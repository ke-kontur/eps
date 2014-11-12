package ru.acs.fts.eps2.router.tasks;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.data.kind.CompressType;
import ru.acs.fts.eps2.engine.objects.defines.EnvelopeOrigins;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.engine.processing.helpers.SendMessageHelper;
import ru.acs.fts.eps2.engine.transport.AddressFactory;
import ru.acs.fts.eps2.engine.transport.gateway.out.MessagingGateway;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.persistence.EDServiceHolder;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.EDJobBatchContextFactory;
import ru.acs.fts.eps2.router.processing.ead.EadRemoting;
import ru.acs.fts.eps2.router.processing.ead.processing.ManifestCompletedProcessor;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.ApplicationInfType;
import ru.acs.fts.schemas.envelope.BodyType;
import ru.acs.fts.schemas.envelope.CustomsType;
import ru.acs.fts.schemas.envelope.EDHeaderType;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.HeaderType;
import ru.acs.fts.schemas.envelope.RoutingInfType;
import ru.acs.fts.schemas.envelope.SignatureType;

public class EadManifestCleanTask
{
	private static final Logger log = LoggerFactory.getLogger( EadManifestCleanTask.class );
	
	private EDServiceHolder _serviceHolder;
	private Configurator _configurator;
	private Map< String, ManifestCompletedProcessor > _manifestProcessors;
	private AddressFactory _addressFactory;
	private MessagingGateway _messagingGateway;
	private EDJobBatchContextFactory _jobBatchContextFactory;
	
	private int _minutesToDelay;
	
	// @formatter:off
	@Required public void setServiceHolder( EDServiceHolder serviceHolder ) { _serviceHolder = serviceHolder; }
	public EDServiceHolder getServiceHolder( ) { return _serviceHolder; }
	
	@Required public void setConfigurator( Configurator configurator ) { _configurator = configurator; }
	public Configurator getConfigurator( ) { return _configurator; }

	@Required public void setManifestProcessors( Map< String, ManifestCompletedProcessor > manifestProcessors ) { _manifestProcessors = manifestProcessors; }
	public Map< String, ManifestCompletedProcessor > getManifestProcessors( ) { return _manifestProcessors; }

	@Required public void setAddressFactory( AddressFactory addressFactory ) { _addressFactory = addressFactory; }
	public AddressFactory getAddressFactory( ) { return _addressFactory; }
	
	@Required public void setMessagingGateway( MessagingGateway messagingGateway ) { _messagingGateway = messagingGateway; }
	public MessagingGateway getMessagingGateway( ) { return _messagingGateway; }
	
	@Required public void setMinutesToDelay( int minutesToDelay ) { _minutesToDelay = minutesToDelay; }
	public int getMinutesToDelay( ) { return _minutesToDelay; }
	
	@Required public void setJobBatchContextFactory( EDJobBatchContextFactory jobBatchContextFactory ) { _jobBatchContextFactory = jobBatchContextFactory; }
	public EDJobBatchContextFactory getJobBatchContextFactory( ) { return _jobBatchContextFactory; }
	// @formatter:on
	
	@SuppressWarnings( "unchecked" )
	@Transactional( propagation = Propagation.REQUIRED, timeout = 3000000 ) // timeout = 300
	public void clean( ) 
		throws Exception
	{
		log.info( "TASK: Очищаем устаревшие манифесты ЭАД" );
		
		EDJobBatchContext jbc = ( EDJobBatchContext )_jobBatchContextFactory.create( new byte[ 0 ] );
		
		JobContext jc = new JobContext( new HashMap< String, Object >( ) );
		jc.put( ContextConstants.ENVELOPE_NAME, "envelopes" );
		jc.put( ContextConstants.ENVELOPES, "envelopes" );
		jc.put( ContextConstants.ENVELOPES_UNSIGNED, "envelopesUnsigned" );
		
		Calendar now = new GregorianCalendar( );
		now.add( Calendar.MINUTE, -_minutesToDelay );
		// now.add( Calendar.SECOND, -30 );
		
		List< ExtEadManifest > manifests = _serviceHolder.getEdarchService( ).getExternalEadManifests( 
			now, _configurator.getSoftVersion( ) 
		);
		
		Map< String, List< ExtEadManifest > > composite = new HashMap< String, List< ExtEadManifest > >( );
		Set< String > toProcess = new HashSet< String >( );
		
		log.info( "\tСтроит карту устаревших манифестов ЭАД" );
		
		for ( ExtEadManifest mf : manifests )
		{
			String envelopeId = mf.getRequestEnvelopeId( );
			
			List< ExtEadManifest > cmp = composite.get( envelopeId );
			if ( null == cmp )
			{
				cmp = new ArrayList< ExtEadManifest >( );
				composite.put( envelopeId, cmp );
			}

			toProcess.add( envelopeId );
			
			if ( mf.getStatus( ) == ExtEadManifest.STATUS_REQUESTED )
			{
				mf.setStatus( ExtEadManifest.STATUS_FAILED );
				mf.setResultCode( ResultCodes._09_96669_99 );
			
				try
				{
					_serviceHolder.getEdarchService( ).merge( mf );
				}
				catch ( Exception exc )
				{
					log.error( "", exc );
				}
			}
			
			cmp.add( mf );
		}		
		
		log.info( "\tВызываем обработку для зомби-манифестов" );
		
		for ( String envelopeId : toProcess )
		{
			try
			{
				log.info( String.format(
					"ЭАД: отправляем конверты в ответ на %s",
					envelopeId
				) );
				
				jbc.remove( "envelopes" );
				jbc.remove( "envelopesUnsigned" );
				
				List< ExtEadManifest > mfs = composite.get( envelopeId );
			
				recoverEnvelope( jbc, envelopeId );
				EadRemoting.processManifests( mfs, _manifestProcessors, jbc, jc );
				
				List< EDEnvelope > envelopes = ( List< EDEnvelope > )jbc.get( "envelopes" );
				
				if ( null != envelopes && envelopes.size( ) > 0 )
				{
					for ( EDEnvelope env : envelopes )
					{
						log.info( String.format(
							"Отправляем конверт %s %s",
							env.getEnvelopeID( ), env.getMessageType( )
						) );
						
						Object obj = env.getDocument( ).getRawDocument( );
						if ( ! ( obj instanceof SignatureType ) &&
							 ! ( obj instanceof XStringMarshallableClass ) )
						{
							CryptoHelper.signEnvelope( env, false );
						}
						
						SendMessageHelper.sendEnvelope( jbc, jc, env );
						_serviceHolder.getEnvelopeOperator( ).persistEnvelope( env );
					}
				}
				
				envelopes = ( List< EDEnvelope > )jbc.get( "envelopesUnsigned" );
				
				if ( null != envelopes && envelopes.size( ) > 0 )
				{
					for ( EDEnvelope env : envelopes )
					{
						log.info( String.format(
							"Отправляем конверт %s %s",
							env.getEnvelopeID( ), env.getMessageType( )
						) );
						
						CryptoHelper.signEnvelope( env, false );
						
						SendMessageHelper.sendEnvelope( jbc, jc, env );
						_serviceHolder.getEnvelopeOperator( ).persistEnvelope( env );
					}
				}
			}
			catch ( Exception exc )
			{
				log.error( "", exc );
			}
		}
		
		for ( String envelopeId : composite.keySet( ) )
		{
			log.info( String.format(
				"\tОчищаем манифесты для запросного конверта %s", envelopeId 
			) );
			List< ExtEadManifest > mfs = composite.get( envelopeId );
			for ( ExtEadManifest mf : mfs )
			{
				log.info( String.format(
					"Удаляем манифест EnvelopeID: %s, RequestLine: %s", mf.getRequestEnvelopeId( ), mf.getRequestLineId( )
				) );
				
				_serviceHolder.getEdarchService( ).remove( mf );
			}
		}
	}
	
	private void recoverEnvelope( EDJobBatchContext jobBatchContext, String envelopeId ) 
		throws BaseProcessingException, DatabaseException
	{
		Edecl_Messages msg = _serviceHolder.getEnvelopeService( ).getEnvelope( envelopeId );
		if ( null == msg )
			return ;
		
		EnvelopeType env = new EnvelopeType( );
		
		/** Восстанавливаем тело, сильно не паримся, просто байтовый массив загоняем */
		
		BodyType body = new BodyType( );
		env.setBody( body );
		
		List< Object > bodyAnies = new ArrayList< Object >( );
		body.setAnyList( bodyAnies );
		
		Edecl_Msg_Doc doc = _serviceHolder.getEnvelopeService( ).getDocument( msg.getDocumentId( ) );
		if ( null == doc )
			return ;
		
		XStringMarshallableClass xdoc = new XStringMarshallableClass( );
		xdoc.setByteArray( doc.getBody( ) );
		xdoc.setEncoding( Configurator.WORKING_ENCODING );
		bodyAnies.add( xdoc );
		
		/** Восстанавливаем заголовок, а вот тут надо потрудиться */
		
		HeaderType header = new HeaderType( );
		env.setHeader( header );
		
		List< Object > headerAnies = new ArrayList< Object >( );
		header.setAnyList( headerAnies );
		
		ApplicationInfType appInfo = new ApplicationInfType( );
		headerAnies.add( appInfo );
		
		appInfo.setMessageKind( msg.getMessageKind( ) );
		appInfo.setSoftKind( msg.getSoftKind( ) );
		appInfo.setSoftVersion( msg.getSoftVersion( ) );
		
		RoutingInfType rInfo = new RoutingInfType( );
		headerAnies.add( rInfo );
		
		rInfo.setEnvelopeID( msg.getEnvelopeId( ) );
		rInfo.setExpiration( msg.getExpiration( ) );
		rInfo.setInitialEnvelopeID( msg.getInitialEnvelopeId( ) );
		rInfo.setPreparationDateTime( new DateTime( msg.getPreparationDatetime( ) ) );
		rInfo.setSenderInformation( msg.getSenderInformation( ) );
		
		List< String > receiverInformations = new ArrayList< String >( );
		receiverInformations.add( msg.getReceiverInformation( ) );
		rInfo.setReceiverInformationList( receiverInformations );
		
		EDHeaderType edHeader = new EDHeaderType( );
		headerAnies.add( edHeader );
		
		edHeader.setMessageType( msg.getMessageType( ) );
		edHeader.setParticipantID( msg.getParticipantId( ) );
		edHeader.setProccessID( msg.getProcessId( ) );
	
		if ( null != msg.getSenderCustomCode( ) && null != msg.getSenderExchangeType( ) )
		{
			CustomsType senderCustoms = new CustomsType( );
			senderCustoms.setCustomsCode( Integer.toString( msg.getSenderCustomCode( ) ) );
			senderCustoms.setExchType( Integer.toString( msg.getSenderExchangeType( ) ) );
			edHeader.setSenderCustoms( senderCustoms );
		}
		
		if ( null != msg.getRcvCustomCode( ) && null != msg.getRcvExchangeType( ) )
		{
			CustomsType receiverCustoms = new CustomsType( );
			receiverCustoms.setCustomsCode( Integer.toString( msg.getRcvCustomCode( ) ) );
			receiverCustoms.setExchType( Integer.toString( msg.getRcvExchangeType( ) ) );
			edHeader.setReceiverCustoms( receiverCustoms );
		}

		String senderSystem = null;

		if ( null != edHeader.getSenderCustoms( ) )
		{
			senderSystem = BusinessSystems.CUSTOMS;
		}
		else
		{
			senderSystem = BusinessSystems.DECLARANT;
		}
		
		jobBatchContext.setSenderSystem( senderSystem );
		
		EDEnvelope envelope = new EDEnvelope( env, senderSystem );
			
		envelope.setSaveEnvelope( true );
		envelope.setSaveDocument( false );
		envelope.setCompressType( CompressType.NotCompressed );
		envelope.setOrigin( EnvelopeOrigins.INCOME );
		
		envelope.getDocument( ).setUniqueness( DocumentUniquenesses.NOT_UNIQ );
		
		jobBatchContext.setReceivedEnvelope( envelope );
		jobBatchContext.doNotUseThis_setIncomeMessage( msg );
	}
}

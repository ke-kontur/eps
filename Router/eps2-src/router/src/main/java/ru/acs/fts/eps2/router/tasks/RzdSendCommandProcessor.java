package ru.acs.fts.eps2.router.tasks;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.CompressType;
import ru.acs.fts.eps2.engine.objects.defines.EnvelopeOrigins;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.engine.processing.helpers.SendMessageHelper;
import ru.acs.fts.eps2.engine.transport.AddressFactory;
import ru.acs.fts.eps2.engine.transport.gateway.out.MessagingGateway;
import ru.acs.fts.eps2.engine.util.xslt.XsltTransformer;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.RzdSendCommands;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.EDServiceHolder;
import ru.acs.fts.eps2.router.persistence.operators.EnvelopeOperator;
import ru.acs.fts.eps2.router.processing.EDConfigurator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.EDJobBatchContextFactory;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.router.processing.helpers.ResultEnvelopeHelper;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.envelope.ApplicationInfType;
import ru.acs.fts.schemas.envelope.BodyType;
import ru.acs.fts.schemas.envelope.CustomsType;
import ru.acs.fts.schemas.envelope.EDHeaderType;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.HeaderType;
import ru.acs.fts.schemas.envelope.RoutingInfType;

public class RzdSendCommandProcessor // NO_UCD (use default)
{
	private static final Logger log = LoggerFactory.getLogger( RzdSendCommandProcessor.class );
	
	private static final String SENDING = "Sending";
	private static final String SENDED = "Sended";
	private static final String ERROR = "Error";
	private static final String NO_ERROR = "All right";
	private static final String TRANSFORMATION_TYPE = "rzdPollingTranformation";
	private static final String EXCH_TYPE = "19200";
	
	private EDServiceHolder _serviceHolder;
	private XsltTransformer _transformer;
	private EDConfigurator _configurator;
	private AddressFactory _addressFactory;
	private MessagingGateway _messagingGateway;
	private EnvelopeOperator _envelopeOperator;
	private EDJobBatchContextFactory _jobBatchContextFactory;
	
	// @formatter:off
	@Required
	public void setServiceHolder( EDServiceHolder serviceHolder ) { _serviceHolder = serviceHolder; }
	public EDServiceHolder getServiceHolder( ) { return _serviceHolder; }
	
	@Required
	public void setTransformer( XsltTransformer transformer ) { _transformer = transformer; }
	public XsltTransformer getTransformer( ) { return _transformer; }
	
	@Required
	public void setConfigurator( EDConfigurator configurator ) { _configurator = configurator; }
	public EDConfigurator getConfigurator( ) { return _configurator; }
	
	@Required
	public void setAddressFactory( AddressFactory addressFactory ) { _addressFactory = addressFactory; }
	public AddressFactory getAddressFactory( ) { return _addressFactory; }
	
	@Required
	public void setMessagingGateway( MessagingGateway messagingGateway ) { _messagingGateway = messagingGateway; }
	public MessagingGateway getMessagingGateway( ) { return _messagingGateway; }
	
	@Required
	public void setEnvelopeOperator( EnvelopeOperator envelopeOperator ) { _envelopeOperator = envelopeOperator; }
	public EnvelopeOperator getEnvelopeOperator( ) { return _envelopeOperator; }
	
	@Required
	public void setJobBatchContextFactory( EDJobBatchContextFactory jobBatchContextFactory ) { _jobBatchContextFactory = jobBatchContextFactory; }
	public EDJobBatchContextFactory getJobBatchContextFactory( ) { return _jobBatchContextFactory; }
	// @formatter:on
	
	@Transactional( propagation = Propagation.REQUIRED, timeout = 3000000 ) // timeout = 300
	public void tryToProcess( RzdSendCommands command )  // NO_UCD (use default)
		throws Exception
	{
		try
		{
			try
			{
				updateStatuses( command, SENDING, NO_ERROR );
			}
			catch ( Exception ex )
			{
				log.info( "При смене статуса команды произошла ошибка: '{}'.", ex.getMessage( ) );
				throw ex;
			}
			process( command );
			updateStatuses( command, SENDED, NO_ERROR );
		}
		catch ( Exception e )
		{
			String envelopeId = "";
			if ( null != command )
				envelopeId = command.getEnvelopeId( );
			log.info( "При попытке обработать кодманду (envelopeId = {}) произошла ошибка: '{}'", envelopeId, e.getMessage( ) );
			
			if ( null != command )
				updateStatuses( command, ERROR, e.toString( ) );
		}
	}
	
	public void updateStatuses( RzdSendCommands command, String status, String error )  // NO_UCD (use private)
		throws DatabaseException
	{
		command.setStatus( status );
		command.setError( StringUtil.toBytes( error ) );
		_serviceHolder.getRzdService( ).merge( command );
	}
	
	public void process( RzdSendCommands command )  // NO_UCD (use private)
		throws Exception
	{
		// Document xmlDocument = null;
		InputStream xmlDocument = null;
		Edecl_Msg_Doc document = _serviceHolder.getEnvelopeService( ).getDocument( command.getDocumentId( ) );
		if ( null != document )
		{
			// xmlDocument = documentBuilder.parse( new InputSource( new ByteArrayInputStream( document.getBody( ) ) ) );
			xmlDocument = new ByteArrayInputStream( document.getBody( ) );
		}
		
		if ( null != xmlDocument )
		{
			byte[ ] transformedData = _transformer.transform( xmlDocument, TRANSFORMATION_TYPE, command.getSoftVersion( ) );
			
			EnvelopeUnmarshaller unmarshaller = new EnvelopeUnmarshaller( );
			Object doc = unmarshaller.unmarshallBaseDocOrSignature( transformedData, _serviceHolder.getUnmarshaller( ) ); 
			
			EDDocument tmp = new EDDocument( doc );
			tmp.setDocumentID( UUIDGen.getUUID( ).toString( ) );
			
			CustomsType senderCustoms = createSenderCustoms( command );
			
			EDEnvelope envelopeToSend = createEnvelope( command, doc, senderCustoms );
			CryptoHelper.signEnvelope( envelopeToSend, true );
			
			JobContext jobContext = new JobContext( new HashMap< String, Object >( ) );
			JobBatchContext jobBatchContext = createJobBatchContext( senderCustoms, command );
			
			SendMessageHelper.sendEnvelope( jobBatchContext, jobContext, envelopeToSend );
			
			_envelopeOperator.persistEnvelope( envelopeToSend );
			
			log.info( "Сообщение CMN.12086 было отправлено и сохранено в БД." );
		}
	}
	
	private CustomsType createSenderCustoms( RzdSendCommands command )
	{
		CustomsType senderCustoms = new CustomsType( );
		senderCustoms.setCustomsCode( command.getCustomsCode( ) );
		senderCustoms.setExchType( EXCH_TYPE );
		
		return senderCustoms;
	}
	
	private EDEnvelope createEnvelope( RzdSendCommands command, Object document, CustomsType senderCustoms ) 
		throws Exception
	{
		/*
		CustomsType senderCustoms = new CustomsType( );
		senderCustoms.setCustomsCode( command.getCustomsCode( ) );
		senderCustoms.setExchType( EXCH_TYPE );
		*/
		
		EDEnvelope envelope = EnvelopeCreator.createFluentMessage( 
			MessageType.CMN_12086, command.getProcessId( ), _configurator.getRzdPollingParticipantId( ), 
			/*messageKind*/ null, /*softKind*/ null, command.getSoftVersion( ), 
			BusinessSystems.EPS, senderCustoms, 
			BusinessSystems.RZD, /*receivingCustoms*/ null, 
			document 
		);
				
		return envelope;
	}
	
	private EDJobBatchContext createJobBatchContext( CustomsType senderCustoms, RzdSendCommands command ) 
		throws Exception
	{
		EDJobBatchContext jobBatchContext = ( EDJobBatchContext )_jobBatchContextFactory.create( new byte[ 0 ] );
		
		recoverEnvelope( jobBatchContext, senderCustoms, command );
		
		return jobBatchContext;
	}
	
	private void recoverEnvelope( EDJobBatchContext jobBatchContext, CustomsType senderCustoms, RzdSendCommands command ) 
		throws BaseProcessingException, DatabaseException
	{
		EnvelopeType env = new EnvelopeType( );
		
		/** Восстанавливаем тело, сильно не паримся, просто байтовый массив загоняем */
		
		BodyType body = new BodyType( );
		env.setBody( body );
		
		List< Object > bodyAnies = new ArrayList< Object >( );
		body.setAnyList( bodyAnies );
		
		/** Восстанавливаем заголовок, а вот тут надо потрудиться */
		
		HeaderType header = new HeaderType( );
		env.setHeader( header );
		
		List< Object > headerAnies = new ArrayList< Object >( );
		header.setAnyList( headerAnies );
		
		ApplicationInfType appInfo = new ApplicationInfType( );
		headerAnies.add( appInfo );
		
		appInfo.setSoftVersion( _configurator.getSoftVersion( ) );
		
		RoutingInfType rInfo = new RoutingInfType( );
		headerAnies.add( rInfo );
		
		rInfo.setEnvelopeID( StringUtil.generateUuid( ) );
		rInfo.setPreparationDateTime( new DateTime( ) );
		
		List< String > receiverInformations = new ArrayList< String >( );
		rInfo.setReceiverInformationList( receiverInformations );
		
		EDHeaderType edHeader = new EDHeaderType( );
		headerAnies.add( edHeader );
		
		edHeader.setMessageType( MessageType.ADM_00001 );
		edHeader.setParticipantID( command.getParticipantId( ) );
		edHeader.setProccessID( command.getProcessId( ) );
	
		// CustomsType senderCustoms = new CustomsType( );
		// senderCustoms.setCustomsCode( procedureProperties.getCustomsCode( ) );
		// senderCustoms.setExchType( procedureProperties.getExchType( ) );
		edHeader.setSenderCustoms( senderCustoms );
		
		env.setBody( createFakeBody( ) );
		
		EDEnvelope recvEnv = new EDEnvelope( env, BusinessSystems.CUSTOMS );		
		
		recvEnv.setSaveDocument( true );
		recvEnv.setCompressType( CompressType.NotCompressed );
		recvEnv.setOrigin( EnvelopeOrigins.INCOME );
		recvEnv.setWasCompressed( false );
		
		jobBatchContext.setReceivedEnvelope( recvEnv );
		jobBatchContext.doNotUseThis_setIncomeMessage( null );
	}
	
	private BodyType createFakeBody( ) throws DatabaseException
	{
		BodyType bodyType = new BodyType( );
		
		List< Object > bodyAnies = new ArrayList< Object >( );
		bodyAnies.add( ResultEnvelopeHelper.getResultDocument( "", ResultCodes._00_00000_00, _serviceHolder.getErrListService( ) ) );
		
		bodyType.setAnyList( bodyAnies );
		
		return bodyType;
	}
}

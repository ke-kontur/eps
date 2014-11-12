package ru.acs.fts.eps2.router.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.CompressType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.objects.defines.EnvelopeOrigins;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.SendMessageHelper;
import ru.acs.fts.eps2.engine.transport.AddressFactory;
import ru.acs.fts.eps2.engine.transport.gateway.out.MessagingGateway;
import ru.acs.fts.eps2.model.services.ServiceHolder;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDConfigurator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.EDJobBatchContextFactory;
import ru.acs.fts.eps2.router.processing.ead.processing.ManifestCompletedProcessor;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.admin.heartbeat.HeartbeatType;
import ru.acs.fts.schemas.envelope.ApplicationInfType;
import ru.acs.fts.schemas.envelope.BodyType;
import ru.acs.fts.schemas.envelope.CustomsType;
import ru.acs.fts.schemas.envelope.EDHeaderType;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.HeaderType;
import ru.acs.fts.schemas.envelope.RoutingInfType;

public class HeartbeatTask
{
	private static final Logger log = LoggerFactory.getLogger( HeartbeatTask.class );

	private boolean _useHeartbeat;
	private String _heartbeatDescription;
	
	private ServiceHolder _serviceHolder;
	private EDConfigurator _configurator;
	private Map< String, ManifestCompletedProcessor > _manifestProcessors;
	private AddressFactory _addressFactory;
	private MessagingGateway _messagingGateway;	
	private EDJobBatchContextFactory _jobBatchContextFactory;
	
	// @formatter:off
	@Required public void setUseHeartbeat( boolean useHeartbeat ) { _useHeartbeat = useHeartbeat; }
	public boolean getUseHeartbeat( ) { return _useHeartbeat; }
	
	@Required public void setHeartbeatDescription( String heartbeatDescription ) { _heartbeatDescription = heartbeatDescription; }
	public String getHeartbeatDescription( ) { return _heartbeatDescription; }

	@Required public void setServiceHolder( ServiceHolder serviceHolder ) { _serviceHolder = serviceHolder; }
	public ServiceHolder getServiceHolder( ) { return _serviceHolder; }
	
	@Required public void setConfigurator( EDConfigurator configurator ) { _configurator = configurator; }
	public EDConfigurator getConfigurator( ) { return _configurator; }

	@Required public void setManifestProcessors( Map< String, ManifestCompletedProcessor > manifestProcessors ) { _manifestProcessors = manifestProcessors; }
	public Map< String, ManifestCompletedProcessor > getManifestProcessors( ) { return _manifestProcessors; }

	@Required public void setAddressFactory( AddressFactory addressFactory ) { _addressFactory = addressFactory; }
	public AddressFactory getAddressFactory( ) { return _addressFactory; }
	
	@Required public void setMessagingGateway( MessagingGateway messagingGateway ) { _messagingGateway = messagingGateway; }
	public MessagingGateway getMessagingGateway( ) { return _messagingGateway; }
	
	@Required public void setJobBatchContextFactory( EDJobBatchContextFactory jobBatchContextFactory ) { _jobBatchContextFactory = jobBatchContextFactory; }
	public EDJobBatchContextFactory getJobBatchContextFactory( ) { return _jobBatchContextFactory; }
	// @formatter:on
	
	@Transactional( propagation = Propagation.REQUIRED, timeout = 3000000 ) // timeout = 300
	public void execute( ) 
		throws Exception
	{
		if ( ! _useHeartbeat )
			return ;
		
		log.info( "Начинаем формировать сигнал сердцебиения ..." );
		
		EDJobBatchContext jbc = ( EDJobBatchContext )_jobBatchContextFactory.create( new byte[ 0 ] );
		
		JobContext jc = new JobContext( new HashMap< String, Object >( ) );
		
		makeHeartbeat( jbc, _configurator );
		EDEnvelope heartbeat = jbc.getReceivedEnvelope( );
		
		SendMessageHelper.sendEnvelope( jbc, jc, heartbeat );
		
		log.info( "Сердцебиение успешно отравлено." );
	}	
	
	private void makeHeartbeat( EDJobBatchContext jobBatchContext, EDConfigurator configurator ) 
		throws BaseProcessingException, DatabaseException
	{
		EnvelopeType env = new EnvelopeType( );
		
		/** Восстанавливаем тело, сильно не паримся, просто байтовый массив загоняем */
		
		BodyType body = new BodyType( );
		env.setBody( body );
		
		List< Object > bodyAnies = new ArrayList< Object >( );
		body.setAnyList( bodyAnies );

		HeartbeatType doc = new HeartbeatType( );
		doc.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		doc.setDocumentModeID( DocumentModeIDs.HEARTBEAT );
		doc.setDescription( _heartbeatDescription );
		bodyAnies.add( doc );
		
		/** Восстанавливаем заголовок, а вот тут надо потрудиться */
		
		HeaderType header = new HeaderType( );
		env.setHeader( header );
		
		List< Object > headerAnies = new ArrayList< Object >( );
		header.setAnyList( headerAnies );
		
		ApplicationInfType appInfo = new ApplicationInfType( );
		headerAnies.add( appInfo );
		
		appInfo.setMessageKind( null );
		appInfo.setSoftKind( null );
		appInfo.setSoftVersion( configurator.getSoftVersion( ) );
		
		RoutingInfType rInfo = new RoutingInfType( );
		headerAnies.add( rInfo );
		
		rInfo.setEnvelopeID( UUIDGen.getUUID( ).toString( ) );
		rInfo.setExpiration( null );
		rInfo.setInitialEnvelopeID( null );
		rInfo.setPreparationDateTime( new DateTime( ) );
		rInfo.setSenderInformation( configurator.getEpsReceiveAddress( ) );
		
		List< String > receiverInformations = new ArrayList< String >( );
		receiverInformations.add( configurator.getEpsReceiveAddress( ) );
		rInfo.setReceiverInformationList( receiverInformations );
		
		EDHeaderType edHeader = new EDHeaderType( );
		headerAnies.add( edHeader );
		
		edHeader.setMessageType( MessageType.PVR_00003 );
		edHeader.setParticipantID( "0" );
		edHeader.setProccessID( null );
		
		CustomsType senderCustoms = new CustomsType( );
		senderCustoms.setCustomsCode( configurator.getEpsCustomsCode( ) );
		senderCustoms.setExchType( configurator.getEpsSenderAdminExchangeType( ) );
		edHeader.setSenderCustoms( senderCustoms );

		jobBatchContext.setSenderSystem( BusinessSystems.EPS );
		
		EDEnvelope envelope = new EDEnvelope( env, BusinessSystems.EPS );
		
		envelope.setSaveEnvelope( true );
		envelope.setSaveDocument( true );
		envelope.setCompressType( CompressType.NotCompressed );
		envelope.setOrigin( EnvelopeOrigins.GENERATED );		
		envelope.setRecipientSystem( BusinessSystems.BALANCER );

		jobBatchContext.setReceivedEnvelope( envelope );
	}	
}

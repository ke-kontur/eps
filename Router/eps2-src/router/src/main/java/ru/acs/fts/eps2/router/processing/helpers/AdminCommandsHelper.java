package ru.acs.fts.eps2.router.processing.helpers;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.data.kind.CompressType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.model.services.ServiceHolder;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.admin.updatedb_result.UpdateDBResultType;

public class AdminCommandsHelper
{
	private static Configurator _configurator;
	private static ServiceHolder _serviceHolder;
	
	// @formatter:off
	@Required public void setConfigurator( Configurator configurator ) { _configurator = configurator; }
	public Configurator getConfigurator( ) { return _configurator; }
	
	@Required public void setServiceHolder( ServiceHolder serviceHolder ) { _serviceHolder = serviceHolder; }
	public ServiceHolder getServiceHolder( ) { return _serviceHolder; }
	// @formatter:on
	
	public static EDEnvelope createUtilMessage( 
			EDEnvelope recvEnv, 
			String refDocumentId, String messageType, 
			String resultCode, String resultDescription ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException 
	{
		UpdateDBResultType notification = new UpdateDBResultType( );
		
		notification.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		notification.setRefDocumentID( refDocumentId );
		notification.setResultCode( resultCode );
		notification.getResultDescriptionList( ).add( resultDescription );
		notification.setDocumentModeID( DocumentModeIDs.UPDATE_DB_RESULT );
		
		return createEnvelopeToAdmin( messageType, recvEnv, notification );
	}

	public static EDEnvelope createEnvelopeToAdmin( 
			String messageType, EDEnvelope recvEnv, Object document ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException 		
	{
		EDEnvelope envelope = EnvelopeCreator.createFluentMessage( 
			messageType, recvEnv.getProcessID( ), recvEnv.getParticipantID( ), 
			null, 
			recvEnv.getApplicationInfo( ).getSoftKind( ), 
			recvEnv.getApplicationInfo( ).getSoftVersion( ), 
			BusinessSystems.EPS, recvEnv.getReceiverCustoms( ), 
			BusinessSystems.CUSTOMS, recvEnv.getSenderCustoms( ), 
			document 
		);
		
		envelope.setCompressType( CompressType.NotCompressed );
		
		return envelope;

	}
}

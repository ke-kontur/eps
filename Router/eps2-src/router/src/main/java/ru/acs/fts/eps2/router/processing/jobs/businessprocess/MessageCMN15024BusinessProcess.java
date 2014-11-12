package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;
import ru.acs.fts.schemas.album.esadout_cu.ESADoutCUType;
import ru.acs.fts.schemas.album.inventory.InventoryType;

public class MessageCMN15024BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EDContainerType container = recvEnv.getDocument( ).getDocumentAsClass( EDContainerType.class );

		ESADoutCUType esadOut = null;
		InventoryType inv = null;
		
		for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument doc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );
			
			if ( doc.isDocumentOfClass( ESADoutCUType.class ) )
				esadOut = doc.getDocumentAsClass( ESADoutCUType.class );
			else if ( doc.isDocumentOfClass( InventoryType.class ) )
				inv = doc.getDocumentAsClass( InventoryType.class );
		}
		
		if ( null == esadOut )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00014_01,
				ProcessingConstants.ERROR_TYPE_AUTH 
			);
		}
		
		checkCurrentState( container, esadOut, inv, jobBatchContext );
		
		Edecl_Proc_Information procInfo = _serviceHolder.getProcedureService( ).getProcInformation( recvEnv.getProcessID( ) );
		if ( null == procInfo )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00049_03, 
				ProcessingConstants.ERROR_TYPE_AUTH 
			);
		}
		
		procInfo.setTransferType( esadOut.getCustomsProcedure( ) );
		procInfo.setCustProcedureCode( esadOut.getTransitDirectionCode( ) );
		procInfo.setUdFlag( ProcedureUdFlags.RRW_TRANSIT );
		
		_serviceHolder.getProcedureService( ).merge( procInfo );
		
		Edecl_Msg_Doc doc = _serviceHolder.getEnvelopeService( ).getDocument( container.getDocumentID( ) );
		doc.setState( DocumentStates.CURRENT );
		_serviceHolder.getEnvelopeService( ).merge( doc );
		
		doc = _serviceHolder.getEnvelopeService( ).getDocument( esadOut.getDocumentID( ) );
		doc.setState( DocumentStates.CURRENT );
		_serviceHolder.getEnvelopeService( ).merge( doc );
		
		doc = _serviceHolder.getEnvelopeService( ).getDocument( inv.getDocumentID( ) );
		doc.setState( DocumentStates.CURRENT );
		_serviceHolder.getEnvelopeService( ).merge( doc );
	}
	
	public void checkCurrentState( 
			EDContainerType edContainer,
			ESADoutCUType esadOut, InventoryType inventory,
			EDJobBatchContext jobBatchContext ) 
		throws DatabaseException, ResultTypeException
	{
		EnvelopeService envSrv = _serviceHolder.getEnvelopeService( );
		
		Edecl_Msg_Doc edContainerDoc = envSrv.getDocument( edContainer.getRefDocumentID( ) );
		if ( ! edContainerDoc.getState( ).equals( DocumentStates.CURRENT ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_08, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);			
		}

		Edecl_Msg_Doc esadOutDoc = envSrv.getDocument( esadOut.getRefDocumentID( ) );
		if ( ! esadOutDoc.getState( ).equals( DocumentStates.CURRENT ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_08, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);			
		}

		Edecl_Msg_Doc invDoc = envSrv.getDocument( inventory.getRefDocumentID( ) );
		if ( ! invDoc.getState( ).equals( DocumentStates.CURRENT ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_08, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);			
		}
	}
}

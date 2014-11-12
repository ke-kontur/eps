package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeHelper;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;
import ru.acs.fts.schemas.album.esadout_cu.ESADoutCUType;

/**
 * Бизнес процесс для обработки сообщения CMN.11023
 * ( Электронная ДТ, ДТС и опись документов ( контейнер ) ИМ )
 */
public class MessageCMN11023BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		// Fetch Documents
		
		EDContainerType container = recvEnv.getDocument( ).getDocumentAsClass( EDContainerType.class );

		ESADoutCUType esadOut = null;
		
		Edecl_Msg_Doc bdoc = _serviceHolder.getEnvelopeService( ).getDocument( container.getDocumentID( ) );
		if ( null != bdoc )
		{
			bdoc.setState( DocumentStates.CURRENT );
			_serviceHolder.getEnvelopeService( ).merge( bdoc );
		}
		
		for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );
			
			if ( cdoc.isDocumentOfClass( ESADoutCUType.class ) )
				esadOut = cdoc.getDocumentAsClass( ESADoutCUType.class );
			
			String refDocumentId = cdoc.getRefDocumentID( );
			if ( ! StringUtil.isNullOrEmpty( refDocumentId ) )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00027_10, 
					ProcessingConstants.ERROR_TYPE_BUSINESS 
				);
			}
			
			bdoc = _serviceHolder.getEnvelopeService( ).getDocument( cDocId );
			if ( null != bdoc )
			{
				bdoc.setState( DocumentStates.CURRENT );
				_serviceHolder.getEnvelopeService( ).merge( bdoc );
			}
		}
		
		// Set Info to procedure
		
		String processId = recvEnv.getProcessID( );
		
		Edecl_Proc_Information procInfo = _serviceHolder.getProcedureService( ).getProcInformation( processId );
		if ( null == procInfo )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._01_00041_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		if ( ProcedureUdFlags.isTrivialRemoteness( procInfo.getUdFlag( ) ) )
			EnvelopeHelper.setUpMessageKind( recvEnv, procInfo );
		
		procInfo.setTransferType( esadOut.getCustomsProcedure( ) );
		procInfo.setCustProcedureCode( esadOut.getCustomsModeCode( ) );

		_serviceHolder.getProcedureService( ).merge( procInfo );
		
		// для экономического оператора
		if ( ProcedureUdFlags.isEconomicOperator( procInfo.getUdFlag( ) ) )
		{
			setNewStatusesForProcessDocuments( processId, recvEnv, jobBatchContext, MessageType.CMN_11076 );
			setNewStatusesForProcessDocuments( processId, recvEnv, jobBatchContext, MessageType.CMN_11090 );
		}
	}
}

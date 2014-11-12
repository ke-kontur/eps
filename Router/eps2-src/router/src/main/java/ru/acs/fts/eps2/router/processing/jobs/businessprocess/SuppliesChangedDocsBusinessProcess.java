package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Substatus_State;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.defines.SpecialProcedureSubStates;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

public class SuppliesChangedDocsBusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String containerDocId = recvEnv.getDocument( ).getDocumentID( );
		String processId = recvEnv.getProcessID( );
		
		processDocuments( containerDocId, processId, jobBatchContext );
	}
	
	private void processDocuments( String containerDocId, String processId, EDJobBatchContext jobBatchContext ) 
		throws Exception
	{
		EnvelopeService envelopeService = getServiceHolder( ).getEnvelopeService( );
		Edecl_Msg_Doc container = envelopeService.getDocument( containerDocId );
		checkRefDocument( container, envelopeService, jobBatchContext );
		
		List< Edecl_Msg_Doc > docs = envelopeService.getContainerDocuments( containerDocId );
		
		if ( null != docs && ! docs.isEmpty( ) )
		{
			for ( Edecl_Msg_Doc doc : docs )
			{
				if ( ! DocumentModeIDs.KDT_OUT_CU.equals( doc.getDocumentModeId( ) ) )
					checkRefDocument( doc, envelopeService, jobBatchContext );
			}
		
			/** Субстатус устанавливаем только для контейнера */
			createAndSaveSubstatusState( processId, container );
			
			/** Раз мы убедились, что все документы заполнены правильно, можем изменить их состояние: */
			makeWaitable( container, envelopeService );
			for ( Edecl_Msg_Doc doc : docs )
			{
				makeWaitable( doc, envelopeService );
			}
		}
	}
	
	private void checkRefDocument( 
			Edecl_Msg_Doc doc, EnvelopeService envelopeService,
			EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		Edecl_Msg_Doc refDoc = envelopeService.getDocument( doc.getRefDocumentId( ) );
		
		if ( null == refDoc )
		{
			ErrorHelper.throwException( jobBatchContext, 
					ResultCodes._02_00001_01, ProcessingConstants.ERROR_TYPE_BUSINESS );
		}
		else
		{
			if ( ! isCurrent( refDoc ) )
				ErrorHelper.throwException( jobBatchContext, 
						ResultCodes._03_00027_08, ProcessingConstants.ERROR_TYPE_BUSINESS );
			
			if ( ! areDocModesCorrespond( doc, refDoc ) )
				ErrorHelper.throwException( jobBatchContext, 
						ResultCodes._03_00016_01, ProcessingConstants.ERROR_TYPE_BUSINESS );
		}
	}
	
	private boolean isCurrent( Edecl_Msg_Doc doc )
	{
		return DocumentStates.CURRENT.equals( doc.getState( ) );
	}
	
	private boolean areDocModesCorrespond( Edecl_Msg_Doc doc1, Edecl_Msg_Doc doc2 )
	{
		return StringUtil.areEqual( doc1.getDocumentModeId( ), doc2.getDocumentModeId( ) );
	}
	
	private void makeWaitable( Edecl_Msg_Doc doc, EnvelopeService envelopeService )
		throws DatabaseException
	{
		doc.setState( DocumentStates.WAITABLE );
		envelopeService.merge( doc );
	}
	
	private void createAndSaveSubstatusState( String processId, Edecl_Msg_Doc doc ) 
		throws DatabaseException
	{
		ProcedureService procedureService = getServiceHolder( ).getProcedureService( );
		Edecl_Substatus_State substate = new Edecl_Substatus_State( );
		substate.setDocumentId( doc.getDocumentID( ) );
		substate.setProcessId( processId );
		substate.setStCode( SpecialProcedureSubStates.GTD_EDITING );
		procedureService.persist( substate );
	}
}

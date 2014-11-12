package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.notifgtdregistration.NotifGTDRegistrationType;
import ru.acs.fts.schemas.envelope.CustomsType;

/**
 * Бизнес процесс для обработки сообщения CMN.15004, CMN.15005
 * ( Отказ в регистрации ЭТД, Регистрация ЭТД )
 */
public class NotifGTDRegistrationBusinessProcess extends BusinessProcess
{
	public static final String DOC_STATE_CURRENT = "CURRENT";
	public static final String DOC_STATE_WAITABLE = "WAITABLE";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
						
		checkRefDocument( recvEnv, jobBatchContext );
		
		Edecl_Proc_Information procInfo = getProc( recvEnv, jobBatchContext );
		
		makeTransitEnvelope( recvEnv, procInfo, jobBatchContext, jobContext );
		
		if ( recvEnv.getMessageType( ).equals( MessageType.CMN_15005 ) )
			putInfoToProcedure( recvEnv, procInfo, jobBatchContext );
	}
	
	private void checkRefDocument( 
			EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException
	{
		String refDocumentId = recvEnv.getDocument( ).getRefDocumentID( ); 
		
		if ( StringUtil.isNullOrEmpty( refDocumentId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		Edecl_Msg_Doc refDoc = _serviceHolder.getEnvelopeService( ).getDocument( refDocumentId );
		if ( ! refDoc.getDocumentModeId( ).equalsIgnoreCase( DocumentModeIDs.ED_CONTAINER ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_02, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		if ( refDoc.getState( ).equalsIgnoreCase( DOC_STATE_CURRENT ) )
		{
			List< Edecl_Msg_Doc > docs = _serviceHolder.getEnvelopeService( )
				.getContainerDocuments( refDocumentId );
			
			for ( Edecl_Msg_Doc cdoc : docs )
			{
				if ( cdoc.getState( ) == DOC_STATE_WAITABLE && 
					 cdoc.getRefDocumentId( ) == refDocumentId )
				{
					ErrorHelper.throwException( 
						jobBatchContext, 
						ResultCodes._03_00027_02, 
						ProcessingConstants.ERROR_TYPE_CHECK 
					);
				}
			}
		}
		else if ( refDoc.getState( ).equalsIgnoreCase( DOC_STATE_WAITABLE ) )
		{
			/**
			 * Не делаем ничего, просто проверяем что может быть такой стейт
			 */
		}
		else
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_02, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}		
	}
	
	private void makeTransitEnvelope( 
			EDEnvelope recvEnv,
			Edecl_Proc_Information procInfo, 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException
	{
		CustomsType senderCustoms = createCustomsFromProc( recvEnv, procInfo );
		
		EDEnvelope respEnvelope = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.DECLARANT, null 
		);
						
		String initialEnvelopeId = recvEnv.getInitialEnvelopeID( );
		String incomeEnvelopeId = _serviceHolder.getEnvelopeService( )
			.getIncomeEnvelopeIdByInitialEnvelopeId( initialEnvelopeId );
		
		respEnvelope.setInitialEnvelopeID( incomeEnvelopeId );
		respEnvelope.getEDHeader( ).setSenderCustoms( senderCustoms );
				
		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );		
		jobBatchContext.put( envelopeName, respEnvelope );		
	}
	
	private Edecl_Proc_Information getProc( 
			EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, IllegalStateException, DatabaseException
	{
		Edecl_Proc_Information procInfo = _serviceHolder.getProcedureService( )
			.getProcInformation( recvEnv.getProcessID( ) );
			
		if ( null == procInfo )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._01_00049_03, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}

		return procInfo;
	}
	
	private CustomsType createCustomsFromProc( 
			EDEnvelope recvEnv, Edecl_Proc_Information procInfo )
		throws ResultTypeException
	{	
		CustomsType senderCustoms = new CustomsType( );
		senderCustoms.setCustomsCode( procInfo.getCustCode( ) );
		senderCustoms.setExchType( recvEnv.getSenderCustoms( ).getExchType( ) );
		
		return senderCustoms;
	}	
	
	private void putInfoToProcedure( 
			EDEnvelope recvEnv,
			Edecl_Proc_Information procInfo, EDJobBatchContext jobBatchContext ) 
		throws Exception
	{
		NotifGTDRegistrationType doc = recvEnv.getDocument( ).getDocumentAsClass( NotifGTDRegistrationType.class ); 
			
		GTDIDType gtdid = doc.getGTDID( );
		if ( null == gtdid )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
			
		procInfo.setGtdIdCustCode( gtdid.getCustomsCode( ) );
		procInfo.setGtdIdDate( gtdid.getRegistrationDate( ).toDate( ) );
		procInfo.setGtdIdRegNum( gtdid.getGTDNumber( ) );
			
		_serviceHolder.getProcedureService( ).persist( procInfo );		
	}
}

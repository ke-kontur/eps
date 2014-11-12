package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.RtuCodePatternsHolder;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.admin.int_dtresponce.INTDTResponseType;
import ru.acs.fts.schemas.envelope.CustomsType;

import java.util.List;

/**
 * Бизнес процесс для обработки сообщения PVR.00002
 * ( Ответ от предыдущей версии по сообщению MSG.11026 )
 */
public class MessagePVR00002BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );		
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );

		INTDTResponseType response = recvEnv.getDocument( ).getDocumentAsClass( INTDTResponseType.class );

		String messageType = MessageType.CMN_00004;
		if ( ! ResultCodes.areCodesEquals( ResultCodes._00_00000_00, response.getResultCode( ) ) )
			messageType = MessageType.CMN_00001;
		
		CustomsType receiverCustoms = recvEnv.getReceiverCustoms( );
		
		RtuCodePatternsHolder matcher = jobBatchContext.getConfigurator( ).getRtuPatternsHolder( );
		
		EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
			messageType, recvEnv, response.getResultCode( ), 
			matcher.match( receiverCustoms.getCustomsCode( ) )
				? BusinessSystems.CUSTOMS
				: BusinessSystems.EPS,
			receiverCustoms 
		);

		if ( ! matcher.match( receiverCustoms.getCustomsCode( ) ) )
		{
			cmn00004.getEDHeader( ).setSenderCustoms( recvEnv.getSenderCustoms( ) );
			cmn00004.getEDHeader( ).setReceiverCustoms( recvEnv.getReceiverCustoms( ) );
			
			cmn00004.setInitialEnvelopeID( recoverMsg11026InitialRemote( recvEnv, jobBatchContext ) );
		}
		else
		{
			cmn00004.setInitialEnvelopeID( recoverMsg11026InitalLocal( recvEnv, jobBatchContext ) );
		}
		
		CryptoHelper.signEnvelope( cmn00004, false );
		
		cmn00004.setInitialEnvelopeID( recvEnv.getInitialEnvelopeID( ) );
		
		envelopes.add( cmn00004 );
	}
	
	private String recoverMsg11026InitalLocal( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		String initialEnvelopeId = recvEnv.getInitialEnvelopeID( );
		if ( StringUtil.isNullOrEmpty( initialEnvelopeId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		Edecl_Messages pvr00001 = _serviceHolder.getEnvelopeService( ).getEnvelope( initialEnvelopeId );
		if ( null == pvr00001 )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		String incomeEnvelopeId = pvr00001.getInitialEnvelopeId( );
		if ( StringUtil.isNullOrEmpty( incomeEnvelopeId ) )
		{
			/**
			 * Случай удаленного РТУ
			 */
			return initialEnvelopeId;
		}
		
		return incomeEnvelopeId;
	}
	
	private String recoverMsg11026InitialRemote( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException
	{
		String initialEnvelopeId_adm00008 = recvEnv.getInitialEnvelopeID( );
		if ( StringUtil.isNullOrEmpty( initialEnvelopeId_adm00008 ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);			
		}
		
		Edecl_Messages adm00008 = _serviceHolder.getEnvelopeService( ).getEnvelope( initialEnvelopeId_adm00008 );
		if ( null == adm00008 )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);						
		}
		
		String initialEnvelopeId_adm11020 = adm00008.getInitialEnvelopeId( );
		if ( StringUtil.isNullOrEmpty( initialEnvelopeId_adm11020 ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		String incomeEnvelopeId = _serviceHolder.getEnvelopeService( )
			.getIncomeEnvelopeIdByInitialEnvelopeId( initialEnvelopeId_adm11020 );
		if ( StringUtil.isNullOrEmpty( incomeEnvelopeId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		return incomeEnvelopeId;		
	}
}

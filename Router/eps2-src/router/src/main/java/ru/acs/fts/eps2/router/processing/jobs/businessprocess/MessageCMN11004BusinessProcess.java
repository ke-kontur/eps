package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentSaveTypes;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.confirmdocsrecip.ConfirmDocsRecipType;

/**
 * Бизнес процесс для обработки сообщения CMN.11004
 * ( Подтверждение получения должностным лицом таможенного органа электронных документов ) 
 * 
 * @created at 30.04.2013
 */
public class MessageCMN11004BusinessProcess extends BusinessProcess
{
	private static final String ENVELOPES_NAME = "envelopes";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		ConfirmDocsRecipType doc = recvEnv.getDocument( ).getDocumentAsClass( ConfirmDocsRecipType.class );
		
		String envelopesName = jobContext.getString( ENVELOPES_NAME );
		List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );
		jobBatchContext.put( envelopesName, envelopes );
		
		String initialEnvelopeId = recvEnv.getInitialEnvelopeID( );
		String incomeEnvelopeId = _serviceHolder.getEnvelopeService( )
			.getIncomeEnvelopeIdByInitialEnvelopeId( initialEnvelopeId );
		
		if ( ! StringUtil.isNullOrEmpty( incomeEnvelopeId ) )
		{
			Edecl_Messages ed11004 = getIncomeMessage( incomeEnvelopeId, doc.getDocumentID( ), jobBatchContext );
			
			EDEnvelope respEnvelope = EnvelopeCreator.createTranzitMessage( 
				null, recvEnv, 
				BusinessSystems.DECLARANT, null
			);
			
			doc.setDocumentID( UUIDGen.getUUID( ).toString( ) );
			doc.setRefDocumentID( ed11004.getDocumentId( ) );
			
			respEnvelope.setInnerDocument( doc );
			
			respEnvelope.getDocument( ).setUniqueness( DocumentUniquenesses.UNIQ );
			respEnvelope.getDocument( ).setSaveType( DocumentSaveTypes.INSERT );
			
			respEnvelope.setInitialEnvelopeID( ed11004.getEnvelopeId( ) );
			respEnvelope.setIncomeEnvelopeID( recvEnv.getEnvelopeID( ) );
			
			envelopes.add( respEnvelope );
		}
	}
	
	private Edecl_Messages getIncomeMessage( 
			String incomeMessageId, String documentId,
			EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		Edecl_Messages income = _serviceHolder.getEnvelopeService( )
			.getEnvelope( incomeMessageId );
		
		if ( null == income )
		{
			ErrorHelper.throwException(
				jobBatchContext, 
				ResultCodes._02_00001_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		return income;
	}
}

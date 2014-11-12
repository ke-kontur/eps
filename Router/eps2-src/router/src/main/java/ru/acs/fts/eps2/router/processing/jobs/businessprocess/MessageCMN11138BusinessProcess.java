package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.Edecl_Substatus_State;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.album.PayerReceiptType;
import ru.acs.fts.schemas.album.notifgtdregistration.NotifGTDRegistrationType;
import ru.acs.fts.schemas.envelope.CustomsType;

import java.util.ArrayList;
import java.util.List;

/**
 * Бизнес процесс для обработки сообщения CMN.11001
 * ( Регистрационный номер электронной декларации ) 
 */
public class MessageCMN11138BusinessProcess extends BusinessProcess
{
	private static final String TRANSIT_MESSAGE_NAME = "transitMessage";
	private static final String ENVELOPES_NAME = "envelopes";

    /**
     * «Мультисервисная платежная система»
     */
	private static final String PAYMENTCODE1 = "0001";

    /**
     * ООО «Таможенная карта»
     */
    private static final String PAYMENTCODE2 = "0002";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

        PayerReceiptType doc =
			recvEnv.getDocument( ).getDocumentAsClass( PayerReceiptType.class );
		
		putEnvelopes( recvEnv, jobBatchContext, jobContext, doc.getReservationID());
	}

	private void putEnvelopes(
            EDEnvelope recvEnv,
            EDJobBatchContext jobBatchContext, JobContext jobContext, String reservationID)
            throws BaseProcessingException, DatabaseException
	{
		List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );
		String envelopesName = jobContext.getString( ENVELOPES_NAME );
		jobBatchContext.put( envelopesName, envelopes );
		
		String transitMessageName = jobContext.getString( TRANSIT_MESSAGE_NAME );
		EDEnvelope transitMessage = ( EDEnvelope )jobBatchContext.get( transitMessageName );
		envelopes.add( transitMessage );
		
		if (reservationID!=null&&reservationID.length()>9)
		{
            if(reservationID.substring(6,10).equals(PAYMENTCODE1)){
                CustomsType receiverCustoms = new CustomsType( );
                receiverCustoms.setCustomsCode( jobBatchContext.getConfigurator( ).getPayment1CustomsCode() );
                receiverCustoms.setExchType( jobBatchContext.getConfigurator().getPayment1ExchType() );
                EDEnvelope transitMessagep = EnvelopeCreator.createTranzitMessage(null,transitMessage,BusinessSystems.PAYMENT1,receiverCustoms);
                envelopes.add( transitMessagep );
            }
            if(reservationID.substring(6,10).equals(PAYMENTCODE2)){
                CustomsType receiverCustoms = new CustomsType( );
                receiverCustoms.setCustomsCode( jobBatchContext.getConfigurator( ).getPayment2CustomsCode() );
                receiverCustoms.setExchType( jobBatchContext.getConfigurator().getPayment2ExchType() );
                EDEnvelope transitMessagep =EnvelopeCreator.createTranzitMessage(null,transitMessage,BusinessSystems.PAYMENT2,receiverCustoms);
                envelopes.add( transitMessagep );
            }

		}
	}
}

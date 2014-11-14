package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.mpo_declaration.MPODeclarationType;
import ru.acs.fts.schemas.album.notifmporegistration.NotifMPORegistrationType;
import ru.acs.fts.schemas.envelope.CustomsType;

import java.util.ArrayList;
import java.util.List;

public class MessageCMN11106BusinessProcess extends BusinessProcess
{
    private static final String ENVELOPES_NAME = "envelopes";
    private static final String TRANSIT_MESSAGE_NAME = "transitMessage";

    private static final Logger log = LoggerFactory.getLogger( MessageCMN11106BusinessProcess.class );

    @Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
        List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );
        String envelopesName = jobContext.getString(ENVELOPES_NAME);
        jobBatchContext.put( envelopesName, envelopes );

        //String transitMessageName = jobContext.getString( TRANSIT_MESSAGE_NAME );
        EDEnvelope transitMessage = ( EDEnvelope )jobBatchContext.get( TRANSIT_MESSAGE_NAME );
        transitMessage.setInitialEnvelopeID(null);
        CryptoHelper.signEnvelope( transitMessage, true );
        envelopes.add( transitMessage );
        EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
        EDDocument regType = transitMessage.getDocument().getDocumentInContainer(NotifMPORegistrationType.class);
        CustomsType senderCustoms=new CustomsType();
        String processId = recvEnv.getProcessID( );

        Edecl_Proc_Information procInfo=getServiceHolder().getProcedureService().getProcInformation( processId );
        senderCustoms.setCustomsCode(procInfo.getCustCode());
        senderCustoms.setExchType(transitMessage.getSenderCustoms().getExchType());
        EDEnvelope cmn11106 = EnvelopeCreator.createFluentMessage(
                "CMN.11133", recvEnv.getProcessID( ), recvEnv.getParticipantID( ),
                null,
                recvEnv.getApplicationInfo( ).getSoftKind( ),
                recvEnv.getApplicationInfo( ).getSoftVersion( ),
                BusinessSystems.CUSTOMS, senderCustoms,
                BusinessSystems.DECLARANT, null,
                regType.getRawDocument()
        );

        EnvelopeService envelopeService = getServiceHolder( ).getEnvelopeService( );

        cmn11106.setIncomeEnvelopeID( recvEnv.getEnvelopeID( ) );
        /*if(!StringUtil.isNullOrEmpty(recvEnv.getInitialEnvelopeID())) {
            Edecl_Messages initialMsg=envelopeService.getEnvelope(recvEnv.getInitialEnvelopeID());
            if(initialMsg!=null) {
                cmn11106.setInitialEnvelopeID(envelopeService.getEnvelope(recvEnv.getInitialEnvelopeID()).getIncomeEnvelopeId());
            }
        }*/
        cmn11106.getEDHeader( ).setSenderCustoms(transitMessage.getSenderCustoms());
        cmn11106.setDocument( regType );
        envelopes.add(cmn11106);

        EDDocument declType = recvEnv.getDocument().getDocumentInContainer(MPODeclarationType.class);
        declType.setCurrentState(DocumentStates.CURRENT);
        Edecl_Msg_Doc doc = envelopeService.getDocument(declType.getDocumentID());
        doc.setState(DocumentStates.CURRENT);
        envelopeService.merge(doc);
    }
}

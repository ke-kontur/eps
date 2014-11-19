package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.notifgoodspresent.NotifGoodsPresentType;
import ru.acs.fts.schemas.album.permitdelaydocs.PermitDelayDocsType;
import ru.acs.fts.schemas.envelope.CustomsType;

import java.util.List;

public class MessageCMN11127BusinessProcess extends BusinessProcess
{
    @Override
    public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext )
            throws Exception
    {
        EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

        NotifGoodsPresentType doc = recvEnv.getDocument( ).getDocumentAsClass(NotifGoodsPresentType.class);
        String custCode = doc.getCustoms().getCode();
        if(!recvEnv.getApplicationInfo().getMessageKind().contains(custCode)){
            ErrorHelper.throwException(
                    jobBatchContext,
                    ResultCodes._01_00030_01,
                    ProcessingConstants.ERROR_TYPE_BUSINESS
            );
        }
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

        procInfo.setBorderCustCode(custCode);
        _serviceHolder.getProcedureService( ).merge(procInfo);

        EnvelopeService envSrv = _serviceHolder.getEnvelopeService( );

        List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
        envelopes.add( prepareLocalCMN11092_Inner( recvEnv, jobBatchContext, jobContext ) );
        envelopes.add( prepareDeclarantCMN00004( recvEnv, jobBatchContext, jobContext ) );
    }

    private EDEnvelope prepareLocalCMN11092_Inner(
            EDEnvelope recvEnv,
            EDJobBatchContext jobBatchContext, JobContext jobContext )
            throws BaseProcessingException, IllegalStateException, DatabaseException
    {
        EDEnvelope transit = EnvelopeCreator.createTranzitMessage(
                null, recvEnv,
                BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( )
        );

        return transit;
    }

    private EDEnvelope prepareDeclarantCMN00004(
            EDEnvelope recvEnv,
            EDJobBatchContext jobBatchContext, JobContext jobContext )
            throws Exception
    {
        EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage(
                MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00,
                BusinessSystems.DECLARANT, null
        );

        CryptoHelper.signEnvelope( cmn00004, false );

        return cmn00004;
    }
}

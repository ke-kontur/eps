package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import ru.acs.fts.schemas.envelope.CustomsType;

public class MessageCMN11092BusinessProcess extends BusinessProcess
{
    @Override
    public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext )
            throws Exception
    {
        EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
        EnvelopeService envSrv = _serviceHolder.getEnvelopeService( );

        List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );

        checkRefDocumentId( recvEnv, jobBatchContext, jobContext );

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

        if ( ProcedureUdFlags.isNoRemoteness( procInfo.getUdFlag( ) ) )
        {
            /**
             * Нет удаленки
             */
            envelopes.add( prepareLocalCMN11092_Inner( recvEnv, jobBatchContext, jobContext ) );
            envelopes.add( prepareDeclarantCMN00004( recvEnv, jobBatchContext, jobContext ) );
        }
        else if ( ProcedureUdFlags.isRrwTransit(procInfo.getUdFlag()) ) {

            envelopes.add( prepareRemoteADM11092( recvEnv, procInfo, jobBatchContext, jobContext ) );
        }
        else if ( ProcedureUdFlags.isLocalRemoteness( procInfo.getUdFlag( ) ) )
        {
            /**
             * Локальная удаленка
             */
            EDEnvelope inner = prepareLocalCMN11092_Inner( recvEnv, jobBatchContext, jobContext );
            EDEnvelope outer = prepareLocalCMN11092_Outer( recvEnv, procInfo, jobBatchContext, jobContext );
            inner.setInitialEnvelopeID(envSrv.getEnvelope11052InnerByEnvelopeId(recvEnv.getInitialEnvelopeID()));
            envelopes.add( inner );
            envelopes.add( outer );
            envelopes.add( prepareDeclarantCMN00004( recvEnv, jobBatchContext, jobContext ) );
        }
        else if ( ProcedureUdFlags.isRemoteRemoteness( procInfo.getUdFlag( ) ) )
        {
            /**
             * Удаленная удаленка
             */
            if ( RemotenessHelper.isCustomsLocal( procInfo.getBorderCustCode( ) ) )
            {
                /**
                 * На внешнем РТУ (ТО получателя наш)
                 */
                envelopes.add( prepareLocalCMN11092_Inner( recvEnv, jobBatchContext, jobContext ) );
                envelopes.add( prepareADM00006( recvEnv, jobBatchContext, jobContext, procInfo ) );
            }
            else
            {
                /**
                 * На внутреннем РТУ (ТО получателя - удаленный) надо отправлять на EPS
                 */
                EDEnvelope inner = prepareLocalCMN11092_Inner( recvEnv, jobBatchContext, jobContext );
                inner.setInitialEnvelopeID(envSrv.getEnvelope11052InnerByEnvelopeId(recvEnv.getInitialEnvelopeID()));
                envelopes.add( inner );
                envelopes.add( prepareRemoteCMN11092( recvEnv, procInfo, jobBatchContext, jobContext ) );
            }
        }
    }

    private void checkRefDocumentId(
            EDEnvelope recvEnv,
            EDJobBatchContext jobBatchContext, JobContext jobContext )
            throws ResultTypeException, DatabaseException
    {
        EnvelopeService eserv = jobBatchContext.getServiceHolder( ).getEnvelopeService( );

        if ( StringUtil.isNullOrEmpty( recvEnv.getDocument( ).getRefDocumentID( ) ) )
        {
            ErrorHelper.throwException(
                    jobBatchContext, ResultCodes._03_00027_02,
                    ProcessingConstants.ERROR_TYPE_BUSINESS
            );
        }

        Edecl_Msg_Doc dbdoc = eserv.getDocument( recvEnv.getDocument( ).getRefDocumentID( ) );

        if ( null == dbdoc )
        {
            ErrorHelper.throwException(
                    jobBatchContext, ResultCodes._03_00027_02,
                    ProcessingConstants.ERROR_TYPE_BUSINESS
            );
        }

        if ( ! dbdoc.getDocumentModeId( ).equalsIgnoreCase( DocumentModeIDs.REQ_OPERATIONS ) )
        {
            ErrorHelper.throwException(
                    jobBatchContext, ResultCodes._03_00027_02,
                    ProcessingConstants.ERROR_TYPE_BUSINESS
            );
        }
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

    private EDEnvelope prepareLocalCMN11092_Outer(
            EDEnvelope recvEnv,
            Edecl_Proc_Information procInfo,
            EDJobBatchContext jobBatchContext, JobContext jobContext )
            throws BaseProcessingException, IllegalStateException, DatabaseException
    {
        CustomsType receiverCustoms = new CustomsType( );
        receiverCustoms.setCustomsCode( procInfo.getBorderCustCode( ) );
        receiverCustoms.setExchType( Integer.toString( procInfo.getExchType( ) ) );

        EDEnvelope transit = EnvelopeCreator.createTranzitMessage(
                null, recvEnv,
                BusinessSystems.CUSTOMS, receiverCustoms
        );

        return transit;
    }

    private EDEnvelope prepareRemoteCMN11092(
            EDEnvelope recvEnv,
            Edecl_Proc_Information procInfo,
            EDJobBatchContext jobBatchContext, JobContext jobContext )
            throws BaseProcessingException, DatabaseException
    {
        CustomsType receiverCustoms = new CustomsType( );
        receiverCustoms.setCustomsCode( procInfo.getBorderCustCode( ) );
        receiverCustoms.setExchType( Integer.toString( procInfo.getExchType( ) ) );

        EDEnvelope transit = EnvelopeCreator.createTranzitMessage(
                null, recvEnv,
                BusinessSystems.EPS, receiverCustoms
        );

        transit.getEDHeader( ).setSenderCustoms( recvEnv.getReceiverCustoms( ) );

        return transit;
    }

    private EDEnvelope prepareRemoteADM11092(
            EDEnvelope recvEnv,
            Edecl_Proc_Information procInfo,
            EDJobBatchContext jobBatchContext, JobContext jobContext )
            throws BaseProcessingException, DatabaseException
    {
        CustomsType senderCustoms = new CustomsType( );
        senderCustoms.setCustomsCode( procInfo.getCustCode() );
        senderCustoms.setExchType( Integer.toString( procInfo.getExchType( ) ) );
        Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
        messageTypeSubstituion.put( MessageType.CMN_11092, MessageType.ADM_11092 );

        EDEnvelope transit = EnvelopeCreator.createTranzitMessage(
                messageTypeSubstituion, recvEnv,
                BusinessSystems.EPS, recvEnv.getReceiverCustoms()
        );

        transit.getEDHeader( ).setSenderCustoms( senderCustoms);

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

    private EDEnvelope prepareADM00006(
            EDEnvelope recvEnv,
            EDJobBatchContext jobBatchContext, JobContext jobContext,
            Edecl_Proc_Information procInfo )
            throws Exception
    {
        CustomsType recvCustoms = new CustomsType( );
        recvCustoms.setCustomsCode( procInfo.getCustCode( ) );
        recvCustoms.setExchType( String.valueOf( procInfo.getExchType( ) ) );

        EDEnvelope adm00006 = EnvelopeCreator.createNotificationMessage(
                MessageType.ADM_00006, recvEnv, ResultCodes._00_00000_00,
                BusinessSystems.EPS, recvCustoms
        );

        CryptoHelper.signEnvelope( adm00006, false );

        return adm00006;
    }
}

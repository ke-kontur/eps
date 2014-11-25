package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.objects.Document;
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
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.ed_container.ContainerDocType;
import ru.acs.fts.schemas.album.ed_container.DocBodyType;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;
import ru.acs.fts.schemas.album.mpo_declaration.MPODeclarationType;
import ru.acs.fts.schemas.album.notifmporegistration.NotifMPORegistrationType;
import ru.acs.fts.schemas.album.represapplicstatinfo.RepresApplicStatInfoType;
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
        EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );


        CustomsType senderCustoms=new CustomsType();
        String processId = recvEnv.getProcessID();
        Edecl_Proc_Information procInfo=getServiceHolder().getProcedureService().getProcInformation(processId);
        senderCustoms.setCustomsCode(procInfo.getCustCode());
        senderCustoms.setExchType(transitMessage.getSenderCustoms().getExchType());
        List<String> recieverInfoes = EnvelopeCreator.getReceiverInformation(BusinessSystems.CUSTOMS,senderCustoms,recvEnv.getParticipantID( ));
        transitMessage.getRoutingInfo().setReceiverInformationList(recieverInfoes);

        EDDocument declarationType = transitMessage.getDocument().getDocumentInContainer(MPODeclarationType.class);
        NotifMPORegistrationType regType = transitMessage.getDocument().getDocumentInContainer(NotifMPORegistrationType.class).getDocumentAsClass(NotifMPORegistrationType.class);
        RepresApplicStatInfoType represApplicStatInfo = transitMessage.getDocument().getDocumentInContainer(RepresApplicStatInfoType.class).getDocumentAsClass(RepresApplicStatInfoType.class);
        EDContainerType container = createNewContainer( recvEnv );
        addDocument(container, declarationType.getRawDocument());
        Object res = CryptoHelper.signDocument( regType, recvEnv );

        addDocument( container, res );

        Object res2 = CryptoHelper.signDocument( represApplicStatInfo, recvEnv );

        addDocument( container, res2 );
        EDDocument doc = new EDDocument( container );
        EDDocument transitDoc=transitMessage.getDocument();
        doc.setCurrentState(transitDoc.getCurrentState());
        doc.setIncomeDocumentID(transitDoc.getIncomeDocumentID());
        doc.setModificationID(transitDoc.getModificationID());
        doc.setOldState(transitDoc.getOldState());
        doc.setSaveType(transitDoc.getSaveType());
        doc.setUniqueness(transitDoc.getUniqueness());
        doc.setSaveBody(transitDoc.getSaveBody());
        EDDocument regTypeEdOld = transitMessage.getDocument().getDocumentInContainer(NotifMPORegistrationType.class);
        EDDocument represApplicStatInfoEDOld = transitMessage.getDocument().getDocumentInContainer(RepresApplicStatInfoType.class);
        EDDocument regTypeEdNew = doc.getDocumentInContainer(NotifMPORegistrationType.class);
        EDDocument represApplicStatInfoEDNew = doc.getDocumentInContainer(RepresApplicStatInfoType.class);
        EDDocument declarationTypeEDNew = doc.getDocumentInContainer(MPODeclarationType.class);
        declarationTypeEDNew.setCurrentState(declarationType.getCurrentState());
        declarationTypeEDNew.setUniqueness(declarationType.getUniqueness());
        declarationTypeEDNew.setSaveType(declarationType.getSaveType());
        declarationTypeEDNew.setSaveBody(declarationType.getSaveBody());

        regTypeEdNew.setUniqueness(regTypeEdOld.getUniqueness());
        regTypeEdNew.setSaveType(regTypeEdOld.getSaveType());
        regTypeEdNew.setSaveBody(regTypeEdOld.getSaveBody());
        regTypeEdNew.setCurrentState(regTypeEdOld.getCurrentState());
        represApplicStatInfoEDNew.setUniqueness(represApplicStatInfoEDOld.getUniqueness());
        represApplicStatInfoEDNew.setSaveType(represApplicStatInfoEDOld.getSaveType());
        represApplicStatInfoEDNew.setSaveBody(represApplicStatInfoEDOld.getSaveBody());
        represApplicStatInfoEDNew.setCurrentState(represApplicStatInfoEDOld.getCurrentState());

        transitMessage.setDocument(doc);

        CryptoHelper.signEnvelope(transitMessage, false);
        envelopes.add( transitMessage );
        EDDocument regTypeED = transitMessage.getDocument().getDocumentInContainer(NotifMPORegistrationType.class);
         EDEnvelope cmn11106 = EnvelopeCreator.createFluentMessage(
                "CMN.11133", recvEnv.getProcessID( ), recvEnv.getParticipantID( ),
                null,
                recvEnv.getApplicationInfo( ).getSoftKind( ),
                recvEnv.getApplicationInfo( ).getSoftVersion( ),
                BusinessSystems.CUSTOMS, senderCustoms,
                BusinessSystems.DECLARANT, null,
                 regTypeED.getRawDocument()
        );

        EnvelopeService envelopeService = getServiceHolder( ).getEnvelopeService( );

        cmn11106.setIncomeEnvelopeID( recvEnv.getEnvelopeID( ) );
        if(!StringUtil.isNullOrEmpty(regType.getRefDocumentID())){
            String initialEnvId = envelopeService.getEnvelopeWithNullIncomeForDocument(regType.getRefDocumentID());
            if(initialEnvId!=null){
                cmn11106.setInitialEnvelopeID(initialEnvId);
            }
        }
        /*if(!StringUtil.isNullOrEmpty(recvEnv.getInitialEnvelopeID())) {
            Edecl_Messages initialMsg=envelopeService.getEnvelope(recvEnv.getInitialEnvelopeID());
            if(initialMsg!=null) {
                cmn11106.setInitialEnvelopeID(envelopeService.getEnvelope(recvEnv.getInitialEnvelopeID()).getIncomeEnvelopeId());
            }
        }*/
        cmn11106.getEDHeader( ).setSenderCustoms(transitMessage.getSenderCustoms());
        cmn11106.setDocument( regTypeED );
        envelopes.add(cmn11106);

        EDDocument declType = recvEnv.getDocument().getDocumentInContainer(MPODeclarationType.class);
        declType.setCurrentState(DocumentStates.CURRENT);
        Edecl_Msg_Doc docDb = envelopeService.getDocument(declType.getDocumentID());
        docDb.setState(DocumentStates.CURRENT);
        envelopeService.merge(docDb);
    }

    public static void addDocument( EDContainerType container, Object signature )
    {
        ContainerDocType containerDocType = new ContainerDocType( );
        //containerDocType.setOrder( Integer.toString( container.getContainerDocList( ).size( ) ) );

        DocBodyType docBodyType = new DocBodyType( );
        docBodyType.setAny( signature );

        containerDocType.setDocBody(docBodyType);
        container.getContainerDocList( ).add( containerDocType );
    }

    public static EDContainerType createNewContainer( EDEnvelope envelope )
            throws Exception
    {
        EDContainerType container = envelope.getDocument( ).getDocumentAsClass( EDContainerType.class );

        EDContainerType newContainer = new EDContainerType( );
        newContainer.setDocumentModeID( DocumentModeIDs.ED_CONTAINER );
        newContainer.setFullSetIndicator( container.getFullSetIndicator( ) );
        newContainer.setDocumentID( container.getDocumentID());
        newContainer.setRefDocumentID( container.getRefDocumentID( ) );

        List<ContainerDocType> containerDocTypes = new ArrayList< ContainerDocType >( );

        /*for ( ContainerDocType cdoc : container.getContainerDocList( ) )
        {
            ContainerDocType containerDocType = new ContainerDocType( );
            containerDocType.setOrder( cdoc.getOrder( ) );

            DocBodyType docBodyType = new DocBodyType();
            docBodyType.setAny( cdoc.getDocBody( ).getAny( ) );

            containerDocType.setDocBody( docBodyType );
            containerDocTypes.add( containerDocType );
        }*/
        newContainer.setContainerDocList( containerDocTypes );

        return newContainer;
    }
}

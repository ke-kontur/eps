package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
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

public class MessageCMN11002BusinessProcess extends BusinessProcess
{
    private static final String ENVELOPES_NAME = "envelopes";
    private static final String TRANSIT_MESSAGE_NAME = "transitMessage";

    private static final Logger log = LoggerFactory.getLogger( MessageCMN11002BusinessProcess.class );

    @Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
        EDEnvelope transitMessage = ( EDEnvelope )jobBatchContext.get( TRANSIT_MESSAGE_NAME );
        String refDoc = transitMessage.getDocument().getRefDocumentID();
        if(!StringUtil.isNullOrEmpty(refDoc)){
            EnvelopeService envelopeService = getServiceHolder( ).getEnvelopeService( );
            Edecl_Msg_Doc doc = envelopeService.getDocument(refDoc);
            if(doc.getDocumentModeId().equals("1006177E")){
                String initialEnvId = envelopeService.getEnvelopeWithNullIncomeForDocument(refDoc);
                if(initialEnvId!=null){
                    transitMessage.setInitialEnvelopeID(initialEnvId);
                }
            }
        }
    }
}

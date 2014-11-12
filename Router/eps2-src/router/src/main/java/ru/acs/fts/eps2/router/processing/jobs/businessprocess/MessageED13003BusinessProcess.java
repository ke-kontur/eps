package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Participant;
import ru.acs.fts.eps2.model.entities.Edmac_Organization;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.album.commonaggregatetypescust.RFOrganizationFeaturesType;
import ru.acs.fts.schemas.album.ed_container.ContainerDocType;
import ru.acs.fts.schemas.album.ed_container.DocBodyType;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;
import ru.acs.fts.schemas.album.participantsysinfo.ParticipantSysInfoType;

public class MessageED13003BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String participantID = recvEnv.getParticipantID( );
		
		Edecl_Participant participant = _serviceHolder.getParticipantService( ).getParticipant( participantID ); 
		if ( participant == null )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00022_01,
				ProcessingConstants.ERROR_TYPE_AUTH 
			);
		}
		
		Edmac_Organization organization = _serviceHolder.getParticipantService( ).getOrganization( participant.getOrgId( ) ); 
		if ( organization == null )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00022_01,
				ProcessingConstants.ERROR_TYPE_AUTH 
			);
		}
		
		EDContainerType container = createNewContainer( recvEnv );
		
		ParticipantSysInfoType newDocument = createParticipantSysInfoDocument( participant, organization );
		
		Object res = CryptoHelper.signDocument( newDocument, recvEnv );
		
		addDocument( container, res );

		EDDocument doc = new EDDocument( container );
		for ( String cDocId : doc.getContainerDocuments( ).keySet( ) )
		{
			if ( cDocId.equalsIgnoreCase( newDocument.getDocumentID( ) ) )
				continue;
			
			EDDocument cdoc = doc.getDocumentInContainer( cDocId );
			cdoc.setUniqueness( DocumentUniquenesses.NOT_UNIQ );
		}

		jobBatchContext.put( jobContext.getString( ContextConstants.DOCUMENT_NAME ), doc );
	}
	
    public static EDContainerType createNewContainer( EDEnvelope envelope )
    	throws Exception
   	{
    	EDContainerType container = envelope.getDocument( ).getDocumentAsClass( EDContainerType.class );

		EDContainerType newContainer = new EDContainerType( );    		
		newContainer.setDocumentModeID( DocumentModeIDs.ED_CONTAINER );
		newContainer.setFullSetIndicator( container.getFullSetIndicator( ) );
		newContainer.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		newContainer.setRefDocumentID( container.getRefDocumentID( ) );

		List< ContainerDocType > containerDocTypes = new ArrayList< ContainerDocType >( );
		
		for ( ContainerDocType cdoc : container.getContainerDocList( ) )
		{
			ContainerDocType containerDocType = new ContainerDocType( );
			containerDocType.setOrder( cdoc.getOrder( ) ); 
			
			DocBodyType docBodyType = new DocBodyType();
			docBodyType.setAny( cdoc.getDocBody( ).getAny( ) ); 

			containerDocType.setDocBody( docBodyType );
			containerDocTypes.add( containerDocType );
		}
		newContainer.setContainerDocList( containerDocTypes );
		
		return newContainer;
   	}
    
	public static ParticipantSysInfoType createParticipantSysInfoDocument( 
			Edecl_Participant participant, Edmac_Organization organization )
	{
		ParticipantSysInfoType participantSysInfoDoc = new ParticipantSysInfoType( );
		RFOrganizationFeaturesType organizationFeatures = new RFOrganizationFeaturesType( );
		
		if ( organization.getInn( ) != null || 
			 organization.getKpp( ) != null || 
			 organization.getOrgN( ) != null )
		{
			organizationFeatures.setINN( organization.getInn( ) );
			organizationFeatures.setKPP( organization.getKpp( ) );
			organizationFeatures.setOGRN( organization.getOrgN( ) );
			
			participantSysInfoDoc.setOrganizationFeatures( organizationFeatures );
		}
		
		participantSysInfoDoc.setOrganizationName( organization.getOrgName( ) );
		participantSysInfoDoc.setParticipantID( participant.getParticipantId( ) );
		participantSysInfoDoc.setParticipantName( participant.getName( ) );
		participantSysInfoDoc.setSVHName( participant.getSvhName( ) );
		participantSysInfoDoc.setCertificateNumber( participant.getSvhLicNum( ) );

		participantSysInfoDoc.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		participantSysInfoDoc.setDocumentModeID( DocumentModeIDs.PARTICIPANT_SYS_INFO );
		
		
		return participantSysInfoDoc;
	}
    
    public static void addDocument( EDContainerType container, Object signature ) 
    {
        ContainerDocType containerDocType = new ContainerDocType( );        
        containerDocType.setOrder( Integer.toString( container.getContainerDocList( ).size( ) ) );
        
        DocBodyType docBodyType = new DocBodyType( );
        docBodyType.setAny( signature );
        
        containerDocType.setDocBody(docBodyType);
        container.getContainerDocList( ).add( containerDocType );
    }
	
}

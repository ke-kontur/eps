package ru.acs.fts.aud.router.processing.jobs.bps;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.fts.aud.model.entities.Document;
import ru.acs.fts.aud.model.entities.Packet;
import ru.acs.fts.aud.model.entities.PacketGTD;
import ru.acs.fts.aud.model.persistence.ArchiveService;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;
import ru.acs.fts.aud.router.model.managers.ArchiveManager;
import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.definitions.DocumentModeIDs;
import ru.acs.fts.aud.router.processing.definitions.MessageKinds;
import ru.acs.fts.aud.router.processing.helpers.DocumentCreator;
import ru.acs.fts.aud.router.processing.helpers.MessageCreator;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.util.time.TimeUtil;
import ru.acs.fts.schemas.aud.aud_registryrequest.AUDRegistryRequestType;
import ru.acs.fts.schemas.aud.aud_registryresponse.AUDRegistryResponseType;
import ru.acs.fts.schemas.aud.aud_registryresponse.RegistryPacketInfoType;
import ru.acs.fts.schemas.aud.aud_registryresponse.RegistryRowType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedDocumentInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedPacketInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDArchiveDocumentIdWithVersionType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentKindVersionIdInfoOptType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDGTDIDType;

public class RegistryBusinessProcess extends BusinessProcess
{
	@Override
	public void process( AudJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		AudEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		AUDRegistryRequestType request =
			recvEnv.getDocument( ).getDocumentAsClass( AUDRegistryRequestType.class );

		AUDRegistryResponseType response = createResponse( request );
		
		AudEnvelope envelope = MessageCreator.createResponseEnvelope( 
			MessageKinds.AUD_REGISTRY_RES, recvEnv, 
			response, jobBatchContext.getConfigurator( ) 
		);
		
		envelope.setWasCompressed( true );
		
		putEnvelopeIntoContext( jobBatchContext, jobContext, envelope );
	}
	
	private AUDRegistryResponseType createResponse( AUDRegistryRequestType request ) throws PersistenceException
	{
		AUDRegistryResponseType response = new AUDRegistryResponseType( );
		DocumentCreator.initAudResponse( request, response );
		response.setDocumentModeID( DocumentModeIDs.AUD_REGISTRY_RESPONSE );
		List< RegistryPacketInfoType > registryInfos = createRegistryReport( request );
		response.setAUDPacketRegistryRowList( registryInfos );
		response.setNullFlag( registryInfos.isEmpty( ) );
		
		return response;
	}
	
	private List< RegistryPacketInfoType > createRegistryReport( AUDRegistryRequestType request ) throws PersistenceException
	{
		List< RegistryPacketInfoType > registryReports = new ArrayList< RegistryPacketInfoType >( );
		ArchiveService archiveService = _serviceHolder.getArchiveService( );
		
		Timestamp dateBegin = TimeUtil.convertToTimestamp( request.getDateBegin( ) );
		Timestamp dateEnd= TimeUtil.convertToTimestamp( request.getDateStop( ) );
		String dateIndicator = request.getDateIndicatior( );
		
		// Set< String > processedPacketIds = new HashSet< String >( );
		List< Document > documents = archiveService.getDocumentReportLoadStatistics( dateBegin, dateEnd, dateIndicator );
		Map< Packet, List< Document > > packets = new HashMap< Packet, List< Document > >( );
		for ( Document document : documents )
		{
			Packet packet = document.getPacket( );
			List< Document > packetDocuments = packets.get( packet );
			if ( null == packetDocuments )
			{
				packetDocuments = new ArrayList< Document >( );
				packets.put( packet, packetDocuments );
			}
			packetDocuments.add( document );
		}
		
		for ( Packet packet : packets.keySet( ) )
			registryReports.add( createRegistryPacketInfo( packet, packets.get( packet ) ) );
		
		return registryReports;
	}
	
	private RegistryPacketInfoType createRegistryPacketInfo( Packet packet, List< Document > documents )
	{
		if ( null == documents )
			documents = new ArrayList< Document >( );
		
		RegistryPacketInfoType packetInfo = new RegistryPacketInfoType( );
		packetInfo.setPutDateTime( TimeUtil.convertToDateTime( packet.getCreationDate( ) ) );
		packetInfo.setArchivePacketId( packet.getId( ) );
		packetInfo.setAppliedPacketInfo( createAppliedPacketInfo( packet ) );
		
		List< RegistryRowType > rows = new ArrayList< RegistryRowType >( );
		packetInfo.setRegistryRowList( rows );
		
		for ( Document document : documents )
			rows.add( createRegistryRow( document ) );
		
		return packetInfo;
	}
	
	private RegistryRowType createRegistryRow( Document document )
	{
		RegistryRowType registryRow = new RegistryRowType( );
		registryRow.setIsActualDocumentIndicator( 0 != document.getActual( ) );
		Document container = document.getDocumentContainer( );
		if ( null != container )
			registryRow.setArchiveContainerDocumentId( container.getId( ) );
		
		registryRow.setArchiveDocInfo( createDocumentInfo( document ) );
		registryRow.setAppliedDocInfo( createAppliedDocumentId( document ) );
		
		return registryRow;
	}
	
	private AUDAppliedDocumentInfoType createAppliedDocumentId( Document document )
	{
		AUDAppliedDocumentInfoType appliedDocumentInfo = new AUDAppliedDocumentInfoType( );
		appliedDocumentInfo.setAppliedDocumentId( document.getAppliedId( ) );
		appliedDocumentInfo.setDescription( document.getDescription( ) );
		
		AUDDocumentKindVersionIdInfoOptType documentKindVersionInfo = new AUDDocumentKindVersionIdInfoOptType( );
		documentKindVersionInfo.setAppliedDocumentKindId( document.getDocumentKindVersion( ).getDocumentKind( ).getDocumentModeId( ) );
		String namespace = document.getDocumentKindVersion( ).getSchema( ).getNamespace( );
		if ( null != document.getDocumentKindVersion( ).getSchema( ).getNamespace( ) )
			documentKindVersionInfo.setAppliedDocumentKindVersionId( namespace );
		
		appliedDocumentInfo.setDocumentKindVersionIdInfoOpt( documentKindVersionInfo );
		
		return appliedDocumentInfo;
	}
	
	private AUDArchiveDocumentIdWithVersionType createDocumentInfo( Document document )
	{
		AUDArchiveDocumentIdWithVersionType documentInfo = new AUDArchiveDocumentIdWithVersionType( );
		documentInfo.setArchiveDocumentId( document.getId( ) );
		documentInfo.setDocumentVersionNumber( BigInteger.valueOf( ( long ) document.getVersionNumber( ) ) );
		
		return documentInfo;
	}
	
	private AUDAppliedPacketInfoType createAppliedPacketInfo( Packet packet )
	{
		AUDAppliedPacketInfoType appliedPacketInfo = new AUDAppliedPacketInfoType( );
		appliedPacketInfo.setAppliedPacketId( packet.getAppliedId( ) );
		appliedPacketInfo.setAppliedProcessId( packet.getId( ) );
		appliedPacketInfo.setDescription( packet.getDescription( ) );
		if ( ArchiveManager.isGtd( packet ) )
		{
			appliedPacketInfo.setAppliedPacketType( Packet.PACKET_TYPE_GTD );
			List< AUDGTDIDType > gtdids = appliedPacketInfo.getAUDGTDIDList( );
			
			for ( PacketGTD packetGTD : packet.getPacketGtds( ) )
				gtdids.add( createAudGtd( packetGTD ) );
		}
		else
			appliedPacketInfo.setAppliedPacketType( Packet.PACKET_TYPE_NONGTD );
		
		return appliedPacketInfo;
	}
	
	private AUDGTDIDType createAudGtd( PacketGTD packetGtd )
	{
		AUDGTDIDType gtdId = new AUDGTDIDType( );
		gtdId.setCustomsCode( packetGtd.getCustCode( ) );
		gtdId.setRegistrationDate( TimeUtil.convertToLocalDate( packetGtd.getDate( ) ) );
		gtdId.setGTDNumber( packetGtd.getRegnum( ) );
		gtdId.setGTDIDState( packetGtd.getLiveType( ) );
		
		return gtdId;
	}
}

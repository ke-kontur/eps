package ru.acs.fts.aud.router.processing.jobs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.time.DateFormatUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.aud.model.entities.Document;
import ru.acs.fts.aud.model.entities.Packet;
import ru.acs.fts.aud.model.entities.PacketGTD;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;
import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.definitions.AudContextConstants;
import ru.acs.fts.aud.router.processing.definitions.DocumentModeIDs;
import ru.acs.fts.aud.router.processing.definitions.ErrorMessageSourceKeys;
import ru.acs.fts.aud.router.processing.definitions.MessageKinds;
import ru.acs.fts.aud.router.processing.helpers.ExceptionHelper;
import ru.acs.fts.aud.router.processing.helpers.MessageCreator;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.aud.aud_packetinventoryrequest.AUDPacketInventoryRequestType;
import ru.acs.fts.schemas.aud.aud_packetinventoryresponse.AUDPacketInventoryResponseType;
import ru.acs.fts.schemas.aud.aud_packetinventoryresponse.DocumentInventoryItemType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDGTDIDType;

public class CreatePacketInventoryResponseJob extends AudJob
{
	private static final Logger log = LoggerFactory
			.getLogger( CreatePacketInventoryResponseJob.class );
	private static final String ACTION = "Отправка ответного сообшения";

	@Override
	public void audExecute( AudJobBatchContext jobBatchContext, JobContext jobContext ) throws Exception
	{
		AudEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		AUDPacketInventoryRequestType request = recvEnv.getDocument( ).getDocumentAsClass(
				AUDPacketInventoryRequestType.class );

		String appliedId = request.getAppliedProcessId( );
		AUDGTDIDType audGTD = request.getAUDGTDID( );

		Packet packet = null;
		if ( null != appliedId )
			packet = _serviceHolder.getArchiveService( ).getPacket( request.getAppliedProcessId( ) );
		else if ( null != audGTD )
			packet = _archiveManager.getPacketsByGtdId( audGTD ).get( 0 );
		if ( null == packet )
			ExceptionHelper.throwArchiveException( ProcessingConstants.ERROR_TYPE_NORMAL,
					ErrorMessageSourceKeys.ERROR_ARCHIVE_1001, ( Object[ ] )null );

		log.info( "[CreatePacketInventoryResponse - {}]", request.getDocumentID( ) );
		AUDPacketInventoryResponseType response = createAudPacketInventoryResponse( packet,
				request.getDocumentID( ), request.isTestDocumentIndicator( ) );

		AudEnvelope envelope = MessageCreator.createResponseEnvelope(
				MessageKinds.AUD_PACKET_INVENTORY_RES, jobBatchContext.getReceivedEnvelope( ),
				response, jobBatchContext.getConfigurator( ) );

		String envelopeName = jobContext.getString( AudContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( envelopeName, envelope );
	}

	private AUDPacketInventoryResponseType createAudPacketInventoryResponse(
		Packet packet,
		String refdocId,
		boolean isTestIndicator
	) throws PersistenceException
	{
		AUDPacketInventoryResponseType response = new AUDPacketInventoryResponseType( );
		response.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		response.setRefDocumentID( refdocId );
		response.setDocumentModeID( DocumentModeIDs.AUD_PACKET_INVENTORY_RESPONSE );
		response.setAppliedProcessId( packet.getId( ) );
		response.setPacketType( packet.getPacketType( ) );
		response.setIssued( new DateTime( ) );
		response.setDocumentDateTime( new DateTime( ) );
		response.setTestDocumentIndicator( isTestIndicator );

		List< Document > docs = packet.getDocumentsInside( );
		List< DocumentInventoryItemType > docInvs = new ArrayList< DocumentInventoryItemType >( );
		response.setDocumentInventoryItemList( docInvs );

		for ( Document doc : docs )
		{
			DocumentInventoryItemType docInv = new DocumentInventoryItemType( );
			docInv.setAppliedDocumentId( doc.getAppliedId( ) );
			docInv.setArchiveDocumentId( getArchiveDocsIds( doc.getAppliedId( ) ) );
			docInv.setMaxVersion( getMaxVersion( doc.getAppliedId( ) ) );

			docInvs.add( docInv );
		}

		List< String > packetIds = new ArrayList< String >( );
		response.setAppliedPacketIdList( packetIds );

		if ( null != packet.getPacketType( ) && packet.getPacketType( ).equals( "01" ) )
		{
			List< PacketGTD > packetsGTD = _serviceHolder.getArchiveService( )
					.getPacketsGTDByPacket( packet );
			for ( PacketGTD pack : packetsGTD )
			{
				packetIds.add( generateAppliedId( pack ) );
			}
		}
		else
			packetIds.add( packet.getAppliedId( ) );

		return response;
	}

	private BigInteger getMaxVersion( String docAppliedId ) throws PersistenceException
	{
		return _serviceHolder.getArchiveService( ).getDocMaxVersion( docAppliedId );
	}

	private String getArchiveDocsIds( String docId ) throws PersistenceException
	{
		List< Document > docs = _serviceHolder.getArchiveService( ).getDocumentsByAppliedId( docId,
				false );
		StringBuilder result = new StringBuilder( );
		for ( Document doc : docs )
		{
			result.append( doc.getId( ) );
			result.append( ";" );
		}
		return result.toString( );
	}

	private String generateAppliedId( PacketGTD packetGTD )
	{
		StringBuilder sb = new StringBuilder( packetGTD.getCustCode( ) );
		sb.append( "/" );
		sb.append( DateFormatUtils.format( packetGTD.getDate( ), "ddMMyy" ) );
		sb.append( packetGTD.getRegnum( ) );
		return sb.toString( );
	}

	@Override
	public String getAction( )
	{
		return ACTION;
	}

}

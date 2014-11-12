package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import org.springframework.oxm.Unmarshaller;

import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Reqdoc_Info;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.EnvelopeOperator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.schemas.album.graphicdocrequest.DocumentType;
import ru.acs.fts.schemas.album.graphicdocrequest.GraphicDocRequestType;

public class MessageCMN11120BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnvelope = jobBatchContext.getReceivedEnvelope( );
		EnvelopeOperator envelopeOperator = _serviceHolder.getEnvelopeOperator( );
		EnvelopeService envelopeService = _serviceHolder.getEnvelopeService( );
		
		Edecl_Messages cmn11119Msg = envelopeOperator.getIncomeEnvelope( recvEnvelope );
		Edecl_Msg_Doc cmn11119Doc = envelopeService.getDocument( cmn11119Msg.getDocumentId( ) );
		
		EnvelopeUnmarshaller envUnmarshaller = new EnvelopeUnmarshaller( );
		Unmarshaller unmarshaller = jobBatchContext.getServiceHolder( ).getUnmarshaller( );
		Object sigDoc = envUnmarshaller.unmarshallBaseDocOrSignature( cmn11119Doc.getBody( ), unmarshaller );
		
		List< DocumentType > documents = ( new EDDocument( sigDoc ).getDocumentAsClass( GraphicDocRequestType.class ) ).getDocumentList( );

		Edecl_Messages msg11003Msg = envelopeOperator.getIncomeEnvelope( cmn11119Msg );
		String envelopeId = msg11003Msg.getEnvelopeId( );
		String documentId = msg11003Msg.getDocumentId( );
		
		for ( DocumentType document : documents )
		{
			String position = String.valueOf( document.getRequestPositionID( ) );
			Edecl_Reqdoc_Info reqDocInfo = envelopeService.getReqDocInfo( envelopeId, documentId, position );
			if ( null != reqDocInfo )
			{
				reqDocInfo.setDocCode( "00000" );
				envelopeService.merge( reqDocInfo );
			}
			else
			{
				ErrorHelper.throwException( "По заданному InitialEnvelopeID не удалось отыскать объект Edecl_Reqdoc_Info.", 
						documentId, ResultCodes._03_00028_01, ProcessingConstants.ERROR_TYPE_DATA );
			}
		}
	}
}

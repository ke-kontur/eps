package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeHelper;
import ru.acs.fts.schemas.album.ed_container.ContainerDocType;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;
import ru.acs.fts.schemas.album.esadout_cu.ESADoutCUType;

public class MessageCMN11024BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		EDContainerType container = recvEnv.getDocument( ).getDocumentAsClass( EDContainerType.class );

		Edecl_Msg_Doc bdoc = _serviceHolder.getEnvelopeService( ).getDocument( container.getDocumentID( ) );
		if ( null != bdoc )
		{
			bdoc.setState( DocumentStates.CURRENT );
			_serviceHolder.getEnvelopeService( ).merge( bdoc );
		}		
		
		ESADoutCUType esadOutCU = null;
		for ( ContainerDocType cdoc : container.getContainerDocList( ) )
		{
			Object cobj = cdoc.getDocBody( ).getAny( );
			if ( null == cobj )
				continue;

			EDDocument cxdoc = new EDDocument( cobj );
			
			if ( cxdoc.isDocumentOfClass( ESADoutCUType.class ) )
				esadOutCU = cxdoc.getDocumentAsClass( ESADoutCUType.class );

			String documentId = cxdoc.getDocumentID( );
			bdoc = _serviceHolder.getEnvelopeService( ).getDocument( documentId );
			if ( null != bdoc )
			{
				bdoc.setState( DocumentStates.CURRENT );
				_serviceHolder.getEnvelopeService( ).merge( bdoc );
			}
		}

		EDEnvelope  respEnvelope = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( )
		);
		
		Edecl_Proc_Information procInfo = _serviceHolder.getProcedureService( )
				.getProcInformation( recvEnv.getProcessID( ) );
		
		if ( ProcedureUdFlags.isTrivialRemoteness( procInfo.getUdFlag( ) ) )
			EnvelopeHelper.setUpMessageKind( recvEnv, procInfo );

		procInfo.setTransferType( esadOutCU.getCustomsProcedure( ) );
		procInfo.setCustProcedureCode( esadOutCU.getCustomsModeCode( ) );

		_serviceHolder.getProcedureService( ).persist( procInfo );

		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( envelopeName, respEnvelope );
	}

}

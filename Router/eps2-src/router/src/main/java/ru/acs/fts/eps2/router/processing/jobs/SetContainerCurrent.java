package ru.acs.fts.eps2.router.processing.jobs;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

public class SetContainerCurrent extends EDJob
{
	protected final Logger log = LoggerFactory.getLogger( SetContainerCurrent.class );
	
	protected final String action = "Установка текущего контейнера в CURRENT";
	protected final String errorQueueToSend = ErrorQueueTypes.ERROR_DB_SAVE;
	
	private Map< String, Boolean > _doOperations;
	
	// @formatter:off
	@Required public void setDoOperations( Map< String, Boolean > doOperations ) { _doOperations = doOperations; }
	public Map< String, Boolean > getDoOperations( ) { return _doOperations; }
	// @formatter:on

	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		String messageType = recvEnv.getMessageType( );
		if ( ! _doOperations.containsKey( messageType ) ||
			 ! _doOperations.get( messageType ) )
		{
			jobBatchContext.getProcessingResult( ).addOKProcessingInfo( action );
			return ;
		}

		EnvelopeService envSrv = jobBatchContext.getServiceHolder( ).getEnvelopeService( );
		
		setDocumentCurrent( recvEnv.getDocument( ), jobBatchContext, envSrv );

		for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );
			setDocumentCurrent( cdoc, jobBatchContext, envSrv );
		}
		
		jobBatchContext.getProcessingResult( ).addOKProcessingInfo( action );
	}

	@Override
	public String getAction( )
	{
		return action;
	}

	private void setDocumentCurrent( 
			EDDocument doc, EDJobBatchContext jobBatchContext,
			EnvelopeService envSrv ) 
		throws ResultTypeException, DatabaseException
	{
		String refDocumentId = doc.getRefDocumentID( ); 
		if ( ! StringUtil.isNullOrEmpty( refDocumentId ) )
		{
			Edecl_Msg_Doc dbDoc = envSrv.getDocument( refDocumentId );
			if ( null == dbDoc )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00027_02, 
					ProcessingConstants.ERROR_TYPE_BUSINESS 
				);
			}
			
			dbDoc.setState( DocumentStates.NOTCHANGEABLE );
			envSrv.persist( dbDoc );
		}
		
		Edecl_Msg_Doc dbDoc = envSrv.getDocument( doc.getDocumentID( ) );
		if ( null == dbDoc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._01_00100_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		dbDoc.setState( DocumentStates.CURRENT );
		envSrv.persist( dbDoc );		
	}
}

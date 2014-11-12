package ru.acs.fts.eps2.router.processing.jobs;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class CreateResponseMessage extends EDJob
{
	protected final Logger log = LoggerFactory.getLogger( CreateResponseMessage.class );
	
	protected final String action = "Создание ответного сообщения";	
	protected final String errorQueueToSend = ErrorQueueTypes.ERROR_FATAL;

	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		List< EDDocument > listDocsToCreate = 
			initListDocsToCreateMessages( jobBatchContext, jobContext );
		
		List< EDEnvelope > envelopesCreated = 
			createEnvelopesListToSend( jobBatchContext, jobContext, listDocsToCreate );
		
		/**
		 * Иногда возникает неободимости в ответные конверты вставить ProccessID, хотя 
		 * во входном конверте этого поля не было ( пример - ED.11001 создание процедуры )
		 * поэтому есть вот такой флаг, нужно только учитывать, чтобы в 
		 * jobBatchContex["processId"] были данные
		 */
		boolean isFillProcessId = jobContext.getBoolean( ContextConstants.FILL_PROCESS_ID );
		
		if ( envelopesCreated.size( ) == 1 )
		{
			EDEnvelope created = envelopesCreated.get( 0 ); 
			if ( isFillProcessId )
			{
				created.getEDHeader( ).setProccessID( 
					jobBatchContext.getString( ContextConstants.PROCESS_ID ) 
				);
			}
			
			jobBatchContext.put( 
				jobContext.getString( ContextConstants.ENVELOPE_NAME ),
				created 
			);
		}
		else
		{
			if ( isFillProcessId )
			{
				for ( EDEnvelope envelope : envelopesCreated )
				{
					envelope.getEDHeader( ).setProccessID( 
						jobBatchContext.getString( ContextConstants.PROCESS_ID ) 
					);
				}
			}
			
			jobBatchContext.put( 
				jobContext.getString( ContextConstants.ENVELOPE_NAME ),
				envelopesCreated 
			);
		}
		
		jobBatchContext.getProcessingResult( ).addOKProcessingInfo( action );
	}

	private List< EDEnvelope > createEnvelopesListToSend( 
			EDJobBatchContext jobBatchContext, 
			JobContext jobContext, List< EDDocument > listDocsToCreate ) 
		throws BaseProcessingException, DatabaseException
	{
		List< EDEnvelope > envelopesCreated = new ArrayList< EDEnvelope >( );
		
		String messageType = jobContext.getString( ContextConstants.MESSAGE_TYPE );
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		for ( EDDocument document : listDocsToCreate )
		{
			EDEnvelope env = EnvelopeCreator.createResponseMessage( 
				messageType, recvEnv, document.getRawDocument( ), 
				recvEnv.getSenderSystem( ), recvEnv.getSenderCustoms( ) 
			);
			
			env.setDocument( document );
			
			envelopesCreated.add( env );
		}
		
		return envelopesCreated;
	}

	@SuppressWarnings( "unchecked" )
	private List< EDDocument > initListDocsToCreateMessages( 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
	{
		List< EDDocument > listDocsToCreate = new ArrayList< EDDocument >( );

		if ( jobContext.contains( ContextConstants.DOCUMENT_NAME ) && 
			 jobBatchContext.contains( jobContext.getString( ContextConstants.DOCUMENT_NAME ) ) )
		{
			EDDocument obj = ( EDDocument )jobBatchContext.get( jobContext.getString( ContextConstants.DOCUMENT_NAME ) );
			if ( obj instanceof List )
			{
				listDocsToCreate = ( List< EDDocument > )obj; 
			}
			else
			{
				listDocsToCreate.add( obj );
			}
		}
		
		return listDocsToCreate;
	}

	@Override
	public String getAction( )
	{
		return action;
	}
}

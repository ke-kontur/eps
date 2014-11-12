package ru.acs.fts.eps2.router.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;

public class FailUnmarshallerJob extends EDJob
{
	private static final Logger log = LoggerFactory.getLogger( FailUnmarshallerJob.class );
	private static final String ACTION = "Упасть как ошибка JiBX, если структурный контроль прошел успешно";

	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		Exception exc = ( Exception )jobBatchContext.get( ContextConstants.UNMARSHALLER_EXCEPTION );
		if ( null == exc )
			return ;
		
		String documentId = "<не определен>";
		
		try
		{
			EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
			documentId = recvEnv.getDocument( ).getDocumentID( );
		}
		catch ( Exception exc2 )
		{
			log.error( "", exc2 );
		}
		
		ErrorHelper.throwException( 
			exc.getLocalizedMessage( ), documentId, 
			ResultCodes._01_00070_01, 
			ProcessingConstants.ERROR_TYPE_BUSINESS 
		);
	}

	@Override
	public String getAction( )
	{
		return ACTION;
	}
}

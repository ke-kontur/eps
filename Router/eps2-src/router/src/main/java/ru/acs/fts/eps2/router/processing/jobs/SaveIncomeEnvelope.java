package ru.acs.fts.eps2.router.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.EnvelopeOperator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;

public class SaveIncomeEnvelope extends EDJob
{
	protected final Logger log = LoggerFactory.getLogger( SaveIncomeEnvelope.class );
	
	protected final String action = "Сохранение входящего сообщения";
	protected final String errorQueueToSend = ErrorQueueTypes.ERROR_DB_SAVE;

	private EnvelopeOperator envelopeOperator;

	@Required
	public void setEnvelopeOperator( EnvelopeOperator envelopeOperator ) { this.envelopeOperator = envelopeOperator; }
	public EnvelopeOperator getEnvelopeOperator( ) { return envelopeOperator; }

	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		if ( jobContext.get( ContextConstants.NEED_FLUSH ) != null && 
			 jobContext.getString( ContextConstants.NEED_FLUSH ).equals( "true" ) )
		{
			if ( jobContext.getBoolean( ContextConstants.NO_NEED_SAVE_BODY ) )
			{
				EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
				if ( recvEnv.getMessageType( ).equals( MessageType.CMN_00002 ) ||
					 recvEnv.getMessageType( ).equals( MessageType.CMN_00004 ) )
				{
					recvEnv.getDocument( ).setSaveBody( false );
				}
			}
			
			envelopeOperator.persistEnvelope( jobBatchContext.getReceivedEnvelope( ) );
		}

		jobBatchContext.getProcessingResult( ).addOKProcessingInfo( action );
	}

	@Override
	public String getAction( )
	{
		return action;
	}

}

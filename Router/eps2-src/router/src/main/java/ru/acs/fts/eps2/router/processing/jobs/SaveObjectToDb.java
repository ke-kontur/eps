package ru.acs.fts.eps2.router.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.EnvelopeOperator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;

import java.util.List;

/**
 * Класс для сохранения конвертов в базу данных
 */
public class SaveObjectToDb extends EDJob
{
	protected final Logger log = LoggerFactory.getLogger( SaveObjectToDb.class );
	
	protected final String action = "Сохранение объекта в БД";
	protected final String errorQueueToSend = ErrorQueueTypes.ERROR_DB_SAVE;

	private ProcedureService procedureService;
	private EnvelopeOperator envelopeOperator;
	
	@Required
	public void setProcedureService( ProcedureService procedureService ) { this.procedureService = procedureService; }
	public ProcedureService getProcedureService( ) { return procedureService; }
	
	@Required
	public void setEnvelopeOperator( EnvelopeOperator operator ) { envelopeOperator = operator; }
	public EnvelopeOperator getEnvelopeOperator( ) { return envelopeOperator; }
	
	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		boolean needFlushFlag = ( jobContext.get( ContextConstants.NEED_FLUSH ) != null ) && 
								( jobContext.get( ContextConstants.NEED_FLUSH ).equals( "true" ) );

		String objectToSaveKey = jobContext.getString( ContextConstants.OBJECT_TO_SAVE );
		
		Object object = jobBatchContext.get( objectToSaveKey );
		
		if ( object instanceof List )
		{
			@SuppressWarnings( "unchecked" )
			List< Object > objects = ( List< Object > )object;
			
			for ( Object obj : objects )
			{
				mapObjectToDb( jobBatchContext, jobContext, obj, needFlushFlag );
			}
		}
		else
		{
			mapObjectToDb( jobBatchContext, jobContext, object, needFlushFlag );
		}
		
		jobBatchContext.getProcessingResult( ).addOKProcessingInfo( action );
	}

	@Override
	public String getAction( )
	{
		return action;
	}
	
	private void mapObjectToDb( 
			EDJobBatchContext jobBatchContext, JobContext jobContext, 
			Object object, boolean needFlushFlag ) 
		throws Exception
	{
		if ( null == object )
			return ;
		
		if ( object instanceof EDEnvelope )
		{
			EDEnvelope env = ( EDEnvelope )object;
			
			EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
			if ( ! recvEnv.getEnvelopeID( ).equals( env.getEnvelopeID( ) ) )
				env.setLineageId( recvEnv.getLineageId( ) );

			envelopeOperator.persistEnvelope( env );
		}
		else if ( object instanceof Edecl_Proc_Information )
		{
			procedureService.persist( ( Edecl_Proc_Information )object );
		}

		jobBatchContext.getProcessingResult( ).addOKProcessingInfo( action );
	}
}

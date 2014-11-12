package ru.acs.fts.eps2.engine.processing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.oxm.Marshaller;

import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;
import ru.acs.fts.eps2.engine.restWs.struct.StructRestWs;

public class StructControlRequest extends Job
{
	protected final Logger log = LoggerFactory.getLogger( StructControlRequest.class );
	
	protected final String action = "Вызов веб-сервиса структурного контроля";
	protected final String errorQueueToSend = ErrorQueueTypes.ERROR_STRUCTURE;

	private Marshaller envelopeMarshaller;
	
	private StructRestWs _structRestWs;
	
	// @formatter:off
	@Required public void setEnvelopeMarshaller( Marshaller envelopeMarshaller ) { this.envelopeMarshaller = envelopeMarshaller; }
	public Marshaller getEnvelopeMarshaller( ) { return envelopeMarshaller; }
	
	@Required public void setStructRestWs( StructRestWs structRestWs ) { _structRestWs = structRestWs; }
	public StructRestWs getStructRestWs( ) { return _structRestWs; }
	// @formatter:on
	
	@Override
	public void execute( JobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		Envelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		Object document = recvEnv.getDocument( ).getNakedDocument( );
		
		_structRestWs.validate( document, recvEnv );
	}

	@Override
	public String getAction( )
	{
		return action;
	}
}

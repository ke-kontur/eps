package ru.acs.fts.eps2.engine.util;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.configuration.RtuCodePatternsHolder;
import ru.acs.fts.eps2.model.services.ServiceHolder;

public final class RemotenessHelper 
{
	private static ServiceHolder _serviceHoder;
	
	private static RtuCodePatternsHolder _rtuCodePatternsHolder;
	
	@Required
	public void setServiceHolder( ServiceHolder serviceHolder ) { _serviceHoder = serviceHolder; }
	public ServiceHolder getServicehHolder( ) { return _serviceHoder; }
	
	@Required
	public void setRtuCodePatternsHolder( RtuCodePatternsHolder rtuCodePatternsHolder ) { _rtuCodePatternsHolder = rtuCodePatternsHolder; }
	public RtuCodePatternsHolder getRtuCodePatternsHolder( ) { return _rtuCodePatternsHolder; } 
	
	@Deprecated
	public static boolean areSenderReceiverCustomsOnLocalEps(  // NO_UCD (unused code)
			String senderCustomsCode, String receiverCustomsCode )
	{
		return _rtuCodePatternsHolder.match( senderCustomsCode ) 
			&& _rtuCodePatternsHolder.match( receiverCustomsCode );
	}
	
	@Deprecated
	public static boolean areSenderLocalReceiverRemote( String senderCode, String receiverCode ) // NO_UCD (unused code)
	{
		return _rtuCodePatternsHolder.match( senderCode ) 
			&& ! _rtuCodePatternsHolder.match( receiverCode );
	}
	
	@Deprecated
	public static boolean areSenderRemoteReceiverLocal( String senderCode, String receiverCode ) // NO_UCD (unused code)
	{
		return ! _rtuCodePatternsHolder.match( senderCode ) &&
			_rtuCodePatternsHolder.match( receiverCode );
	}
	
	public static boolean areCustomsOnDifferentEps( String senderCode, String receiverCode )
	{
		return _rtuCodePatternsHolder.match( senderCode ) ^ 
			_rtuCodePatternsHolder.match( receiverCode );
	}
	
	public static boolean isCustomsRemote( String customsCode )
	{
		return ! _rtuCodePatternsHolder.match( customsCode );
	}
	
	public static boolean isCustomsLocal( String customsCode )
	{
		return _rtuCodePatternsHolder.match( customsCode );
	}
	
	public static boolean areCustomsLocal( String code1, String code2 )
	{
		return _rtuCodePatternsHolder.match( code1 ) 
			&& _rtuCodePatternsHolder.match( code2 );
	}
}

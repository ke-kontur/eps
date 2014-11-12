package ru.acs.fts.eps2.util.helpers;

import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UUIDGen
{
	private static final Logger log = LoggerFactory.getLogger( UUIDGen.class );
	
	private static final ReentrantLock _lock = new ReentrantLock( );
	private static final int _batchSize = 5000;
	private static BlockingQueue< UUID > _uuids = new LinkedBlockingQueue< UUID >( );
	
	static
	{
		populate( );
	}
	
	private static void populate( )
	{
		log.info( "PROC: наполняем генератор UUID'ов ..." );
		
		for ( int i = 0; i < _batchSize; ++i )
		{
			_uuids.add( UUID.randomUUID( ) );
		}
	}
	
	public static UUID getUUID( )
	{
		UUID uuid = null;
		while ( _lock.isLocked( ) )
		{
			try
			{
				Thread.sleep( 30 );
			}
			catch ( Exception exc )
			{
				log.debug( "problem", exc );
			}
		}
		
		try
		{
			uuid = _uuids.take( );
			if ( _uuids.peek( ) == null )
			{
				if ( _lock.tryLock( ) )
				{
					try
					{
						populate( );
					}
					finally
					{
						_lock.unlock( );
					}
				}
			}
		}
		catch ( InterruptedException exc )
		{
			Thread.currentThread( ).interrupt( );
		}
		
		if ( _uuids.size( ) > _batchSize )
			throw new RuntimeException( String.format( "Количество UUID'ов превысило %d!", _batchSize ) );
		
		if ( null == uuid )
			throw new RuntimeException( "Нет доступных UUID'ов!" );
		
		log.info( String.format( "Выдан UUID: %s", uuid.toString( ) ) );
		
		return uuid;
	}
}

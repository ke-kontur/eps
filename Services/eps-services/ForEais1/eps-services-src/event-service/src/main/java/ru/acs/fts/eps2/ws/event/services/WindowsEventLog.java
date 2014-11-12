package ru.acs.fts.eps2.ws.event.services;

import com.sun.jna.platform.win32.Advapi32;
import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;
import com.sun.jna.platform.win32.WinNT.HANDLE;

public class WindowsEventLog
{
	private HANDLE _eventLog;
	
	public boolean openEventLog( String source, String log )
	{
		if ( !closeEventLog( ) )
			return false;
		
		String eventSourceKeyPath = String.format( "SYSTEM\\CurrentControlSet\\Services\\EventLog\\%s\\%s", log, source );
		
		if ( Advapi32Util.registryCreateKey( WinReg.HKEY_LOCAL_MACHINE, eventSourceKeyPath ) )
		{		
			Advapi32Util.registrySetIntValue( WinReg.HKEY_LOCAL_MACHINE, eventSourceKeyPath, "TypesSupported", 7 );
			Advapi32Util.registrySetIntValue( WinReg.HKEY_LOCAL_MACHINE, eventSourceKeyPath, "CategoryCount", 6 );
			Advapi32Util.registrySetStringValue( WinReg.HKEY_LOCAL_MACHINE, eventSourceKeyPath, "EventMessageFile", "C:\\WINDOWS\\Microsoft.NET\\Framework\\v2.0.50727\\EventLogMessages.dll" );
		}
		
		_eventLog = Advapi32.INSTANCE.RegisterEventSource( null, source );
		if ( null == _eventLog )
			return false;
		
		return true;
	}
	
	public boolean closeEventLog( )
	{
		if ( null == _eventLog )
			return true;
		
		if ( ! Advapi32.INSTANCE.DeregisterEventSource( _eventLog ) )
			return false;
		
		_eventLog = null;
		return true;
	}
	
	public boolean reportEvent( int type, int category, int eventId, String[ ] strings )
	{
		if ( null == _eventLog )
			return false;
		
		if ( ! Advapi32.INSTANCE.ReportEvent( _eventLog, type, category, eventId, null, ( short )strings.length, 0, strings, null ) )
			return false;
		
		return true;
	}
}

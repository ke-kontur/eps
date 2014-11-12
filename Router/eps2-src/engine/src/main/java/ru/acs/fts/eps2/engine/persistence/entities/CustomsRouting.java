package ru.acs.fts.eps2.engine.persistence.entities;

public class CustomsRouting
{
    private String _transportAddress;
    private String _transportServer;
    private String _localManager;
    private String _localQueue;
    private String _remoteManager;
    private String _remoteQueue;
    private Boolean _isLocal;
    
    // @formatter:off
    public void setTransportAddress( String transportAddress ) { _transportAddress = transportAddress; }
    public String getTransportAddress( ) { return _transportAddress; }
    
    public void setTransportServer( String transportServer ) { _transportServer = transportServer; }
    public String getTransportServer( ) { return _transportServer; }
    
    public void setLocalManager( String localManager ) { _localManager = localManager; }
    public String getLocalManager( ) { return _localManager; }
    
    public void setLocalQueue( String localQueue ) { _localQueue = localQueue; }
    public String getLocalQueue( ) { return _localQueue; }
    
    public void setRemoteManager( String remoteManager ) { _remoteManager = remoteManager; }
    public String getRemoteManager( ) { return _remoteManager; }
    
    public void setRemoteQueue( String remoteQueue ) { _remoteQueue = remoteQueue; }
    public String getRemoteQueue( ) { return _remoteQueue; }
    
    public void setIsLocal( Boolean isLocal ) { _isLocal = isLocal; }
    public Boolean getIsLocal( ) { return _isLocal; }
    // @formatter:on
}

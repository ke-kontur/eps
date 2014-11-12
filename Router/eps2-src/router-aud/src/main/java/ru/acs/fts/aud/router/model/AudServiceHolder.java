package ru.acs.fts.aud.router.model;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.model.persistence.ArchiveService;
import ru.acs.fts.aud.model.persistence.ClientService;
import ru.acs.fts.aud.model.persistence.ProtocolService;
import ru.acs.fts.aud.model.persistence.ServerStatisticsService;
import ru.acs.fts.aud.model.persistence.cached.BusinessDocumentKindService;
import ru.acs.fts.aud.model.persistence.cached.ProtocolLogLevelService;
import ru.acs.fts.aud.model.persistence.cached.ProtocolSourceService;
import ru.acs.fts.eps2.model.services.ServiceHolder;

public class AudServiceHolder extends ServiceHolder
{
	private ProtocolService _protocolService;
	private ProtocolLogLevelService _protocolLogLevelService;
	private ProtocolSourceService _protocolSourceService;
	private ClientService _clientService;
	private ServerStatisticsService _serverStatisticsService;
	private ArchiveService _archiveService;
	/*
	 * XXX Данное поле нигде не используется, но может пригодиться
	 */
	private BusinessDocumentKindService _businessDocumentKindService;
	
	// @formatter:off
	@Required
	public void setProtocolService( ProtocolService protocolService ) { _protocolService = protocolService; }
	public ProtocolService getProtocolService( ) { return _protocolService; }
	
	@Required
	public void setProtocolLogLevelService( ProtocolLogLevelService service ) { _protocolLogLevelService = service; }
	public ProtocolLogLevelService getProtocolLogLevelService( ) { return _protocolLogLevelService; }
	
	@Required
	public void setProtocolSourceService( ProtocolSourceService service ) { _protocolSourceService = service; }
	public ProtocolSourceService getProtocolSourceService( ) { return _protocolSourceService; }
	
	@Required public void setClientService( ClientService clientService ) { _clientService = clientService; }
	public ClientService getClientService( ) { return _clientService; }
	
	@Required
	public void setServerStatisticsService( ServerStatisticsService service ) { _serverStatisticsService = service; }
	public ServerStatisticsService getServerStatisticsService( ) { return _serverStatisticsService; }
	
	@Required
	public void setArchiveService( ArchiveService service ) { _archiveService = service; }
	public ArchiveService getArchiveService( ) { return _archiveService; }
	
	@Required
	public void setBusinessDocumentKindService( BusinessDocumentKindService service ) { _businessDocumentKindService = service; }
	public BusinessDocumentKindService getBusinessDocumentKindService( ) { return _businessDocumentKindService; }
	// @formatter:on
}

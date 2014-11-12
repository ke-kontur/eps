package ru.acs.fts.aud.rest.service.model.requests;

import ru.acs.fts.aud.rest.service.model.objects.AudRegistryRequest;

public class AudRegistryRequestRequest
{
	private AudRegistryRequest _audRegistryRequest;
	
	// @formatter:off
	public void setAudRegistryRequest( AudRegistryRequest audRegistryRequest ) { _audRegistryRequest = audRegistryRequest; }
	public AudRegistryRequest getAudRegistryRequest( ) { return _audRegistryRequest; }
	// @formatter:on
}

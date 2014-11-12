package ru.acs.fts.aud.rest.service.model.requests;

import ru.acs.fts.aud.rest.service.model.objects.AudMessage;
import ru.acs.fts.aud.rest.service.model.objects.AudResponseMetadata;

public class AudMessageRequest extends Request
{
	private AudMessage _audMessage;
	private AudResponseMetadata _audResponseMetadata;
	
	// @formatter:off
	public void setAudMessage( AudMessage audMessage ) { _audMessage = audMessage; }
	public AudMessage getAudMessage( ) { return _audMessage; }
	
	public void setAudResponseMetadata( AudResponseMetadata audResponseMetadata ) { _audResponseMetadata = audResponseMetadata; }
	public AudResponseMetadata getAudResponseMetadata( ) { return _audResponseMetadata; }
	// @formatter:on
}

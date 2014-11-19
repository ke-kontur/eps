package ru.acs.fts.eps2.ws.model.requests.crypto;

import ru.acs.fts.eps2.ws.model.requests.Request;
import ru.acs.fts.eps2.ws.model.serviceModel.shared.DocumentToCheck;

public class CheckSignRequest extends Request
{
	private DocumentToCheck _document;
	
	// @formatter:off
	public void setDocument( DocumentToCheck document ) { _document = document; }
	public DocumentToCheck getDocument( ) { return _document; }
	// @formatter:on
}

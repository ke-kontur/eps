package ru.acs.fts.eps2.engine.restWs.crypto.requests;

import ru.acs.fts.eps2.engine.restWs.shared.serviceModel.DocumentToCheck;

public class CheckSignRequest extends Request
{
	private DocumentToCheck _document;
	
	// @formatter:off
	public void setDocument( DocumentToCheck document ) { _document = document; }
	public DocumentToCheck getDocument( ) { return _document; }
	// @formatter:on
}

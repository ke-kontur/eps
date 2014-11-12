package ru.acs.fts.aud.wmq.router.restWs.crypto.requests;

import ru.acs.fts.aud.wmq.router.restWs.shared.serviceModel.DocumentToCheck;

public class CheckSignRequest extends Request
{
	private DocumentToCheck _document;
	
	// @formatter:off
	public void setDocument( DocumentToCheck document ) { _document = document; }
	public DocumentToCheck getDocument( ) { return _document; }
	// @formatter:on
}

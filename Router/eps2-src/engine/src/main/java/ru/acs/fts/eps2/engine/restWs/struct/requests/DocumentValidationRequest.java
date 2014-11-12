package ru.acs.fts.eps2.engine.restWs.struct.requests;

import ru.acs.fts.eps2.engine.restWs.shared.serviceModel.DocumentToCheck;

public class DocumentValidationRequest extends Request
{
	private DocumentToCheck _documentToCheck;
	
	// @formatter:off
	public void setDocumentToCheck( DocumentToCheck documentToCheck ) { _documentToCheck = documentToCheck; }
	public DocumentToCheck getDocumentToCheck( ) { return _documentToCheck; }
	// @formatter:on
}

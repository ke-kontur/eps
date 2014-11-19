package ru.acs.fts.eps2.ws.model.requests.struct;

import ru.acs.fts.eps2.ws.model.requests.Request;
import ru.acs.fts.eps2.ws.model.serviceModel.shared.DocumentToCheck;

public class DocumentValidationRequest extends Request
{
	private DocumentToCheck _documentToCheck;
	
	// @formatter:off
	public void setDocumentToCheck( DocumentToCheck documentToCheck ) { _documentToCheck = documentToCheck; }
	public DocumentToCheck getDocumentToCheck( ) { return _documentToCheck; }
	// @formatter:on
}

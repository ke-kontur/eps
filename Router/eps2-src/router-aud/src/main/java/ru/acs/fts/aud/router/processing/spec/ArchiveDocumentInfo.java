package ru.acs.fts.aud.router.processing.spec;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedDocumentInfoType;
import ru.acs.fts.schemas.envelope.SignatureType;

public class ArchiveDocumentInfo
{
	private String _documentId;
	private String _namespaceUri;
	private SignatureType _signature;
	private AUDAppliedDocumentInfoType _embeddedDocument;
	
	public ArchiveDocumentInfo( String documentId, String namespaceUri, 
			SignatureType signature, AUDAppliedDocumentInfoType embeddedDocument )
	{
		_documentId = documentId;
		_namespaceUri = namespaceUri;
		_signature = signature;
		_embeddedDocument = embeddedDocument;
	}
	
	// @formatter:off
	public void setDocumentId( String documentId ) { _documentId = documentId; }
	public String getDocumentId( ) { return _documentId; }
	
	public void setNamespaceUri( String namespaceUri ) { _namespaceUri = namespaceUri; }
	public String getNamespaceUri( ) { return _namespaceUri; }
	
	public void setSignature( SignatureType signature ) { _signature = signature; }
	public SignatureType getSignature( ) { return _signature; }
	
	public void setEmbeddedDocument( AUDAppliedDocumentInfoType embeddedDocument ) { _embeddedDocument = embeddedDocument; }
	public AUDAppliedDocumentInfoType getEmbeddedDocument( ) { return _embeddedDocument; }
	// @formatter:on
}

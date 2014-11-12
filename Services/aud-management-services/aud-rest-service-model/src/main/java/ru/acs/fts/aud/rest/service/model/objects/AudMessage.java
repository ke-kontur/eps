package ru.acs.fts.aud.rest.service.model.objects;

import org.joda.time.DateTime;

public class AudMessage
{
	private String _envelopeId;
	private String _incomeEnvelopeId;
	private String _initialEnvelopeId;
	private String _senderInformation;
	private String _receiverInformation;
	private String _softKind;
	private String _softVersion;
	private String _messageKind;
	private String _documentId;
	private Integer _customsCode;
	private DateTime _preparationDateTime;
	private DateTime _recvDate;
	private DateTime _sendDate;
	private String _archiveClientId;
	private String _document;
	
	// @formatter:off
	public void setEnvelopeId( String envelopeId ) { _envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return _envelopeId; }
	
	public void setIncomeEnvelopeId( String incomeEnvelopeId ) { _incomeEnvelopeId = incomeEnvelopeId; }
	public String getIncomeEnvelopeId( ) { return _incomeEnvelopeId; }
	
	public void setInitialEnvelopeId( String initialEnvelopeId ) { _initialEnvelopeId = initialEnvelopeId; }
	public String getInitialEnvelopeId( ) { return _initialEnvelopeId; }
	
	public void setSenderInformation( String senderInformation ) { _senderInformation = senderInformation; }
	public String getSenderInformation( ) { return _senderInformation; }
	
	public void setReceiverInformation( String receiverInformation ) { _receiverInformation = receiverInformation; }
	public String getReceiverInformation( ) { return _receiverInformation; }
	
	public void setSoftKind( String softKind ) { _softKind = softKind; }
	public String getSoftKind( ) { return _softKind; }
	
	public void setSoftVersion( String softVersion ) { _softVersion = softVersion; }
	public String getSoftVersion( ) { return _softVersion; }
	
	public void setMessageKind( String messageKind ) { _messageKind = messageKind; }
	public String getMessageKind( ) { return _messageKind; }
	
	public void setDocumentId( String documentId ) { _documentId = documentId; }
	public String getDocumentId( ) { return _documentId; }
	
	public void setCustomsCode( Integer customsCode ) { _customsCode = customsCode; }
	public Integer getCustomsCode( ) { return _customsCode; }
	
	public void setPreparationDateTime( DateTime preparationDateTime ) { _preparationDateTime = preparationDateTime; }
	public DateTime getPreparationDateTime( ) { return _preparationDateTime; }
	
	public void setRecvDate( DateTime recvDate ) { _recvDate = recvDate; }
	public DateTime getRecvDate( ) { return _recvDate; }
	
	public void setSendDate( DateTime sendDate ) { _sendDate = sendDate; }
	public DateTime getSendDate( ) { return _sendDate; }
	
	public void setArchiveClientId( String archiveClientId ) { _archiveClientId = archiveClientId; }
	public String getArchiveClientId( ) { return _archiveClientId; }
	
	public void setDocument( String document ) { _document = document; }
	public String getDocument( ) { return _document; }
	// @formatter:on
}

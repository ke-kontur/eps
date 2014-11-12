package ru.acs.fts.eps2.ws.eps.serviceModel.objects;

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
	private DateTime _receiveDate;
	private DateTime _sendDate;
	private String _archiveClientId;
	private DateTime _coaDateTime;
	private DateTime _coaSaveDateTime;
	private DateTime _codSaveDateTime;
	private DateTime _codDateTime;
	private String _body; // base64

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

	public void setReceiveDate( DateTime receiveDate ) { _receiveDate = receiveDate; }
	public DateTime getReceiveDate( ) { return _receiveDate; }
	
	public void setSendDate( DateTime sendDate ) { _sendDate = sendDate; }
	public DateTime getSendDate( ) { return _sendDate; }

	public void setArchiveClientId( String archiveClientId ) { _archiveClientId = archiveClientId; }
	public String getArchiveClientId( ) { return _archiveClientId; }

	public void setCoaDateTime( DateTime coaDateTime ) { _coaDateTime = coaDateTime; }
	public DateTime getCoaDateTime( ) { return _coaDateTime; }

	public void setCoaSaveDateTime( DateTime coaSaveDateTime ) { _coaSaveDateTime = coaSaveDateTime; }
	public DateTime getCoaSaveDateTime( ) { return _coaSaveDateTime; }

	public void setCodSaveDateTime( DateTime codSaveDateTime ) { _codSaveDateTime = codSaveDateTime; }
	public DateTime getCodSaveDateTime( ) { return _codSaveDateTime; }

	public void setCodDateTime( DateTime codDateTime ) { _codDateTime = codDateTime; }
	public DateTime getCodDateTime( ) { return _codDateTime; }

	public void setBody( String body ) { _body = body; }	
	public String getBody( ) { return _body; }
	// @formatter:on
}

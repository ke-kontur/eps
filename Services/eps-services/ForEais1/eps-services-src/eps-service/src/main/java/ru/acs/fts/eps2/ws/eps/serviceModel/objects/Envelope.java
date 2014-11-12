package ru.acs.fts.eps2.ws.eps.serviceModel.objects;

import org.joda.time.DateTime;

public class Envelope
{
	private String _envelopeId;
	private String _messageType;
	private String _participantId;
	private String _receiverCustomsCode;
	private String _receiverCustomsExchType;
	private String _senderCustomsCode;
	private String _senderCustomsExchType;
	private String _incomeEnvelopeId;
	private String _initialEnvelopeId;
	private DateTime _envelopeTime;
	private String _procedureState;
	
	// @formatter:off
	public void setEnvelopeId( String envelopeId ) { _envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return _envelopeId; }
	
	public void setMessageType( String messageType ) { _messageType = messageType; }
	public String getMessageType( ) { return _messageType; }
	
	public void setParticipantId( String participantId ) { _participantId = participantId; } 
	public String getParticipantId( ) { return _participantId; }

	public void setReceiverCustomsCode( String receiverCustomsCode ) { _receiverCustomsCode = receiverCustomsCode; }
	public String getReceiverCustomsCode( ) { return _receiverCustomsCode; }
	
	public void setReceiverCustomsExchType( String receiverCustomsExchType ) { _receiverCustomsExchType = receiverCustomsExchType; }
	public String getReceiverCustomsExchType( ) { return _receiverCustomsExchType; }

	public void setSenderCustomsCode( String senderCustomsCode ) { _senderCustomsCode = senderCustomsCode; }
	public String getSenderCustomsCode( ) { return _senderCustomsCode; }

	public void setSenderCustomsExchType( String senderCustomsExchType ) { _senderCustomsExchType = senderCustomsExchType; }
	public String getSenderCustomsExchType( ) { return _senderCustomsExchType; }
	
	public void setIncomeEnvelopeId( String incomeEnvelopeId ) { _incomeEnvelopeId = incomeEnvelopeId; }
	public String getIncomeEnvelopeId( ) { return _incomeEnvelopeId; }
	
	public void setInitialEnvelopeId( String initialEnvelopeId ) { _initialEnvelopeId = initialEnvelopeId; }
	public String getInitialEnvelopeId( ) { return _initialEnvelopeId; }

	public void setEnvelopeTime( DateTime envelopeTime ) { _envelopeTime = envelopeTime; }
	public DateTime getEnvelopeTime( ) { return _envelopeTime; }
	
	public void setProcedureState( String procedureState ) { _procedureState = procedureState; }
	public String getProcedureState( ) { return _procedureState; }
	// @formatter:on	
}

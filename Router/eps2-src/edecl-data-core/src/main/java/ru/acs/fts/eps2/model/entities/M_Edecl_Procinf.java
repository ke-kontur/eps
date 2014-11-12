package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;

import oracle.sql.TIMESTAMPTZ;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.TypeConverter;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

@Entity
@Table(name = "M_EDECL_PROCINF")
public class M_Edecl_Procinf {
    public M_Edecl_Procinf(){

    }

    @Id
    @Column(name="ENVELOPEID", length = 36, nullable = false)
    private String envelopeId;
    @Column(name="SENDERINFORMATION", length = 100)
    private String senderInformation;
    @Column(name="RECEIVERINFORMATION", length = 100)
    private String recieverInformation;
    @Column(name="MSGTYPE", length = 9)
    private String msgType;
    @Column(name="DESCRIPTION", length = 250)
    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    @Convert("timestamptz")
    @TypeConverter(name="timestamptz", dataType=TIMESTAMPTZ.class)
    @Column(name="PROCESSTIME", length = 9, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE")
    private Calendar processTime;
    @Temporal(TemporalType.TIMESTAMP)
    @Convert("timestamptz")
    @TypeConverter(name="timestamptz", dataType=TIMESTAMPTZ.class)
    @Column(name="RCVTIME", length = 9, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE")
    private Calendar rcvTime;
    @Temporal(TemporalType.TIMESTAMP)
    @Convert("timestamptz")
    @TypeConverter(name="timestamptz", dataType=TIMESTAMPTZ.class)
    @Column(name="SENDTIME", length = 9, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE")
    private Calendar sendTime;
    @Column(name="DOCUMENTMODEID", length = 30)
    private String documentModeId;
    @Column(name="DOCUMENTDESCRIPTION", length = 250)
    private String documentDescription;
    @Column(name="PROCESSID", length = 36)
    private String processId;
    @Column(name="ST_CODE", length = 30)
    private String stCode;
    @Column(name="MSGINITIALENVELOPEID", length = 36)
    private String msgInitialEnvelopeId;
    @Temporal(TemporalType.TIMESTAMP)
    @Convert("timestamptz")
    @TypeConverter(name="timestamptz", dataType=TIMESTAMPTZ.class)
    @Column(name="MSGPREPARATIONDATETIME", length = 9, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE")
    private Calendar msgPreparationDateTime;
    @Column(name="MSGDOCUMENTID", length = 36)
    private String msgDocumentId;
    @Column(name="MSGREFDOCUMENTID", length = 36)
    private String msgRefDocumentId;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getSenderInformation() {
        return senderInformation;
    }

    public void setSenderInformation(String senderInformation) {
        this.senderInformation = senderInformation;
    }

    public String getRecieverInformation() {
        return recieverInformation;
    }

    public void setRecieverInformation(String recieverInformation) {
        this.recieverInformation = recieverInformation;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getRcvTime() {
        return rcvTime;
    }

    public void setRcvTime(Calendar rcvTime) {
        this.rcvTime = rcvTime;
    }

    public Calendar getSendTime() {
        return sendTime;
    }

    public void setSendTime(Calendar sendTime) {
        this.sendTime = sendTime;
    }

    public Calendar getProcessTime() {
        return processTime;
    }

    public void setProcessTime(GregorianCalendar processTime) {
        this.processTime = processTime;
    }

    public String getDocumentModeId() {
        return documentModeId;
    }

    public void setDocumentModeId(String documentModeId) {
        this.documentModeId = documentModeId;
    }

    public String getDocumentDescription() {
        return documentDescription;
    }

    public void setDocumentDescription(String documentDescription) {
        this.documentDescription = documentDescription;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getStCode() {
        return stCode;
    }

    public void setStCode(String stCode) {
        this.stCode = stCode;
    }

    public String getMsgInitialEnvelopeId() {
        return msgInitialEnvelopeId;
    }

    public void setMsgInitialEnvelopeId(String msgInitialEnvelopeId) {
        this.msgInitialEnvelopeId = msgInitialEnvelopeId;
    }

    public Calendar getMsgPreparationDateTime() {
        return msgPreparationDateTime;
    }

    public void setMsgPreparationDateTime(Calendar msgPreparationDateTime) {
        this.msgPreparationDateTime = msgPreparationDateTime;
    }

    public String getMsgDocumentId() {
        return msgDocumentId;
    }

    public void setMsgDocumentId(String msgDocumentId) {
        this.msgDocumentId = msgDocumentId;
    }

    public String getMsgRefDocumentId() {
        return msgRefDocumentId;
    }

    public void setMsgRefDocumentId(String msgRefDocumentId) {
        this.msgRefDocumentId = msgRefDocumentId;
    }
}

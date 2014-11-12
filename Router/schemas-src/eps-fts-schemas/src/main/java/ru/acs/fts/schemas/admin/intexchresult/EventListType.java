
package ru.acs.fts.schemas.admin.intexchresult;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/** 
 * ���������� � �������� / ����������
 */
public class EventListType
{
    private String messageCode;
    private String messageDescription;
    private String procState;
    private DateTime recvDateTime;
    private DateTime sendDateTime;
    private String documentCode;
    private String documentDescription;
    private String messageID;
    private String msgInitialEnvelopeID;
    private DateTime msgPreparationDateTime;
    private String msgDocumentID;
    private String msgRefDocumentID;
    private List<DocumentResultType> documentResultList = new ArrayList<DocumentResultType>();

    /** 
     * Get the 'MessageCode' element value. ��� ��������� �������� ������������ ������.
     * 
     * @return value
     */
    public String getMessageCode() {
        return messageCode;
    }

    /** 
     * Set the 'MessageCode' element value. ��� ��������� �������� ������������ ������.
     * 
     * @param messageCode
     */
    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    /** 
     * Get the 'MessageDescription' element value. �������� ��������� (���������� ���������).
     * 
     * @return value
     */
    public String getMessageDescription() {
        return messageDescription;
    }

    /** 
     * Set the 'MessageDescription' element value. �������� ��������� (���������� ���������).
     * 
     * @param messageDescription
     */
    public void setMessageDescription(String messageDescription) {
        this.messageDescription = messageDescription;
    }

    /** 
     * Get the 'ProcState' element value. ������ �������� ����� ��������� ���������
     * 
     * @return value
     */
    public String getProcState() {
        return procState;
    }

    /** 
     * Set the 'ProcState' element value. ������ �������� ����� ��������� ���������
     * 
     * @param procState
     */
    public void setProcState(String procState) {
        this.procState = procState;
    }

    /** 
     * Get the 'RecvDateTime' element value. ���� � ����� ������ ���������
     * 
     * @return value
     */
    public DateTime getRecvDateTime() {
        return recvDateTime;
    }

    /** 
     * Set the 'RecvDateTime' element value. ���� � ����� ������ ���������
     * 
     * @param recvDateTime
     */
    public void setRecvDateTime(DateTime recvDateTime) {
        this.recvDateTime = recvDateTime;
    }

    /** 
     * Get the 'SendDateTime' element value. ����/����� �������� ���������
     * 
     * @return value
     */
    public DateTime getSendDateTime() {
        return sendDateTime;
    }

    /** 
     * Set the 'SendDateTime' element value. ����/����� �������� ���������
     * 
     * @param sendDateTime
     */
    public void setSendDateTime(DateTime sendDateTime) {
        this.sendDateTime = sendDateTime;
    }

    /** 
     * Get the 'DocumentCode' element value. ��� ���� ���������
     * 
     * @return value
     */
    public String getDocumentCode() {
        return documentCode;
    }

    /** 
     * Set the 'DocumentCode' element value. ��� ���� ���������
     * 
     * @param documentCode
     */
    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    /** 
     * Get the 'DocumentDescription' element value. �������� ���� ��������� (����������)
     * 
     * @return value
     */
    public String getDocumentDescription() {
        return documentDescription;
    }

    /** 
     * Set the 'DocumentDescription' element value. �������� ���� ��������� (����������)
     * 
     * @param documentDescription
     */
    public void setDocumentDescription(String documentDescription) {
        this.documentDescription = documentDescription;
    }

    /** 
     * Get the 'MessageID' element value. ������������� ������������� ���������
     * 
     * @return value
     */
    public String getMessageID() {
        return messageID;
    }

    /** 
     * Set the 'MessageID' element value. ������������� ������������� ���������
     * 
     * @param messageID
     */
    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    /** 
     * Get the 'MsgInitialEnvelopeID' element value. ��������� ������������� ���������
     * 
     * @return value
     */
    public String getMsgInitialEnvelopeID() {
        return msgInitialEnvelopeID;
    }

    /** 
     * Set the 'MsgInitialEnvelopeID' element value. ��������� ������������� ���������
     * 
     * @param msgInitialEnvelopeID
     */
    public void setMsgInitialEnvelopeID(String msgInitialEnvelopeID) {
        this.msgInitialEnvelopeID = msgInitialEnvelopeID;
    }

    /** 
     * Get the 'MsgPreparationDateTime' element value. ����/�����  �������� ���������
     * 
     * @return value
     */
    public DateTime getMsgPreparationDateTime() {
        return msgPreparationDateTime;
    }

    /** 
     * Set the 'MsgPreparationDateTime' element value. ����/�����  �������� ���������
     * 
     * @param msgPreparationDateTime
     */
    public void setMsgPreparationDateTime(DateTime msgPreparationDateTime) {
        this.msgPreparationDateTime = msgPreparationDateTime;
    }

    /** 
     * Get the 'MsgDocumentID' element value. ������������� ���������
     * 
     * @return value
     */
    public String getMsgDocumentID() {
        return msgDocumentID;
    }

    /** 
     * Set the 'MsgDocumentID' element value. ������������� ���������
     * 
     * @param msgDocumentID
     */
    public void setMsgDocumentID(String msgDocumentID) {
        this.msgDocumentID = msgDocumentID;
    }

    /** 
     * Get the 'MsgRefDocumentID' element value. ��������� ������������� ���������
     * 
     * @return value
     */
    public String getMsgRefDocumentID() {
        return msgRefDocumentID;
    }

    /** 
     * Set the 'MsgRefDocumentID' element value. ��������� ������������� ���������
     * 
     * @param msgRefDocumentID
     */
    public void setMsgRefDocumentID(String msgRefDocumentID) {
        this.msgRefDocumentID = msgRefDocumentID;
    }

    /** 
     * Get the list of 'DocumentResult' element items. ��������� ��������� ���������
     * 
     * @return list
     */
    public List<DocumentResultType> getDocumentResultList() {
        return documentResultList;
    }

    /** 
     * Set the list of 'DocumentResult' element items. ��������� ��������� ���������
     * 
     * @param list
     */
    public void setDocumentResultList(List<DocumentResultType> list) {
        documentResultList = list;
    }
}


package ru.acs.fts.schemas.album.result;

import java.util.ArrayList;
import java.util.List;

/** 
 * Информация о событиях / сообщениях
 */
public class EventListType
{
    private String messageCode;
    private String messageDescription;
    private String procState;
    private String recvDateTime;
    private String sendDateTime;
    private String documentCode;
    private String documentDescription;
    private String messageID;
    private String msgInitialEnvelopeID;
    private String msgPreparationDateTime;
    private String msgDocumentID;
    private String msgRefDocumentID;
    private List<DocumentResultType> documentResultList = new ArrayList<DocumentResultType>();

    /** 
     * Get the 'MessageCode' element value. Код сообщения согласно спецификации обмена.
     * 
     * @return value
     */
    public String getMessageCode() {
        return messageCode;
    }

    /** 
     * Set the 'MessageCode' element value. Код сообщения согласно спецификации обмена.
     * 
     * @param messageCode
     */
    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    /** 
     * Get the 'MessageDescription' element value. Описание сообщения (справочник сообщений).
     * 
     * @return value
     */
    public String getMessageDescription() {
        return messageDescription;
    }

    /** 
     * Set the 'MessageDescription' element value. Описание сообщения (справочник сообщений).
     * 
     * @param messageDescription
     */
    public void setMessageDescription(String messageDescription) {
        this.messageDescription = messageDescription;
    }

    /** 
     * Get the 'ProcState' element value. Статус процесса после обработки сообщения
     * 
     * @return value
     */
    public String getProcState() {
        return procState;
    }

    /** 
     * Set the 'ProcState' element value. Статус процесса после обработки сообщения
     * 
     * @param procState
     */
    public void setProcState(String procState) {
        this.procState = procState;
    }

    /** 
     * Get the 'RecvDateTime' element value. Дата и время приема сообщения
     * 
     * @return value
     */
    public String getRecvDateTime() {
        return recvDateTime;
    }

    /** 
     * Set the 'RecvDateTime' element value. Дата и время приема сообщения
     * 
     * @param recvDateTime
     */
    public void setRecvDateTime(String recvDateTime) {
        this.recvDateTime = recvDateTime;
    }

    /** 
     * Get the 'SendDateTime' element value. Дата/время отправки сообщения
     * 
     * @return value
     */
    public String getSendDateTime() {
        return sendDateTime;
    }

    /** 
     * Set the 'SendDateTime' element value. Дата/время отправки сообщения
     * 
     * @param sendDateTime
     */
    public void setSendDateTime(String sendDateTime) {
        this.sendDateTime = sendDateTime;
    }

    /** 
     * Get the 'DocumentCode' element value. Код вида документа
     * 
     * @return value
     */
    public String getDocumentCode() {
        return documentCode;
    }

    /** 
     * Set the 'DocumentCode' element value. Код вида документа
     * 
     * @param documentCode
     */
    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    /** 
     * Get the 'DocumentDescription' element value. Описание вида документа (справочник)
     * 
     * @return value
     */
    public String getDocumentDescription() {
        return documentDescription;
    }

    /** 
     * Set the 'DocumentDescription' element value. Описание вида документа (справочник)
     * 
     * @param documentDescription
     */
    public void setDocumentDescription(String documentDescription) {
        this.documentDescription = documentDescription;
    }

    /** 
     * Get the 'MessageID' element value. Идентификатор обработанного сообщения
     * 
     * @return value
     */
    public String getMessageID() {
        return messageID;
    }

    /** 
     * Set the 'MessageID' element value. Идентификатор обработанного сообщения
     * 
     * @param messageID
     */
    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    /** 
     * Get the 'MsgInitialEnvelopeID' element value. Ссылочный идентификатор сообщения
     * 
     * @return value
     */
    public String getMsgInitialEnvelopeID() {
        return msgInitialEnvelopeID;
    }

    /** 
     * Set the 'MsgInitialEnvelopeID' element value. Ссылочный идентификатор сообщения
     * 
     * @param msgInitialEnvelopeID
     */
    public void setMsgInitialEnvelopeID(String msgInitialEnvelopeID) {
        this.msgInitialEnvelopeID = msgInitialEnvelopeID;
    }

    /** 
     * Get the 'MsgPreparationDateTime' element value. Дата/время  создания сообщения
     * 
     * @return value
     */
    public String getMsgPreparationDateTime() {
        return msgPreparationDateTime;
    }

    /** 
     * Set the 'MsgPreparationDateTime' element value. Дата/время  создания сообщения
     * 
     * @param msgPreparationDateTime
     */
    public void setMsgPreparationDateTime(String msgPreparationDateTime) {
        this.msgPreparationDateTime = msgPreparationDateTime;
    }

    /** 
     * Get the 'MsgDocumentID' element value. Идентификатор документа
     * 
     * @return value
     */
    public String getMsgDocumentID() {
        return msgDocumentID;
    }

    /** 
     * Set the 'MsgDocumentID' element value. Идентификатор документа
     * 
     * @param msgDocumentID
     */
    public void setMsgDocumentID(String msgDocumentID) {
        this.msgDocumentID = msgDocumentID;
    }

    /** 
     * Get the 'MsgRefDocumentID' element value. Ссылочный идентификатор документа
     * 
     * @return value
     */
    public String getMsgRefDocumentID() {
        return msgRefDocumentID;
    }

    /** 
     * Set the 'MsgRefDocumentID' element value. Ссылочный идентификатор документа
     * 
     * @param msgRefDocumentID
     */
    public void setMsgRefDocumentID(String msgRefDocumentID) {
        this.msgRefDocumentID = msgRefDocumentID;
    }

    /** 
     * Get the list of 'DocumentResult' element items. Результат обработки документа
     * 
     * @return list
     */
    public List<DocumentResultType> getDocumentResultList() {
        return documentResultList;
    }

    /** 
     * Set the list of 'DocumentResult' element items. Результат обработки документа
     * 
     * @param list
     */
    public void setDocumentResultList(List<DocumentResultType> list) {
        documentResultList = list;
    }
}

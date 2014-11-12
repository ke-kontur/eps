
package ru.acs.fts.schemas.album.inventoryin;

/** 
 * Документ
 */
public class RequestDocumentType
{
    private String invDocCode;
    private String invDocName;
    private String recordNumber;
    private String reqPurpose;
    private String note;
    private String requestorName;

    /** 
     * Get the 'InvDocCode' element value. Код вида представляемого документа. Заполняется согласно Классификатору видов документов, используемых при заявлении сведений в графе 44 ДТ.
     * 
     * @return value
     */
    public String getInvDocCode() {
        return invDocCode;
    }

    /** 
     * Set the 'InvDocCode' element value. Код вида представляемого документа. Заполняется согласно Классификатору видов документов, используемых при заявлении сведений в графе 44 ДТ.
     * 
     * @param invDocCode
     */
    public void setInvDocCode(String invDocCode) {
        this.invDocCode = invDocCode;
    }

    /** 
     * Get the 'InvDocName' element value. Вид документа
     * 
     * @return value
     */
    public String getInvDocName() {
        return invDocName;
    }

    /** 
     * Set the 'InvDocName' element value. Вид документа
     * 
     * @param invDocName
     */
    public void setInvDocName(String invDocName) {
        this.invDocName = invDocName;
    }

    /** 
     * Get the 'RecordNumber' element value. Порядковый номер записи в запросе
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. Порядковый номер записи в запросе
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    /** 
     * Get the 'ReqPurpose' element value. Цель, для которой запрашивается документ
     * 
     * @return value
     */
    public String getReqPurpose() {
        return reqPurpose;
    }

    /** 
     * Set the 'ReqPurpose' element value. Цель, для которой запрашивается документ
     * 
     * @param reqPurpose
     */
    public void setReqPurpose(String reqPurpose) {
        this.reqPurpose = reqPurpose;
    }

    /** 
     * Get the 'Note' element value. Примечание
     * 
     * @return value
     */
    public String getNote() {
        return note;
    }

    /** 
     * Set the 'Note' element value. Примечание
     * 
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /** 
     * Get the 'RequestorName' element value. ФИО должностного лица, запрашивающего дополнительные документы и сведения
     * 
     * @return value
     */
    public String getRequestorName() {
        return requestorName;
    }

    /** 
     * Set the 'RequestorName' element value. ФИО должностного лица, запрашивающего дополнительные документы и сведения
     * 
     * @param requestorName
     */
    public void setRequestorName(String requestorName) {
        this.requestorName = requestorName;
    }
}


package ru.acs.fts.schemas.album.reqinotreatmentdocs;

/** 
 * Запрашиваемый документ
 */
public class RequestedDocType
{
    private String position;
    private String docCode;
    private String docName;
    private String reqPurpose;
    private String note;
    private String requestorName;

    /** 
     * Get the 'Position' element value. Порядковый номер записи в запросе
     * 
     * @return value
     */
    public String getPosition() {
        return position;
    }

    /** 
     * Set the 'Position' element value. Порядковый номер записи в запросе
     * 
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /** 
     * Get the 'DocCode' element value. Код вида запрашиваемого документа (заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44)
     * 
     * @return value
     */
    public String getDocCode() {
        return docCode;
    }

    /** 
     * Set the 'DocCode' element value. Код вида запрашиваемого документа (заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44)
     * 
     * @param docCode
     */
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    /** 
     * Get the 'DocName' element value. Вид документа
     * 
     * @return value
     */
    public String getDocName() {
        return docName;
    }

    /** 
     * Set the 'DocName' element value. Вид документа
     * 
     * @param docName
     */
    public void setDocName(String docName) {
        this.docName = docName;
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

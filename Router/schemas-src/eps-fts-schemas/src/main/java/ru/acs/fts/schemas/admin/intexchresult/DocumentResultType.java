
package ru.acs.fts.schemas.admin.intexchresult;

/** 
 * Результат обработки документа
 */
public class DocumentResultType
{
    private String resultCode;
    private String documentID;

    /** 
     * Get the 'ResultCode' element value. Код обработки сообщения
     * 
     * @return value
     */
    public String getResultCode() {
        return resultCode;
    }

    /** 
     * Set the 'ResultCode' element value. Код обработки сообщения
     * 
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /** 
     * Get the 'DocumentID' element value. Идентификатор документа - результата обработки.
     * 
     * @return value
     */
    public String getDocumentID() {
        return documentID;
    }

    /** 
     * Set the 'DocumentID' element value. Идентификатор документа - результата обработки.
     * 
     * @param documentID
     */
    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }
}

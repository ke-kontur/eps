
package ru.acs.fts.schemas.album.eps_docresponse;

/** 
 * Запрошенный документ
 */
public class DocResponseType
{
    private String requestPositionID;
    private DocResponseBodyType docResponseBody;

    /** 
     * Get the 'RequestPositionID' element value. Идетнификатор позиции в исходном запросе
     * 
     * @return value
     */
    public String getRequestPositionID() {
        return requestPositionID;
    }

    /** 
     * Set the 'RequestPositionID' element value. Идетнификатор позиции в исходном запросе
     * 
     * @param requestPositionID
     */
    public void setRequestPositionID(String requestPositionID) {
        this.requestPositionID = requestPositionID;
    }

    /** 
     * Get the 'DocResponseBody' element value. Тело запрошенного документа
     * 
     * @return value
     */
    public DocResponseBodyType getDocResponseBody() {
        return docResponseBody;
    }

    /** 
     * Set the 'DocResponseBody' element value. Тело запрошенного документа
     * 
     * @param docResponseBody
     */
    public void setDocResponseBody(DocResponseBodyType docResponseBody) {
        this.docResponseBody = docResponseBody;
    }
}

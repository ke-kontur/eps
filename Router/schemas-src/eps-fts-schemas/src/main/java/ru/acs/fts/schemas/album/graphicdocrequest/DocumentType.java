
package ru.acs.fts.schemas.album.graphicdocrequest;

/** 
 * Документ
 */
public class DocumentType
{
    private String requestPositionID;
    private String comments;

    /** 
     * Get the 'RequestPositionID' element value. Идентификатор позиции в запросе. Используется в АПС "Электронное представление сведений"
     * 
     * @return value
     */
    public String getRequestPositionID() {
        return requestPositionID;
    }

    /** 
     * Set the 'RequestPositionID' element value. Идентификатор позиции в запросе. Используется в АПС "Электронное представление сведений"
     * 
     * @param requestPositionID
     */
    public void setRequestPositionID(String requestPositionID) {
        this.requestPositionID = requestPositionID;
    }

    /** 
     * Get the 'Comments' element value. Примечание
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Примечание
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}

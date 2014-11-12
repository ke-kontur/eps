
package ru.acs.fts.schemas.album.graphicdocrequest;

/** 
 * ��������
 */
public class DocumentType
{
    private String requestPositionID;
    private String comments;

    /** 
     * Get the 'RequestPositionID' element value. ������������� ������� � �������. ������������ � ��� "����������� ������������� ��������"
     * 
     * @return value
     */
    public String getRequestPositionID() {
        return requestPositionID;
    }

    /** 
     * Set the 'RequestPositionID' element value. ������������� ������� � �������. ������������ � ��� "����������� ������������� ��������"
     * 
     * @param requestPositionID
     */
    public void setRequestPositionID(String requestPositionID) {
        this.requestPositionID = requestPositionID;
    }

    /** 
     * Get the 'Comments' element value. ����������
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. ����������
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}

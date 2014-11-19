
package ru.acs.fts.schemas.album.eps_docresponse;

/** 
 * ����������� ��������
 */
public class DocResponseType
{
    private String requestPositionID;
    private DocResponseBodyType docResponseBody;

    /** 
     * Get the 'RequestPositionID' element value. ������������� ������� � �������� �������
     * 
     * @return value
     */
    public String getRequestPositionID() {
        return requestPositionID;
    }

    /** 
     * Set the 'RequestPositionID' element value. ������������� ������� � �������� �������
     * 
     * @param requestPositionID
     */
    public void setRequestPositionID(String requestPositionID) {
        this.requestPositionID = requestPositionID;
    }

    /** 
     * Get the 'DocResponseBody' element value. ���� ������������ ���������
     * 
     * @return value
     */
    public DocResponseBodyType getDocResponseBody() {
        return docResponseBody;
    }

    /** 
     * Set the 'DocResponseBody' element value. ���� ������������ ���������
     * 
     * @param docResponseBody
     */
    public void setDocResponseBody(DocResponseBodyType docResponseBody) {
        this.docResponseBody = docResponseBody;
    }
}

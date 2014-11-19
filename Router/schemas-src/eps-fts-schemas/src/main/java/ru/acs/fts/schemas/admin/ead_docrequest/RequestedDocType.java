
package ru.acs.fts.schemas.admin.ead_docrequest;

/** 
 * ������������� ��������
 */
public class RequestedDocType
{
    private String archDeclID;
    private String archID;
    private String archDocID;
    private String requestPositionID;

    /** 
     * Get the 'ArchDeclID' element value. ���������� ������������� ���������� � ����������� ������ ����������.
     * 
     * @return value
     */
    public String getArchDeclID() {
        return archDeclID;
    }

    /** 
     * Set the 'ArchDeclID' element value. ���������� ������������� ���������� � ����������� ������ ����������.
     * 
     * @param archDeclID
     */
    public void setArchDeclID(String archDeclID) {
        this.archDeclID = archDeclID;
    }

    /** 
     * Get the 'ArchID' element value. ������������� ������������ ������ ����������
     * 
     * @return value
     */
    public String getArchID() {
        return archID;
    }

    /** 
     * Set the 'ArchID' element value. ������������� ������������ ������ ����������
     * 
     * @param archID
     */
    public void setArchID(String archID) {
        this.archID = archID;
    }

    /** 
     * Get the 'ArchDocID' element value. ������������� ��������� � ����������� ������ ����������
     * 
     * @return value
     */
    public String getArchDocID() {
        return archDocID;
    }

    /** 
     * Set the 'ArchDocID' element value. ������������� ��������� � ����������� ������ ����������
     * 
     * @param archDocID
     */
    public void setArchDocID(String archDocID) {
        this.archDocID = archDocID;
    }

    /** 
     * Get the 'RequestPositionID' element value. ������������� ������� � �������
     * 
     * @return value
     */
    public String getRequestPositionID() {
        return requestPositionID;
    }

    /** 
     * Set the 'RequestPositionID' element value. ������������� ������� � �������
     * 
     * @param requestPositionID
     */
    public void setRequestPositionID(String requestPositionID) {
        this.requestPositionID = requestPositionID;
    }
}

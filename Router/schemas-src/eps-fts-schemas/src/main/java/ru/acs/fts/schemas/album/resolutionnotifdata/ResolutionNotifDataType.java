
package ru.acs.fts.schemas.album.resolutionnotifdata;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * �������� � �������� �������
 */
public class ResolutionNotifDataType extends BaseDocType
{
    private String requestId;
    private String action;
    private String documentModeID;

    /** 
     * Get the 'RequestId' element value. ���������� ������������� �������
     * 
     * @return value
     */
    public String getRequestId() {
        return requestId;
    }

    /** 
     * Set the 'RequestId' element value. ���������� ������������� �������
     * 
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /** 
     * Get the 'Action' element value. ������� �������������� ������������ ����: 1 - ���������; 2 - ��������� � ������������ �� ������� ������� ����������� ����� (��������); 3 - ��������� � ������������ �� ������� ������� ����������� ����� (���������); 4 - ���������
     * 
     * @return value
     */
    public String getAction() {
        return action;
    }

    /** 
     * Set the 'Action' element value. ������� �������������� ������������ ����: 1 - ���������; 2 - ��������� � ������������ �� ������� ������� ����������� ����� (��������); 3 - ��������� � ������������ �� ������� ������� ����������� ����� (���������); 4 - ���������
     * 
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}

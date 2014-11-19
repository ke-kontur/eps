
package ru.acs.fts.schemas.album.notifaddcontrol;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ������������� ��������
 */
public class ReqDocumentType extends DocumentBaseType
{
    private String requestPositionID;
    private String docCode;

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

    /** 
     * Get the 'DocCode' element value. ��� ���� �������������� ��������� (����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44)
     * 
     * @return value
     */
    public String getDocCode() {
        return docCode;
    }

    /** 
     * Set the 'DocCode' element value. ��� ���� �������������� ��������� (����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44)
     * 
     * @param docCode
     */
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }
}

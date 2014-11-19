
package ru.acs.fts.schemas.album.notif_piresult;

/** 
 * ���������� �� ��������� ���������
 */
public class PIDocResultType
{
    private String PIRegID;
    private String PIStatus;
    private String PIRegDateTime;

    /** 
     * Get the 'PI_RegID' element value. ��������������� ������������� ��������������� ����������.
     * 
     * @return value
     */
    public String getPIRegID() {
        return PIRegID;
    }

    /** 
     * Set the 'PI_RegID' element value. ��������������� ������������� ��������������� ����������.
     * 
     * @param PIRegID
     */
    public void setPIRegID(String PIRegID) {
        this.PIRegID = PIRegID;
    }

    /** 
     * Get the 'PI_Status' element value. ������ ��������������� ����������
     * 
     * @return value
     */
    public String getPIStatus() {
        return PIStatus;
    }

    /** 
     * Set the 'PI_Status' element value. ������ ��������������� ����������
     * 
     * @param PIStatus
     */
    public void setPIStatus(String PIStatus) {
        this.PIStatus = PIStatus;
    }

    /** 
     * Get the 'PI_RegDateTime' element value. ���� � ����� ����������� ��������������� ����������
     * 
     * @return value
     */
    public String getPIRegDateTime() {
        return PIRegDateTime;
    }

    /** 
     * Set the 'PI_RegDateTime' element value. ���� � ����� ����������� ��������������� ����������
     * 
     * @param PIRegDateTime
     */
    public void setPIRegDateTime(String PIRegDateTime) {
        this.PIRegDateTime = PIRegDateTime;
    }
}

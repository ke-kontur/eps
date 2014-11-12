
package ru.acs.fts.schemas.album.reqinotreatmentdocs;

/** 
 * �������� �����
 */
public class CommunicationType
{
    private String commCode;
    private String commNumberAddress;

    /** 
     * Get the 'CommCode' element value. ��� �������� �����: "1"-�������, "2"-����, "3"-������, "4"-��������, "5"-e-mail, "6"-�����
     * 
     * @return value
     */
    public String getCommCode() {
        return commCode;
    }

    /** 
     * Set the 'CommCode' element value. ��� �������� �����: "1"-�������, "2"-����, "3"-������, "4"-��������, "5"-e-mail, "6"-�����
     * 
     * @param commCode
     */
    public void setCommCode(String commCode) {
        this.commCode = commCode;
    }

    /** 
     * Get the 'CommNumberAddress' element value. ����� �������� ����� / �����
     * 
     * @return value
     */
    public String getCommNumberAddress() {
        return commNumberAddress;
    }

    /** 
     * Set the 'CommNumberAddress' element value. ����� �������� ����� / �����
     * 
     * @param commNumberAddress
     */
    public void setCommNumberAddress(String commNumberAddress) {
        this.commNumberAddress = commNumberAddress;
    }
}

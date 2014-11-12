
package ru.acs.fts.schemas.album.inventoryin;

/** 
 * �������� �����
 */
public class CommunicationType
{
    private String commCode;
    private String commNumber;

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
     * Get the 'CommNumber' element value. ����� �������� �����
     * 
     * @return value
     */
    public String getCommNumber() {
        return commNumber;
    }

    /** 
     * Set the 'CommNumber' element value. ����� �������� �����
     * 
     * @param commNumber
     */
    public void setCommNumber(String commNumber) {
        this.commNumber = commNumber;
    }
}

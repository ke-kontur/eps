
package ru.acs.fts.schemas.album.inffromactinspection;

/** 
 * ������� ���������� �� ��������� ���
 */
public class VEDParticipantShortInfType
{
    private String INNID;
    private String KPPCode;

    /** 
     * Get the 'INNID' element value. �������������� ����� ����������������� 
     * 
     * @return value
     */
    public String getINNID() {
        return INNID;
    }

    /** 
     * Set the 'INNID' element value. �������������� ����� ����������������� 
     * 
     * @param INNID
     */
    public void setINNID(String INNID) {
        this.INNID = INNID;
    }

    /** 
     * Get the 'KPPCode' element value. ��� ������� ���������� �� ��������� ����
     * 
     * @return value
     */
    public String getKPPCode() {
        return KPPCode;
    }

    /** 
     * Set the 'KPPCode' element value. ��� ������� ���������� �� ��������� ����
     * 
     * @param KPPCode
     */
    public void setKPPCode(String KPPCode) {
        this.KPPCode = KPPCode;
    }
}


package ru.acs.fts.schemas.album.airwaybill;

/** 
 * ����� ������������ �����������
 */
public class IssueAgentType extends AirOrganizationType
{
    private String IATACode;
    private String commissionFlag;

    /** 
     * Get the 'IATACode' element value. ��� ���� ������
     * 
     * @return value
     */
    public String getIATACode() {
        return IATACode;
    }

    /** 
     * Set the 'IATACode' element value. ��� ���� ������
     * 
     * @param IATACode
     */
    public void setIATACode(String IATACode) {
        this.IATACode = IATACode;
    }

    /** 
     * Get the 'CommissionFlag' element value. �������� �  ������������ ��� ������: 1 - ������ ���������� ������������; 0 - ������ �����������
     * 
     * @return value
     */
    public String getCommissionFlag() {
        return commissionFlag;
    }

    /** 
     * Set the 'CommissionFlag' element value. �������� �  ������������ ��� ������: 1 - ������ ���������� ������������; 0 - ������ �����������
     * 
     * @param commissionFlag
     */
    public void setCommissionFlag(String commissionFlag) {
        this.commissionFlag = commissionFlag;
    }
}

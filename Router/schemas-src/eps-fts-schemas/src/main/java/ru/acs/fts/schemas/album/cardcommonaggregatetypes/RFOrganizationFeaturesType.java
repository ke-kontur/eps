
package ru.acs.fts.schemas.album.cardcommonaggregatetypes;

/** 
 * �������� �� �����������. ����������� ���������� ���������
 */
public class RFOrganizationFeaturesType
{
    private String INN;
    private String KPP;

    /** 
     * Get the 'INN' element value. ��� - �������������� ����� �����������������
     * 
     * @return value
     */
    public String getINN() {
        return INN;
    }

    /** 
     * Set the 'INN' element value. ��� - �������������� ����� �����������������
     * 
     * @param INN
     */
    public void setINN(String INN) {
        this.INN = INN;
    }

    /** 
     * Get the 'KPP' element value. ��� - ��� ������� ���������� �� ����
     * 
     * @return value
     */
    public String getKPP() {
        return KPP;
    }

    /** 
     * Set the 'KPP' element value. ��� - ��� ������� ���������� �� ����
     * 
     * @param KPP
     */
    public void setKPP(String KPP) {
        this.KPP = KPP;
    }
}

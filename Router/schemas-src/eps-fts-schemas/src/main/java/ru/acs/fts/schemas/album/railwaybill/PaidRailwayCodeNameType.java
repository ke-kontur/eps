
package ru.acs.fts.schemas.album.railwaybill;

/** 
 * ������������ � ���� ���������� ��������������� �����, �� ��������� �� ������� ����������� ��������� �� ���� ������� 
 */
public class PaidRailwayCodeNameType
{
    private String paidRailwayCode;
    private String paidRailwayName;
    private String paidRailwayShortName;
    private InfoPayerType infoPayer;

    /** 
     * Get the 'PaidRailwayCode' element value. ���� ���������� ��������������� �����
     * 
     * @return value
     */
    public String getPaidRailwayCode() {
        return paidRailwayCode;
    }

    /** 
     * Set the 'PaidRailwayCode' element value. ���� ���������� ��������������� �����
     * 
     * @param paidRailwayCode
     */
    public void setPaidRailwayCode(String paidRailwayCode) {
        this.paidRailwayCode = paidRailwayCode;
    }

    /** 
     * Get the 'PaidRailwayName' element value. ������������ ���������� ��������������� �����
     * 
     * @return value
     */
    public String getPaidRailwayName() {
        return paidRailwayName;
    }

    /** 
     * Set the 'PaidRailwayName' element value. ������������ ���������� ��������������� �����
     * 
     * @param paidRailwayName
     */
    public void setPaidRailwayName(String paidRailwayName) {
        this.paidRailwayName = paidRailwayName;
    }

    /** 
     * Get the 'PaidRailwayShortName' element value. ����������� ������������ ���������� ��������������� �����
     * 
     * @return value
     */
    public String getPaidRailwayShortName() {
        return paidRailwayShortName;
    }

    /** 
     * Set the 'PaidRailwayShortName' element value. ����������� ������������ ���������� ��������������� �����
     * 
     * @param paidRailwayShortName
     */
    public void setPaidRailwayShortName(String paidRailwayShortName) {
        this.paidRailwayShortName = paidRailwayShortName;
    }

    /** 
     * Get the 'InfoPayer' element value. �������� � �����������
     * 
     * @return value
     */
    public InfoPayerType getInfoPayer() {
        return infoPayer;
    }

    /** 
     * Set the 'InfoPayer' element value. �������� � �����������
     * 
     * @param infoPayer
     */
    public void setInfoPayer(InfoPayerType infoPayer) {
        this.infoPayer = infoPayer;
    }
}

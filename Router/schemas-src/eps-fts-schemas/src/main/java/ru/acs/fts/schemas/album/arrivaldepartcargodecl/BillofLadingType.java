
package ru.acs.fts.schemas.album.arrivaldepartcargodecl;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ��������� ����������� �� ���� (�����), ���������� �������� � ����� �������
 */
public class BillofLadingType extends DocumentBaseType
{
    private String debarkationPort;
    private String departureGoodsPort;

    /** 
     * Get the 'DebarkationPort' element value. �������� ����� �������� ������ (�������), ���������� �� ����� �����
     * 
     * @return value
     */
    public String getDebarkationPort() {
        return debarkationPort;
    }

    /** 
     * Set the 'DebarkationPort' element value. �������� ����� �������� ������ (�������), ���������� �� ����� �����
     * 
     * @param debarkationPort
     */
    public void setDebarkationPort(String debarkationPort) {
        this.debarkationPort = debarkationPort;
    }

    /** 
     * Get the 'DepartureGoodsPort' element value. �������� �������������� ������ ����������� ������ (�������), ����������� �� ������������
     * 
     * @return value
     */
    public String getDepartureGoodsPort() {
        return departureGoodsPort;
    }

    /** 
     * Set the 'DepartureGoodsPort' element value. �������� �������������� ������ ����������� ������ (�������), ����������� �� ������������
     * 
     * @param departureGoodsPort
     */
    public void setDepartureGoodsPort(String departureGoodsPort) {
        this.departureGoodsPort = departureGoodsPort;
    }
}

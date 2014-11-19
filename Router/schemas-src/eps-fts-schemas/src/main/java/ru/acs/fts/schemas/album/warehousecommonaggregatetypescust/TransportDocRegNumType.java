
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ����������� ��� ��� �������� ���������������� ������ ������������� ���������
 */
public class TransportDocRegNumType extends GTDIDType
{
    private String waybillNumPP;

    /** 
     * Get the 'WaybillNumPP' element value. ���������� ����� ������������� ��������� �� ������� �����������
     * 
     * @return value
     */
    public String getWaybillNumPP() {
        return waybillNumPP;
    }

    /** 
     * Set the 'WaybillNumPP' element value. ���������� ����� ������������� ��������� �� ������� �����������
     * 
     * @param waybillNumPP
     */
    public void setWaybillNumPP(String waybillNumPP) {
        this.waybillNumPP = waybillNumPP;
    }
}

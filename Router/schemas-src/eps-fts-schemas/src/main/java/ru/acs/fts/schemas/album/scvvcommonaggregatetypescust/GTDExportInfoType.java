
package ru.acs.fts.schemas.album.scvvcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� � ����������� ������ �� ���������� �� ������
 */
public class GTDExportInfoType
{
    private List<SCVVShipmentFactInfoType> shipmentFactInfoList = new ArrayList<SCVVShipmentFactInfoType>();
    private GTDInqType DTID;

    /** 
     * Get the list of 'ShipmentFactInfo' element items. �������� � ���������� ���������� �������
     * 
     * @return list
     */
    public List<SCVVShipmentFactInfoType> getShipmentFactInfoList() {
        return shipmentFactInfoList;
    }

    /** 
     * Set the list of 'ShipmentFactInfo' element items. �������� � ���������� ���������� �������
     * 
     * @param list
     */
    public void setShipmentFactInfoList(List<SCVVShipmentFactInfoType> list) {
        shipmentFactInfoList = list;
    }

    /** 
     * Get the 'DTID' element value. ��������������� ����� ��.
     * 
     * @return value
     */
    public GTDInqType getDTID() {
        return DTID;
    }

    /** 
     * Set the 'DTID' element value. ��������������� ����� ��.
     * 
     * @param DTID
     */
    public void setDTID(GTDInqType DTID) {
        this.DTID = DTID;
    }
}

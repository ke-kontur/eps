
package ru.acs.fts.schemas.album.measuringprotocol;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Сведения о транспортном средстве и ТТН
 */
public class TransportWayBillInfoType
{
    private String wayBillNumber;
    private List<TransportMeansBaseType> transportList = new ArrayList<TransportMeansBaseType>();

    /** 
     * Get the 'WayBillNumber' element value. Номер транспортной накладной
     * 
     * @return value
     */
    public String getWayBillNumber() {
        return wayBillNumber;
    }

    /** 
     * Set the 'WayBillNumber' element value. Номер транспортной накладной
     * 
     * @param wayBillNumber
     */
    public void setWayBillNumber(String wayBillNumber) {
        this.wayBillNumber = wayBillNumber;
    }

    /** 
     * Get the list of 'Transport' element items. Транспортное средство
     * 
     * @return list
     */
    public List<TransportMeansBaseType> getTransportList() {
        return transportList;
    }

    /** 
     * Set the list of 'Transport' element items. Транспортное средство
     * 
     * @param list
     */
    public void setTransportList(List<TransportMeansBaseType> list) {
        transportList = list;
    }
}

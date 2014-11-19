
package ru.acs.fts.schemas.album.scvvcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Информация о фактическом вывозе по декларации на товары
 */
public class GTDExportInfoType
{
    private List<SCVVShipmentFactInfoType> shipmentFactInfoList = new ArrayList<SCVVShipmentFactInfoType>();
    private GTDInqType DTID;

    /** 
     * Get the list of 'ShipmentFactInfo' element items. Сведения о фактически вывезенных товарах
     * 
     * @return list
     */
    public List<SCVVShipmentFactInfoType> getShipmentFactInfoList() {
        return shipmentFactInfoList;
    }

    /** 
     * Set the list of 'ShipmentFactInfo' element items. Сведения о фактически вывезенных товарах
     * 
     * @param list
     */
    public void setShipmentFactInfoList(List<SCVVShipmentFactInfoType> list) {
        shipmentFactInfoList = list;
    }

    /** 
     * Get the 'DTID' element value. Регистрационный номер ДТ.
     * 
     * @return value
     */
    public GTDInqType getDTID() {
        return DTID;
    }

    /** 
     * Set the 'DTID' element value. Регистрационный номер ДТ.
     * 
     * @param DTID
     */
    public void setDTID(GTDInqType DTID) {
        this.DTID = DTID;
    }
}

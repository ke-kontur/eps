
package ru.acs.fts.schemas.album.woodshipingspecification;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Сведения об организации
 */
public class OrganizationInfoType extends OrganizationBaseType
{
    private String stationName;
    private AddressType address;

    /** 
     * Get the 'StationName' element value. Наименование станции
     * 
     * @return value
     */
    public String getStationName() {
        return stationName;
    }

    /** 
     * Set the 'StationName' element value. Наименование станции
     * 
     * @param stationName
     */
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    /** 
     * Get the 'Address' element value. Адрес
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}

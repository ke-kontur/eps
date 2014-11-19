
package ru.acs.fts.schemas.album.woodshipingspecification;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �������� �� �����������
 */
public class OrganizationInfoType extends OrganizationBaseType
{
    private String stationName;
    private AddressType address;

    /** 
     * Get the 'StationName' element value. ������������ �������
     * 
     * @return value
     */
    public String getStationName() {
        return stationName;
    }

    /** 
     * Set the 'StationName' element value. ������������ �������
     * 
     * @param stationName
     */
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    /** 
     * Get the 'Address' element value. �����
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. �����
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}

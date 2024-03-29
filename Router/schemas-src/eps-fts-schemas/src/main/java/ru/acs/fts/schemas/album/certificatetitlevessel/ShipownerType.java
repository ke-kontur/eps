
package ru.acs.fts.schemas.album.certificatetitlevessel;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �������� � �������������
 */
public class ShipownerType extends OrganizationBaseType
{
    private AddressType postalAddress;
    private AddressType locationPlace;

    /** 
     * Get the 'PostalAddress' element value. �������� �����
     * 
     * @return value
     */
    public AddressType getPostalAddress() {
        return postalAddress;
    }

    /** 
     * Set the 'PostalAddress' element value. �������� �����
     * 
     * @param postalAddress
     */
    public void setPostalAddress(AddressType postalAddress) {
        this.postalAddress = postalAddress;
    }

    /** 
     * Get the 'LocationPlace' element value. ����� ����������
     * 
     * @return value
     */
    public AddressType getLocationPlace() {
        return locationPlace;
    }

    /** 
     * Set the 'LocationPlace' element value. ����� ����������
     * 
     * @param locationPlace
     */
    public void setLocationPlace(AddressType locationPlace) {
        this.locationPlace = locationPlace;
    }
}


package ru.acs.fts.schemas.album.veterinarycertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * ��������������� ���������/���������/����� ����������� �����������
 */
public class LocationType
{
    private String placeLocation;
    private AddressType address;

    /** 
     * Get the 'PlaceLocation' element value. ���������������  ���������
     * 
     * @return value
     */
    public String getPlaceLocation() {
        return placeLocation;
    }

    /** 
     * Set the 'PlaceLocation' element value. ���������������  ���������
     * 
     * @param placeLocation
     */
    public void setPlaceLocation(String placeLocation) {
        this.placeLocation = placeLocation;
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

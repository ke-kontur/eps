
package ru.acs.fts.schemas.album.veterinarycertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Местонахождение продукции/животного/Место составления сертификата
 */
public class LocationType
{
    private String placeLocation;
    private AddressType address;

    /** 
     * Get the 'PlaceLocation' element value. Местонахождение  продукции
     * 
     * @return value
     */
    public String getPlaceLocation() {
        return placeLocation;
    }

    /** 
     * Set the 'PlaceLocation' element value. Местонахождение  продукции
     * 
     * @param placeLocation
     */
    public void setPlaceLocation(String placeLocation) {
        this.placeLocation = placeLocation;
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

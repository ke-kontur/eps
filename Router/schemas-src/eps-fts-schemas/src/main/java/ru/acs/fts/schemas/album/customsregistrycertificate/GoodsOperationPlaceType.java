
package ru.acs.fts.schemas.album.customsregistrycertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Характеристика местонахождения помещения, открытой площадки, иной территории
 */
public class GoodsOperationPlaceType
{
    private String placeSign;
    private String placeDescription;
    private String placeVolume;
    private String placeSquare;
    private AddressType address;

    /** 
     * Get the 'PlaceSign' element value. Признак места: 1 - торговый зал (МБТ); 2 - склад (МБТ); 3 - открытая площадка; 4 - помещение
     * 
     * @return value
     */
    public String getPlaceSign() {
        return placeSign;
    }

    /** 
     * Set the 'PlaceSign' element value. Признак места: 1 - торговый зал (МБТ); 2 - склад (МБТ); 3 - открытая площадка; 4 - помещение
     * 
     * @param placeSign
     */
    public void setPlaceSign(String placeSign) {
        this.placeSign = placeSign;
    }

    /** 
     * Get the 'PlaceDescription' element value. Описание места
     * 
     * @return value
     */
    public String getPlaceDescription() {
        return placeDescription;
    }

    /** 
     * Set the 'PlaceDescription' element value. Описание места
     * 
     * @param placeDescription
     */
    public void setPlaceDescription(String placeDescription) {
        this.placeDescription = placeDescription;
    }

    /** 
     * Get the 'PlaceVolume' element value. Объем помещения (полезный), куб. м
     * 
     * @return value
     */
    public String getPlaceVolume() {
        return placeVolume;
    }

    /** 
     * Set the 'PlaceVolume' element value. Объем помещения (полезный), куб. м
     * 
     * @param placeVolume
     */
    public void setPlaceVolume(String placeVolume) {
        this.placeVolume = placeVolume;
    }

    /** 
     * Get the 'PlaceSquare' element value. Площадь открытой площадки (полезная), кв. м
     * 
     * @return value
     */
    public String getPlaceSquare() {
        return placeSquare;
    }

    /** 
     * Set the 'PlaceSquare' element value. Площадь открытой площадки (полезная), кв. м
     * 
     * @param placeSquare
     */
    public void setPlaceSquare(String placeSquare) {
        this.placeSquare = placeSquare;
    }

    /** 
     * Get the 'Address' element value. Местонахождение помещения, открытой площадки, иной территории
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Местонахождение помещения, открытой площадки, иной территории
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}

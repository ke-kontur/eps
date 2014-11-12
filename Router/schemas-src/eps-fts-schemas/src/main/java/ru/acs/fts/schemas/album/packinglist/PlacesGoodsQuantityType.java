
package ru.acs.fts.schemas.album.packinglist;

/** 
 * Количество мест товара по видам грузовых  мест
 */
public class PlacesGoodsQuantityType extends PlacesQuantityType
{
    private String placesPartQuantity;

    /** 
     * Get the 'PlacesPartQuantity' element value. Количество грузовых мест, частично занятых товаром
     * 
     * @return value
     */
    public String getPlacesPartQuantity() {
        return placesPartQuantity;
    }

    /** 
     * Set the 'PlacesPartQuantity' element value. Количество грузовых мест, частично занятых товаром
     * 
     * @param placesPartQuantity
     */
    public void setPlacesPartQuantity(String placesPartQuantity) {
        this.placesPartQuantity = placesPartQuantity;
    }
}

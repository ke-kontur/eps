
package ru.acs.fts.schemas.album.packinglist;

/** 
 *  оличество мест товара по видам грузовых  мест
 */
public class PlacesGoodsQuantityType extends PlacesQuantityType
{
    private String placesPartQuantity;

    /** 
     * Get the 'PlacesPartQuantity' element value.  оличество грузовых мест, частично зан€тых товаром
     * 
     * @return value
     */
    public String getPlacesPartQuantity() {
        return placesPartQuantity;
    }

    /** 
     * Set the 'PlacesPartQuantity' element value.  оличество грузовых мест, частично зан€тых товаром
     * 
     * @param placesPartQuantity
     */
    public void setPlacesPartQuantity(String placesPartQuantity) {
        this.placesPartQuantity = placesPartQuantity;
    }
}

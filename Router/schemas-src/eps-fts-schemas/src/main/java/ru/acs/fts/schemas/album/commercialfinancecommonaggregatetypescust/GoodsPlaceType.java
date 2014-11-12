
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

/** 
 * Описание грузовых мест
 */
public class GoodsPlaceType
{
    private String placeKind;
    private String placesQuantity;
    private String placeWeightQuantity;

    /** 
     * Get the 'PlaceKind' element value. Код вида грузового места из справочника НСИ
     * 
     * @return value
     */
    public String getPlaceKind() {
        return placeKind;
    }

    /** 
     * Set the 'PlaceKind' element value. Код вида грузового места из справочника НСИ
     * 
     * @param placeKind
     */
    public void setPlaceKind(String placeKind) {
        this.placeKind = placeKind;
    }

    /** 
     * Get the 'PlacesQuantity' element value. Общее количество грузовых мест товара
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. Общее количество грузовых мест товара
     * 
     * @param placesQuantity
     */
    public void setPlacesQuantity(String placesQuantity) {
        this.placesQuantity = placesQuantity;
    }

    /** 
     * Get the 'PlaceWeightQuantity' element value. Вес места (кг)
     * 
     * @return value
     */
    public String getPlaceWeightQuantity() {
        return placeWeightQuantity;
    }

    /** 
     * Set the 'PlaceWeightQuantity' element value. Вес места (кг)
     * 
     * @param placeWeightQuantity
     */
    public void setPlaceWeightQuantity(String placeWeightQuantity) {
        this.placeWeightQuantity = placeWeightQuantity;
    }
}

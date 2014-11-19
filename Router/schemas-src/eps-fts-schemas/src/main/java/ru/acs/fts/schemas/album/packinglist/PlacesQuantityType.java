
package ru.acs.fts.schemas.album.packinglist;

/** 
 * Общее количество мест по видам грузовых  мест
 */
public class PlacesQuantityType
{
    private String placesQuantity;
    private String placesDescription;
    private String packingCode;

    /** 
     * Get the 'PlacesQuantity' element value. Количество грузовых мест товара (при описании товара указывается количество полностью занимаемых товаром мест)
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. Количество грузовых мест товара (при описании товара указывается количество полностью занимаемых товаром мест)
     * 
     * @param placesQuantity
     */
    public void setPlacesQuantity(String placesQuantity) {
        this.placesQuantity = placesQuantity;
    }

    /** 
     * Get the 'PlacesDescription' element value. Описание вида грузовых мест (коробок, упаковок, паллет и т.д.)
     * 
     * @return value
     */
    public String getPlacesDescription() {
        return placesDescription;
    }

    /** 
     * Set the 'PlacesDescription' element value. Описание вида грузовых мест (коробок, упаковок, паллет и т.д.)
     * 
     * @param placesDescription
     */
    public void setPlacesDescription(String placesDescription) {
        this.placesDescription = placesDescription;
    }

    /** 
     * Get the 'PackingCode' element value. Код вида упаковки товаров в соответствии с  классификатором видов груза, упаковки и упаковочных материалов.
     * 
     * @return value
     */
    public String getPackingCode() {
        return packingCode;
    }

    /** 
     * Set the 'PackingCode' element value. Код вида упаковки товаров в соответствии с  классификатором видов груза, упаковки и упаковочных материалов.
     * 
     * @param packingCode
     */
    public void setPackingCode(String packingCode) {
        this.packingCode = packingCode;
    }
}

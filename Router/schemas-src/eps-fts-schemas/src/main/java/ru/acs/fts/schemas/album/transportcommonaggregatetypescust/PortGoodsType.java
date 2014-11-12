
package ru.acs.fts.schemas.album.transportcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportGoodsBaseType;

/** 
 * Описание груза (товаров) - выгрузка/загрузка в порту
 */
public class PortGoodsType extends TransportGoodsBaseType
{
    private String placesQuantity;
    private String grossWeightQuantity;
    private String dimensions;

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
     * Get the 'GrossWeightQuantity' element value. Вес товара, брутто (кг)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. Вес товара, брутто (кг)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'Dimensions' element value. Размеры груза
     * 
     * @return value
     */
    public String getDimensions() {
        return dimensions;
    }

    /** 
     * Set the 'Dimensions' element value. Размеры груза
     * 
     * @param dimensions
     */
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}

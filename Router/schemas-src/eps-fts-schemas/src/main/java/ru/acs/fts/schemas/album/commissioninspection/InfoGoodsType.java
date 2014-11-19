
package ru.acs.fts.schemas.album.commissioninspection;

/** 
 * Сведения о товаре
 */
public class InfoGoodsType
{
    private String nameDepartureCountry;
    private String quantity;
    private String netWeightQuantity;
    private String grossWeightQuantity;

    /** 
     * Get the 'NameDepartureCountry' element value. Страна отправления
     * 
     * @return value
     */
    public String getNameDepartureCountry() {
        return nameDepartureCountry;
    }

    /** 
     * Set the 'NameDepartureCountry' element value. Страна отправления
     * 
     * @param nameDepartureCountry
     */
    public void setNameDepartureCountry(String nameDepartureCountry) {
        this.nameDepartureCountry = nameDepartureCountry;
    }

    /** 
     * Get the 'Quantity' element value. Количество мест 
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество мест 
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. Вес товаров, нетто  (кг)
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. Вес товаров, нетто  (кг)
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. Вес товаров, брутто (кг)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. Вес товаров, брутто (кг)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }
}

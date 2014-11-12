
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

/** 
 * Вес нетто,брутто товара в кг.
 */
public class GoodsWeightType
{
    private String netWeightQuantity;
    private String grossWeightQuantity;

    /** 
     * Get the 'NetWeightQuantity' element value. Вес товара нетто (кг)
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. Вес товара нетто (кг)
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. Вес товара брутто (кг)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. Вес товара брутто (кг)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }
}

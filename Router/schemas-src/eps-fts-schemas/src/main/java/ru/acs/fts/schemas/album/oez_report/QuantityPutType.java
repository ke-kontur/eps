
package ru.acs.fts.schemas.album.oez_report;

/** 
 * Количество товара, помещённое под таможенный режим СТЗ
 */
public class QuantityPutType
{
    private String quantityAtTheBeginning;
    private String quantityInTheEnd;
    private String quantityTotal;

    /** 
     * Get the 'QuantityAtTheBeginning' element value. Количество товара в начале отчётного периода
     * 
     * @return value
     */
    public String getQuantityAtTheBeginning() {
        return quantityAtTheBeginning;
    }

    /** 
     * Set the 'QuantityAtTheBeginning' element value. Количество товара в начале отчётного периода
     * 
     * @param quantityAtTheBeginning
     */
    public void setQuantityAtTheBeginning(String quantityAtTheBeginning) {
        this.quantityAtTheBeginning = quantityAtTheBeginning;
    }

    /** 
     * Get the 'QuantityInTheEnd' element value. Количество товара, на конец отчетного периода
     * 
     * @return value
     */
    public String getQuantityInTheEnd() {
        return quantityInTheEnd;
    }

    /** 
     * Set the 'QuantityInTheEnd' element value. Количество товара, на конец отчетного периода
     * 
     * @param quantityInTheEnd
     */
    public void setQuantityInTheEnd(String quantityInTheEnd) {
        this.quantityInTheEnd = quantityInTheEnd;
    }

    /** 
     * Get the 'QuantityTotal' element value. Всего за отчётный период
     * 
     * @return value
     */
    public String getQuantityTotal() {
        return quantityTotal;
    }

    /** 
     * Set the 'QuantityTotal' element value. Всего за отчётный период
     * 
     * @param quantityTotal
     */
    public void setQuantityTotal(String quantityTotal) {
        this.quantityTotal = quantityTotal;
    }
}

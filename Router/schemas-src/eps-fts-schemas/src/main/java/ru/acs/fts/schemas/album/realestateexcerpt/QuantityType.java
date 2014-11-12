
package ru.acs.fts.schemas.album.realestateexcerpt;

/** 
 * Количество
 */
public class QuantityType
{
    private String originalSign;
    private String quantity;
    private String sheetQuantity;

    /** 
     * Get the 'OriginalSign' element value. Признак подлинности
     * 
     * @return value
     */
    public String getOriginalSign() {
        return originalSign;
    }

    /** 
     * Set the 'OriginalSign' element value. Признак подлинности
     * 
     * @param originalSign
     */
    public void setOriginalSign(String originalSign) {
        this.originalSign = originalSign;
    }

    /** 
     * Get the 'Quantity' element value. Кол-во экземпляров
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Кол-во экземпляров
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'SheetQuantity' element value. Количество листов
     * 
     * @return value
     */
    public String getSheetQuantity() {
        return sheetQuantity;
    }

    /** 
     * Set the 'SheetQuantity' element value. Количество листов
     * 
     * @param sheetQuantity
     */
    public void setSheetQuantity(String sheetQuantity) {
        this.sheetQuantity = sheetQuantity;
    }
}

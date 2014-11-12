
package ru.acs.fts.schemas.album.oez_report;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Использование товаров
 */
public class GoodsUsageType
{
    private String quantity;
    private DocumentBaseType confirmUsageDoc;

    /** 
     * Get the 'Quantity' element value. Количество товара
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество товара
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'ConfirmUsageDoc' element value. Документ, подтверждающий факт использования
     * 
     * @return value
     */
    public DocumentBaseType getConfirmUsageDoc() {
        return confirmUsageDoc;
    }

    /** 
     * Set the 'ConfirmUsageDoc' element value. Документ, подтверждающий факт использования
     * 
     * @param confirmUsageDoc
     */
    public void setConfirmUsageDoc(DocumentBaseType confirmUsageDoc) {
        this.confirmUsageDoc = confirmUsageDoc;
    }
}

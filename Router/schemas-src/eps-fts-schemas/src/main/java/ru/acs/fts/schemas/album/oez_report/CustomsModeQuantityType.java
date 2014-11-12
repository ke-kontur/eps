
package ru.acs.fts.schemas.album.oez_report;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Количество товара, соответствующее определённому коду таможенного режима
 */
public class CustomsModeQuantityType
{
    private String customsModeCode;
    private String quantity;
    private GTDIDType declarationNumber;

    /** 
     * Get the 'CustomsModeCode' element value. Код таможенного режима
     * 
     * @return value
     */
    public String getCustomsModeCode() {
        return customsModeCode;
    }

    /** 
     * Set the 'CustomsModeCode' element value. Код таможенного режима
     * 
     * @param customsModeCode
     */
    public void setCustomsModeCode(String customsModeCode) {
        this.customsModeCode = customsModeCode;
    }

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
     * Get the 'DeclarationNumber' element value. Номер таможенной декларации
     * 
     * @return value
     */
    public GTDIDType getDeclarationNumber() {
        return declarationNumber;
    }

    /** 
     * Set the 'DeclarationNumber' element value. Номер таможенной декларации
     * 
     * @param declarationNumber
     */
    public void setDeclarationNumber(GTDIDType declarationNumber) {
        this.declarationNumber = declarationNumber;
    }
}

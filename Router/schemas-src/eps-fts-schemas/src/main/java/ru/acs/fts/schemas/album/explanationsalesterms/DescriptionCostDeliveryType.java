
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Описание стоимость доставки.
 */
public class DescriptionCostDeliveryType
{
    private String value;
    private String quantity;
    private String currency;

    /** 
     * Get the 'Value' element value. Если значение поля: true или 1 - да; false или 0 - нет
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'Value' element value. Если значение поля: true или 1 - да; false или 0 - нет
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /** 
     * Get the 'Quantity' element value. Стоимость доставки
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Стоимость доставки
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'Currency' element value. Валюта 
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. Валюта 
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

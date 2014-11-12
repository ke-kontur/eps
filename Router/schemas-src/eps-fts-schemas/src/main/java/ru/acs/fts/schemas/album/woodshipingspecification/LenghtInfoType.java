
package ru.acs.fts.schemas.album.woodshipingspecification;

/** 
 * Сведения о длине
 */
public class LenghtInfoType
{
    private String standartValue;
    private String quantity;

    /** 
     * Get the 'StandartValue' element value. Значение по ГОСТу
     * 
     * @return value
     */
    public String getStandartValue() {
        return standartValue;
    }

    /** 
     * Set the 'StandartValue' element value. Значение по ГОСТу
     * 
     * @param standartValue
     */
    public void setStandartValue(String standartValue) {
        this.standartValue = standartValue;
    }

    /** 
     * Get the 'Quantity' element value. Количество
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}

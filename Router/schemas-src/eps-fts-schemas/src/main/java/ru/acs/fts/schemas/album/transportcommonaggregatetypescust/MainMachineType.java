
package ru.acs.fts.schemas.album.transportcommonaggregatetypescust;

/** 
 * Сведения о главных машинах судна
 */
public class MainMachineType
{
    private String type;
    private String quantity;
    private String power;

    /** 
     * Get the 'Type' element value. Тип машины
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' element value. Тип машины
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'Quantity' element value. Число
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Число
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'Power' element value. Общая мощность
     * 
     * @return value
     */
    public String getPower() {
        return power;
    }

    /** 
     * Set the 'Power' element value. Общая мощность
     * 
     * @param power
     */
    public void setPower(String power) {
        this.power = power;
    }
}

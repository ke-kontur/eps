
package ru.acs.fts.schemas.album.veterinarycertificate;

/** 
 * Описание
 */
public class DescriptionType
{
    private String quantity;
    private String weight;

    /** 
     * Get the 'Quantity' element value. Мест(штук)
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Мест(штук)
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'Weight' element value. Вес
     * 
     * @return value
     */
    public String getWeight() {
        return weight;
    }

    /** 
     * Set the 'Weight' element value. Вес
     * 
     * @param weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }
}

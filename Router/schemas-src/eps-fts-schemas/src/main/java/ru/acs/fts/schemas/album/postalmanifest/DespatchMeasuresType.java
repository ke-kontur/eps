
package ru.acs.fts.schemas.album.postalmanifest;

/** 
 * Данные о количественных характеристиках почтового отправления
 */
public class DespatchMeasuresType
{
    private String quantity;
    private String weight;
    private String factWeight;

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

    /** 
     * Get the 'FactWeight' element value. Фактический вес
     * 
     * @return value
     */
    public String getFactWeight() {
        return factWeight;
    }

    /** 
     * Set the 'FactWeight' element value. Фактический вес
     * 
     * @param factWeight
     */
    public void setFactWeight(String factWeight) {
        this.factWeight = factWeight;
    }
}

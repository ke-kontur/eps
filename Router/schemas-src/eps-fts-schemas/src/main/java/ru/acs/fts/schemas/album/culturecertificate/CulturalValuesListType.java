
package ru.acs.fts.schemas.album.culturecertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Список культурных ценностей
 */
public class CulturalValuesListType
{
    private String culturalName;
    private SupplementaryQuantityType quantity;

    /** 
     * Get the 'CulturalName' element value. Наименование культурной ценности
     * 
     * @return value
     */
    public String getCulturalName() {
        return culturalName;
    }

    /** 
     * Set the 'CulturalName' element value. Наименование культурной ценности
     * 
     * @param culturalName
     */
    public void setCulturalName(String culturalName) {
        this.culturalName = culturalName;
    }

    /** 
     * Get the 'Quantity' element value. Количество
     * 
     * @return value
     */
    public SupplementaryQuantityType getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество
     * 
     * @param quantity
     */
    public void setQuantity(SupplementaryQuantityType quantity) {
        this.quantity = quantity;
    }
}


package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * Комплексный тип для описания паллет и поддонов, на которых находится товар
 */
public class WHPalleteInformationType
{
    private String palleteQuantity;
    private String palleteDescription;

    /** 
     * Get the 'PalleteQuantity' element value. Количество поддонов
     * 
     * @return value
     */
    public String getPalleteQuantity() {
        return palleteQuantity;
    }

    /** 
     * Set the 'PalleteQuantity' element value. Количество поддонов
     * 
     * @param palleteQuantity
     */
    public void setPalleteQuantity(String palleteQuantity) {
        this.palleteQuantity = palleteQuantity;
    }

    /** 
     * Get the 'PalleteDescription' element value. Описание поддонов.
     * 
     * @return value
     */
    public String getPalleteDescription() {
        return palleteDescription;
    }

    /** 
     * Set the 'PalleteDescription' element value. Описание поддонов.
     * 
     * @param palleteDescription
     */
    public void setPalleteDescription(String palleteDescription) {
        this.palleteDescription = palleteDescription;
    }
}

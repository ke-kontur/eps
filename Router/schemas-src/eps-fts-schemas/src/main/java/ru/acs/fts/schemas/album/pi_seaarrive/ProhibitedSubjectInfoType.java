
package ru.acs.fts.schemas.album.pi_seaarrive;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Информация о товаре, на который накладывается запрет или ограничение
 */
public class ProhibitedSubjectInfoType extends SupplementaryQuantityType
{
    private String name;
    private String description;

    /** 
     * Get the 'Name' element value. Наименование
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Description' element value. Описание товара
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. Описание товара
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}

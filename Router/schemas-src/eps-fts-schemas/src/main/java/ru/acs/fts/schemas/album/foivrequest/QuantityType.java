
package ru.acs.fts.schemas.album.foivrequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Количество
 */
public class QuantityType extends SupplementaryQuantityType
{
    private String UUID;

    /** 
     * Get the 'UUID' element value. Идентификатор единицы измерения
     * 
     * @return value
     */
    public String getUUID() {
        return UUID;
    }

    /** 
     * Set the 'UUID' element value. Идентификатор единицы измерения
     * 
     * @param UUID
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }
}


package ru.acs.fts.schemas.album.whdocinventory;

import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHCustomInspectorType;

/** 
 * Таможенный пост
 */
public class CustomsType
        extends
            ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType
{
    private WHCustomInspectorType customsPerson;

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public WHCustomInspectorType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(WHCustomInspectorType customsPerson) {
        this.customsPerson = customsPerson;
    }
}

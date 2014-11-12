
package ru.acs.fts.schemas.album.actinspection;

import java.util.ArrayList;
import java.util.List;

/** 
 * Видимые повреждения
 */
public class DamagesType
{
    private List<String> visDamageList = new ArrayList<String>();

    /** 
     * Get the list of 'VisDamage' element items. Видимые повреждения
     * 
     * @return list
     */
    public List<String> getVisDamageList() {
        return visDamageList;
    }

    /** 
     * Set the list of 'VisDamage' element items. Видимые повреждения
     * 
     * @param list
     */
    public void setVisDamageList(List<String> list) {
        visDamageList = list;
    }
}

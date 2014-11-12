
package ru.acs.fts.schemas.album.sanitarysertif;

import java.util.ArrayList;
import java.util.List;

/** 
 * Приложение к санитарно-эпидемиологическому заключению
 */
public class SertifSupplementType
{
    private List<String> supplementTextList = new ArrayList<String>();

    /** 
     * Get the list of 'SupplementText' element items. Текст приложения
     * 
     * @return list
     */
    public List<String> getSupplementTextList() {
        return supplementTextList;
    }

    /** 
     * Set the list of 'SupplementText' element items. Текст приложения
     * 
     * @param list
     */
    public void setSupplementTextList(List<String> list) {
        supplementTextList = list;
    }
}


package ru.acs.fts.schemas.album.applicationstore;

import java.util.ArrayList;
import java.util.List;

/** 
 * Комментарии
 */
public class CommentsType
{
    private List<String> otherInformList = new ArrayList<String>();

    /** 
     * Get the list of 'OtherInform' element items. Иные сведения
     * 
     * @return list
     */
    public List<String> getOtherInformList() {
        return otherInformList;
    }

    /** 
     * Set the list of 'OtherInform' element items. Иные сведения
     * 
     * @param list
     */
    public void setOtherInformList(List<String> list) {
        otherInformList = list;
    }
}


package ru.acs.fts.schemas.album.passengermanifest;

import java.util.ArrayList;
import java.util.List;

/** 
 * Багажные бирки
 */
public class LuggageTagType
{
    private List<String> luggageNumberList = new ArrayList<String>();

    /** 
     * Get the list of 'LuggageNumber' element items. Номер багажной бирки
     * 
     * @return list
     */
    public List<String> getLuggageNumberList() {
        return luggageNumberList;
    }

    /** 
     * Set the list of 'LuggageNumber' element items. Номер багажной бирки
     * 
     * @param list
     */
    public void setLuggageNumberList(List<String> list) {
        luggageNumberList = list;
    }
}

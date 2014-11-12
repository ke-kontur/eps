
package ru.acs.fts.schemas.album.instrinspection;

import java.util.ArrayList;
import java.util.List;

/** 
 * Применение средств идентификации
 */
public class UseIdentType
{
    private List<IdentUnitType> identUnitList = new ArrayList<IdentUnitType>();

    /** 
     * Get the list of 'IdentUnit' element items. Средство идентификации
     * 
     * @return list
     */
    public List<IdentUnitType> getIdentUnitList() {
        return identUnitList;
    }

    /** 
     * Set the list of 'IdentUnit' element items. Средство идентификации
     * 
     * @param list
     */
    public void setIdentUnitList(List<IdentUnitType> list) {
        identUnitList = list;
    }
}

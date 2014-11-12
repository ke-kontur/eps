
package ru.acs.fts.schemas.album.resulttk;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Регистрационные данные ТС
 */
public class TransportType extends TransportMeansBaseType
{
    private List<CheckViolationType> violFidelNumbTrailList = new ArrayList<CheckViolationType>();

    /** 
     * Get the list of 'ViolFidelNumbTrail' element items. Наличие и соответствие отличительного знака страны регистрации прицепа/полуприцепа установленным требованиям
     * 
     * @return list
     */
    public List<CheckViolationType> getViolFidelNumbTrailList() {
        return violFidelNumbTrailList;
    }

    /** 
     * Set the list of 'ViolFidelNumbTrail' element items. Наличие и соответствие отличительного знака страны регистрации прицепа/полуприцепа установленным требованиям
     * 
     * @param list
     */
    public void setViolFidelNumbTrailList(List<CheckViolationType> list) {
        violFidelNumbTrailList = list;
    }
}

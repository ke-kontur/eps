
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalTime;

/** 
 * Параметры фильтра для значения типа "time" (время). Допустимые операторы: empty, not_empty, equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal.
 */
public class AUDTimeFilterParamsType extends AUDBaseFilterParamsType
{
    private List<LocalTime> filterValueList = new ArrayList<LocalTime>();

    /** 
     * Get the list of 'FilterValue' element items. Значение фильтра для типа "time" (время).
     * 
     * @return list
     */
    public List<LocalTime> getFilterValueList() {
        return filterValueList;
    }

    /** 
     * Set the list of 'FilterValue' element items. Значение фильтра для типа "time" (время).
     * 
     * @param list
     */
    public void setFilterValueList(List<LocalTime> list) {
        filterValueList = list;
    }
}

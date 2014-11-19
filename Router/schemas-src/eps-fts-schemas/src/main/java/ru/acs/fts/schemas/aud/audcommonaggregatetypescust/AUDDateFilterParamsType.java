
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Параметры фильтра для значения типа "date" (дата). Допустимые операторы: empty, not_empty, equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal.
 */
public class AUDDateFilterParamsType extends AUDBaseFilterParamsType
{
    private List<LocalDate> filterValueList = new ArrayList<LocalDate>();

    /** 
     * Get the list of 'FilterValue' element items. Значение фильтра для типа "date" (дата).
     * 
     * @return list
     */
    public List<LocalDate> getFilterValueList() {
        return filterValueList;
    }

    /** 
     * Set the list of 'FilterValue' element items. Значение фильтра для типа "date" (дата).
     * 
     * @param list
     */
    public void setFilterValueList(List<LocalDate> list) {
        filterValueList = list;
    }
}

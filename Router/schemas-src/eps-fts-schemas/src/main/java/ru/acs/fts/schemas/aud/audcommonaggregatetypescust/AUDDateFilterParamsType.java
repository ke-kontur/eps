
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * ��������� ������� ��� �������� ���� "date" (����). ���������� ���������: empty, not_empty, equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal.
 */
public class AUDDateFilterParamsType extends AUDBaseFilterParamsType
{
    private List<LocalDate> filterValueList = new ArrayList<LocalDate>();

    /** 
     * Get the list of 'FilterValue' element items. �������� ������� ��� ���� "date" (����).
     * 
     * @return list
     */
    public List<LocalDate> getFilterValueList() {
        return filterValueList;
    }

    /** 
     * Set the list of 'FilterValue' element items. �������� ������� ��� ���� "date" (����).
     * 
     * @param list
     */
    public void setFilterValueList(List<LocalDate> list) {
        filterValueList = list;
    }
}

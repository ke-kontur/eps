
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/** 
 * ��������� ������� ��� �������� ���� "datetime" (���� � �����). ���������� ���������: empty, not_empty, equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal.
 */
public class AUDDateTimeFilterParamsType extends AUDBaseFilterParamsType
{
    private List<DateTime> filterValueList = new ArrayList<DateTime>();

    /** 
     * Get the list of 'FilterValue' element items. �������� ������� ��� ���� "datetime" (���� � �����).
     * 
     * @return list
     */
    public List<DateTime> getFilterValueList() {
        return filterValueList;
    }

    /** 
     * Set the list of 'FilterValue' element items. �������� ������� ��� ���� "datetime" (���� � �����).
     * 
     * @param list
     */
    public void setFilterValueList(List<DateTime> list) {
        filterValueList = list;
    }
}

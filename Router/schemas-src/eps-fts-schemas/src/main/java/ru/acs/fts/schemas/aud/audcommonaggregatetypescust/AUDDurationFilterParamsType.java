
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ��������� ������� ��� �������� ���� "duration" (������������). ���������� ���������: empty, not_empty, equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal.
 */
public class AUDDurationFilterParamsType extends AUDBaseFilterParamsType
{
    private List<String> filterValueList = new ArrayList<String>();

    /** 
     * Get the list of 'FilterValue' element items. �������� ������� ��� ���� "duration" (������������).
     * 
     * @return list
     */
    public List<String> getFilterValueList() {
        return filterValueList;
    }

    /** 
     * Set the list of 'FilterValue' element items. �������� ������� ��� ���� "duration" (������������).
     * 
     * @param list
     */
    public void setFilterValueList(List<String> list) {
        filterValueList = list;
    }
}

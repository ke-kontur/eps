
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/** 
 * ��������� ������� ��� �������� ���� "real" (������������ �����). ���������� ���������: empty, not_empty, equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal.
 */
public class AUDRealNumberFilterParamsType extends AUDBaseFilterParamsType
{
    private List<BigDecimal> filterValueList = new ArrayList<BigDecimal>();

    /** 
     * Get the list of 'FilterValue' element items. �������� ������� ��� ���� "real" (������������ �����).
     * 
     * @return list
     */
    public List<BigDecimal> getFilterValueList() {
        return filterValueList;
    }

    /** 
     * Set the list of 'FilterValue' element items. �������� ������� ��� ���� "real" (������������ �����).
     * 
     * @param list
     */
    public void setFilterValueList(List<BigDecimal> list) {
        filterValueList = list;
    }
}

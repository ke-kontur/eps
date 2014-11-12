
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/** 
 * Параметры фильтра для значения типа "integer" (целое число). Допустимые операторы: empty, not_empty, equal, not_equal, more_than, more_than_or_equal, less_than, less_than_or_equal, between, between_or_equal.
 */
public class AUDIntegerNumberFilterParamsType extends AUDBaseFilterParamsType
{
    private List<BigInteger> filterValueList = new ArrayList<BigInteger>();

    /** 
     * Get the list of 'FilterValue' element items. Значение фильтра для типа "integer" (целое число).
     * 
     * @return list
     */
    public List<BigInteger> getFilterValueList() {
        return filterValueList;
    }

    /** 
     * Set the list of 'FilterValue' element items. Значение фильтра для типа "integer" (целое число).
     * 
     * @param list
     */
    public void setFilterValueList(List<BigInteger> list) {
        filterValueList = list;
    }
}

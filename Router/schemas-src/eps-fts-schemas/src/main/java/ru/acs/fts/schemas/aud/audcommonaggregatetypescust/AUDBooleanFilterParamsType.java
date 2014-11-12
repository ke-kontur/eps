
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Параметры фильтра для значения типа "boolean" (булевое). Допустимые операторы: empty, not_empty, equal, not_equal.
 */
public class AUDBooleanFilterParamsType extends AUDBaseFilterParamsType
{
    private Boolean filterValue;

    /** 
     * Get the 'FilterValue' element value. Значение фильтра для типа "boolean" (булевое).
     * 
     * @return value
     */
    public Boolean getFilterValue() {
        return filterValue;
    }

    /** 
     * Set the 'FilterValue' element value. Значение фильтра для типа "boolean" (булевое).
     * 
     * @param filterValue
     */
    public void setFilterValue(Boolean filterValue) {
        this.filterValue = filterValue;
    }
}

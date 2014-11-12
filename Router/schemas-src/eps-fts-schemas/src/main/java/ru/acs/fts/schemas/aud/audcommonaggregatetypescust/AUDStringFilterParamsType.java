
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Параметры фильтра для значения типа "string" (строка). Допустимые операторы: empty, not_empty, equal, not_equal, like.
 */
public class AUDStringFilterParamsType extends AUDBaseFilterParamsType
{
    private String filterValue;
    private boolean caseSensitiveIndicator;

    /** 
     * Get the 'FilterValue' element value. Значение фильтра для типа "string" (строка).
     * 
     * @return value
     */
    public String getFilterValue() {
        return filterValue;
    }

    /** 
     * Set the 'FilterValue' element value. Значение фильтра для типа "string" (строка).
     * 
     * @param filterValue
     */
    public void setFilterValue(String filterValue) {
        this.filterValue = filterValue;
    }

    /** 
     * Get the 'CaseSensitiveIndicator' element value. Признак: 0 (false) - выполнять поиск без учета регистра букв; 1 (true) - выполнять поиск с учетом регистра букв.
     * 
     * @return value
     */
    public boolean isCaseSensitiveIndicator() {
        return caseSensitiveIndicator;
    }

    /** 
     * Set the 'CaseSensitiveIndicator' element value. Признак: 0 (false) - выполнять поиск без учета регистра букв; 1 (true) - выполнять поиск с учетом регистра букв.
     * 
     * @param caseSensitiveIndicator
     */
    public void setCaseSensitiveIndicator(boolean caseSensitiveIndicator) {
        this.caseSensitiveIndicator = caseSensitiveIndicator;
    }
}

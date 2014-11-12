
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * ��������� ������� ��� �������� ���� "string" (������). ���������� ���������: empty, not_empty, equal, not_equal, like.
 */
public class AUDStringFilterParamsType extends AUDBaseFilterParamsType
{
    private String filterValue;
    private boolean caseSensitiveIndicator;

    /** 
     * Get the 'FilterValue' element value. �������� ������� ��� ���� "string" (������).
     * 
     * @return value
     */
    public String getFilterValue() {
        return filterValue;
    }

    /** 
     * Set the 'FilterValue' element value. �������� ������� ��� ���� "string" (������).
     * 
     * @param filterValue
     */
    public void setFilterValue(String filterValue) {
        this.filterValue = filterValue;
    }

    /** 
     * Get the 'CaseSensitiveIndicator' element value. �������: 0 (false) - ��������� ����� ��� ����� �������� ����; 1 (true) - ��������� ����� � ������ �������� ����.
     * 
     * @return value
     */
    public boolean isCaseSensitiveIndicator() {
        return caseSensitiveIndicator;
    }

    /** 
     * Set the 'CaseSensitiveIndicator' element value. �������: 0 (false) - ��������� ����� ��� ����� �������� ����; 1 (true) - ��������� ����� � ������ �������� ����.
     * 
     * @param caseSensitiveIndicator
     */
    public void setCaseSensitiveIndicator(boolean caseSensitiveIndicator) {
        this.caseSensitiveIndicator = caseSensitiveIndicator;
    }
}

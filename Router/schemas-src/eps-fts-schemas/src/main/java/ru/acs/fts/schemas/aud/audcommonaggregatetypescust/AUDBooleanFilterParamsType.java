
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * ��������� ������� ��� �������� ���� "boolean" (�������). ���������� ���������: empty, not_empty, equal, not_equal.
 */
public class AUDBooleanFilterParamsType extends AUDBaseFilterParamsType
{
    private Boolean filterValue;

    /** 
     * Get the 'FilterValue' element value. �������� ������� ��� ���� "boolean" (�������).
     * 
     * @return value
     */
    public Boolean getFilterValue() {
        return filterValue;
    }

    /** 
     * Set the 'FilterValue' element value. �������� ������� ��� ���� "boolean" (�������).
     * 
     * @param filterValue
     */
    public void setFilterValue(Boolean filterValue) {
        this.filterValue = filterValue;
    }
}

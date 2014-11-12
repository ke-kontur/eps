
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Описание вида сотрудничества.
 */
public class DescriptionKindCooperationType
{
    private String periodTime;
    private String value;

    /** 
     * Get the 'PeriodTime' element value. Период времени
     * 
     * @return value
     */
    public String getPeriodTime() {
        return periodTime;
    }

    /** 
     * Set the 'PeriodTime' element value. Период времени
     * 
     * @param periodTime
     */
    public void setPeriodTime(String periodTime) {
        this.periodTime = periodTime;
    }

    /** 
     * Get the 'Value' element value. Если значение поля: true или 1 - да; false или 0 - нет
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'Value' element value. Если значение поля: true или 1 - да; false или 0 - нет
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }
}

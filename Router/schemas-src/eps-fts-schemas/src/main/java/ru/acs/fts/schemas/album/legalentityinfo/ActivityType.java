
package ru.acs.fts.schemas.album.legalentityinfo;

/** 
 * Сведения о кодах по Общероссийскому классификатору видов экономической деятельности
 */
public class ActivityType
{
    private String activityCode;
    private String activitySign;
    private RecordDataType recordData;

    /** 
     * Get the 'ActivityCode' element value. Код по Общероссийскому классификатору видов экономической деятельности
     * 
     * @return value
     */
    public String getActivityCode() {
        return activityCode;
    }

    /** 
     * Set the 'ActivityCode' element value. Код по Общероссийскому классификатору видов экономической деятельности
     * 
     * @param activityCode
     */
    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    /** 
     * Get the 'ActivitySign' element value. Признак: 0 - основной; 1 - дополнительный
     * 
     * @return value
     */
    public String getActivitySign() {
        return activitySign;
    }

    /** 
     * Set the 'ActivitySign' element value. Признак: 0 - основной; 1 - дополнительный
     * 
     * @param activitySign
     */
    public void setActivitySign(String activitySign) {
        this.activitySign = activitySign;
    }

    /** 
     * Get the 'RecordData' element value. Сведения о записи
     * 
     * @return value
     */
    public RecordDataType getRecordData() {
        return recordData;
    }

    /** 
     * Set the 'RecordData' element value. Сведения о записи
     * 
     * @param recordData
     */
    public void setRecordData(RecordDataType recordData) {
        this.recordData = recordData;
    }
}

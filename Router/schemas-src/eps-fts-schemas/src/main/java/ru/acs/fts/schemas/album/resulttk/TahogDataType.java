
package ru.acs.fts.schemas.album.resulttk;

/** 
 * Данные цифрового тахографа
 */
public class TahogDataType
{
    private String approvalDateTime;
    private String tahogInspectDateTime;
    private String driveDuration;
    private String driveDurationWeek;
    private String restDuration;
    private String restDurationWeek;
    private String breakDuration;

    /** 
     * Get the 'ApprovalDateTime' element value. Дата/время официального утверждения
     * 
     * @return value
     */
    public String getApprovalDateTime() {
        return approvalDateTime;
    }

    /** 
     * Set the 'ApprovalDateTime' element value. Дата/время официального утверждения
     * 
     * @param approvalDateTime
     */
    public void setApprovalDateTime(String approvalDateTime) {
        this.approvalDateTime = approvalDateTime;
    }

    /** 
     * Get the 'TahogInspectDateTime' element value. Дата/время последней инспекции
     * 
     * @return value
     */
    public String getTahogInspectDateTime() {
        return tahogInspectDateTime;
    }

    /** 
     * Set the 'TahogInspectDateTime' element value. Дата/время последней инспекции
     * 
     * @param tahogInspectDateTime
     */
    public void setTahogInspectDateTime(String tahogInspectDateTime) {
        this.tahogInspectDateTime = tahogInspectDateTime;
    }

    /** 
     * Get the 'DriveDuration' element value. Продолжительность управления ТС за предыдущий период
     * 
     * @return value
     */
    public String getDriveDuration() {
        return driveDuration;
    }

    /** 
     * Set the 'DriveDuration' element value. Продолжительность управления ТС за предыдущий период
     * 
     * @param driveDuration
     */
    public void setDriveDuration(String driveDuration) {
        this.driveDuration = driveDuration;
    }

    /** 
     * Get the 'DriveDurationWeek' element value. Продолжительность управления ТС за предыдущую неделю
     * 
     * @return value
     */
    public String getDriveDurationWeek() {
        return driveDurationWeek;
    }

    /** 
     * Set the 'DriveDurationWeek' element value. Продолжительность управления ТС за предыдущую неделю
     * 
     * @param driveDurationWeek
     */
    public void setDriveDurationWeek(String driveDurationWeek) {
        this.driveDurationWeek = driveDurationWeek;
    }

    /** 
     * Get the 'RestDuration' element value. Продолжительность отдыха за предыдущие сутки
     * 
     * @return value
     */
    public String getRestDuration() {
        return restDuration;
    }

    /** 
     * Set the 'RestDuration' element value. Продолжительность отдыха за предыдущие сутки
     * 
     * @param restDuration
     */
    public void setRestDuration(String restDuration) {
        this.restDuration = restDuration;
    }

    /** 
     * Get the 'RestDurationWeek' element value. Продолжительность отдыха за предыдущую неделю
     * 
     * @return value
     */
    public String getRestDurationWeek() {
        return restDurationWeek;
    }

    /** 
     * Set the 'RestDurationWeek' element value. Продолжительность отдыха за предыдущую неделю
     * 
     * @param restDurationWeek
     */
    public void setRestDurationWeek(String restDurationWeek) {
        this.restDurationWeek = restDurationWeek;
    }

    /** 
     * Get the 'BreakDuration' element value. Продолжительность перерывов в течение смены
     * 
     * @return value
     */
    public String getBreakDuration() {
        return breakDuration;
    }

    /** 
     * Set the 'BreakDuration' element value. Продолжительность перерывов в течение смены
     * 
     * @param breakDuration
     */
    public void setBreakDuration(String breakDuration) {
        this.breakDuration = breakDuration;
    }
}

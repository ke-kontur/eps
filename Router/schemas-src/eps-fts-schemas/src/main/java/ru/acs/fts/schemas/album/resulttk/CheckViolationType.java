
package ru.acs.fts.schemas.album.resulttk;

import org.joda.time.LocalDate;

/** 
 * Данные проверки/наличия нарушения
 */
public class CheckViolationType
{
    private String requirementInfo;
    private String violationName;
    private String controlStatusName;
    private String notifNumber;
    private LocalDate correctionDate;

    /** 
     * Get the 'RequirementInfo' element value. Описание требования/условия
     * 
     * @return value
     */
    public String getRequirementInfo() {
        return requirementInfo;
    }

    /** 
     * Set the 'RequirementInfo' element value. Описание требования/условия
     * 
     * @param requirementInfo
     */
    public void setRequirementInfo(String requirementInfo) {
        this.requirementInfo = requirementInfo;
    }

    /** 
     * Get the 'ViolationName' element value. Наименование нарушения
     * 
     * @return value
     */
    public String getViolationName() {
        return violationName;
    }

    /** 
     * Set the 'ViolationName' element value. Наименование нарушения
     * 
     * @param violationName
     */
    public void setViolationName(String violationName) {
        this.violationName = violationName;
    }

    /** 
     * Get the 'ControlStatusName' element value. Статус проверки/наличия нарушения (YES - Да; NO - Нет; NOTREQUIRED - Не требуется; NOTVERIFIED - Не проверялось)
     * 
     * @return value
     */
    public String getControlStatusName() {
        return controlStatusName;
    }

    /** 
     * Set the 'ControlStatusName' element value. Статус проверки/наличия нарушения (YES - Да; NO - Нет; NOTREQUIRED - Не требуется; NOTVERIFIED - Не проверялось)
     * 
     * @param controlStatusName
     */
    public void setControlStatusName(String controlStatusName) {
        this.controlStatusName = controlStatusName;
    }

    /** 
     * Get the 'NotifNumber' element value. Номер уведомления
     * 
     * @return value
     */
    public String getNotifNumber() {
        return notifNumber;
    }

    /** 
     * Set the 'NotifNumber' element value. Номер уведомления
     * 
     * @param notifNumber
     */
    public void setNotifNumber(String notifNumber) {
        this.notifNumber = notifNumber;
    }

    /** 
     * Get the 'CorrectionDate' element value. Дата устранения замечания
     * 
     * @return value
     */
    public LocalDate getCorrectionDate() {
        return correctionDate;
    }

    /** 
     * Set the 'CorrectionDate' element value. Дата устранения замечания
     * 
     * @param correctionDate
     */
    public void setCorrectionDate(LocalDate correctionDate) {
        this.correctionDate = correctionDate;
    }
}

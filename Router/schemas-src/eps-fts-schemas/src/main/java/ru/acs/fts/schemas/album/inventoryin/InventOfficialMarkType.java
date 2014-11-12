
package ru.acs.fts.schemas.album.inventoryin;

import org.joda.time.LocalDate;

/** 
 * Отметки таможенного органа.
 */
public class InventOfficialMarkType
{
    private String GTDAcceptTime;
    private LocalDate examinationStartDate;
    private String examinationStartTime;
    private String LNP;
    private String GTDDecisionCode;
    private LocalDate GTDDecisionDate;
    private String GTDDecisionTime;
    private String decisionReason;

    /** 
     * Get the 'GTDAcceptTime' element value. Время принятия ДТ
     * 
     * @return value
     */
    public String getGTDAcceptTime() {
        return GTDAcceptTime;
    }

    /** 
     * Set the 'GTDAcceptTime' element value. Время принятия ДТ
     * 
     * @param GTDAcceptTime
     */
    public void setGTDAcceptTime(String GTDAcceptTime) {
        this.GTDAcceptTime = GTDAcceptTime;
    }

    /** 
     * Get the 'ExaminationStartDate' element value. Дата начала проверки ДТ
     * 
     * @return value
     */
    public LocalDate getExaminationStartDate() {
        return examinationStartDate;
    }

    /** 
     * Set the 'ExaminationStartDate' element value. Дата начала проверки ДТ
     * 
     * @param examinationStartDate
     */
    public void setExaminationStartDate(LocalDate examinationStartDate) {
        this.examinationStartDate = examinationStartDate;
    }

    /** 
     * Get the 'ExaminationStartTime' element value. Время начала проверки ДТ
     * 
     * @return value
     */
    public String getExaminationStartTime() {
        return examinationStartTime;
    }

    /** 
     * Set the 'ExaminationStartTime' element value. Время начала проверки ДТ
     * 
     * @param examinationStartTime
     */
    public void setExaminationStartTime(String examinationStartTime) {
        this.examinationStartTime = examinationStartTime;
    }

    /** 
     * Get the 'LNP' element value. ЛНП лица, сделавшего отметку о начале проверки ДТ
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ЛНП лица, сделавшего отметку о начале проверки ДТ
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }

    /** 
     * Get the 'GTDDecisionCode' element value. Код решения по ДТ- в соответствии с классификатором решений, принимаемых таможенными органами; - "**" - различно по товарам.
     * 
     * @return value
     */
    public String getGTDDecisionCode() {
        return GTDDecisionCode;
    }

    /** 
     * Set the 'GTDDecisionCode' element value. Код решения по ДТ- в соответствии с классификатором решений, принимаемых таможенными органами; - "**" - различно по товарам.
     * 
     * @param GTDDecisionCode
     */
    public void setGTDDecisionCode(String GTDDecisionCode) {
        this.GTDDecisionCode = GTDDecisionCode;
    }

    /** 
     * Get the 'GTDDecisionDate' element value. Дата принятия решения по ДТ
     * 
     * @return value
     */
    public LocalDate getGTDDecisionDate() {
        return GTDDecisionDate;
    }

    /** 
     * Set the 'GTDDecisionDate' element value. Дата принятия решения по ДТ
     * 
     * @param GTDDecisionDate
     */
    public void setGTDDecisionDate(LocalDate GTDDecisionDate) {
        this.GTDDecisionDate = GTDDecisionDate;
    }

    /** 
     * Get the 'GTDDecisionTime' element value. Время принятия решения по ДТ
     * 
     * @return value
     */
    public String getGTDDecisionTime() {
        return GTDDecisionTime;
    }

    /** 
     * Set the 'GTDDecisionTime' element value. Время принятия решения по ДТ
     * 
     * @param GTDDecisionTime
     */
    public void setGTDDecisionTime(String GTDDecisionTime) {
        this.GTDDecisionTime = GTDDecisionTime;
    }

    /** 
     * Get the 'DecisionReason' element value. Причина отказа в принятии ДТ
     * 
     * @return value
     */
    public String getDecisionReason() {
        return decisionReason;
    }

    /** 
     * Set the 'DecisionReason' element value. Причина отказа в принятии ДТ
     * 
     * @param decisionReason
     */
    public void setDecisionReason(String decisionReason) {
        this.decisionReason = decisionReason;
    }
}

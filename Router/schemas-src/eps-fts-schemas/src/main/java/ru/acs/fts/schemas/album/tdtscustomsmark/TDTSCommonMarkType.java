
package ru.acs.fts.schemas.album.tdtscustomsmark;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Служебные отметки ТДТС
 */
public class TDTSCommonMarkType
{
    private String GRNumber;
    private LocalDate date;
    private String controlMark;
    private String specialMark;
    private LocalDate deadline;
    private CustomsType customs;
    private CustomsPersonType customsPerson;

    /** 
     * Get the 'GRNumber' element value. Обозначение графы: A, B, C
     * 
     * @return value
     */
    public String getGRNumber() {
        return GRNumber;
    }

    /** 
     * Set the 'GRNumber' element value. Обозначение графы: A, B, C
     * 
     * @param GRNumber
     */
    public void setGRNumber(String GRNumber) {
        this.GRNumber = GRNumber;
    }

    /** 
     * Get the 'Date' element value. Дата регистрации ТДТС/совершения таможенной операции
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата регистрации ТДТС/совершения таможенной операции
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'ControlMark' element value. Отметка о форме таможенного контроля
     * 
     * @return value
     */
    public String getControlMark() {
        return controlMark;
    }

    /** 
     * Set the 'ControlMark' element value. Отметка о форме таможенного контроля
     * 
     * @param controlMark
     */
    public void setControlMark(String controlMark) {
        this.controlMark = controlMark;
    }

    /** 
     * Get the 'SpecialMark' element value. Особые отметки
     * 
     * @return value
     */
    public String getSpecialMark() {
        return specialMark;
    }

    /** 
     * Set the 'SpecialMark' element value. Особые отметки
     * 
     * @param specialMark
     */
    public void setSpecialMark(String specialMark) {
        this.specialMark = specialMark;
    }

    /** 
     * Get the 'Deadline' element value. Срок временного ввоза ТСМП
     * 
     * @return value
     */
    public LocalDate getDeadline() {
        return deadline;
    }

    /** 
     * Set the 'Deadline' element value. Срок временного ввоза ТСМП
     * 
     * @param deadline
     */
    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    /** 
     * Get the 'Customs' element value. Таможенный орган
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Таможенный орган
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPerson' element value. Инспектор таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Инспектор таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }
}

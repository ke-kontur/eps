
package ru.acs.fts.schemas.album.tdtscustomsmark;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * ��������� ������� ����
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
     * Get the 'GRNumber' element value. ����������� �����: A, B, C
     * 
     * @return value
     */
    public String getGRNumber() {
        return GRNumber;
    }

    /** 
     * Set the 'GRNumber' element value. ����������� �����: A, B, C
     * 
     * @param GRNumber
     */
    public void setGRNumber(String GRNumber) {
        this.GRNumber = GRNumber;
    }

    /** 
     * Get the 'Date' element value. ���� ����������� ����/���������� ���������� ��������
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� ����������� ����/���������� ���������� ��������
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'ControlMark' element value. ������� � ����� ����������� ��������
     * 
     * @return value
     */
    public String getControlMark() {
        return controlMark;
    }

    /** 
     * Set the 'ControlMark' element value. ������� � ����� ����������� ��������
     * 
     * @param controlMark
     */
    public void setControlMark(String controlMark) {
        this.controlMark = controlMark;
    }

    /** 
     * Get the 'SpecialMark' element value. ������ �������
     * 
     * @return value
     */
    public String getSpecialMark() {
        return specialMark;
    }

    /** 
     * Set the 'SpecialMark' element value. ������ �������
     * 
     * @param specialMark
     */
    public void setSpecialMark(String specialMark) {
        this.specialMark = specialMark;
    }

    /** 
     * Get the 'Deadline' element value. ���� ���������� ����� ����
     * 
     * @return value
     */
    public LocalDate getDeadline() {
        return deadline;
    }

    /** 
     * Set the 'Deadline' element value. ���� ���������� ����� ����
     * 
     * @param deadline
     */
    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    /** 
     * Get the 'Customs' element value. ���������� �����
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ���������� �����
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPerson' element value. ��������� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ��������� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }
}

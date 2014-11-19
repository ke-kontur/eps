
package ru.acs.fts.schemas.album.instrinspection;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * �������� � ���������
 */
public class InstrInfoType
{
    private LocalDate instrDate;
    private String instrTime;
    private CustomsType customs;
    private CustomsOfficerType customsOfficer;

    /** 
     * Get the 'InstrDate' element value. ���� �������� ���������
     * 
     * @return value
     */
    public LocalDate getInstrDate() {
        return instrDate;
    }

    /** 
     * Set the 'InstrDate' element value. ���� �������� ���������
     * 
     * @param instrDate
     */
    public void setInstrDate(LocalDate instrDate) {
        this.instrDate = instrDate;
    }

    /** 
     * Get the 'InstrTime' element value. ����� �������� ���������
     * 
     * @return value
     */
    public String getInstrTime() {
        return instrTime;
    }

    /** 
     * Set the 'InstrTime' element value. ����� �������� ���������
     * 
     * @param instrTime
     */
    public void setInstrTime(String instrTime) {
        this.instrTime = instrTime;
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
     * Get the 'CustomsOfficer' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsOfficerType getCustomsOfficer() {
        return customsOfficer;
    }

    /** 
     * Set the 'CustomsOfficer' element value. ����������� ���� ����������� ������
     * 
     * @param customsOfficer
     */
    public void setCustomsOfficer(CustomsOfficerType customsOfficer) {
        this.customsOfficer = customsOfficer;
    }
}

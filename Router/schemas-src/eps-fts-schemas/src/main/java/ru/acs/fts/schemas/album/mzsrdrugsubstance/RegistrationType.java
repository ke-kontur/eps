
package ru.acs.fts.schemas.album.mzsrdrugsubstance;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � ����������� �������������� ��������
 */
public class RegistrationType extends DocumentBaseType
{
    private String regStatus;
    private LocalDate endDate;

    /** 
     * Get the 'RegStatus' element value. ������ ���������������� �������������: 1 - �����������, 2 - ����������������, 3 - ��������������
     * 
     * @return value
     */
    public String getRegStatus() {
        return regStatus;
    }

    /** 
     * Set the 'RegStatus' element value. ������ ���������������� �������������: 1 - �����������, 2 - ����������������, 3 - ��������������
     * 
     * @param regStatus
     */
    public void setRegStatus(String regStatus) {
        this.regStatus = regStatus;
    }

    /** 
     * Get the 'EndDate' element value. ���� (���������������, �������������)/���� ��������/���� ���������� �� ���������������� ������� ������������� �������
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ���� (���������������, �������������)/���� ��������/���� ���������� �� ���������������� ������� ������������� �������
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}

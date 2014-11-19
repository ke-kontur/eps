
package ru.acs.fts.schemas.album.legalentityinfo;

import org.joda.time.LocalDate;

/** 
 * �������� � ��������������� �������� ��������
 */
public class SuspensionType
{
    private LocalDate endDate;
    private RegOrganType regOrgan;

    /** 
     * Get the 'EndDate' element value. ���� ���������������
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ���� ���������������
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'RegOrgan' element value. ������������ �������������� ������, ���������������� �������� ��������
     * 
     * @return value
     */
    public RegOrganType getRegOrgan() {
        return regOrgan;
    }

    /** 
     * Set the 'RegOrgan' element value. ������������ �������������� ������, ���������������� �������� ��������
     * 
     * @param regOrgan
     */
    public void setRegOrgan(RegOrganType regOrgan) {
        this.regOrgan = regOrgan;
    }
}

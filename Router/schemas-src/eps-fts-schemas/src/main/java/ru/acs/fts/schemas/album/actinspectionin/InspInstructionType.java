
package ru.acs.fts.schemas.album.actinspectionin;

import org.joda.time.LocalDate;

/** 
 * �������� � ��������� �� �������
 */
public class InspInstructionType
{
    private String time;
    private String customsCode;
    private LocalDate registrationDate;
    private String PTDNumber;

    /** 
     * Get the 'Time' element value. ����� ������ ��������� �� �������
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'Time' element value. ����� ������ ��������� �� �������
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /** 
     * Get the 'CustomsCode' element value. ��� ����������� ������, ������������������� ���.
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. ��� ����������� ������, ������������������� ���.
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'RegistrationDate' element value. ���� ����������� ���.
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. ���� ����������� ���.
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'PTDNumber' element value. ���������� ����� ���   �� ������� �����������.
     * 
     * @return value
     */
    public String getPTDNumber() {
        return PTDNumber;
    }

    /** 
     * Set the 'PTDNumber' element value. ���������� ����� ���   �� ������� �����������.
     * 
     * @param PTDNumber
     */
    public void setPTDNumber(String PTDNumber) {
        this.PTDNumber = PTDNumber;
    }
}

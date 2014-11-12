
package ru.acs.fts.schemas.admin.confirmwhdocregremote;

import org.joda.time.LocalDate;

/** 
 * ��������������� ����� ����������� ���������. ����������� ��� ���� ����������, ������� ��������� ������, ����������� �� ���������� ������ ��
 */
public class GTDIDType
{
    private String customsCode;
    private LocalDate registrationDate;
    private String GTDNumber;

    /** 
     * Get the 'CustomsCode' element value. ��� ����������� ������, ������������������� ��������
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. ��� ����������� ������, ������������������� ��������
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'RegistrationDate' element value. ���� ����������� ���������
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. ���� ����������� ���������
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'GTDNumber' element value. ���������� ����� ��������� �� ������� �����������
     * 
     * @return value
     */
    public String getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ���������� ����� ��������� �� ������� �����������
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(String GTDNumber) {
        this.GTDNumber = GTDNumber;
    }
}

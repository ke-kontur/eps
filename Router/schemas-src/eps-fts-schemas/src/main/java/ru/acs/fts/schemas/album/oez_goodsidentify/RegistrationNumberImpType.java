
package ru.acs.fts.schemas.album.oez_goodsidentify;

import org.joda.time.LocalDate;

/** 
 * ��������������� ����� ����������� � �����
 */
public class RegistrationNumberImpType
{
    private String customsCode;
    private LocalDate registrationDate;
    private String number;

    /** 
     * Get the 'CustomsCode' element value. ��� ����������� ������, ������������������� ��������.
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. ��� ����������� ������, ������������������� ��������.
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'RegistrationDate' element value. ���� ����������� ���������.
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. ���� ����������� ���������.
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'Number' element value. ���������� ����� ���������
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. ���������� ����� ���������
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }
}

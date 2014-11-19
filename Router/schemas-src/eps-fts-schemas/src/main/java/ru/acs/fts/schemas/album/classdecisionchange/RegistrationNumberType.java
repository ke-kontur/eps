
package ru.acs.fts.schemas.album.classdecisionchange;

import org.joda.time.LocalDate;

/** 
 * ��������������� �����
 */
public class RegistrationNumberType
{
    private String customsCode;
    private String serialNumber;
    private LocalDate date;

    /** 
     * Get the 'CustomsCode' element value. ��� ����������� ������
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. ��� ����������� ������
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'SerialNumber' element value. ���������� ��������� �����
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. ���������� ��������� �����
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /** 
     * Get the 'Date' element value. ���� �������� �������
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� �������� �������
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
}

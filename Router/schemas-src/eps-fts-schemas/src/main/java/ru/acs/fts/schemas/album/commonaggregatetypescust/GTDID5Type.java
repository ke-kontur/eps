
package ru.acs.fts.schemas.album.commonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * ��������������� ����� ����������� ���������. ����������� ��� ���� ����������, ������� ��������� ������, ����������� ��������� ������ ��. ��������� ������� 5 ������
 */
public class GTDID5Type
{
    private String customsCode;
    private LocalDate registrationDate;
    private String serialNumber;

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
     * Get the 'SerialNumber' element value. ���������� ����� ��������� �� ������� �����������
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. ���������� ����� ��������� �� ������� �����������
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}

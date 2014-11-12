
package ru.acs.fts.schemas.album.tpo;

import org.joda.time.LocalDate;

/** 
 * ���������� ����� ���
 */
public class TPORegNumberType
{
    private String customsCode;
    private LocalDate registrationDate;
    private String docNumber;

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
     * Get the 'DocNumber' element value. ����� ��������� �� ������� �����������/������������ �����
     * 
     * @return value
     */
    public String getDocNumber() {
        return docNumber;
    }

    /** 
     * Set the 'DocNumber' element value. ����� ��������� �� ������� �����������/������������ �����
     * 
     * @param docNumber
     */
    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }
}

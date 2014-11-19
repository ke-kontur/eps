
package ru.acs.fts.schemas.album.packagepts;

import org.joda.time.LocalDate;

/** 
 * ���
 */
public class TPOIDType
{
    private String customsCode;
    private LocalDate registrationDate;
    private String TPONumber;

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
     * Get the 'TPONumber' element value. ����� ���
     * 
     * @return value
     */
    public String getTPONumber() {
        return TPONumber;
    }

    /** 
     * Set the 'TPONumber' element value. ����� ���
     * 
     * @param TPONumber
     */
    public void setTPONumber(String TPONumber) {
        this.TPONumber = TPONumber;
    }
}

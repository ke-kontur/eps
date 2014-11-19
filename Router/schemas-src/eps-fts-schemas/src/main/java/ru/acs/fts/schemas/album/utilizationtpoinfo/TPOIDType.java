
package ru.acs.fts.schemas.album.utilizationtpoinfo;

import org.joda.time.LocalDate;

/** 
 * ���������������� ��������� ��������� ���
 */
public class TPOIDType
{
    private String customsCode;
    private LocalDate registrationDate;
    private String orderNumber;

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
     * Get the 'OrderNumber' element value. ������������ ����� ������ ���
     * 
     * @return value
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /** 
     * Set the 'OrderNumber' element value. ������������ ����� ������ ���
     * 
     * @param orderNumber
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}

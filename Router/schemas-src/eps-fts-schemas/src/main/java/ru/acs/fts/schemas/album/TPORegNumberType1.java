
package ru.acs.fts.schemas.album;

import org.joda.time.LocalDate;

/** 
 * ���������� ����� ���
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:ExchangeDocuments:PaymentConfirmDocs:5.4.5" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TPORegNumberType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="CustomsCode"/>
 *     &lt;xs:element type="xs:date" name="RegistrationDate"/>
 *     &lt;xs:element type="xs:string" name="DocNumber"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TPORegNumberType1
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

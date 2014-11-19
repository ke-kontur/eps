
package ru.acs.fts.schemas.album;

import org.joda.time.LocalDate;

/** 
 * Ðוד. םמלונ ÌÏÎ
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:PRTestRequest:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MPOType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="CustomsCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:date" name="RegistrationDate" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="MPO_Number"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MPOType
{
    private String customsCode;
    private LocalDate registrationDate;
    private String MPONumber;

    /** 
     * Get the 'CustomsCode' element value.
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value.
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'RegistrationDate' element value.
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value.
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'MPO_Number' element value.
     * 
     * @return value
     */
    public String getMPONumber() {
        return MPONumber;
    }

    /** 
     * Set the 'MPO_Number' element value.
     * 
     * @param MPONumber
     */
    public void setMPONumber(String MPONumber) {
        this.MPONumber = MPONumber;
    }
}

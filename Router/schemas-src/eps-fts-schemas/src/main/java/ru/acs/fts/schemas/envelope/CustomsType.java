
package ru.acs.fts.schemas.envelope;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Envelope:EDHeader:2.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CustomsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="CustomsCode"/>
 *     &lt;xs:element type="xs:string" name="ExchType"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CustomsType
{
    private String customsCode;
    private String exchType;

    /** 
     * Get the 'CustomsCode' element value. Код таможенного органа 
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа 
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'ExchType' element value. Код информационного обмена.
     * 
     * @return value
     */
    public String getExchType() {
        return exchType;
    }

    /** 
     * Set the 'ExchType' element value. Код информационного обмена.
     * 
     * @param exchType
     */
    public void setExchType(String exchType) {
        this.exchType = exchType;
    }
}

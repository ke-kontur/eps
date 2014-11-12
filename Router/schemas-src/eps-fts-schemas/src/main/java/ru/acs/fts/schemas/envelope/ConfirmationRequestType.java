
package ru.acs.fts.schemas.envelope;

/** 
 * Запрос уведомлений
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Envelope:RoutingInf:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConfirmationRequestType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="COD" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ConfirmationRequestType
{
    private String COD;

    /** 
     * Get the 'COD' element value. Запрос уведомления о доставке
     * 
     * @return value
     */
    public String getCOD() {
        return COD;
    }

    /** 
     * Set the 'COD' element value. Запрос уведомления о доставке
     * 
     * @param COD
     */
    public void setCOD(String COD) {
        this.COD = COD;
    }
}

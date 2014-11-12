
package ru.acs.fts.schemas.envelope;

/** 
 * Конверт
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.w3.org/2001/06/soap-envelope" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="EnvelopeType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:HeaderType" name="Header"/>
 *     &lt;xs:element type="ns:BodyType" name="Body" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class EnvelopeType
{
    private HeaderType header;
    private BodyType body;

    /** 
     * Get the 'Header' element value. Общий заголовок конверта
     * 
     * @return value
     */
    public HeaderType getHeader() {
        return header;
    }

    /** 
     * Set the 'Header' element value. Общий заголовок конверта
     * 
     * @param header
     */
    public void setHeader(HeaderType header) {
        this.header = header;
    }

    /** 
     * Get the 'Body' element value. Тело конверта
     * 
     * @return value
     */
    public BodyType getBody() {
        return body;
    }

    /** 
     * Set the 'Body' element value. Тело конверта
     * 
     * @param body
     */
    public void setBody(BodyType body) {
        this.body = body;
    }
}

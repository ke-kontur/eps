
package ru.acs.fts.schemas.envelope;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.w3.org/2001/06/soap-envelope" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="E2T">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:EnvelopeType" name="Envelope"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class E2T
{
    private EnvelopeType envelope;

    /** 
     * Get the 'Envelope' element value. Конверт
     * 
     * @return value
     */
    public EnvelopeType getEnvelope() {
        return envelope;
    }

    /** 
     * Set the 'Envelope' element value. Конверт
     * 
     * @param envelope
     */
    public void setEnvelope(EnvelopeType envelope) {
        this.envelope = envelope;
    }
}

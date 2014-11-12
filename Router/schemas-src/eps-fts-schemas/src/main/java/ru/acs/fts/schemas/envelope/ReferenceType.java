
package ru.acs.fts.schemas.envelope;

/** 
 * 
 Информация о заверяемых подписью объектах

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.w3.org/2000/09/xmldsig#" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:TransformsType" name="Transforms"/>
 *     &lt;xs:element type="ns:DigestMethodType" name="DigestMethod"/>
 *     &lt;xs:element type="xs:string" name="DigestValue"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" use="required" name="URI"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceType
{
    private TransformsType transforms;
    private DigestMethodType digestMethod;
    private String digestValue;
    private String URI;

    /** 
     * Get the 'Transforms' element value.
     * 
     * @return value
     */
    public TransformsType getTransforms() {
        return transforms;
    }

    /** 
     * Set the 'Transforms' element value.
     * 
     * @param transforms
     */
    public void setTransforms(TransformsType transforms) {
        this.transforms = transforms;
    }

    /** 
     * Get the 'DigestMethod' element value.
     * 
     * @return value
     */
    public DigestMethodType getDigestMethod() {
        return digestMethod;
    }

    /** 
     * Set the 'DigestMethod' element value.
     * 
     * @param digestMethod
     */
    public void setDigestMethod(DigestMethodType digestMethod) {
        this.digestMethod = digestMethod;
    }

    /** 
     * Get the 'DigestValue' element value.
     * 
     * @return value
     */
    public String getDigestValue() {
        return digestValue;
    }

    /** 
     * Set the 'DigestValue' element value.
     * 
     * @param digestValue
     */
    public void setDigestValue(String digestValue) {
        this.digestValue = digestValue;
    }

    /** 
     * Get the 'URI' attribute value.
     * 
     * @return value
     */
    public String getURI() {
        return URI;
    }

    /** 
     * Set the 'URI' attribute value.
     * 
     * @param URI
     */
    public void setURI(String URI) {
        this.URI = URI;
    }
}

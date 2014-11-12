
package ru.acs.fts.schemas.envelope;

/** 
 * 

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.w3.org/2000/09/xmldsig#" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="X509DataType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="X509Certificate"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class X509DataType
{
    private String x509Certificate;

    /** 
     * Get the 'X509Certificate' element value.
     * 
     * @return value
     */
    public String getX509Certificate() {
        return x509Certificate;
    }

    /** 
     * Set the 'X509Certificate' element value.
     * 
     * @param x509Certificate
     */
    public void setX509Certificate(String x509Certificate) {
        this.x509Certificate = x509Certificate;
    }
}

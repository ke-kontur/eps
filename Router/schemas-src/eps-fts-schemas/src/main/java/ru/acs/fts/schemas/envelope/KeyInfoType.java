
package ru.acs.fts.schemas.envelope;

/** 
 * 
 Содержит X.509-сертификат, с помощью которого получили 
 ЭЦП документа

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.w3.org/2000/09/xmldsig#" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="KeyInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:X509DataType" name="X509Data"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" use="required" name="Id"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class KeyInfoType
{
    private X509DataType x509Data;
    private String id;

    /** 
     * Get the 'X509Data' element value.
     * 
     * @return value
     */
    public X509DataType getX509Data() {
        return x509Data;
    }

    /** 
     * Set the 'X509Data' element value.
     * 
     * @param x509Data
     */
    public void setX509Data(X509DataType x509Data) {
        this.x509Data = x509Data;
    }

    /** 
     * Get the 'Id' attribute value.
     * 
     * @return value
     */
    public String getId() {
        return id;
    }

    /** 
     * Set the 'Id' attribute value.
     * 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }
}

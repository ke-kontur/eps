
package ru.acs.fts.schemas.envelope;

/** 
 * 
 Информация о криптографическом алгоритме, с помощью которого 
 была подготовленна цифровая подпись

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.w3.org/2000/09/xmldsig#" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SignatureMethodType">
 *   &lt;xs:attribute type="xs:string" use="required" fixed="http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411" name="Algorithm"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SignatureMethodType
{
    private String algorithm;

    /** 
     * Get the 'Algorithm' attribute value.
     * 
     * @return value
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /** 
     * Set the 'Algorithm' attribute value.
     * 
     * @param algorithm
     */
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }
}

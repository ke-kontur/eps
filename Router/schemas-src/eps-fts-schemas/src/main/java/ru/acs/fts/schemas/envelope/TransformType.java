
package ru.acs.fts.schemas.envelope;

/** 
 * 
 Одно из последовательно выполняемых преобразований над 
 подписываемым объектом

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.w3.org/2000/09/xmldsig#" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TransformType">
 *   &lt;xs:attribute type="xs:string" use="required" fixed="urn:xml-dsig:transformation:v1.1" name="Algorithm"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TransformType
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

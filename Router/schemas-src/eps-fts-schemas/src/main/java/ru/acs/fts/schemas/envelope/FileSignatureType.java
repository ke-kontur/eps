
package ru.acs.fts.schemas.envelope;

/** 
 * Информация о ЭЦП присоединенного файла
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Envelope:Attachments:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FileSignatureType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="SignatureValue"/>
 *     &lt;xs:element type="xs:string" name="KeyInfo"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" default="http://www.w3.org/2001/04/xmldsig-more#gostr34102001-gostr3411" name="Algorithm"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FileSignatureType
{
    private String signatureValue;
    private String keyInfo;
    private String algorithm;

    /** 
     * Get the 'SignatureValue' element value. Значение ЭЦП
     * 
     * @return value
     */
    public String getSignatureValue() {
        return signatureValue;
    }

    /** 
     * Set the 'SignatureValue' element value. Значение ЭЦП
     * 
     * @param signatureValue
     */
    public void setSignatureValue(String signatureValue) {
        this.signatureValue = signatureValue;
    }

    /** 
     * Get the 'KeyInfo' element value. Ключевая информация для проверки ЭЦП
     * 
     * @return value
     */
    public String getKeyInfo() {
        return keyInfo;
    }

    /** 
     * Set the 'KeyInfo' element value. Ключевая информация для проверки ЭЦП
     * 
     * @param keyInfo
     */
    public void setKeyInfo(String keyInfo) {
        this.keyInfo = keyInfo;
    }

    /** 
     * Get the 'Algorithm' attribute value. Алгоритм вычисления ЭЦП
     * 
     * @return value
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /** 
     * Set the 'Algorithm' attribute value. Алгоритм вычисления ЭЦП
     * 
     * @param algorithm
     */
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }
}


package ru.acs.fts.schemas.envelope;

/** 
 * 
 Электронно-цифровая подпись.

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.w3.org/2000/09/xmldsig#" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SignatureType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:SignedInfoType" name="SignedInfo"/>
 *     &lt;xs:element type="xs:string" name="SignatureValue"/>
 *     &lt;xs:element type="ns:KeyInfoType" name="KeyInfo"/>
 *     &lt;xs:element type="ns:ObjectType" name="Object"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SignatureType
{
    private SignedInfoType signedInfo;
    private String signatureValue;
    private KeyInfoType keyInfo;
    private ObjectType object;

    /** 
     * Get the 'SignedInfo' element value.
     * 
     * @return value
     */
    public SignedInfoType getSignedInfo() {
        return signedInfo;
    }

    /** 
     * Set the 'SignedInfo' element value.
     * 
     * @param signedInfo
     */
    public void setSignedInfo(SignedInfoType signedInfo) {
        this.signedInfo = signedInfo;
    }

    /** 
     * Get the 'SignatureValue' element value.
     * 
     * @return value
     */
    public String getSignatureValue() {
        return signatureValue;
    }

    /** 
     * Set the 'SignatureValue' element value.
     * 
     * @param signatureValue
     */
    public void setSignatureValue(String signatureValue) {
        this.signatureValue = signatureValue;
    }

    /** 
     * Get the 'KeyInfo' element value.
     * 
     * @return value
     */
    public KeyInfoType getKeyInfo() {
        return keyInfo;
    }

    /** 
     * Set the 'KeyInfo' element value.
     * 
     * @param keyInfo
     */
    public void setKeyInfo(KeyInfoType keyInfo) {
        this.keyInfo = keyInfo;
    }

    /** 
     * Get the 'Object' element value.
     * 
     * @return value
     */
    public ObjectType getObject() {
        return object;
    }

    /** 
     * Set the 'Object' element value.
     * 
     * @param object
     */
    public void setObject(ObjectType object) {
        this.object = object;
    }
}

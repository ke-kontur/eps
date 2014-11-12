
package ru.acs.fts.schemas.envelope;

import java.util.ArrayList;
import java.util.List;

/** 
 * 
 Информация о подписываемом объекте.

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.w3.org/2000/09/xmldsig#" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SignedInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:CanonicalizationMethodType" name="CanonicalizationMethod"/>
 *     &lt;xs:element type="ns:SignatureMethodType" name="SignatureMethod"/>
 *     &lt;xs:element type="ns:ReferenceType" name="Reference" minOccurs="2" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SignedInfoType
{
    private CanonicalizationMethodType canonicalizationMethod;
    private SignatureMethodType signatureMethod;
    private List<ReferenceType> referenceList = new ArrayList<ReferenceType>();

    /** 
     * Get the 'CanonicalizationMethod' element value.
     * 
     * @return value
     */
    public CanonicalizationMethodType getCanonicalizationMethod() {
        return canonicalizationMethod;
    }

    /** 
     * Set the 'CanonicalizationMethod' element value.
     * 
     * @param canonicalizationMethod
     */
    public void setCanonicalizationMethod(
            CanonicalizationMethodType canonicalizationMethod) {
        this.canonicalizationMethod = canonicalizationMethod;
    }

    /** 
     * Get the 'SignatureMethod' element value.
     * 
     * @return value
     */
    public SignatureMethodType getSignatureMethod() {
        return signatureMethod;
    }

    /** 
     * Set the 'SignatureMethod' element value.
     * 
     * @param signatureMethod
     */
    public void setSignatureMethod(SignatureMethodType signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    /** 
     * Get the list of 'Reference' element items.
     * 
     * @return list
     */
    public List<ReferenceType> getReferenceList() {
        return referenceList;
    }

    /** 
     * Set the list of 'Reference' element items.
     * 
     * @param list
     */
    public void setReferenceList(List<ReferenceType> list) {
        referenceList = list;
    }
}

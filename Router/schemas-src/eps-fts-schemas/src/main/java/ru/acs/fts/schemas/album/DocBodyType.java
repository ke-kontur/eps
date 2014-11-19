
package ru.acs.fts.schemas.album;

import org.w3c.dom.Element;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:DTRevealedRisks:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DocBodyType">
 *   &lt;xs:sequence>
 *     &lt;xs:any processContents="skip"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DocBodyType
{
    private Element any;

    /** 
     * Get the 'DocBodyType' complexType value. Документ, подписанный  ЭЦП
     * 
     * @return value
     */
    public Element getAny() {
        return any;
    }

    /** 
     * Set the 'DocBodyType' complexType value. Документ, подписанный  ЭЦП
     * 
     * @param any
     */
    public void setAny(Element any) {
        this.any = any;
    }
}


package ru.acs.fts.schemas.envelope;

/** 
 * Ссылка на прикрепленный файл
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Envelope:Attachments:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FileReferenceType">
 *   &lt;xs:attribute type="xs:string" use="required" name="href"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FileReferenceType
{
    private String href;

    /** 
     * Get the 'href' attribute value. URI
     * 
     * @return value
     */
    public String getHref() {
        return href;
    }

    /** 
     * Set the 'href' attribute value. URI
     * 
     * @param href
     */
    public void setHref(String href) {
        this.href = href;
    }
}

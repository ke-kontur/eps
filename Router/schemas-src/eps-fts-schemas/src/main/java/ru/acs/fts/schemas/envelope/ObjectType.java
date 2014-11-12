
package ru.acs.fts.schemas.envelope;

/** 
 * 

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.w3.org/2000/09/xmldsig#" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ObjectType">
 *   &lt;xs:sequence>
 *     &lt;xs:any minOccurs="0" processContents="skip" namespace="##any"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:string" use="required" name="Id"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ObjectType
{
    private Object any;
    private String id;

    /** 
     * Get the any value.
     * 
     * @return value
     */
    public Object getAny() {
        return any;
    }

    /** 
     * Set the any value.
     * 
     * @param any
     */
    public void setAny(Object any) {
        this.any = any;
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

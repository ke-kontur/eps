
package ru.acs.fts.schemas.envelope;

/** 
 * 
 Список трансформаций, которые необходимо применить к
 подписываемому объекту, перед наложением подписи.

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.w3.org/2000/09/xmldsig#" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TransformsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:TransformType" name="Transform"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TransformsType
{
    private TransformType transform;

    /** 
     * Get the 'Transform' element value.
     * 
     * @return value
     */
    public TransformType getTransform() {
        return transform;
    }

    /** 
     * Set the 'Transform' element value.
     * 
     * @param transform
     */
    public void setTransform(TransformType transform) {
        this.transform = transform;
    }
}

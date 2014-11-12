
package ru.acs.fts.schemas.envelope;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="urn:customs.ru:CompressedBody:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" type="xs:string" name="Compressed"/>
 * </pre>
 */
public class Compressed
{
    private String compressed;

    /** 
     * Get the 'Compressed' element value.
     * 
     * @return value
     */
    public String getCompressed() {
        return compressed;
    }

    /** 
     * Set the 'Compressed' element value.
     * 
     * @param compressed
     */
    public void setCompressed(String compressed) {
        this.compressed = compressed;
    }
}

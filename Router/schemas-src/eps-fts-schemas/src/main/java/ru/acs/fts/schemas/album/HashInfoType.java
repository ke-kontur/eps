
package ru.acs.fts.schemas.album;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:DTRevealedRisks:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="HashInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="Hash"/>
 *     &lt;xs:element type="xs:string" name="HashMean"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class HashInfoType
{
    private String hash;
    private String hashMean;

    /** 
     * Get the 'Hash' element value. Хэш-сумма для неформ. индикатора
     * 
     * @return value
     */
    public String getHash() {
        return hash;
    }

    /** 
     * Set the 'Hash' element value. Хэш-сумма для неформ. индикатора
     * 
     * @param hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /** 
     * Get the 'HashMean' element value. Значение неформ. индикатора, соответствующее хэш-сумме
     * 
     * @return value
     */
    public String getHashMean() {
        return hashMean;
    }

    /** 
     * Set the 'HashMean' element value. Значение неформ. индикатора, соответствующее хэш-сумме
     * 
     * @param hashMean
     */
    public void setHashMean(String hashMean) {
        this.hashMean = hashMean;
    }
}

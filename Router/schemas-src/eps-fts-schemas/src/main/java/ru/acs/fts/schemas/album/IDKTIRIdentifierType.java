
package ru.acs.fts.schemas.album;

/** 
 * Идентификатор книжки МДП
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:IDKDocuments:IDKCommonAggregateTypesCust:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IDKTIRIdentifierType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="TIRSeries"/>
 *     &lt;xs:element type="xs:string" name="TIRID"/>
 *     &lt;xs:element type="xs:string" name="TIRListID" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IDKTIRIdentifierType
{
    private String TIRSeries;
    private String TIRID;
    private String TIRListID;

    /** 
     * Get the 'TIRSeries' element value. Серия книжки МДП
     * 
     * @return value
     */
    public String getTIRSeries() {
        return TIRSeries;
    }

    /** 
     * Set the 'TIRSeries' element value. Серия книжки МДП
     * 
     * @param TIRSeries
     */
    public void setTIRSeries(String TIRSeries) {
        this.TIRSeries = TIRSeries;
    }

    /** 
     * Get the 'TIRID' element value. Номер книжки МДП
     * 
     * @return value
     */
    public String getTIRID() {
        return TIRID;
    }

    /** 
     * Set the 'TIRID' element value. Номер книжки МДП
     * 
     * @param TIRID
     */
    public void setTIRID(String TIRID) {
        this.TIRID = TIRID;
    }

    /** 
     * Get the 'TIRListID' element value. Номер листа МДП
     * 
     * @return value
     */
    public String getTIRListID() {
        return TIRListID;
    }

    /** 
     * Set the 'TIRListID' element value. Номер листа МДП
     * 
     * @param TIRListID
     */
    public void setTIRListID(String TIRListID) {
        this.TIRListID = TIRListID;
    }
}

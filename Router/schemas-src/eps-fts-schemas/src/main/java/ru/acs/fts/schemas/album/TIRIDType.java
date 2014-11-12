
package ru.acs.fts.schemas.album;

/** 
 * Номер книжки МДП.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:PRTestRequest:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TIRIDType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="TIRID"/>
 *     &lt;xs:element type="xs:string" name="TIRSeries"/>
 *     &lt;xs:element type="xs:string" name="TIRPageNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TIRIDType
{
    private String TIRID;
    private String TIRSeries;
    private String TIRPageNumber;

    /** 
     * Get the 'TIRID' element value. Номер книжки МДП.
     * 
     * @return value
     */
    public String getTIRID() {
        return TIRID;
    }

    /** 
     * Set the 'TIRID' element value. Номер книжки МДП.
     * 
     * @param TIRID
     */
    public void setTIRID(String TIRID) {
        this.TIRID = TIRID;
    }

    /** 
     * Get the 'TIRSeries' element value. Серия книжки МДП.
     * 
     * @return value
     */
    public String getTIRSeries() {
        return TIRSeries;
    }

    /** 
     * Set the 'TIRSeries' element value. Серия книжки МДП.
     * 
     * @param TIRSeries
     */
    public void setTIRSeries(String TIRSeries) {
        this.TIRSeries = TIRSeries;
    }

    /** 
     * Get the 'TIRPageNumber' element value. Номер листа книжки МДП.
     * 
     * @return value
     */
    public String getTIRPageNumber() {
        return TIRPageNumber;
    }

    /** 
     * Set the 'TIRPageNumber' element value. Номер листа книжки МДП.
     * 
     * @param TIRPageNumber
     */
    public void setTIRPageNumber(String TIRPageNumber) {
        this.TIRPageNumber = TIRPageNumber;
    }
}

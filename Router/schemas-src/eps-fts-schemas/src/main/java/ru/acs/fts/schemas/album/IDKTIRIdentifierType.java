
package ru.acs.fts.schemas.album;

/** 
 * ������������� ������ ���
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
     * Get the 'TIRSeries' element value. ����� ������ ���
     * 
     * @return value
     */
    public String getTIRSeries() {
        return TIRSeries;
    }

    /** 
     * Set the 'TIRSeries' element value. ����� ������ ���
     * 
     * @param TIRSeries
     */
    public void setTIRSeries(String TIRSeries) {
        this.TIRSeries = TIRSeries;
    }

    /** 
     * Get the 'TIRID' element value. ����� ������ ���
     * 
     * @return value
     */
    public String getTIRID() {
        return TIRID;
    }

    /** 
     * Set the 'TIRID' element value. ����� ������ ���
     * 
     * @param TIRID
     */
    public void setTIRID(String TIRID) {
        this.TIRID = TIRID;
    }

    /** 
     * Get the 'TIRListID' element value. ����� ����� ���
     * 
     * @return value
     */
    public String getTIRListID() {
        return TIRListID;
    }

    /** 
     * Set the 'TIRListID' element value. ����� ����� ���
     * 
     * @param TIRListID
     */
    public void setTIRListID(String TIRListID) {
        this.TIRListID = TIRListID;
    }
}

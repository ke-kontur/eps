
package ru.acs.fts.schemas.album;

/** 
 * Сведения о книжке МДП
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:IDKDocuments:IDKCommonAggregateTypesCust:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IDKTIRInfoType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:IDKTIRIdentifierType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:string" name="StatusInfo" minOccurs="0"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IDKTIRInfoType extends IDKTIRIdentifierType
{
    private String statusInfo;

    /** 
     * Get the 'StatusInfo' element value. Статус книжки МДП
     * 
     * @return value
     */
    public String getStatusInfo() {
        return statusInfo;
    }

    /** 
     * Set the 'StatusInfo' element value. Статус книжки МДП
     * 
     * @param statusInfo
     */
    public void setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
    }
}

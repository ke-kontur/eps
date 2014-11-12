
package ru.acs.fts.schemas.album;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Рег. номер ТДТС
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:CustomsDocuments:PRTestRequest:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TDTSType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:GTDIDType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:string" name="TransportModeCode"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TDTSType extends GTDIDType
{
    private String transportModeCode;

    /** 
     * Get the 'TransportModeCode' element value. Код вида транспорта
     * 
     * @return value
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /** 
     * Set the 'TransportModeCode' element value. Код вида транспорта
     * 
     * @param transportModeCode
     */
    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }
}

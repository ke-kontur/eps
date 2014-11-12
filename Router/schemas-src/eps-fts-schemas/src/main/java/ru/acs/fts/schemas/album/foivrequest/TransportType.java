
package ru.acs.fts.schemas.album.foivrequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Сведения о транспортном средстве
 */
public class TransportType extends TransportMeansBaseType
{
    private String transportModeCode;

    /** 
     * Get the 'TransportModeCode' element value. Вид транспортного средства
     * 
     * @return value
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /** 
     * Set the 'TransportModeCode' element value. Вид транспортного средства
     * 
     * @param transportModeCode
     */
    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }
}

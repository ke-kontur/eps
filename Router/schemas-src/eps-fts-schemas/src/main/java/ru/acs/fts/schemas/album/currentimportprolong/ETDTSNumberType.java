
package ru.acs.fts.schemas.album.currentimportprolong;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Регистрационный номер ЭТДТС
 */
public class ETDTSNumberType extends GTDIDType
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

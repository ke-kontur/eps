
package ru.acs.fts.schemas.album.pp_revealedrisks;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Тип, описывающий рег. номер ЭТДТС
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
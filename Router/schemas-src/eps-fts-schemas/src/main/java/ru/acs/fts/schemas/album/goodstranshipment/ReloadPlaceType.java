
package ru.acs.fts.schemas.album.goodstranshipment;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Место проведения грузовых и иных операций.
 */
public class ReloadPlaceType extends CustomsType
{
    private String borderPointCode;
    private RWStationType RWStation;

    /** 
     * Get the 'BorderPointCode' element value. Код пункта пропуска
     * 
     * @return value
     */
    public String getBorderPointCode() {
        return borderPointCode;
    }

    /** 
     * Set the 'BorderPointCode' element value. Код пункта пропуска
     * 
     * @param borderPointCode
     */
    public void setBorderPointCode(String borderPointCode) {
        this.borderPointCode = borderPointCode;
    }

    /** 
     * Get the 'RWStation' element value. ЖД станция на которой предполагаются грузовые операции
     * 
     * @return value
     */
    public RWStationType getRWStation() {
        return RWStation;
    }

    /** 
     * Set the 'RWStation' element value. ЖД станция на которой предполагаются грузовые операции
     * 
     * @param RWStation
     */
    public void setRWStation(RWStationType RWStation) {
        this.RWStation = RWStation;
    }
}

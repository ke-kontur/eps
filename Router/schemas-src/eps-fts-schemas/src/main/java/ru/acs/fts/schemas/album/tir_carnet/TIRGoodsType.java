
package ru.acs.fts.schemas.album.tir_carnet;

import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.TDGoodsBaseType;

/** 
 * Товары в книжке МДП
 */
public class TIRGoodsType extends TDGoodsBaseType
{
    private String TTNNumber;

    /** 
     * Get the 'TTNNumber' element value. Номер товарно-транспортной накладной
     * 
     * @return value
     */
    public String getTTNNumber() {
        return TTNNumber;
    }

    /** 
     * Set the 'TTNNumber' element value. Номер товарно-транспортной накладной
     * 
     * @param TTNNumber
     */
    public void setTTNNumber(String TTNNumber) {
        this.TTNNumber = TTNNumber;
    }
}

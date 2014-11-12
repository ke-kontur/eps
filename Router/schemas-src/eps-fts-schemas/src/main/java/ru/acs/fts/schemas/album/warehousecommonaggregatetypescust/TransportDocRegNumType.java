
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Комплексный тип для описания регистрационного номера транспортного документа
 */
public class TransportDocRegNumType extends GTDIDType
{
    private String waybillNumPP;

    /** 
     * Get the 'WaybillNumPP' element value. Порядковый номер транспортного документа по журналу регистрации
     * 
     * @return value
     */
    public String getWaybillNumPP() {
        return waybillNumPP;
    }

    /** 
     * Set the 'WaybillNumPP' element value. Порядковый номер транспортного документа по журналу регистрации
     * 
     * @param waybillNumPP
     */
    public void setWaybillNumPP(String waybillNumPP) {
        this.waybillNumPP = waybillNumPP;
    }
}

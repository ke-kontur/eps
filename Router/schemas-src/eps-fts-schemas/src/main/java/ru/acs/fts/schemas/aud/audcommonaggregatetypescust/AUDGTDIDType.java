
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import ru.acs.fts.schemas.aud.commonaggregatetypescust.GTDIDType;

/** 
 * Регистрационный номер ГТД
 */
public class AUDGTDIDType extends GTDIDType
{
    private String GTDIDState;

    /** 
     * Get the 'GTDIDState' element value. Статус номера ГТД 01 - актуальный, 99 - номер был  изменен
     * 
     * @return value
     */
    public String getGTDIDState() {
        return GTDIDState;
    }

    /** 
     * Set the 'GTDIDState' element value. Статус номера ГТД 01 - актуальный, 99 - номер был  изменен
     * 
     * @param GTDIDState
     */
    public void setGTDIDState(String GTDIDState) {
        this.GTDIDState = GTDIDState;
    }
}

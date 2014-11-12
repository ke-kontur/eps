
package ru.acs.fts.schemas.album.dtsin;

import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSFilledPersonType;

/** 
 * ДТС. внутренний формат. Сведения о лице, заполнившем ДТС.
 */
public class DTSinFilledPersonType extends DTSFilledPersonType
{
    private String LNP;

    /** 
     * Get the 'LNP' element value. Личная номерная печать должностного лица таможенного органа.
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. Личная номерная печать должностного лица таможенного органа.
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }
}

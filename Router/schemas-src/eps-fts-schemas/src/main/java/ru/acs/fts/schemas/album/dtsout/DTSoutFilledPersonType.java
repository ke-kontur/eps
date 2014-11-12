
package ru.acs.fts.schemas.album.dtsout;

import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSFilledPersonType;

/** 
 * ДТС. Внешний формат. Сведения о лице, заполнившем ДТС.
 */
public class DTSoutFilledPersonType extends DTSFilledPersonType
{
    private String LNP;

    /** 
     * Get the 'LNP' element value. ЛНП должностного лица таможенного органа
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ЛНП должностного лица таможенного органа
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }
}


package ru.acs.fts.schemas.album.quaranfitosanitcontrol;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Выданный акт
 */
public class ActType extends DocumentBaseType
{
    private String blankNum;

    /** 
     * Get the 'BlankNum' element value. Номер бланка, выданного акта
     * 
     * @return value
     */
    public String getBlankNum() {
        return blankNum;
    }

    /** 
     * Set the 'BlankNum' element value. Номер бланка, выданного акта
     * 
     * @param blankNum
     */
    public void setBlankNum(String blankNum) {
        this.blankNum = blankNum;
    }
}


package ru.acs.fts.schemas.album.revealeddirections;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDID5Type;

/** 
 * Регистрационный номер оперативной ориентировки
 */
public class DirectionRegNumberType extends GTDID5Type
{
    private String seqNumberVersion;

    /** 
     * Get the 'SeqNumberVersion' element value. Порядковый номер версии оперативной ориентировки
     * 
     * @return value
     */
    public String getSeqNumberVersion() {
        return seqNumberVersion;
    }

    /** 
     * Set the 'SeqNumberVersion' element value. Порядковый номер версии оперативной ориентировки
     * 
     * @param seqNumberVersion
     */
    public void setSeqNumberVersion(String seqNumberVersion) {
        this.seqNumberVersion = seqNumberVersion;
    }
}

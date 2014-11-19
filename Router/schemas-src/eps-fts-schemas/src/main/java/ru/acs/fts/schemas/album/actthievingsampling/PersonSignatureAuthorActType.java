
package ru.acs.fts.schemas.album.actthievingsampling;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Подпись лица, составившего акт
 */
public class PersonSignatureAuthorActType extends PersonSignatureType
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

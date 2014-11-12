
package ru.acs.fts.schemas.album.commercialinvoice;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

public class IndividualEntrepreneurType extends PersonSignatureType
{
    private String OGRNID;

    /** 
     * Get the 'OGRNID' element value. Основной государственный регистрационный  номер (ОГРН) частного предпринимателя или организации
     * 
     * @return value
     */
    public String getOGRNID() {
        return OGRNID;
    }

    /** 
     * Set the 'OGRNID' element value. Основной государственный регистрационный  номер (ОГРН) частного предпринимателя или организации
     * 
     * @param OGRNID
     */
    public void setOGRNID(String OGRNID) {
        this.OGRNID = OGRNID;
    }
}

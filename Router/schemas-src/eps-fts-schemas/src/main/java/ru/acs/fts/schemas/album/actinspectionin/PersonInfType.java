
package ru.acs.fts.schemas.album.actinspectionin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Сведения о лицах, принимающих  участие в досмотре
 */
public class PersonInfType extends PersonBaseType
{
    private String signatureFlag;

    /** 
     * Get the 'SignatureFlag' element value. Признак, подтверждающий факт подписи АТД: 0 - не подписано 1 - подписано
     * 
     * @return value
     */
    public String getSignatureFlag() {
        return signatureFlag;
    }

    /** 
     * Set the 'SignatureFlag' element value. Признак, подтверждающий факт подписи АТД: 0 - не подписано 1 - подписано
     * 
     * @param signatureFlag
     */
    public void setSignatureFlag(String signatureFlag) {
        this.signatureFlag = signatureFlag;
    }
}

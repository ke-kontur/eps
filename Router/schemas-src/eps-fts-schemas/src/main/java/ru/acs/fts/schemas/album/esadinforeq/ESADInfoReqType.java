
package ru.acs.fts.schemas.album.esadinforeq;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.scvvcommonaggregatetypescust.GTDInqType;

/** 
 * Запрос информации из ДТ/ТД
 */
public class ESADInfoReqType extends BaseDocType
{
    private GTDInqType DTID;
    private String documentModeID;

    /** 
     * Get the 'DTID' element value. Регистрационный номер ДТ.
     * 
     * @return value
     */
    public GTDInqType getDTID() {
        return DTID;
    }

    /** 
     * Set the 'DTID' element value. Регистрационный номер ДТ.
     * 
     * @param DTID
     */
    public void setDTID(GTDInqType DTID) {
        this.DTID = DTID;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}

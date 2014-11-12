
package ru.acs.fts.schemas.album.changedeclnotif;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Уведомление об изменении ДТ
 */
public class ChangeDeclNotifType extends BaseDocType
{
    private String changeDeclType;
    private GTDIDType DTID;
    private GTDIDType newDTID;
    private String documentModeID;

    /** 
     * Get the 'ChangeDeclType' element value. Характер внесенных изменений
     * 
     * @return value
     */
    public String getChangeDeclType() {
        return changeDeclType;
    }

    /** 
     * Set the 'ChangeDeclType' element value. Характер внесенных изменений
     * 
     * @param changeDeclType
     */
    public void setChangeDeclType(String changeDeclType) {
        this.changeDeclType = changeDeclType;
    }

    /** 
     * Get the 'DTID' element value. Регистрационный номер ДТ.
     * 
     * @return value
     */
    public GTDIDType getDTID() {
        return DTID;
    }

    /** 
     * Set the 'DTID' element value. Регистрационный номер ДТ.
     * 
     * @param DTID
     */
    public void setDTID(GTDIDType DTID) {
        this.DTID = DTID;
    }

    /** 
     * Get the 'NewDTID' element value. Исправленный регистрационный номер ДТ.
     * 
     * @return value
     */
    public GTDIDType getNewDTID() {
        return newDTID;
    }

    /** 
     * Set the 'NewDTID' element value. Исправленный регистрационный номер ДТ.
     * 
     * @param newDTID
     */
    public void setNewDTID(GTDIDType newDTID) {
        this.newDTID = newDTID;
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


package ru.acs.fts.schemas.album.notifcloseproc;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Уведомление о закрытии процедуры 
 */
public class NotifCloseProcType extends BaseDocType
{
    private String closeProcedureID;
    private String closeDateTime;
    private String documentModeID;

    /** 
     * Get the 'CloseProcedureID' element value. Уникальный идентификатор закрытой процедуры.
     * 
     * @return value
     */
    public String getCloseProcedureID() {
        return closeProcedureID;
    }

    /** 
     * Set the 'CloseProcedureID' element value. Уникальный идентификатор закрытой процедуры.
     * 
     * @param closeProcedureID
     */
    public void setCloseProcedureID(String closeProcedureID) {
        this.closeProcedureID = closeProcedureID;
    }

    /** 
     * Get the 'CloseDateTime' element value. Дата / время закрытия процедуры
     * 
     * @return value
     */
    public String getCloseDateTime() {
        return closeDateTime;
    }

    /** 
     * Set the 'CloseDateTime' element value. Дата / время закрытия процедуры
     * 
     * @param closeDateTime
     */
    public void setCloseDateTime(String closeDateTime) {
        this.closeDateTime = closeDateTime;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Уникальный идентификатор документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Уникальный идентификатор документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}

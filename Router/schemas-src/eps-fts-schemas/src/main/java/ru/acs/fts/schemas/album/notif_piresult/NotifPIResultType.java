
package ru.acs.fts.schemas.album.notif_piresult;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Уведомление о результатах обработки сообщения
 */
public class NotifPIResultType extends BaseDocType
{
    private ResponseType response;
    private String documentModeID;

    /** 
     * Get the 'Response' element value. Результат обработки документа
     * 
     * @return value
     */
    public ResponseType getResponse() {
        return response;
    }

    /** 
     * Set the 'Response' element value. Результат обработки документа
     * 
     * @param response
     */
    public void setResponse(ResponseType response) {
        this.response = response;
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

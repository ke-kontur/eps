
package ru.acs.fts.schemas.album.resolutionnotifdata;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Сведения о принятом решении
 */
public class ResolutionNotifDataType extends BaseDocType
{
    private String requestId;
    private String action;
    private String documentModeID;

    /** 
     * Get the 'RequestId' element value. Уникальный идентификатор запроса
     * 
     * @return value
     */
    public String getRequestId() {
        return requestId;
    }

    /** 
     * Set the 'RequestId' element value. Уникальный идентификатор запроса
     * 
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /** 
     * Get the 'Action' element value. Решение ответственного должностного лица: 1 - Пропущено; 2 - Пропущено с уведомлением на внешней границе Таможенного союза (Беларусь); 3 - Пропущено с уведомлением на внешней границе Таможенного союза (Казахстан); 4 - Задержано
     * 
     * @return value
     */
    public String getAction() {
        return action;
    }

    /** 
     * Set the 'Action' element value. Решение ответственного должностного лица: 1 - Пропущено; 2 - Пропущено с уведомлением на внешней границе Таможенного союза (Беларусь); 3 - Пропущено с уведомлением на внешней границе Таможенного союза (Казахстан); 4 - Задержано
     * 
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
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

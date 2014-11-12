
package ru.acs.fts.schemas.aud.aud_statusrequest;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * Запрос информации о статусе функционирования системы.
 */
public class AUDStatusRequestType extends AUDBaseEnvelopeType
{
    private String documentModeID;

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида технологического документа (запроса, ответа)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида технологического документа (запроса, ответа)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}

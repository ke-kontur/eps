
package ru.acs.fts.schemas.aud.aud_resultresponse;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentBodyType;

public class AUDResultResponseType extends AUDBaseEnvelopeType
{
    private AUDDocumentBodyType documentBody;
    private String documentModeID;

    /** 
     * Get the 'DocumentBody' element value. “ехнологический документ-ответ, который был отправлен клиенту в результате обработки технологического документа-запроса.
     * 
     * @return value
     */
    public AUDDocumentBodyType getDocumentBody() {
        return documentBody;
    }

    /** 
     * Set the 'DocumentBody' element value. “ехнологический документ-ответ, который был отправлен клиенту в результате обработки технологического документа-запроса.
     * 
     * @param documentBody
     */
    public void setDocumentBody(AUDDocumentBodyType documentBody) {
        this.documentBody = documentBody;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. »дентификатор вида технологического документа (запроса, ответа)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. »дентификатор вида технологического документа (запроса, ответа)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}

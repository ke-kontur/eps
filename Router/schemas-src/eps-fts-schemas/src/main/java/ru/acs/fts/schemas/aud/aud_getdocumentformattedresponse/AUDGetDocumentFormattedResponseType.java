
package ru.acs.fts.schemas.aud.aud_getdocumentformattedresponse;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * Ответ на запрос на получение данных для отображения документа архива.
 */
public class AUDGetDocumentFormattedResponseType extends AUDBaseEnvelopeType
{
    private byte[] documentRepresentation;
    private String documentModeID;

    /** 
     * Get the 'DocumentRepresentation' element value. Сформированное представление документа (для визуализации документа).
     * 
     * @return value
     */
    public byte[] getDocumentRepresentation() {
        return documentRepresentation;
    }

    /** 
     * Set the 'DocumentRepresentation' element value. Сформированное представление документа (для визуализации документа).
     * 
     * @param documentRepresentation
     */
    public void setDocumentRepresentation(byte[] documentRepresentation) {
        this.documentRepresentation = documentRepresentation;
    }

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

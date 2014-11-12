
package ru.acs.fts.schemas.aud.aud_resultrequest;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * Запрос на получение результатов обработки технологического документа.
 */
public class AUDResultRequestType extends AUDBaseEnvelopeType
{
    private String requestDocumentID;
    private String documentModeID;

    /** 
     * Get the 'RequestDocumentID' element value. Идентификатор технологического документа, результат обработки которого требуется получить.
     * 
     * @return value
     */
    public String getRequestDocumentID() {
        return requestDocumentID;
    }

    /** 
     * Set the 'RequestDocumentID' element value. Идентификатор технологического документа, результат обработки которого требуется получить.
     * 
     * @param requestDocumentID
     */
    public void setRequestDocumentID(String requestDocumentID) {
        this.requestDocumentID = requestDocumentID;
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

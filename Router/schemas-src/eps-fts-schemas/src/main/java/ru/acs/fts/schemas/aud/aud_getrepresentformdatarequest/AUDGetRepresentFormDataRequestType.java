
package ru.acs.fts.schemas.aud.aud_getrepresentformdatarequest;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentKindRepresentationIdInfoType;

/** 
 * Запрос на получение данных (текста XSLT-преобразования) для формирования представления документа в целях визуализации.
 */
public class AUDGetRepresentFormDataRequestType extends AUDBaseEnvelopeType
{
    private AUDDocumentKindRepresentationIdInfoType documentKindRepresentationIdInfo;
    private String documentModeID;

    /** 
     * Get the 'DocumentKindRepresentationIdInfo' element value. Информация для идентификации вида представления (используемого для визуализации документа).
     * 
     * @return value
     */
    public AUDDocumentKindRepresentationIdInfoType getDocumentKindRepresentationIdInfo() {
        return documentKindRepresentationIdInfo;
    }

    /** 
     * Set the 'DocumentKindRepresentationIdInfo' element value. Информация для идентификации вида представления (используемого для визуализации документа).
     * 
     * @param documentKindRepresentationIdInfo
     */
    public void setDocumentKindRepresentationIdInfo(
            AUDDocumentKindRepresentationIdInfoType documentKindRepresentationIdInfo) {
        this.documentKindRepresentationIdInfo = documentKindRepresentationIdInfo;
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


package ru.acs.fts.schemas.aud.aud_getrepresentformdataresponse;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * Ответ на запрос на запрос на получение данных (текста XSLT-преобразования) для формирования представления документа в целях визуализации.
 */
public class AUDGetRepresentFormDataResponseType extends AUDBaseEnvelopeType
{
    private byte[] representationFormingData;
    private String documentModeID;

    /** 
     * Get the 'RepresentationFormingData' element value. Данные (текст XSLT-преобразования), используемые для формирования представления документа (в целях его визуализации).
     * 
     * @return value
     */
    public byte[] getRepresentationFormingData() {
        return representationFormingData;
    }

    /** 
     * Set the 'RepresentationFormingData' element value. Данные (текст XSLT-преобразования), используемые для формирования представления документа (в целях его визуализации).
     * 
     * @param representationFormingData
     */
    public void setRepresentationFormingData(byte[] representationFormingData) {
        this.representationFormingData = representationFormingData;
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


package ru.acs.fts.schemas.aud.aud_getrepresentformdataresponse;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * ќтвет на запрос на запрос на получение данных (текста XSLT-преобразовани€) дл€ формировани€ представлени€ документа в цел€х визуализации.
 */
public class AUDGetRepresentFormDataResponseType extends AUDBaseEnvelopeType
{
    private byte[] representationFormingData;
    private String documentModeID;

    /** 
     * Get the 'RepresentationFormingData' element value. ƒанные (текст XSLT-преобразовани€), используемые дл€ формировани€ представлени€ документа (в цел€х его визуализации).
     * 
     * @return value
     */
    public byte[] getRepresentationFormingData() {
        return representationFormingData;
    }

    /** 
     * Set the 'RepresentationFormingData' element value. ƒанные (текст XSLT-преобразовани€), используемые дл€ формировани€ представлени€ документа (в цел€х его визуализации).
     * 
     * @param representationFormingData
     */
    public void setRepresentationFormingData(byte[] representationFormingData) {
        this.representationFormingData = representationFormingData;
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

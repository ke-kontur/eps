
package ru.acs.fts.schemas.aud.aud_getdocumentresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentInfoWithAttributesType;

/** 
 * Ответ на запрос на поиск и извлечение документа (документов) архива.
 */
public class AUDGetDocumentResponseType extends AUDBaseEnvelopeType
{
    private List<AUDDocumentInfoWithAttributesType> documentInfoWithAttributeList = new ArrayList<AUDDocumentInfoWithAttributesType>();
    private String documentModeID;

    /** 
     * Get the list of 'DocumentInfoWithAttributes' element items. Информация о документе архива, пакете (в состав которого входит документ) и реквизитах документа.
     * 
     * @return list
     */
    public List<AUDDocumentInfoWithAttributesType> getDocumentInfoWithAttributeList() {
        return documentInfoWithAttributeList;
    }

    /** 
     * Set the list of 'DocumentInfoWithAttributes' element items. Информация о документе архива, пакете (в состав которого входит документ) и реквизитах документа.
     * 
     * @param list
     */
    public void setDocumentInfoWithAttributeList(
            List<AUDDocumentInfoWithAttributesType> list) {
        documentInfoWithAttributeList = list;
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

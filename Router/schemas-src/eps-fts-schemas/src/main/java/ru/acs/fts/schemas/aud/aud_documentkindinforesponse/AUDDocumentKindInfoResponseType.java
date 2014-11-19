
package ru.acs.fts.schemas.aud.aud_documentkindinforesponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * Ответ на запрос на получение информации о зарегистрированных видах документов.
 */
public class AUDDocumentKindInfoResponseType extends AUDBaseEnvelopeType
{
    private List<KindInfoLocalType> documentKindInfoList = new ArrayList<KindInfoLocalType>();
    private String documentModeID;

    /** 
     * Get the list of 'DocumentKindInfo' element items. Информация о виде документов и версиях этого вида.
     * 
     * @return list
     */
    public List<KindInfoLocalType> getDocumentKindInfoList() {
        return documentKindInfoList;
    }

    /** 
     * Set the list of 'DocumentKindInfo' element items. Информация о виде документов и версиях этого вида.
     * 
     * @param list
     */
    public void setDocumentKindInfoList(List<KindInfoLocalType> list) {
        documentKindInfoList = list;
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

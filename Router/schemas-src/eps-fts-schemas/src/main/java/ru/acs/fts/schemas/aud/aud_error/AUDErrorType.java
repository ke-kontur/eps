
package ru.acs.fts.schemas.aud.aud_error;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDResultInfoType;

/** 
 * Результаты обработки запроса.
 */
public class AUDErrorType extends AUDBaseEnvelopeType
{
    private List<AUDResultInfoType> resultInfoList = new ArrayList<AUDResultInfoType>();
    private List<EmbeddedDocumentResultInfoType> embeddedDocumentResultInfoList = new ArrayList<EmbeddedDocumentResultInfoType>();
    private String documentModeID;

    /** 
     * Get the list of 'ResultInfo' element items. Информация о результате обработки запроса.
     * 
     * @return list
     */
    public List<AUDResultInfoType> getResultInfoList() {
        return resultInfoList;
    }

    /** 
     * Set the list of 'ResultInfo' element items. Информация о результате обработки запроса.
     * 
     * @param list
     */
    public void setResultInfoList(List<AUDResultInfoType> list) {
        resultInfoList = list;
    }

    /** 
     * Get the list of 'EmbeddedDocumentResultInfo' element items. Информация о результате обработки документа, вложенного в документ-контейнер.
     * 
     * @return list
     */
    public List<EmbeddedDocumentResultInfoType> getEmbeddedDocumentResultInfoList() {
        return embeddedDocumentResultInfoList;
    }

    /** 
     * Set the list of 'EmbeddedDocumentResultInfo' element items. Информация о результате обработки документа, вложенного в документ-контейнер.
     * 
     * @param list
     */
    public void setEmbeddedDocumentResultInfoList(
            List<EmbeddedDocumentResultInfoType> list) {
        embeddedDocumentResultInfoList = list;
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

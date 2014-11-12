
package ru.acs.fts.schemas.album.resultrd;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Уведомление о результате проверки / обработке сообщения БД РД
 */
public class ResultRDType extends BaseDocType
{
    private List<ResponseType> responseList = new ArrayList<ResponseType>();
    private String documentModeID;

    /** 
     * Get the list of 'Response' element items. Результат выполнения операции
     * 
     * @return list
     */
    public List<ResponseType> getResponseList() {
        return responseList;
    }

    /** 
     * Set the list of 'Response' element items. Результат выполнения операции
     * 
     * @param list
     */
    public void setResponseList(List<ResponseType> list) {
        responseList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}

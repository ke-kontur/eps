
package ru.acs.fts.schemas.album.resultasktt;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Результат проверки АСКТТ-2
 */
public class ResultASKTTType extends BaseDocType
{
    private List<TDCheckResultType> TDCheckResultList = new ArrayList<TDCheckResultType>();
    private String documentModeID;

    /** 
     * Get the list of 'TDCheckResult' element items. Результаты проверки по ТД
     * 
     * @return list
     */
    public List<TDCheckResultType> getTDCheckResultList() {
        return TDCheckResultList;
    }

    /** 
     * Set the list of 'TDCheckResult' element items. Результаты проверки по ТД
     * 
     * @param list
     */
    public void setTDCheckResultList(List<TDCheckResultType> list) {
        TDCheckResultList = list;
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

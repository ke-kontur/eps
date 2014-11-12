
package ru.acs.fts.schemas.album.cwqueryresult;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.CWDocType;

/** 
 * Результат выполнения запроса
 */
public class CWQueryResultType extends CWDocType
{
    private List<ResultBodyType> resultBodyList = new ArrayList<ResultBodyType>();
    private String documentModeID;

    /** 
     * Get the list of 'ResultBody' element items. Результат
     * 
     * @return list
     */
    public List<ResultBodyType> getResultBodyList() {
        return resultBodyList;
    }

    /** 
     * Set the list of 'ResultBody' element items. Результат
     * 
     * @param list
     */
    public void setResultBodyList(List<ResultBodyType> list) {
        resultBodyList = list;
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

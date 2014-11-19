
package ru.acs.fts.schemas.album.resulttk;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Сведения из транспортного контроля
 */
public class ResultTKType extends BaseDocType
{
    private List<InspectionType> inspectionList = new ArrayList<InspectionType>();
    private String documentModeID;

    /** 
     * Get the list of 'Inspection' element items. Данные транспортного контроля/инспекции
     * 
     * @return list
     */
    public List<InspectionType> getInspectionList() {
        return inspectionList;
    }

    /** 
     * Set the list of 'Inspection' element items. Данные транспортного контроля/инспекции
     * 
     * @param list
     */
    public void setInspectionList(List<InspectionType> list) {
        inspectionList = list;
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

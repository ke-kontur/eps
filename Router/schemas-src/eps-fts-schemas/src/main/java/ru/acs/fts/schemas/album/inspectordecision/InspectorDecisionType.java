
package ru.acs.fts.schemas.album.inspectordecision;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Решение должностного лица
 */
public class InspectorDecisionType extends BaseDocType
{
    private List<DecisionDescriptionType> decisionDescriptionList = new ArrayList<DecisionDescriptionType>();
    private String documentModeID;

    /** 
     * Get the list of 'DecisionDescription' element items. Описание решения должностного лица
     * 
     * @return list
     */
    public List<DecisionDescriptionType> getDecisionDescriptionList() {
        return decisionDescriptionList;
    }

    /** 
     * Set the list of 'DecisionDescription' element items. Описание решения должностного лица
     * 
     * @param list
     */
    public void setDecisionDescriptionList(List<DecisionDescriptionType> list) {
        decisionDescriptionList = list;
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

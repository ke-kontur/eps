
package ru.acs.fts.schemas.album.inspectordecision;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ������� ������������ ����
 */
public class InspectorDecisionType extends BaseDocType
{
    private List<DecisionDescriptionType> decisionDescriptionList = new ArrayList<DecisionDescriptionType>();
    private String documentModeID;

    /** 
     * Get the list of 'DecisionDescription' element items. �������� ������� ������������ ����
     * 
     * @return list
     */
    public List<DecisionDescriptionType> getDecisionDescriptionList() {
        return decisionDescriptionList;
    }

    /** 
     * Set the list of 'DecisionDescription' element items. �������� ������� ������������ ����
     * 
     * @param list
     */
    public void setDecisionDescriptionList(List<DecisionDescriptionType> list) {
        decisionDescriptionList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}


package ru.acs.fts.schemas.album.inspectionreqres;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * �������� � ������������� �������������� �������������� ���������� � �������� � � ����������� �������� �������/�������� � ����������� ��������
 */
public class InspectionReqResType extends BaseDocType
{
    private String docSign;
    private String conversationID;
    private InspectionDecisionType inspectionDecision;
    private List<ViolationType> violationList = new ArrayList<ViolationType>();
    private List<RequirementType> requirementList = new ArrayList<RequirementType>();
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. ������� ���������: 1 - �������� � ������������� �������������� �������������� ���������� � �������� � � ����������� �������� �������; 2 - �������� � ����������� ��������������� ������������� ��������; 3 - �������� � ����������� ������������� �������� (����� �������/��������)
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ���������: 1 - �������� � ������������� �������������� �������������� ���������� � �������� � � ����������� �������� �������; 2 - �������� � ����������� ��������������� ������������� ��������; 3 - �������� � ����������� ������������� �������� (����� �������/��������)
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'ConversationID' element value. ������������� ��������������
     * 
     * @return value
     */
    public String getConversationID() {
        return conversationID;
    }

    /** 
     * Set the 'ConversationID' element value. ������������� ��������������
     * 
     * @param conversationID
     */
    public void setConversationID(String conversationID) {
        this.conversationID = conversationID;
    }

    /** 
     * Get the 'InspectionDecision' element value. �������, �������� ���������� ����������� �� ����������� �������������� ��������
     * 
     * @return value
     */
    public InspectionDecisionType getInspectionDecision() {
        return inspectionDecision;
    }

    /** 
     * Set the 'InspectionDecision' element value. �������, �������� ���������� ����������� �� ����������� �������������� ��������
     * 
     * @param inspectionDecision
     */
    public void setInspectionDecision(InspectionDecisionType inspectionDecision) {
        this.inspectionDecision = inspectionDecision;
    }

    /** 
     * Get the list of 'Violation' element items. ���������, ���������� ��� ��������
     * 
     * @return list
     */
    public List<ViolationType> getViolationList() {
        return violationList;
    }

    /** 
     * Set the list of 'Violation' element items. ���������, ���������� ��� ��������
     * 
     * @param list
     */
    public void setViolationList(List<ViolationType> list) {
        violationList = list;
    }

    /** 
     * Get the list of 'Requirement' element items. ������� ��������������� ����� ����� �������
     * 
     * @return list
     */
    public List<RequirementType> getRequirementList() {
        return requirementList;
    }

    /** 
     * Set the list of 'Requirement' element items. ������� ��������������� ����� ����� �������
     * 
     * @param list
     */
    public void setRequirementList(List<RequirementType> list) {
        requirementList = list;
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

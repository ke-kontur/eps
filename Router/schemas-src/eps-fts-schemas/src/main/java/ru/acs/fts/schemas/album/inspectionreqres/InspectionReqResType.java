
package ru.acs.fts.schemas.album.inspectionreqres;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Сведения о необходимости предоставления дополнительных документов и сведений и о возможности принятия решения/Сведения о результатах контроля
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
     * Get the 'DocSign' element value. Признак документа: 1 - Сведения о необходимости предоставления дополнительных документов и сведений и о возможности принятия решения; 2 - Сведения о результатах документального ветеринарного контроля; 3 - Сведения о результатах ветеринарного контроля (после осмотра/досмотра)
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак документа: 1 - Сведения о необходимости предоставления дополнительных документов и сведений и о возможности принятия решения; 2 - Сведения о результатах документального ветеринарного контроля; 3 - Сведения о результатах ветеринарного контроля (после осмотра/досмотра)
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'ConversationID' element value. Идентификатор взаимодействия
     * 
     * @return value
     */
    public String getConversationID() {
        return conversationID;
    }

    /** 
     * Set the 'ConversationID' element value. Идентификатор взаимодействия
     * 
     * @param conversationID
     */
    public void setConversationID(String conversationID) {
        this.conversationID = conversationID;
    }

    /** 
     * Get the 'InspectionDecision' element value. Решение, принятое таможенным инспектором по результатам документарного контроля
     * 
     * @return value
     */
    public InspectionDecisionType getInspectionDecision() {
        return inspectionDecision;
    }

    /** 
     * Set the 'InspectionDecision' element value. Решение, принятое таможенным инспектором по результатам документарного контроля
     * 
     * @param inspectionDecision
     */
    public void setInspectionDecision(InspectionDecisionType inspectionDecision) {
        this.inspectionDecision = inspectionDecision;
    }

    /** 
     * Get the list of 'Violation' element items. Нарушение, выявленное при досмотре
     * 
     * @return list
     */
    public List<ViolationType> getViolationList() {
        return violationList;
    }

    /** 
     * Set the list of 'Violation' element items. Нарушение, выявленное при досмотре
     * 
     * @param list
     */
    public void setViolationList(List<ViolationType> list) {
        violationList = list;
    }

    /** 
     * Get the list of 'Requirement' element items. Условие транспортировки груза через границу
     * 
     * @return list
     */
    public List<RequirementType> getRequirementList() {
        return requirementList;
    }

    /** 
     * Set the list of 'Requirement' element items. Условие транспортировки груза через границу
     * 
     * @param list
     */
    public void setRequirementList(List<RequirementType> list) {
        requirementList = list;
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

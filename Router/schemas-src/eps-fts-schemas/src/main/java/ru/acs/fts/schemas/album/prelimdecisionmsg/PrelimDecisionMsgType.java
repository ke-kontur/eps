
package ru.acs.fts.schemas.album.prelimdecisionmsg;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * ��������� � �������� ���������������� ������� � ��
 */
public class PrelimDecisionMsgType extends BaseDocType
{
    private String PIURN;
    private LocalDate decisionDate;
    private String decisionTime;
    private String customsCode;
    private String TSControlDecision;
    private CustomsPersonType customsPerson;
    private List<ConsignmentsType> consignmentList = new ArrayList<ConsignmentsType>();
    private RailwayType railway;
    private String documentModeID;

    /** 
     * Get the 'PI_URN' element value. ���������� ������������� �������� ������. ������ - URN
     * 
     * @return value
     */
    public String getPIURN() {
        return PIURN;
    }

    /** 
     * Set the 'PI_URN' element value. ���������� ������������� �������� ������. ������ - URN
     * 
     * @param PIURN
     */
    public void setPIURN(String PIURN) {
        this.PIURN = PIURN;
    }

    /** 
     * Get the 'DecisionDate' element value. ���� �������� �������
     * 
     * @return value
     */
    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    /** 
     * Set the 'DecisionDate' element value. ���� �������� �������
     * 
     * @param decisionDate
     */
    public void setDecisionDate(LocalDate decisionDate) {
        this.decisionDate = decisionDate;
    }

    /** 
     * Get the 'DecisionTime' element value. ����� �������� �������
     * 
     * @return value
     */
    public String getDecisionTime() {
        return decisionTime;
    }

    /** 
     * Set the 'DecisionTime' element value. ����� �������� �������
     * 
     * @param decisionTime
     */
    public void setDecisionTime(String decisionTime) {
        this.decisionTime = decisionTime;
    }

    /** 
     * Get the 'CustomsCode' element value. ��� ����������� �����
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. ��� ����������� �����
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'TSControlDecision' element value. �������� ������� �� ��
     * 
     * @return value
     */
    public String getTSControlDecision() {
        return TSControlDecision;
    }

    /** 
     * Set the 'TSControlDecision' element value. �������� ������� �� ��
     * 
     * @param TSControlDecision
     */
    public void setTSControlDecision(String TSControlDecision) {
        this.TSControlDecision = TSControlDecision;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ����, ����������� �������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ����, ����������� �������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the list of 'Consignments' element items. �������� � �������� �������
     * 
     * @return list
     */
    public List<ConsignmentsType> getConsignmentList() {
        return consignmentList;
    }

    /** 
     * Set the list of 'Consignments' element items. �������� � �������� �������
     * 
     * @param list
     */
    public void setConsignmentList(List<ConsignmentsType> list) {
        consignmentList = list;
    }

    /** 
     * Get the 'Railway' element value. �������� � �������� ������
     * 
     * @return value
     */
    public RailwayType getRailway() {
        return railway;
    }

    /** 
     * Set the 'Railway' element value. �������� � �������� ������
     * 
     * @param railway
     */
    public void setRailway(RailwayType railway) {
        this.railway = railway;
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

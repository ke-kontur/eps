
package ru.acs.fts.schemas.album.goodsdecision;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * ���������������/������������� ������� � ��������� ������� ��� ��������� �������/���������/�� ������������
 */
public class GoodsDecisionType extends BaseDocType
{
    private String PIURN;
    private String decisionKind;
    private String transportKind;
    private String estimatedArrival;
    private LocalDate decisionDate;
    private String decisionTime;
    private String customsOperationPlace;
    private String customsCode;
    private String TSControlDecision;
    private CustomsPersonType customsPerson;
    private List<ConsignmentsType> consignmentList = new ArrayList<ConsignmentsType>();
    private int choiceSelect = -1;
    private static final int FLIGHT_INFO_CHOICE = 0;
    private static final int RAILWAY_CHOICE = 1;
    private static final int SHIP_INFO_CHOICE = 2;
    private FlightInfoType flightInfo;
    private RailwayType railway;
    private ShipInfoType shipInfo;
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
     * Get the 'DecisionKind' element value. ��� �������. 1- ��������������� 2 - �������������
     * 
     * @return value
     */
    public String getDecisionKind() {
        return decisionKind;
    }

    /** 
     * Set the 'DecisionKind' element value. ��� �������. 1- ��������������� 2 - �������������
     * 
     * @param decisionKind
     */
    public void setDecisionKind(String decisionKind) {
        this.decisionKind = decisionKind;
    }

    /** 
     * Get the 'TransportKind' element value. ��� ����������. 1 - ���������, 2 - ������, 3- ��
     * 
     * @return value
     */
    public String getTransportKind() {
        return transportKind;
    }

    /** 
     * Set the 'TransportKind' element value. ��� ����������. 1 - ���������, 2 - ������, 3- ��
     * 
     * @param transportKind
     */
    public void setTransportKind(String transportKind) {
        this.transportKind = transportKind;
    }

    /** 
     * Get the 'EstimatedArrival' element value. ��������� ���� � ����� �������� � ����
     * 
     * @return value
     */
    public String getEstimatedArrival() {
        return estimatedArrival;
    }

    /** 
     * Set the 'EstimatedArrival' element value. ��������� ���� � ����� �������� � ����
     * 
     * @param estimatedArrival
     */
    public void setEstimatedArrival(String estimatedArrival) {
        this.estimatedArrival = estimatedArrival;
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
     * Get the 'CustomsOperationPlace' element value. ����� ���������� ���������� ��������
     * 
     * @return value
     */
    public String getCustomsOperationPlace() {
        return customsOperationPlace;
    }

    /** 
     * Set the 'CustomsOperationPlace' element value. ����� ���������� ���������� ��������
     * 
     * @param customsOperationPlace
     */
    public void setCustomsOperationPlace(String customsOperationPlace) {
        this.customsOperationPlace = customsOperationPlace;
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

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if FlightInfo is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifFlightInfo() {
        return choiceSelect == FLIGHT_INFO_CHOICE;
    }

    /** 
     * Get the 'FlightInfo' element value. �������� � �����
     * 
     * @return value
     */
    public FlightInfoType getFlightInfo() {
        return flightInfo;
    }

    /** 
     * Set the 'FlightInfo' element value. �������� � �����
     * 
     * @param flightInfo
     */
    public void setFlightInfo(FlightInfoType flightInfo) {
        setChoiceSelect(FLIGHT_INFO_CHOICE);
        this.flightInfo = flightInfo;
    }

    /** 
     * Check if Railway is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifRailway() {
        return choiceSelect == RAILWAY_CHOICE;
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
        setChoiceSelect(RAILWAY_CHOICE);
        this.railway = railway;
    }

    /** 
     * Check if ShipInfo is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifShipInfo() {
        return choiceSelect == SHIP_INFO_CHOICE;
    }

    /** 
     * Get the 'ShipInfo' element value. �������� � �����
     * 
     * @return value
     */
    public ShipInfoType getShipInfo() {
        return shipInfo;
    }

    /** 
     * Set the 'ShipInfo' element value. �������� � �����
     * 
     * @param shipInfo
     */
    public void setShipInfo(ShipInfoType shipInfo) {
        setChoiceSelect(SHIP_INFO_CHOICE);
        this.shipInfo = shipInfo;
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

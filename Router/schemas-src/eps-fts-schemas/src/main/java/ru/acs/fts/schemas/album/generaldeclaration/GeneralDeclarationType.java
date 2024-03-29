
package ru.acs.fts.schemas.album.generaldeclaration;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ����� (�����������) ����������
 */
public class GeneralDeclarationType extends BaseDocType
{
    private List<String> noticeList = new ArrayList<String>();
    private String languageCode;
    private String carrier;
    private String arrivalIndicator;
    private String voyageDescription;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String membershipNumber;
    private String passengerNumber;
    private String departurePort;
    private String destinationPort;
    private String mooring;
    private VesselRegistrationType vesselRegistration;
    private PersonSignatureType documentSignature;
    private AgentType shipAgent;
    private int choiceSelect = -1;
    private static final int ARRIVAL_CHOICE = 0;
    private static final int SAILING_CHOICE = 1;
    private GDPortType arrival;
    private GDPortType sailing;
    private EnclosedDocumentType enclosedDocument;
    private CustomsType customs;
    private String documentModeID;

    /** 
     * Get the list of 'Notice' element items. ���������� 
     * 
     * @return list
     */
    public List<String> getNoticeList() {
        return noticeList;
    }

    /** 
     * Set the list of 'Notice' element items. ���������� 
     * 
     * @param list
     */
    public void setNoticeList(List<String> list) {
        noticeList = list;
    }

    /** 
     * Get the 'LanguageCode' element value. ��� ����� ��������� 
     * 
     * @return value
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /** 
     * Set the 'LanguageCode' element value. ��� ����� ��������� 
     * 
     * @param languageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /** 
     * Get the 'Carrier' element value. ������������ �������������
     * 
     * @return value
     */
    public String getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. ������������ �������������
     * 
     * @param carrier
     */
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'ArrivalIndicator' element value. ������� �������� ����� ������������ ���������� �������
     * 
     * @return value
     */
    public String getArrivalIndicator() {
        return arrivalIndicator;
    }

    /** 
     * Set the 'ArrivalIndicator' element value. ������� �������� ����� ������������ ���������� �������
     * 
     * @param arrivalIndicator
     */
    public void setArrivalIndicator(String arrivalIndicator) {
        this.arrivalIndicator = arrivalIndicator;
    }

    /** 
     * Get the 'VoyageDescription' element value. ������� �������� � ����� (���������� � ����������� ����� ������; �����������, ��� ����� �������� ���������� �� ����� ����)
     * 
     * @return value
     */
    public String getVoyageDescription() {
        return voyageDescription;
    }

    /** 
     * Set the 'VoyageDescription' element value. ������� �������� � ����� (���������� � ����������� ����� ������; �����������, ��� ����� �������� ���������� �� ����� ����)
     * 
     * @param voyageDescription
     */
    public void setVoyageDescription(String voyageDescription) {
        this.voyageDescription = voyageDescription;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. ������� �������� �����
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. ������� �������� �����
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'MembershipNumber' element value. ���������� ������ ������� �����, ������� ��������
     * 
     * @return value
     */
    public String getMembershipNumber() {
        return membershipNumber;
    }

    /** 
     * Set the 'MembershipNumber' element value. ���������� ������ ������� �����, ������� ��������
     * 
     * @param membershipNumber
     */
    public void setMembershipNumber(String membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    /** 
     * Get the 'PassengerNumber' element value. ���������� ���������� 
     * 
     * @return value
     */
    public String getPassengerNumber() {
        return passengerNumber;
    }

    /** 
     * Set the 'PassengerNumber' element value. ���������� ���������� 
     * 
     * @param passengerNumber
     */
    public void setPassengerNumber(String passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    /** 
     * Get the 'DeparturePort' element value. �������� ����� ����������� �����
     * 
     * @return value
     */
    public String getDeparturePort() {
        return departurePort;
    }

    /** 
     * Set the 'DeparturePort' element value. �������� ����� ����������� �����
     * 
     * @param departurePort
     */
    public void setDeparturePort(String departurePort) {
        this.departurePort = departurePort;
    }

    /** 
     * Get the 'DestinationPort' element value. �������� ����� ���������� �����
     * 
     * @return value
     */
    public String getDestinationPort() {
        return destinationPort;
    }

    /** 
     * Set the 'DestinationPort' element value. �������� ����� ���������� �����
     * 
     * @param destinationPort
     */
    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    /** 
     * Get the 'Mooring' element value. ����� ������� ����� � �����
     * 
     * @return value
     */
    public String getMooring() {
        return mooring;
    }

    /** 
     * Set the 'Mooring' element value. ����� ������� ����� � �����
     * 
     * @param mooring
     */
    public void setMooring(String mooring) {
        this.mooring = mooring;
    }

    /** 
     * Get the 'VesselRegistration' element value. ��������� � �������������� �����, �������� � ����������� �����
     * 
     * @return value
     */
    public VesselRegistrationType getVesselRegistration() {
        return vesselRegistration;
    }

    /** 
     * Set the 'VesselRegistration' element value. ��������� � �������������� �����, �������� � ����������� �����
     * 
     * @param vesselRegistration
     */
    public void setVesselRegistration(VesselRegistrationType vesselRegistration) {
        this.vesselRegistration = vesselRegistration;
    }

    /** 
     * Get the 'DocumentSignature' element value. ������� ��������� ���������, ������� ������� ��� �����-���� ������ �����, ���������� ������� �������������� �� �� ���������
     * 
     * @return value
     */
    public PersonSignatureType getDocumentSignature() {
        return documentSignature;
    }

    /** 
     * Set the 'DocumentSignature' element value. ������� ��������� ���������, ������� ������� ��� �����-���� ������ �����, ���������� ������� �������������� �� �� ���������
     * 
     * @param documentSignature
     */
    public void setDocumentSignature(PersonSignatureType documentSignature) {
        this.documentSignature = documentSignature;
    }

    /** 
     * Get the 'ShipAgent' element value. ������� �����
     * 
     * @return value
     */
    public AgentType getShipAgent() {
        return shipAgent;
    }

    /** 
     * Set the 'ShipAgent' element value. ������� �����
     * 
     * @param shipAgent
     */
    public void setShipAgent(AgentType shipAgent) {
        this.shipAgent = shipAgent;
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
     * Check if Arrival is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifArrival() {
        return choiceSelect == ARRIVAL_CHOICE;
    }

    /** 
     * Get the 'Arrival' element value. �������� � ��������
     * 
     * @return value
     */
    public GDPortType getArrival() {
        return arrival;
    }

    /** 
     * Set the 'Arrival' element value. �������� � ��������
     * 
     * @param arrival
     */
    public void setArrival(GDPortType arrival) {
        setChoiceSelect(ARRIVAL_CHOICE);
        this.arrival = arrival;
    }

    /** 
     * Check if Sailing is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifSailing() {
        return choiceSelect == SAILING_CHOICE;
    }

    /** 
     * Get the 'Sailing' element value. �������� �� ������
     * 
     * @return value
     */
    public GDPortType getSailing() {
        return sailing;
    }

    /** 
     * Set the 'Sailing' element value. �������� �� ������
     * 
     * @param sailing
     */
    public void setSailing(GDPortType sailing) {
        setChoiceSelect(SAILING_CHOICE);
        this.sailing = sailing;
    }

    /** 
     * Get the 'EnclosedDocument' element value. ���������� � ����������� ����������
     * 
     * @return value
     */
    public EnclosedDocumentType getEnclosedDocument() {
        return enclosedDocument;
    }

    /** 
     * Set the 'EnclosedDocument' element value. ���������� � ����������� ����������
     * 
     * @param enclosedDocument
     */
    public void setEnclosedDocument(EnclosedDocumentType enclosedDocument) {
        this.enclosedDocument = enclosedDocument;
    }

    /** 
     * Get the 'Customs' element value. ��� � ������������ ����������� ������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ��� � ������������ ����������� ������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
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

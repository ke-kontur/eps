
package ru.acs.fts.schemas.album.pi_seaarrive;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ��������������� ���������� � �������, �����������  ������ �����������
 */
public class PISeaArriveType extends BaseDocType
{
    private String PIURN;
    private String MPOSign;
    private String dangerGoodsSing;
    private ShipDetailsType shipDetails;
    private PassengersType passengers;
    private CrewInfoType crewInfo;
    private List<ConsignmentsType> consignmentList = new ArrayList<ConsignmentsType>();
    private List<StoresType> storeList = new ArrayList<StoresType>();
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
     * Get the 'MPOSign' element value. ������� ���������� ���
     * 
     * @return value
     */
    public String getMPOSign() {
        return MPOSign;
    }

    /** 
     * Set the 'MPOSign' element value. ������� ���������� ���
     * 
     * @param MPOSign
     */
    public void setMPOSign(String MPOSign) {
        this.MPOSign = MPOSign;
    }

    /** 
     * Get the 'DangerGoodsSing' element value. ������� ������� ������� �������
     * 
     * @return value
     */
    public String getDangerGoodsSing() {
        return dangerGoodsSing;
    }

    /** 
     * Set the 'DangerGoodsSing' element value. ������� ������� ������� �������
     * 
     * @param dangerGoodsSing
     */
    public void setDangerGoodsSing(String dangerGoodsSing) {
        this.dangerGoodsSing = dangerGoodsSing;
    }

    /** 
     * Get the 'ShipDetails' element value. ��������� � �������������� �����
     * 
     * @return value
     */
    public ShipDetailsType getShipDetails() {
        return shipDetails;
    }

    /** 
     * Set the 'ShipDetails' element value. ��������� � �������������� �����
     * 
     * @param shipDetails
     */
    public void setShipDetails(ShipDetailsType shipDetails) {
        this.shipDetails = shipDetails;
    }

    /** 
     * Get the 'Passengers' element value. �������� � ����������
     * 
     * @return value
     */
    public PassengersType getPassengers() {
        return passengers;
    }

    /** 
     * Set the 'Passengers' element value. �������� � ����������
     * 
     * @param passengers
     */
    public void setPassengers(PassengersType passengers) {
        this.passengers = passengers;
    }

    /** 
     * Get the 'CrewInfo' element value. �������� �� �������
     * 
     * @return value
     */
    public CrewInfoType getCrewInfo() {
        return crewInfo;
    }

    /** 
     * Set the 'CrewInfo' element value. �������� �� �������
     * 
     * @param crewInfo
     */
    public void setCrewInfo(CrewInfoType crewInfo) {
        this.crewInfo = crewInfo;
    }

    /** 
     * Get the list of 'Consignments' element items. �������� �������� ������
     * 
     * @return list
     */
    public List<ConsignmentsType> getConsignmentList() {
        return consignmentList;
    }

    /** 
     * Set the list of 'Consignments' element items. �������� �������� ������
     * 
     * @param list
     */
    public void setConsignmentList(List<ConsignmentsType> list) {
        consignmentList = list;
    }

    /** 
     * Get the list of 'Stores' element items. �������� � ������� ��������
     * 
     * @return list
     */
    public List<StoresType> getStoreList() {
        return storeList;
    }

    /** 
     * Set the list of 'Stores' element items. �������� � ������� ��������
     * 
     * @param list
     */
    public void setStoreList(List<StoresType> list) {
        storeList = list;
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

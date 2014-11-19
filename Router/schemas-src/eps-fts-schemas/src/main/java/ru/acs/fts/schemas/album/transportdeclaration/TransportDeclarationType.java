
package ru.acs.fts.schemas.album.transportdeclaration;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ���������� ���������� �� ������������ ��������
 */
public class TransportDeclarationType extends BaseDocType
{
    private String status;
    private String storeInfo;
    private String goodsInfo;
    private String purpose;
    private String additionalInfo;
    private List<TSInfoType> TSInfoList = new ArrayList<TSInfoType>();
    private int choiceSelect = -1;
    private static final int CARRIER_CHOICE = 0;
    private static final int DATE_STAMP_LIST_CHOICE = 1;
    private CarrierType carrier;
    private List<DateStampType> dateStampList = new ArrayList<DateStampType>();
    private RouteType route;
    private CrewInfoType crewInfo;
    private PassengersType passengers;
    private OperatingEquipmentType operatingEquipment;
    private SignerType signer;
    private TDTSRegNumType TDTSOpenRegNum;
    private String documentModeID;

    /** 
     * Get the 'Status' element value. 0 - ����; 1 - �����
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. 0 - ����; 1 - �����
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'StoreInfo' element value. ������� ������� �������� � ����
     * 
     * @return value
     */
    public String getStoreInfo() {
        return storeInfo;
    }

    /** 
     * Set the 'StoreInfo' element value. ������� ������� �������� � ����
     * 
     * @param storeInfo
     */
    public void setStoreInfo(String storeInfo) {
        this.storeInfo = storeInfo;
    }

    /** 
     * Get the 'GoodsInfo' element value. ������� ������� ������� � ����
     * 
     * @return value
     */
    public String getGoodsInfo() {
        return goodsInfo;
    }

    /** 
     * Set the 'GoodsInfo' element value. ������� ������� ������� � ����
     * 
     * @param goodsInfo
     */
    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    /** 
     * Get the 'Purpose' element value. ���� �����/������ (1 - ��� ������ ������������� ��������� ������, ���������� � (���) ������ �� ���������� ����������; 2 - ��� ������ ������������� ��������� ������, ���������� � (���) ������ �� ������� ���������� ����������; 3 - ��� ���������� ������������� ��������� ������, ���������� � (���) ������ �� ���������� ����������; 4 - ��� ���������� ������������� ��������� ������, ���������� � (���) ������ �� ��������� ���������� ����������; 5 - ����)
     * 
     * @return value
     */
    public String getPurpose() {
        return purpose;
    }

    /** 
     * Set the 'Purpose' element value. ���� �����/������ (1 - ��� ������ ������������� ��������� ������, ���������� � (���) ������ �� ���������� ����������; 2 - ��� ������ ������������� ��������� ������, ���������� � (���) ������ �� ������� ���������� ����������; 3 - ��� ���������� ������������� ��������� ������, ���������� � (���) ������ �� ���������� ����������; 4 - ��� ���������� ������������� ��������� ������, ���������� � (���) ������ �� ��������� ���������� ����������; 5 - ����)
     * 
     * @param purpose
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /** 
     * Get the 'AdditionalInfo' element value. �������������� ��������
     * 
     * @return value
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /** 
     * Set the 'AdditionalInfo' element value. �������������� ��������
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /** 
     * Get the list of 'TSInfo' element items. ������������ ��������
     * 
     * @return list
     */
    public List<TSInfoType> getTSInfoList() {
        return TSInfoList;
    }

    /** 
     * Set the list of 'TSInfo' element items. ������������ ��������
     * 
     * @param list
     */
    public void setTSInfoList(List<TSInfoType> list) {
        TSInfoList = list;
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
     * Check if Carrier is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifCarrier() {
        return choiceSelect == CARRIER_CHOICE;
    }

    /** 
     * Get the 'Carrier' element value. ����, �������������� ��������� �������
     * 
     * @return value
     */
    public CarrierType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. ����, �������������� ��������� �������
     * 
     * @param carrier
     */
    public void setCarrier(CarrierType carrier) {
        setChoiceSelect(CARRIER_CHOICE);
        this.carrier = carrier;
    }

    /** 
     * Check if DateStampList is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDateStampList() {
        return choiceSelect == DATE_STAMP_LIST_CHOICE;
    }

    /** 
     * Get the list of 'DateStamp' element items. ��������, ��������� �� ����������� ��������
     * 
     * @return list
     */
    public List<DateStampType> getDateStampList() {
        return dateStampList;
    }

    /** 
     * Set the list of 'DateStamp' element items. ��������, ��������� �� ����������� ��������
     * 
     * @param list
     */
    public void setDateStampList(List<DateStampType> list) {
        setChoiceSelect(DATE_STAMP_LIST_CHOICE);
        dateStampList = list;
    }

    /** 
     * Get the 'Route' element value. �������
     * 
     * @return value
     */
    public RouteType getRoute() {
        return route;
    }

    /** 
     * Set the 'Route' element value. �������
     * 
     * @param route
     */
    public void setRoute(RouteType route) {
        this.route = route;
    }

    /** 
     * Get the 'CrewInfo' element value. ������
     * 
     * @return value
     */
    public CrewInfoType getCrewInfo() {
        return crewInfo;
    }

    /** 
     * Set the 'CrewInfo' element value. ������
     * 
     * @param crewInfo
     */
    public void setCrewInfo(CrewInfoType crewInfo) {
        this.crewInfo = crewInfo;
    }

    /** 
     * Get the 'Passengers' element value. ���������
     * 
     * @return value
     */
    public PassengersType getPassengers() {
        return passengers;
    }

    /** 
     * Set the 'Passengers' element value. ���������
     * 
     * @param passengers
     */
    public void setPassengers(PassengersType passengers) {
        this.passengers = passengers;
    }

    /** 
     * Get the 'OperatingEquipment' element value. �������� ����� � ������������
     * 
     * @return value
     */
    public OperatingEquipmentType getOperatingEquipment() {
        return operatingEquipment;
    }

    /** 
     * Set the 'OperatingEquipment' element value. �������� ����� � ������������
     * 
     * @param operatingEquipment
     */
    public void setOperatingEquipment(OperatingEquipmentType operatingEquipment) {
        this.operatingEquipment = operatingEquipment;
    }

    /** 
     * Get the 'Signer' element value. ������� ����, ����������� ��������
     * 
     * @return value
     */
    public SignerType getSigner() {
        return signer;
    }

    /** 
     * Set the 'Signer' element value. ������� ����, ����������� ��������
     * 
     * @param signer
     */
    public void setSigner(SignerType signer) {
        this.signer = signer;
    }

    /** 
     * Get the 'TDTSOpenRegNum' element value. ��������������� ����� ���� 
     * 
     * @return value
     */
    public TDTSRegNumType getTDTSOpenRegNum() {
        return TDTSOpenRegNum;
    }

    /** 
     * Set the 'TDTSOpenRegNum' element value. ��������������� ����� ���� 
     * 
     * @param TDTSOpenRegNum
     */
    public void setTDTSOpenRegNum(TDTSRegNumType TDTSOpenRegNum) {
        this.TDTSOpenRegNum = TDTSOpenRegNum;
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

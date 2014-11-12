
package ru.acs.fts.schemas.album.pi_airarrive;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ��������������� ����������� � �������� �������, ����������� ��������� �����������.
 */
public class PIAirArriveType extends BaseDocType
{
    private String MPOSign;
    private String prohobitedGoodsIndicator;
    private String numberCrewMembers;
    private String PIURN;
    private TransportMeansType transportMeans;
    private List<PersonBaseType> airCrewInfoList = new ArrayList<PersonBaseType>();
    private AirCarrierInfoType airCarrierInfo;
    private RoutingInfoType routingInfo;
    private StoresInfoType storesInfo;
    private List<SuppliesStocksDescriptionType> sparePartsInfoList = new ArrayList<SuppliesStocksDescriptionType>();
    private PassengerListType passengerList;
    private List<CargoManifestType> cargoManifestList = new ArrayList<CargoManifestType>();
    private String documentModeID;

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
     * Get the 'ProhobitedGoodsIndicator' element value. ������� ������� �������, ���� ������� �������� ��� ���������
     * 
     * @return value
     */
    public String getProhobitedGoodsIndicator() {
        return prohobitedGoodsIndicator;
    }

    /** 
     * Set the 'ProhobitedGoodsIndicator' element value. ������� ������� �������, ���� ������� �������� ��� ���������
     * 
     * @param prohobitedGoodsIndicator
     */
    public void setProhobitedGoodsIndicator(String prohobitedGoodsIndicator) {
        this.prohobitedGoodsIndicator = prohobitedGoodsIndicator;
    }

    /** 
     * Get the 'NumberCrewMembers' element value. ���������� ������ �������
     * 
     * @return value
     */
    public String getNumberCrewMembers() {
        return numberCrewMembers;
    }

    /** 
     * Set the 'NumberCrewMembers' element value. ���������� ������ �������
     * 
     * @param numberCrewMembers
     */
    public void setNumberCrewMembers(String numberCrewMembers) {
        this.numberCrewMembers = numberCrewMembers;
    }

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
     * Get the 'TransportMeans' element value. �������� � ������������ ��������
     * 
     * @return value
     */
    public TransportMeansType getTransportMeans() {
        return transportMeans;
    }

    /** 
     * Set the 'TransportMeans' element value. �������� � ������������ ��������
     * 
     * @param transportMeans
     */
    public void setTransportMeans(TransportMeansType transportMeans) {
        this.transportMeans = transportMeans;
    }

    /** 
     * Get the list of 'AirCrewInfo' element items. �������� �� ������� ���������� �����
     * 
     * @return list
     */
    public List<PersonBaseType> getAirCrewInfoList() {
        return airCrewInfoList;
    }

    /** 
     * Set the list of 'AirCrewInfo' element items. �������� �� ������� ���������� �����
     * 
     * @param list
     */
    public void setAirCrewInfoList(List<PersonBaseType> list) {
        airCrewInfoList = list;
    }

    /** 
     * Get the 'AirCarrierInfo' element value. �������� �� ���������������
     * 
     * @return value
     */
    public AirCarrierInfoType getAirCarrierInfo() {
        return airCarrierInfo;
    }

    /** 
     * Set the 'AirCarrierInfo' element value. �������� �� ���������������
     * 
     * @param airCarrierInfo
     */
    public void setAirCarrierInfo(AirCarrierInfoType airCarrierInfo) {
        this.airCarrierInfo = airCarrierInfo;
    }

    /** 
     * Get the 'RoutingInfo' element value. �������� � �������� ���������� �����
     * 
     * @return value
     */
    public RoutingInfoType getRoutingInfo() {
        return routingInfo;
    }

    /** 
     * Set the 'RoutingInfo' element value. �������� � �������� ���������� �����
     * 
     * @param routingInfo
     */
    public void setRoutingInfo(RoutingInfoType routingInfo) {
        this.routingInfo = routingInfo;
    }

    /** 
     * Get the 'StoresInfo' element value. �������� � ����������� ��������
     * 
     * @return value
     */
    public StoresInfoType getStoresInfo() {
        return storesInfo;
    }

    /** 
     * Set the 'StoresInfo' element value. �������� � ����������� ��������
     * 
     * @param storesInfo
     */
    public void setStoresInfo(StoresInfoType storesInfo) {
        this.storesInfo = storesInfo;
    }

    /** 
     * Get the list of 'SparePartsInfo' element items. �������� � ����������� ������ � ������������, ��������������� ��� ������� � ������������ ���������� �����
     * 
     * @return list
     */
    public List<SuppliesStocksDescriptionType> getSparePartsInfoList() {
        return sparePartsInfoList;
    }

    /** 
     * Set the list of 'SparePartsInfo' element items. �������� � ����������� ������ � ������������, ��������������� ��� ������� � ������������ ���������� �����
     * 
     * @param list
     */
    public void setSparePartsInfoList(List<SuppliesStocksDescriptionType> list) {
        sparePartsInfoList = list;
    }

    /** 
     * Get the 'PassengerList' element value. �������� � ����������
     * 
     * @return value
     */
    public PassengerListType getPassengerList() {
        return passengerList;
    }

    /** 
     * Set the 'PassengerList' element value. �������� � ����������
     * 
     * @param passengerList
     */
    public void setPassengerList(PassengerListType passengerList) {
        this.passengerList = passengerList;
    }

    /** 
     * Get the list of 'CargoManifest' element items. �������� �������� ������
     * 
     * @return list
     */
    public List<CargoManifestType> getCargoManifestList() {
        return cargoManifestList;
    }

    /** 
     * Set the list of 'CargoManifest' element items. �������� �������� ������
     * 
     * @param list
     */
    public void setCargoManifestList(List<CargoManifestType> list) {
        cargoManifestList = list;
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

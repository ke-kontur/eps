
package ru.acs.fts.schemas.album.passengermanifest;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AirportType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.FlightInfoType;

/** 
 * ������������ ���������
 */
public class PassengerManifestType extends BaseDocType
{
    private String listNumber;
    private LocalDate manifestDate;
    private String carrierName;
    private String carrierCode;
    private String totalPassNumber;
    private String factPassNumber;
    private String LNG;
    private String transportKind;
    private String shipName;
    private String agent;
    private String port;
    private FlightInfoType flightInfo;
    private AirportType destinationAirport;
    private PassengerCapacityType passengerCapacity;
    private List<PassengerInfoType> passengerInfoList = new ArrayList<PassengerInfoType>();
    private PersonSignatureType captainInfo;
    private String documentModeID;

    /** 
     * Get the 'ListNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getListNumber() {
        return listNumber;
    }

    /** 
     * Set the 'ListNumber' element value. ����� ���������
     * 
     * @param listNumber
     */
    public void setListNumber(String listNumber) {
        this.listNumber = listNumber;
    }

    /** 
     * Get the 'ManifestDate' element value. ���� ���������� ���������
     * 
     * @return value
     */
    public LocalDate getManifestDate() {
        return manifestDate;
    }

    /** 
     * Set the 'ManifestDate' element value. ���� ���������� ���������
     * 
     * @param manifestDate
     */
    public void setManifestDate(LocalDate manifestDate) {
        this.manifestDate = manifestDate;
    }

    /** 
     * Get the 'CarrierName' element value. ������������ �����������
     * 
     * @return value
     */
    public String getCarrierName() {
        return carrierName;
    }

    /** 
     * Set the 'CarrierName' element value. ������������ �����������
     * 
     * @param carrierName
     */
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    /** 
     * Get the 'CarrierCode' element value. �������������� ���  �����������
     * 
     * @return value
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /** 
     * Set the 'CarrierCode' element value. �������������� ���  �����������
     * 
     * @param carrierCode
     */
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    /** 
     * Get the 'TotalPassNumber' element value. ����� ��������������������
     * 
     * @return value
     */
    public String getTotalPassNumber() {
        return totalPassNumber;
    }

    /** 
     * Set the 'TotalPassNumber' element value. ����� ��������������������
     * 
     * @param totalPassNumber
     */
    public void setTotalPassNumber(String totalPassNumber) {
        this.totalPassNumber = totalPassNumber;
    }

    /** 
     * Get the 'FactPassNumber' element value. ����������� ���������� ���������� 
     * 
     * @return value
     */
    public String getFactPassNumber() {
        return factPassNumber;
    }

    /** 
     * Set the 'FactPassNumber' element value. ����������� ���������� ���������� 
     * 
     * @param factPassNumber
     */
    public void setFactPassNumber(String factPassNumber) {
        this.factPassNumber = factPassNumber;
    }

    /** 
     * Get the 'LNG' element value. ���  ����� ���������
     * 
     * @return value
     */
    public String getLNG() {
        return LNG;
    }

    /** 
     * Set the 'LNG' element value. ���  ����� ���������
     * 
     * @param LNG
     */
    public void setLNG(String LNG) {
        this.LNG = LNG;
    }

    /** 
     * Get the 'TransportKind' element value. ��� ���������� 1 - ��������� 2 - ������
     * 
     * @return value
     */
    public String getTransportKind() {
        return transportKind;
    }

    /** 
     * Set the 'TransportKind' element value. ��� ���������� 1 - ��������� 2 - ������
     * 
     * @param transportKind
     */
    public void setTransportKind(String transportKind) {
        this.transportKind = transportKind;
    }

    /** 
     * Get the 'ShipName' element value. �������� �����
     * 
     * @return value
     */
    public String getShipName() {
        return shipName;
    }

    /** 
     * Set the 'ShipName' element value. �������� �����
     * 
     * @param shipName
     */
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    /** 
     * Get the 'Agent' element value. �����
     * 
     * @return value
     */
    public String getAgent() {
        return agent;
    }

    /** 
     * Set the 'Agent' element value. �����
     * 
     * @param agent
     */
    public void setAgent(String agent) {
        this.agent = agent;
    }

    /** 
     * Get the 'Port' element value. ����
     * 
     * @return value
     */
    public String getPort() {
        return port;
    }

    /** 
     * Set the 'Port' element value. ����
     * 
     * @param port
     */
    public void setPort(String port) {
        this.port = port;
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
        this.flightInfo = flightInfo;
    }

    /** 
     * Get the 'DestinationAirport' element value. �������� ����������
     * 
     * @return value
     */
    public AirportType getDestinationAirport() {
        return destinationAirport;
    }

    /** 
     * Set the 'DestinationAirport' element value. �������� ����������
     * 
     * @param destinationAirport
     */
    public void setDestinationAirport(AirportType destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    /** 
     * Get the 'PassengerCapacity' element value. �������������������� �����
     * 
     * @return value
     */
    public PassengerCapacityType getPassengerCapacity() {
        return passengerCapacity;
    }

    /** 
     * Set the 'PassengerCapacity' element value. �������������������� �����
     * 
     * @param passengerCapacity
     */
    public void setPassengerCapacity(PassengerCapacityType passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    /** 
     * Get the list of 'PassengerInfo' element items. ���������� � ���������
     * 
     * @return list
     */
    public List<PassengerInfoType> getPassengerInfoList() {
        return passengerInfoList;
    }

    /** 
     * Set the list of 'PassengerInfo' element items. ���������� � ���������
     * 
     * @param list
     */
    public void setPassengerInfoList(List<PassengerInfoType> list) {
        passengerInfoList = list;
    }

    /** 
     * Get the 'CaptainInfo' element value. �������� � ��������
     * 
     * @return value
     */
    public PersonSignatureType getCaptainInfo() {
        return captainInfo;
    }

    /** 
     * Set the 'CaptainInfo' element value. �������� � ��������
     * 
     * @param captainInfo
     */
    public void setCaptainInfo(PersonSignatureType captainInfo) {
        this.captainInfo = captainInfo;
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

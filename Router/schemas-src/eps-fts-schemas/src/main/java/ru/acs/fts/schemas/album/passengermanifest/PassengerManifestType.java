
package ru.acs.fts.schemas.album.passengermanifest;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AirportType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.FlightInfoType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.RoutigInfoType;

/** 
 * Пассажирская ведомость
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
    private String airNationalityCode;
    private String totalCrewNumber;
    private FlightInfoType flightInfo;
    private AirportType destinationAirport;
    private PassengerCapacityType passengerCapacity;
    private List<PassengerInfoType> passengerInfoList = new ArrayList<PassengerInfoType>();
    private PersonSignatureType captainInfo;
    private List<RoutigInfoType> routingInfoList = new ArrayList<RoutigInfoType>();
    private String documentModeID;

    /** 
     * Get the 'ListNumber' element value. Номер документа
     * 
     * @return value
     */
    public String getListNumber() {
        return listNumber;
    }

    /** 
     * Set the 'ListNumber' element value. Номер документа
     * 
     * @param listNumber
     */
    public void setListNumber(String listNumber) {
        this.listNumber = listNumber;
    }

    /** 
     * Get the 'ManifestDate' element value. Дата заполнения документа
     * 
     * @return value
     */
    public LocalDate getManifestDate() {
        return manifestDate;
    }

    /** 
     * Set the 'ManifestDate' element value. Дата заполнения документа
     * 
     * @param manifestDate
     */
    public void setManifestDate(LocalDate manifestDate) {
        this.manifestDate = manifestDate;
    }

    /** 
     * Get the 'CarrierName' element value. Наименование перевозчика
     * 
     * @return value
     */
    public String getCarrierName() {
        return carrierName;
    }

    /** 
     * Set the 'CarrierName' element value. Наименование перевозчика
     * 
     * @param carrierName
     */
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    /** 
     * Get the 'CarrierCode' element value. Двухсимвольный код  перевозчика
     * 
     * @return value
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /** 
     * Set the 'CarrierCode' element value. Двухсимвольный код  перевозчика
     * 
     * @param carrierCode
     */
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    /** 
     * Get the 'TotalPassNumber' element value. Общая пассажировместимость
     * 
     * @return value
     */
    public String getTotalPassNumber() {
        return totalPassNumber;
    }

    /** 
     * Set the 'TotalPassNumber' element value. Общая пассажировместимость
     * 
     * @param totalPassNumber
     */
    public void setTotalPassNumber(String totalPassNumber) {
        this.totalPassNumber = totalPassNumber;
    }

    /** 
     * Get the 'FactPassNumber' element value. Фактическое количество пассажиров 
     * 
     * @return value
     */
    public String getFactPassNumber() {
        return factPassNumber;
    }

    /** 
     * Set the 'FactPassNumber' element value. Фактическое количество пассажиров 
     * 
     * @param factPassNumber
     */
    public void setFactPassNumber(String factPassNumber) {
        this.factPassNumber = factPassNumber;
    }

    /** 
     * Get the 'LNG' element value. Код  языка документа
     * 
     * @return value
     */
    public String getLNG() {
        return LNG;
    }

    /** 
     * Set the 'LNG' element value. Код  языка документа
     * 
     * @param LNG
     */
    public void setLNG(String LNG) {
        this.LNG = LNG;
    }

    /** 
     * Get the 'TransportKind' element value. Тип транспорта 1 - воздушный 2 - водный
     * 
     * @return value
     */
    public String getTransportKind() {
        return transportKind;
    }

    /** 
     * Set the 'TransportKind' element value. Тип транспорта 1 - воздушный 2 - водный
     * 
     * @param transportKind
     */
    public void setTransportKind(String transportKind) {
        this.transportKind = transportKind;
    }

    /** 
     * Get the 'ShipName' element value. Название судна
     * 
     * @return value
     */
    public String getShipName() {
        return shipName;
    }

    /** 
     * Set the 'ShipName' element value. Название судна
     * 
     * @param shipName
     */
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    /** 
     * Get the 'Agent' element value. Агент
     * 
     * @return value
     */
    public String getAgent() {
        return agent;
    }

    /** 
     * Set the 'Agent' element value. Агент
     * 
     * @param agent
     */
    public void setAgent(String agent) {
        this.agent = agent;
    }

    /** 
     * Get the 'Port' element value. Порт
     * 
     * @return value
     */
    public String getPort() {
        return port;
    }

    /** 
     * Set the 'Port' element value. Порт
     * 
     * @param port
     */
    public void setPort(String port) {
        this.port = port;
    }

    /** 
     * Get the 'AirNationalityCode' element value. Код страны принадлежности транспорта
     * 
     * @return value
     */
    public String getAirNationalityCode() {
        return airNationalityCode;
    }

    /** 
     * Set the 'AirNationalityCode' element value. Код страны принадлежности транспорта
     * 
     * @param airNationalityCode
     */
    public void setAirNationalityCode(String airNationalityCode) {
        this.airNationalityCode = airNationalityCode;
    }

    /** 
     * Get the 'TotalCrewNumber' element value. Количество членов экипажа
     * 
     * @return value
     */
    public String getTotalCrewNumber() {
        return totalCrewNumber;
    }

    /** 
     * Set the 'TotalCrewNumber' element value. Количество членов экипажа
     * 
     * @param totalCrewNumber
     */
    public void setTotalCrewNumber(String totalCrewNumber) {
        this.totalCrewNumber = totalCrewNumber;
    }

    /** 
     * Get the 'FlightInfo' element value. Сведения о рейсе
     * 
     * @return value
     */
    public FlightInfoType getFlightInfo() {
        return flightInfo;
    }

    /** 
     * Set the 'FlightInfo' element value. Сведения о рейсе
     * 
     * @param flightInfo
     */
    public void setFlightInfo(FlightInfoType flightInfo) {
        this.flightInfo = flightInfo;
    }

    /** 
     * Get the 'DestinationAirport' element value. Аэропорт назначения
     * 
     * @return value
     */
    public AirportType getDestinationAirport() {
        return destinationAirport;
    }

    /** 
     * Set the 'DestinationAirport' element value. Аэропорт назначения
     * 
     * @param destinationAirport
     */
    public void setDestinationAirport(AirportType destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    /** 
     * Get the 'PassengerCapacity' element value. Пассажировместимость судна
     * 
     * @return value
     */
    public PassengerCapacityType getPassengerCapacity() {
        return passengerCapacity;
    }

    /** 
     * Set the 'PassengerCapacity' element value. Пассажировместимость судна
     * 
     * @param passengerCapacity
     */
    public void setPassengerCapacity(PassengerCapacityType passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    /** 
     * Get the list of 'PassengerInfo' element items. Информация о пассажире
     * 
     * @return list
     */
    public List<PassengerInfoType> getPassengerInfoList() {
        return passengerInfoList;
    }

    /** 
     * Set the list of 'PassengerInfo' element items. Информация о пассажире
     * 
     * @param list
     */
    public void setPassengerInfoList(List<PassengerInfoType> list) {
        passengerInfoList = list;
    }

    /** 
     * Get the 'CaptainInfo' element value. Сведения о капитане
     * 
     * @return value
     */
    public PersonSignatureType getCaptainInfo() {
        return captainInfo;
    }

    /** 
     * Set the 'CaptainInfo' element value. Сведения о капитане
     * 
     * @param captainInfo
     */
    public void setCaptainInfo(PersonSignatureType captainInfo) {
        this.captainInfo = captainInfo;
    }

    /** 
     * Get the list of 'RoutingInfo' element items. Информация о маршруте
     * 
     * @return list
     */
    public List<RoutigInfoType> getRoutingInfoList() {
        return routingInfoList;
    }

    /** 
     * Set the list of 'RoutingInfo' element items. Информация о маршруте
     * 
     * @param list
     */
    public void setRoutingInfoList(List<RoutigInfoType> list) {
        routingInfoList = list;
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

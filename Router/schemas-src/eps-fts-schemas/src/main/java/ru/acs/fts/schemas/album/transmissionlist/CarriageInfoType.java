
package ru.acs.fts.schemas.album.transmissionlist;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о вагонах
 */
public class CarriageInfoType
{
    private String emptyIndicator;
    private String number;
    private String registrationCountry;
    private String dispatchCountry;
    private String destinationCountry;
    private String cargoWeight;
    private List<String> waybillNumberList = new ArrayList<String>();
    private RailwayStationType departureStation;
    private RailwayStationType destinationStation;

    /** 
     * Get the 'EmptyIndicator' element value. Признак того, что вагон является порожним
     * 
     * @return value
     */
    public String getEmptyIndicator() {
        return emptyIndicator;
    }

    /** 
     * Set the 'EmptyIndicator' element value. Признак того, что вагон является порожним
     * 
     * @param emptyIndicator
     */
    public void setEmptyIndicator(String emptyIndicator) {
        this.emptyIndicator = emptyIndicator;
    }

    /** 
     * Get the 'Number' element value. Инвентарный номер вагона
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Инвентарный номер вагона
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'RegistrationCountry' element value. Страна регистрации вагона
     * 
     * @return value
     */
    public String getRegistrationCountry() {
        return registrationCountry;
    }

    /** 
     * Set the 'RegistrationCountry' element value. Страна регистрации вагона
     * 
     * @param registrationCountry
     */
    public void setRegistrationCountry(String registrationCountry) {
        this.registrationCountry = registrationCountry;
    }

    /** 
     * Get the 'DispatchCountry' element value. Страна отправления вагона 
     * 
     * @return value
     */
    public String getDispatchCountry() {
        return dispatchCountry;
    }

    /** 
     * Set the 'DispatchCountry' element value. Страна отправления вагона 
     * 
     * @param dispatchCountry
     */
    public void setDispatchCountry(String dispatchCountry) {
        this.dispatchCountry = dispatchCountry;
    }

    /** 
     * Get the 'DestinationCountry' element value. Страна назначения вагона 
     * 
     * @return value
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. Страна назначения вагона 
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /** 
     * Get the 'CargoWeight' element value. Вес груза в вагоне, кг
     * 
     * @return value
     */
    public String getCargoWeight() {
        return cargoWeight;
    }

    /** 
     * Set the 'CargoWeight' element value. Вес груза в вагоне, кг
     * 
     * @param cargoWeight
     */
    public void setCargoWeight(String cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    /** 
     * Get the list of 'WaybillNumber' element items. Номер накладной
     * 
     * @return list
     */
    public List<String> getWaybillNumberList() {
        return waybillNumberList;
    }

    /** 
     * Set the list of 'WaybillNumber' element items. Номер накладной
     * 
     * @param list
     */
    public void setWaybillNumberList(List<String> list) {
        waybillNumberList = list;
    }

    /** 
     * Get the 'DepartureStation' element value. Станция отправления
     * 
     * @return value
     */
    public RailwayStationType getDepartureStation() {
        return departureStation;
    }

    /** 
     * Set the 'DepartureStation' element value. Станция отправления
     * 
     * @param departureStation
     */
    public void setDepartureStation(RailwayStationType departureStation) {
        this.departureStation = departureStation;
    }

    /** 
     * Get the 'DestinationStation' element value. Станция назначения
     * 
     * @return value
     */
    public RailwayStationType getDestinationStation() {
        return destinationStation;
    }

    /** 
     * Set the 'DestinationStation' element value. Станция назначения
     * 
     * @param destinationStation
     */
    public void setDestinationStation(RailwayStationType destinationStation) {
        this.destinationStation = destinationStation;
    }
}

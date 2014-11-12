
package ru.acs.fts.schemas.album.transmissionlist;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � �������
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
     * Get the 'EmptyIndicator' element value. ������� ����, ��� ����� �������� ��������
     * 
     * @return value
     */
    public String getEmptyIndicator() {
        return emptyIndicator;
    }

    /** 
     * Set the 'EmptyIndicator' element value. ������� ����, ��� ����� �������� ��������
     * 
     * @param emptyIndicator
     */
    public void setEmptyIndicator(String emptyIndicator) {
        this.emptyIndicator = emptyIndicator;
    }

    /** 
     * Get the 'Number' element value. ����������� ����� ������
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. ����������� ����� ������
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'RegistrationCountry' element value. ������ ����������� ������
     * 
     * @return value
     */
    public String getRegistrationCountry() {
        return registrationCountry;
    }

    /** 
     * Set the 'RegistrationCountry' element value. ������ ����������� ������
     * 
     * @param registrationCountry
     */
    public void setRegistrationCountry(String registrationCountry) {
        this.registrationCountry = registrationCountry;
    }

    /** 
     * Get the 'DispatchCountry' element value. ������ ����������� ������ 
     * 
     * @return value
     */
    public String getDispatchCountry() {
        return dispatchCountry;
    }

    /** 
     * Set the 'DispatchCountry' element value. ������ ����������� ������ 
     * 
     * @param dispatchCountry
     */
    public void setDispatchCountry(String dispatchCountry) {
        this.dispatchCountry = dispatchCountry;
    }

    /** 
     * Get the 'DestinationCountry' element value. ������ ���������� ������ 
     * 
     * @return value
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. ������ ���������� ������ 
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /** 
     * Get the 'CargoWeight' element value. ��� ����� � ������, ��
     * 
     * @return value
     */
    public String getCargoWeight() {
        return cargoWeight;
    }

    /** 
     * Set the 'CargoWeight' element value. ��� ����� � ������, ��
     * 
     * @param cargoWeight
     */
    public void setCargoWeight(String cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    /** 
     * Get the list of 'WaybillNumber' element items. ����� ���������
     * 
     * @return list
     */
    public List<String> getWaybillNumberList() {
        return waybillNumberList;
    }

    /** 
     * Set the list of 'WaybillNumber' element items. ����� ���������
     * 
     * @param list
     */
    public void setWaybillNumberList(List<String> list) {
        waybillNumberList = list;
    }

    /** 
     * Get the 'DepartureStation' element value. ������� �����������
     * 
     * @return value
     */
    public RailwayStationType getDepartureStation() {
        return departureStation;
    }

    /** 
     * Set the 'DepartureStation' element value. ������� �����������
     * 
     * @param departureStation
     */
    public void setDepartureStation(RailwayStationType departureStation) {
        this.departureStation = departureStation;
    }

    /** 
     * Get the 'DestinationStation' element value. ������� ����������
     * 
     * @return value
     */
    public RailwayStationType getDestinationStation() {
        return destinationStation;
    }

    /** 
     * Set the 'DestinationStation' element value. ������� ����������
     * 
     * @param destinationStation
     */
    public void setDestinationStation(RailwayStationType destinationStation) {
        this.destinationStation = destinationStation;
    }
}

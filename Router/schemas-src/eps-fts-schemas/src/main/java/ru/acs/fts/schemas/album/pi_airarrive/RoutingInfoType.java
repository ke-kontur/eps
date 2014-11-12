
package ru.acs.fts.schemas.album.pi_airarrive;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � �������� ���������� �����
 */
public class RoutingInfoType
{
    private String arrivalDateTime;
    private String plannedDateTime;
    private String departureDateTime;
    private AirportInfoType departureAirport;
    private List<AirportInfoType> interimList = new ArrayList<AirportInfoType>();
    private CountryInfoType destinationCountry;
    private CountryInfoType departureCountry;
    private AirportInfoType destinationAirport;

    /** 
     * Get the 'ArrivalDateTime' element value. ���� � ����� ��������
     * 
     * @return value
     */
    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    /** 
     * Set the 'ArrivalDateTime' element value. ���� � ����� ��������
     * 
     * @param arrivalDateTime
     */
    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    /** 
     * Get the 'PlannedDateTime' element value. ����������� ���� � ����� ��������� ������.������
     * 
     * @return value
     */
    public String getPlannedDateTime() {
        return plannedDateTime;
    }

    /** 
     * Set the 'PlannedDateTime' element value. ����������� ���� � ����� ��������� ������.������
     * 
     * @param plannedDateTime
     */
    public void setPlannedDateTime(String plannedDateTime) {
        this.plannedDateTime = plannedDateTime;
    }

    /** 
     * Get the 'DepartureDateTime' element value. ���� � ����� ������
     * 
     * @return value
     */
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    /** 
     * Set the 'DepartureDateTime' element value. ���� � ����� ������
     * 
     * @param departureDateTime
     */
    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    /** 
     * Get the 'DepartureAirport' element value. �������� �����������
     * 
     * @return value
     */
    public AirportInfoType getDepartureAirport() {
        return departureAirport;
    }

    /** 
     * Set the 'DepartureAirport' element value. �������� �����������
     * 
     * @param departureAirport
     */
    public void setDepartureAirport(AirportInfoType departureAirport) {
        this.departureAirport = departureAirport;
    }

    /** 
     * Get the list of 'Interim' element items. ��������� ��������
     * 
     * @return list
     */
    public List<AirportInfoType> getInterimList() {
        return interimList;
    }

    /** 
     * Set the list of 'Interim' element items. ��������� ��������
     * 
     * @param list
     */
    public void setInterimList(List<AirportInfoType> list) {
        interimList = list;
    }

    /** 
     * Get the 'DestinationCountry' element value. C����� ����������
     * 
     * @return value
     */
    public CountryInfoType getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. C����� ����������
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(CountryInfoType destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /** 
     * Get the 'DepartureCountry' element value. ������ �����������
     * 
     * @return value
     */
    public CountryInfoType getDepartureCountry() {
        return departureCountry;
    }

    /** 
     * Set the 'DepartureCountry' element value. ������ �����������
     * 
     * @param departureCountry
     */
    public void setDepartureCountry(CountryInfoType departureCountry) {
        this.departureCountry = departureCountry;
    }

    /** 
     * Get the 'DestinationAirport' element value. �������� ����������
     * 
     * @return value
     */
    public AirportInfoType getDestinationAirport() {
        return destinationAirport;
    }

    /** 
     * Set the 'DestinationAirport' element value. �������� ����������
     * 
     * @param destinationAirport
     */
    public void setDestinationAirport(AirportInfoType destinationAirport) {
        this.destinationAirport = destinationAirport;
    }
}

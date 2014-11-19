
package ru.acs.fts.schemas.album.goodsdecision;

import org.joda.time.LocalDate;

/** 
 * �������� � �����
 */
public class FlightInfoType
{
    private String flightNumber;
    private String mark;
    private String airPlaneRegNum;
    private LocalDate flightDate;
    private String flightTime;
    private AirportInfoType depatureAirport;
    private AirportInfoType arrivalAirport;

    /** 
     * Get the 'FlightNumber' element value. ����� �����
     * 
     * @return value
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'FlightNumber' element value. ����� �����
     * 
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /** 
     * Get the 'Mark' element value. ����� ���������� �����
     * 
     * @return value
     */
    public String getMark() {
        return mark;
    }

    /** 
     * Set the 'Mark' element value. ����� ���������� �����
     * 
     * @param mark
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /** 
     * Get the 'AirPlaneRegNum' element value. ��������������� ����� ���������� �����
     * 
     * @return value
     */
    public String getAirPlaneRegNum() {
        return airPlaneRegNum;
    }

    /** 
     * Set the 'AirPlaneRegNum' element value. ��������������� ����� ���������� �����
     * 
     * @param airPlaneRegNum
     */
    public void setAirPlaneRegNum(String airPlaneRegNum) {
        this.airPlaneRegNum = airPlaneRegNum;
    }

    /** 
     * Get the 'FlightDate' element value. ���� �����
     * 
     * @return value
     */
    public LocalDate getFlightDate() {
        return flightDate;
    }

    /** 
     * Set the 'FlightDate' element value. ���� �����
     * 
     * @param flightDate
     */
    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    /** 
     * Get the 'FlightTime' element value. ����� ������ �����
     * 
     * @return value
     */
    public String getFlightTime() {
        return flightTime;
    }

    /** 
     * Set the 'FlightTime' element value. ����� ������ �����
     * 
     * @param flightTime
     */
    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    /** 
     * Get the 'DepatureAirport' element value. �������� ������
     * 
     * @return value
     */
    public AirportInfoType getDepatureAirport() {
        return depatureAirport;
    }

    /** 
     * Set the 'DepatureAirport' element value. �������� ������
     * 
     * @param depatureAirport
     */
    public void setDepatureAirport(AirportInfoType depatureAirport) {
        this.depatureAirport = depatureAirport;
    }

    /** 
     * Get the 'ArrivalAirport' element value. �������� �������
     * 
     * @return value
     */
    public AirportInfoType getArrivalAirport() {
        return arrivalAirport;
    }

    /** 
     * Set the 'ArrivalAirport' element value. �������� �������
     * 
     * @param arrivalAirport
     */
    public void setArrivalAirport(AirportInfoType arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }
}

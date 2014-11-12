
package ru.acs.fts.schemas.album.goodsdecision;

import org.joda.time.LocalDate;

/** 
 * Сведения о рейсе
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
     * Get the 'FlightNumber' element value. Номер рейса
     * 
     * @return value
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'FlightNumber' element value. Номер рейса
     * 
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /** 
     * Get the 'Mark' element value. Марка воздушного судна
     * 
     * @return value
     */
    public String getMark() {
        return mark;
    }

    /** 
     * Set the 'Mark' element value. Марка воздушного судна
     * 
     * @param mark
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /** 
     * Get the 'AirPlaneRegNum' element value. Регистрационный номер воздушного судна
     * 
     * @return value
     */
    public String getAirPlaneRegNum() {
        return airPlaneRegNum;
    }

    /** 
     * Set the 'AirPlaneRegNum' element value. Регистрационный номер воздушного судна
     * 
     * @param airPlaneRegNum
     */
    public void setAirPlaneRegNum(String airPlaneRegNum) {
        this.airPlaneRegNum = airPlaneRegNum;
    }

    /** 
     * Get the 'FlightDate' element value. Дата рейса
     * 
     * @return value
     */
    public LocalDate getFlightDate() {
        return flightDate;
    }

    /** 
     * Set the 'FlightDate' element value. Дата рейса
     * 
     * @param flightDate
     */
    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    /** 
     * Get the 'FlightTime' element value. Время вылета рейса
     * 
     * @return value
     */
    public String getFlightTime() {
        return flightTime;
    }

    /** 
     * Set the 'FlightTime' element value. Время вылета рейса
     * 
     * @param flightTime
     */
    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    /** 
     * Get the 'DepatureAirport' element value. Аэропорт вылета
     * 
     * @return value
     */
    public AirportInfoType getDepatureAirport() {
        return depatureAirport;
    }

    /** 
     * Set the 'DepatureAirport' element value. Аэропорт вылета
     * 
     * @param depatureAirport
     */
    public void setDepatureAirport(AirportInfoType depatureAirport) {
        this.depatureAirport = depatureAirport;
    }

    /** 
     * Get the 'ArrivalAirport' element value. Аэропорт прилета
     * 
     * @return value
     */
    public AirportInfoType getArrivalAirport() {
        return arrivalAirport;
    }

    /** 
     * Set the 'ArrivalAirport' element value. Аэропорт прилета
     * 
     * @param arrivalAirport
     */
    public void setArrivalAirport(AirportInfoType arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }
}

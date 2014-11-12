
package ru.acs.fts.schemas.album.postalmanifest;

import org.joda.time.LocalDate;

/** 
 * Авиатранспорт
 */
public class AirTransportType
{
    private LocalDate sendDate;
    private String sendTime;
    private String flightNumber;
    private String directOverloadAirport;
    private String unloadAirport;

    /** 
     * Get the 'SendDate' element value. Дата отправления
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. Дата отправления
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'SendTime' element value. Время отправления
     * 
     * @return value
     */
    public String getSendTime() {
        return sendTime;
    }

    /** 
     * Set the 'SendTime' element value. Время отправления
     * 
     * @param sendTime
     */
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

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
     * Get the 'DirectOverloadAirport' element value. Аэропорт прямой перегрузки
     * 
     * @return value
     */
    public String getDirectOverloadAirport() {
        return directOverloadAirport;
    }

    /** 
     * Set the 'DirectOverloadAirport' element value. Аэропорт прямой перегрузки
     * 
     * @param directOverloadAirport
     */
    public void setDirectOverloadAirport(String directOverloadAirport) {
        this.directOverloadAirport = directOverloadAirport;
    }

    /** 
     * Get the 'UnloadAirport' element value. Аэропорт выгрузки
     * 
     * @return value
     */
    public String getUnloadAirport() {
        return unloadAirport;
    }

    /** 
     * Set the 'UnloadAirport' element value. Аэропорт выгрузки
     * 
     * @param unloadAirport
     */
    public void setUnloadAirport(String unloadAirport) {
        this.unloadAirport = unloadAirport;
    }
}

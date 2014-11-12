
package ru.acs.fts.schemas.album.transportcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Маршрут  следования
 */
public class RoutigInfoType
{
    private String numPP;
    private String carrierName;
    private String carrierCode;
    private String flightNumber;
    private LocalDate flightDate;
    private AirportType airport;

    /** 
     * Get the 'NumPP' element value. Порядковый номер записи
     * 
     * @return value
     */
    public String getNumPP() {
        return numPP;
    }

    /** 
     * Set the 'NumPP' element value. Порядковый номер записи
     * 
     * @param numPP
     */
    public void setNumPP(String numPP) {
        this.numPP = numPP;
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
     * Get the 'Airport' element value. Следующий  аэропорт
     * 
     * @return value
     */
    public AirportType getAirport() {
        return airport;
    }

    /** 
     * Set the 'Airport' element value. Следующий  аэропорт
     * 
     * @param airport
     */
    public void setAirport(AirportType airport) {
        this.airport = airport;
    }
}


package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Комплексный тип для описания подробностей для авиационного транспорта
 */
public class AviaParticularsType
{
    private String flightNumber;
    private LocalDate flightDate;

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
}


package ru.acs.fts.schemas.album.airshoppingwaybill;

import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AirportType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.FlightInfoType;

/** 
 * Описание перемещения товара
 */
public class GoodsMovementType extends FlightInfoType
{
    private String returnFlightNumber;
    private AirportType destinationAirport;

    /** 
     * Get the 'ReturnFlightNumber' element value. Обратный номер рейса
     * 
     * @return value
     */
    public String getReturnFlightNumber() {
        return returnFlightNumber;
    }

    /** 
     * Set the 'ReturnFlightNumber' element value. Обратный номер рейса
     * 
     * @param returnFlightNumber
     */
    public void setReturnFlightNumber(String returnFlightNumber) {
        this.returnFlightNumber = returnFlightNumber;
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
}


package ru.acs.fts.schemas.album.factintermediatelanding;

import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AirportType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.FlightInfoType;

/** 
 * Сведения о рейсе
 */
public class FlightType extends FlightInfoType
{
    private AirportType destinationAirport;

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

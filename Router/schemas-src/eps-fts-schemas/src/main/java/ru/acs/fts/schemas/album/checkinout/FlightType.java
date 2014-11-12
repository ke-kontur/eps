
package ru.acs.fts.schemas.album.checkinout;

import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AirportType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.FlightInfoType;

/** 
 * �������� � �����
 */
public class FlightType extends FlightInfoType
{
    private AirportType destinationAirport;

    /** 
     * Get the 'DestinationAirport' element value. �������� ���������� 
     * 
     * @return value
     */
    public AirportType getDestinationAirport() {
        return destinationAirport;
    }

    /** 
     * Set the 'DestinationAirport' element value. �������� ���������� 
     * 
     * @param destinationAirport
     */
    public void setDestinationAirport(AirportType destinationAirport) {
        this.destinationAirport = destinationAirport;
    }
}

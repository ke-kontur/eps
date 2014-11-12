
package ru.acs.fts.schemas.album.pi_airarrive;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о пассажирах
 */
public class PassengerListType
{
    private String passengers;
    private List<PassengerInfoType> passengerInfoList = new ArrayList<PassengerInfoType>();

    /** 
     * Get the 'Passengers' element value. Количество пассажиров
     * 
     * @return value
     */
    public String getPassengers() {
        return passengers;
    }

    /** 
     * Set the 'Passengers' element value. Количество пассажиров
     * 
     * @param passengers
     */
    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    /** 
     * Get the list of 'PassengerInfo' element items. Сведения о пассажире
     * 
     * @return list
     */
    public List<PassengerInfoType> getPassengerInfoList() {
        return passengerInfoList;
    }

    /** 
     * Set the list of 'PassengerInfo' element items. Сведения о пассажире
     * 
     * @param list
     */
    public void setPassengerInfoList(List<PassengerInfoType> list) {
        passengerInfoList = list;
    }
}

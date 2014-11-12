
package ru.acs.fts.schemas.album.noticeflightdeparture;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.FlightInfoType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.RoutigInfoType;

/** 
 * Сведения об убытии воздушного судна
 */
public class DepartureInfoType extends FlightInfoType
{
    private String estimatedFlightTime;
    private List<RoutigInfoType> routeInfoList = new ArrayList<RoutigInfoType>();

    /** 
     * Get the 'EstimatedFlightTime' element value. Расчетное время вылета рейса
     * 
     * @return value
     */
    public String getEstimatedFlightTime() {
        return estimatedFlightTime;
    }

    /** 
     * Set the 'EstimatedFlightTime' element value. Расчетное время вылета рейса
     * 
     * @param estimatedFlightTime
     */
    public void setEstimatedFlightTime(String estimatedFlightTime) {
        this.estimatedFlightTime = estimatedFlightTime;
    }

    /** 
     * Get the list of 'RouteInfo' element items. Маршрут следования
     * 
     * @return list
     */
    public List<RoutigInfoType> getRouteInfoList() {
        return routeInfoList;
    }

    /** 
     * Set the list of 'RouteInfo' element items. Маршрут следования
     * 
     * @param list
     */
    public void setRouteInfoList(List<RoutigInfoType> list) {
        routeInfoList = list;
    }
}

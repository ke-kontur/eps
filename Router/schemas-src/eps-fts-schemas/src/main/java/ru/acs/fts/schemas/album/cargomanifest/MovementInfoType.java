
package ru.acs.fts.schemas.album.cargomanifest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.RoutigInfoType;

/** 
 * Информация о последующем перемещении груза
 */
public class MovementInfoType
{
    private String movementPriorityCode;
    private List<RoutigInfoType> routigInfoList = new ArrayList<RoutigInfoType>();

    /** 
     * Get the 'MovementPriorityCode' element value. Приоритет
     * 
     * @return value
     */
    public String getMovementPriorityCode() {
        return movementPriorityCode;
    }

    /** 
     * Set the 'MovementPriorityCode' element value. Приоритет
     * 
     * @param movementPriorityCode
     */
    public void setMovementPriorityCode(String movementPriorityCode) {
        this.movementPriorityCode = movementPriorityCode;
    }

    /** 
     * Get the list of 'RoutigInfo' element items. Маршрут  следования
     * 
     * @return list
     */
    public List<RoutigInfoType> getRoutigInfoList() {
        return routigInfoList;
    }

    /** 
     * Set the list of 'RoutigInfo' element items. Маршрут  следования
     * 
     * @param list
     */
    public void setRoutigInfoList(List<RoutigInfoType> list) {
        routigInfoList = list;
    }
}


package ru.acs.fts.schemas.album.cargomanifest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.RoutigInfoType;

/** 
 * Сведения о перемещении контейнера
 */
public class ULDMoveInfoType
{
    private String ULDVolAvailCode;
    private List<RoutigInfoType> ULDRoutingInfoList = new ArrayList<RoutigInfoType>();

    /** 
     * Get the 'ULDVolAvailCode' element value. ULD Volume Available Code
     * 
     * @return value
     */
    public String getULDVolAvailCode() {
        return ULDVolAvailCode;
    }

    /** 
     * Set the 'ULDVolAvailCode' element value. ULD Volume Available Code
     * 
     * @param ULDVolAvailCode
     */
    public void setULDVolAvailCode(String ULDVolAvailCode) {
        this.ULDVolAvailCode = ULDVolAvailCode;
    }

    /** 
     * Get the list of 'ULDRoutingInfo' element items. Информация о маршруте контейнера
     * 
     * @return list
     */
    public List<RoutigInfoType> getULDRoutingInfoList() {
        return ULDRoutingInfoList;
    }

    /** 
     * Set the list of 'ULDRoutingInfo' element items. Информация о маршруте контейнера
     * 
     * @param list
     */
    public void setULDRoutingInfoList(List<RoutigInfoType> list) {
        ULDRoutingInfoList = list;
    }
}

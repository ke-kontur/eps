
package ru.acs.fts.schemas.album.cutir_carnet;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUTransportMeansType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * “ранспортные средства при прибытии/убытии
 */
public class CUDepartureArrivalTransportType extends CUTransportMeansType
{
    private String transportMeansQuantity;
    private List<TransportMeansBaseType> transportMeanList = new ArrayList<TransportMeansBaseType>();

    /** 
     * Get the 'TransportMeansQuantity' element value.  оличество транспортных средств
     * 
     * @return value
     */
    public String getTransportMeansQuantity() {
        return transportMeansQuantity;
    }

    /** 
     * Set the 'TransportMeansQuantity' element value.  оличество транспортных средств
     * 
     * @param transportMeansQuantity
     */
    public void setTransportMeansQuantity(String transportMeansQuantity) {
        this.transportMeansQuantity = transportMeansQuantity;
    }

    /** 
     * Get the list of 'TransportMeans' element items. ќписание транспортного средства
     * 
     * @return list
     */
    public List<TransportMeansBaseType> getTransportMeanList() {
        return transportMeanList;
    }

    /** 
     * Set the list of 'TransportMeans' element items. ќписание транспортного средства
     * 
     * @param list
     */
    public void setTransportMeanList(List<TransportMeansBaseType> list) {
        transportMeanList = list;
    }
}


package ru.acs.fts.schemas.album.actinspection;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUTransportMeansType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Описание транспортного средства
 */
public class InspTransportMeanType extends CUTransportMeansType
{
    private List<TransportMeansBaseType> transportMeanList = new ArrayList<TransportMeansBaseType>();

    /** 
     * Get the list of 'TransportMeans' element items. Транспортные  средства
     * 
     * @return list
     */
    public List<TransportMeansBaseType> getTransportMeanList() {
        return transportMeanList;
    }

    /** 
     * Set the list of 'TransportMeans' element items. Транспортные  средства
     * 
     * @param list
     */
    public void setTransportMeanList(List<TransportMeansBaseType> list) {
        transportMeanList = list;
    }
}

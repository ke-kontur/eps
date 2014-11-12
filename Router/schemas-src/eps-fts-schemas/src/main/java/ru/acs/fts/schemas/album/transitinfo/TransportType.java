
package ru.acs.fts.schemas.album.transitinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUTransportMeansType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Транспортное средство
 */
public class TransportType extends CUTransportMeansType
{
    private List<TransportMeansBaseType> transportMeanList = new ArrayList<TransportMeansBaseType>();

    /** 
     * Get the list of 'TransportMeans' element items. Описание транспортного средства
     * 
     * @return list
     */
    public List<TransportMeansBaseType> getTransportMeanList() {
        return transportMeanList;
    }

    /** 
     * Set the list of 'TransportMeans' element items. Описание транспортного средства
     * 
     * @param list
     */
    public void setTransportMeanList(List<TransportMeansBaseType> list) {
        transportMeanList = list;
    }
}

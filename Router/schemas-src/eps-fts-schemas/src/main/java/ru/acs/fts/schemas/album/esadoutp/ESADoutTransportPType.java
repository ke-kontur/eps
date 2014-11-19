
package ru.acs.fts.schemas.album.esadoutp;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUTransportMeansType;

/** 
 * Сведения о транспортных средствах
 */
public class ESADoutTransportPType extends CUTransportMeansType
{
    private List<TransportMeansType> transportMeanList = new ArrayList<TransportMeansType>();

    /** 
     * Get the list of 'TransportMeans' element items. Сведения о транспортных средствах
     * 
     * @return list
     */
    public List<TransportMeansType> getTransportMeanList() {
        return transportMeanList;
    }

    /** 
     * Set the list of 'TransportMeans' element items. Сведения о транспортных средствах
     * 
     * @param list
     */
    public void setTransportMeanList(List<TransportMeansType> list) {
        transportMeanList = list;
    }
}

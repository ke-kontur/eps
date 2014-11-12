
package ru.acs.fts.schemas.album.instrinspection;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ContainerNumberType;

/** 
 * Транспортные средства/контейнеры
 */
public class InspTransportMeansType
{
    private TransportMeansType transportMeans;
    private List<ContainerNumberType> inspContainerList = new ArrayList<ContainerNumberType>();

    /** 
     * Get the 'TransportMeans' element value. Сведения о транспортном средстве
     * 
     * @return value
     */
    public TransportMeansType getTransportMeans() {
        return transportMeans;
    }

    /** 
     * Set the 'TransportMeans' element value. Сведения о транспортном средстве
     * 
     * @param transportMeans
     */
    public void setTransportMeans(TransportMeansType transportMeans) {
        this.transportMeans = transportMeans;
    }

    /** 
     * Get the list of 'InspContainer' element items. Сведения о контейнерах
     * 
     * @return list
     */
    public List<ContainerNumberType> getInspContainerList() {
        return inspContainerList;
    }

    /** 
     * Set the list of 'InspContainer' element items. Сведения о контейнерах
     * 
     * @param list
     */
    public void setInspContainerList(List<ContainerNumberType> list) {
        inspContainerList = list;
    }
}

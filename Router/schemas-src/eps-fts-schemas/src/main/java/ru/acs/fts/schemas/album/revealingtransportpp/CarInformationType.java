
package ru.acs.fts.schemas.album.revealingtransportpp;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUTransportMeansType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Сведения об автомобильном транспорте
 */
public class CarInformationType extends CUTransportMeansType
{
    private List<TransportMeansBaseType> transportMeansBaseList = new ArrayList<TransportMeansBaseType>();

    /** 
     * Get the list of 'TransportMeansBase' element items. Базовый тип для описания транспортного средства в таможенных документах.
     * 
     * @return list
     */
    public List<TransportMeansBaseType> getTransportMeansBaseList() {
        return transportMeansBaseList;
    }

    /** 
     * Set the list of 'TransportMeansBase' element items. Базовый тип для описания транспортного средства в таможенных документах.
     * 
     * @param list
     */
    public void setTransportMeansBaseList(List<TransportMeansBaseType> list) {
        transportMeansBaseList = list;
    }
}


package ru.acs.fts.schemas.album.revealingtransportpi;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.TransportMeansType;

/** 
 * Сведения об автомобильном транспорте
 */
public class CarInformationType
{
    private String TIRHolder;
    private List<TransportMeansType> transportMeanList = new ArrayList<TransportMeansType>();

    /** 
     * Get the 'TIRHolder' element value. Идентификационный номер держателя книжки МДП
     * 
     * @return value
     */
    public String getTIRHolder() {
        return TIRHolder;
    }

    /** 
     * Set the 'TIRHolder' element value. Идентификационный номер держателя книжки МДП
     * 
     * @param TIRHolder
     */
    public void setTIRHolder(String TIRHolder) {
        this.TIRHolder = TIRHolder;
    }

    /** 
     * Get the list of 'TransportMeans' element items. Базовый тип для описания транспортного средства в таможенных документах.
     * 
     * @return list
     */
    public List<TransportMeansType> getTransportMeanList() {
        return transportMeanList;
    }

    /** 
     * Set the list of 'TransportMeans' element items. Базовый тип для описания транспортного средства в таможенных документах.
     * 
     * @param list
     */
    public void setTransportMeanList(List<TransportMeansType> list) {
        transportMeanList = list;
    }
}

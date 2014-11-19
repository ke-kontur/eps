
package ru.acs.fts.schemas.album.measuringprotocol;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения об измерениях объема штабеля круглых лесоматериалов, погруженных в (на) вагоны (автомобили)
 */
public class MeasuringTransportLogsType
{
    private String transportType;
    private String transportIdentifier;
    private List<PileMeasuringInfoType> pileMeasuringInfoList = new ArrayList<PileMeasuringInfoType>();

    /** 
     * Get the 'TransportType' element value. Тип транспортного средства: 1 - вагон; 2 - автомобиль; 3 - прицеп
     * 
     * @return value
     */
    public String getTransportType() {
        return transportType;
    }

    /** 
     * Set the 'TransportType' element value. Тип транспортного средства: 1 - вагон; 2 - автомобиль; 3 - прицеп
     * 
     * @param transportType
     */
    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    /** 
     * Get the 'TransportIdentifier' element value. Номер транспортного средства
     * 
     * @return value
     */
    public String getTransportIdentifier() {
        return transportIdentifier;
    }

    /** 
     * Set the 'TransportIdentifier' element value. Номер транспортного средства
     * 
     * @param transportIdentifier
     */
    public void setTransportIdentifier(String transportIdentifier) {
        this.transportIdentifier = transportIdentifier;
    }

    /** 
     * Get the list of 'PileMeasuringInfo' element items. Результаты измерений штабеля
     * 
     * @return list
     */
    public List<PileMeasuringInfoType> getPileMeasuringInfoList() {
        return pileMeasuringInfoList;
    }

    /** 
     * Set the list of 'PileMeasuringInfo' element items. Результаты измерений штабеля
     * 
     * @param list
     */
    public void setPileMeasuringInfoList(List<PileMeasuringInfoType> list) {
        pileMeasuringInfoList = list;
    }
}

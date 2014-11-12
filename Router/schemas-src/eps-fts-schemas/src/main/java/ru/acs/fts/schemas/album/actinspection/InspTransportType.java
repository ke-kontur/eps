
package ru.acs.fts.schemas.album.actinspection;

/** 
 * Сведения о транспортных  средствах
 */
public class InspTransportType
{
    private String arriveMode;
    private InspTransportMeanType inspTransportMean;
    private ContainerType containerInfo;

    /** 
     * Get the 'ArriveMode' element value. Транспортное средство (транспортные средства) прибыло (и) в качестве товара: "1" - на транспортном средстве, "2" - в контейнере(ах), "3" - своим ходом
     * 
     * @return value
     */
    public String getArriveMode() {
        return arriveMode;
    }

    /** 
     * Set the 'ArriveMode' element value. Транспортное средство (транспортные средства) прибыло (и) в качестве товара: "1" - на транспортном средстве, "2" - в контейнере(ах), "3" - своим ходом
     * 
     * @param arriveMode
     */
    public void setArriveMode(String arriveMode) {
        this.arriveMode = arriveMode;
    }

    /** 
     * Get the 'InspTransportMean' element value. Описание транспортного средства
     * 
     * @return value
     */
    public InspTransportMeanType getInspTransportMean() {
        return inspTransportMean;
    }

    /** 
     * Set the 'InspTransportMean' element value. Описание транспортного средства
     * 
     * @param inspTransportMean
     */
    public void setInspTransportMean(InspTransportMeanType inspTransportMean) {
        this.inspTransportMean = inspTransportMean;
    }

    /** 
     * Get the 'ContainerInfo' element value. Сведения о контейнерах.
     * 
     * @return value
     */
    public ContainerType getContainerInfo() {
        return containerInfo;
    }

    /** 
     * Set the 'ContainerInfo' element value. Сведения о контейнерах.
     * 
     * @param containerInfo
     */
    public void setContainerInfo(ContainerType containerInfo) {
        this.containerInfo = containerInfo;
    }
}

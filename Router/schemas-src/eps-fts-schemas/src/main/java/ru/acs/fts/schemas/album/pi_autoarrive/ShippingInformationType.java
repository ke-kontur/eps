
package ru.acs.fts.schemas.album.pi_autoarrive;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.CountryInformationType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.TransportMeansType;

/** 
 * Информация о перевозке груза
 */
public class ShippingInformationType
{
    private String containerIndicator;
    private List<TransportMeansType> borderTransportList = new ArrayList<TransportMeansType>();
    private CountryInformationType dispatchCountry;
    private CountryInformationType destinationCountry;

    /** 
     * Get the 'ContainerIndicator' element value. Признак контейнерной перевозки
     * 
     * @return value
     */
    public String getContainerIndicator() {
        return containerIndicator;
    }

    /** 
     * Set the 'ContainerIndicator' element value. Признак контейнерной перевозки
     * 
     * @param containerIndicator
     */
    public void setContainerIndicator(String containerIndicator) {
        this.containerIndicator = containerIndicator;
    }

    /** 
     * Get the list of 'BorderTransport' element items. Транспортное средство
     * 
     * @return list
     */
    public List<TransportMeansType> getBorderTransportList() {
        return borderTransportList;
    }

    /** 
     * Set the list of 'BorderTransport' element items. Транспортное средство
     * 
     * @param list
     */
    public void setBorderTransportList(List<TransportMeansType> list) {
        borderTransportList = list;
    }

    /** 
     * Get the 'DispatchCountry' element value. Страна отправления товаров
     * 
     * @return value
     */
    public CountryInformationType getDispatchCountry() {
        return dispatchCountry;
    }

    /** 
     * Set the 'DispatchCountry' element value. Страна отправления товаров
     * 
     * @param dispatchCountry
     */
    public void setDispatchCountry(CountryInformationType dispatchCountry) {
        this.dispatchCountry = dispatchCountry;
    }

    /** 
     * Get the 'DestinationCountry' element value. Страна назначения товаров
     * 
     * @return value
     */
    public CountryInformationType getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. Страна назначения товаров
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(CountryInformationType destinationCountry) {
        this.destinationCountry = destinationCountry;
    }
}

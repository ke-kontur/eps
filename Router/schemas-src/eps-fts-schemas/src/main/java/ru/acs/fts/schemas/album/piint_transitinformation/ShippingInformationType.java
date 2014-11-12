
package ru.acs.fts.schemas.album.piint_transitinformation;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.CountryInformationType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.GuaranteeType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.ReloadingInfoType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.TransitRouteType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.TransportMeansType;

/** 
 * Информация о перевозке груза
 */
public class ShippingInformationType
{
    private String containerIndicator;
    private LocalDate dateLimit;
    private CustomsType dispatchCustoms;
    private List<TransportMeansType> borderTransportList = new ArrayList<TransportMeansType>();
    private List<GuaranteeType> guaranteeList = new ArrayList<GuaranteeType>();
    private CountryInformationType destinationCountry;
    private List<ReloadingInfoType> reloadingInfoList = new ArrayList<ReloadingInfoType>();
    private CountryInformationType dispatchCountry;
    private List<TransitRouteType> transitRouteList = new ArrayList<TransitRouteType>();
    private DestinationType destination;

    /** 
     * Get the 'ContainerIndicator' element value. Признак контейнерных перевозок: да/нет
     * 
     * @return value
     */
    public String getContainerIndicator() {
        return containerIndicator;
    }

    /** 
     * Set the 'ContainerIndicator' element value. Признак контейнерных перевозок: да/нет
     * 
     * @param containerIndicator
     */
    public void setContainerIndicator(String containerIndicator) {
        this.containerIndicator = containerIndicator;
    }

    /** 
     * Get the 'DateLimit' element value. Планируемый срок перевозки товаров
     * 
     * @return value
     */
    public LocalDate getDateLimit() {
        return dateLimit;
    }

    /** 
     * Set the 'DateLimit' element value. Планируемый срок перевозки товаров
     * 
     * @param dateLimit
     */
    public void setDateLimit(LocalDate dateLimit) {
        this.dateLimit = dateLimit;
    }

    /** 
     * Get the 'DispatchCustoms' element value. Таможня отправления
     * 
     * @return value
     */
    public CustomsType getDispatchCustoms() {
        return dispatchCustoms;
    }

    /** 
     * Set the 'DispatchCustoms' element value. Таможня отправления
     * 
     * @param dispatchCustoms
     */
    public void setDispatchCustoms(CustomsType dispatchCustoms) {
        this.dispatchCustoms = dispatchCustoms;
    }

    /** 
     * Get the list of 'BorderTransport' element items. Транспортное средство на границе.
     * 
     * @return list
     */
    public List<TransportMeansType> getBorderTransportList() {
        return borderTransportList;
    }

    /** 
     * Set the list of 'BorderTransport' element items. Транспортное средство на границе.
     * 
     * @param list
     */
    public void setBorderTransportList(List<TransportMeansType> list) {
        borderTransportList = list;
    }

    /** 
     * Get the list of 'Guarantee' element items. Гарантия, меры обеспечения
     * 
     * @return list
     */
    public List<GuaranteeType> getGuaranteeList() {
        return guaranteeList;
    }

    /** 
     * Set the list of 'Guarantee' element items. Гарантия, меры обеспечения
     * 
     * @param list
     */
    public void setGuaranteeList(List<GuaranteeType> list) {
        guaranteeList = list;
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

    /** 
     * Get the list of 'ReloadingInfo' element items. Информация о планируемых перегрузках товаров или других грузовых операциях в пути
     * 
     * @return list
     */
    public List<ReloadingInfoType> getReloadingInfoList() {
        return reloadingInfoList;
    }

    /** 
     * Set the list of 'ReloadingInfo' element items. Информация о планируемых перегрузках товаров или других грузовых операциях в пути
     * 
     * @param list
     */
    public void setReloadingInfoList(List<ReloadingInfoType> list) {
        reloadingInfoList = list;
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
     * Get the list of 'TransitRoute' element items. Маршрут транзита
     * 
     * @return list
     */
    public List<TransitRouteType> getTransitRouteList() {
        return transitRouteList;
    }

    /** 
     * Set the list of 'TransitRoute' element items. Маршрут транзита
     * 
     * @param list
     */
    public void setTransitRouteList(List<TransitRouteType> list) {
        transitRouteList = list;
    }

    /** 
     * Get the 'Destination' element value. Пункт назначения товаров
     * 
     * @return value
     */
    public DestinationType getDestination() {
        return destination;
    }

    /** 
     * Set the 'Destination' element value. Пункт назначения товаров
     * 
     * @param destination
     */
    public void setDestination(DestinationType destination) {
        this.destination = destination;
    }
}

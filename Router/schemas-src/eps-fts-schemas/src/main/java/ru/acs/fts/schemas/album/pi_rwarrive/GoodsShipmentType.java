
package ru.acs.fts.schemas.album.pi_rwarrive;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.CountryInformationType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.PIGoodsType;

/** 
 * Товарная партия
 */
public class GoodsShipmentType
{
    private List<String> wagonNumberList = new ArrayList<String>();
    private String departureStation;
    private String containerIndicator;
    private String SMGSNumber;
    private String destinationStation;
    private LocalDate dateExpectedArrival;
    private String timeExpectedArrival;
    private List<PIGoodsType> goodList = new ArrayList<PIGoodsType>();
    private OrganizationType consignor;
    private OrganizationType consignee;
    private PIoutDestinationType PIoutDestination;
    private CountryInformationType destinationCountry;
    private CountryInformationType dispatchCountry;
    private CUCustomsType borderCustoms;

    /** 
     * Get the list of 'WagonNumbers' element items. Номера вагонов. Может не заполняться, если для товарной партии указан признак контейнерной перевозки
     * 
     * @return list
     */
    public List<String> getWagonNumberList() {
        return wagonNumberList;
    }

    /** 
     * Set the list of 'WagonNumbers' element items. Номера вагонов. Может не заполняться, если для товарной партии указан признак контейнерной перевозки
     * 
     * @param list
     */
    public void setWagonNumberList(List<String> list) {
        wagonNumberList = list;
    }

    /** 
     * Get the 'DepartureStation' element value. Станция отправления 
     * 
     * @return value
     */
    public String getDepartureStation() {
        return departureStation;
    }

    /** 
     * Set the 'DepartureStation' element value. Станция отправления 
     * 
     * @param departureStation
     */
    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    /** 
     * Get the 'ContainerIndicator' element value. Признак контейнерной перевозки для товарной партии: да/нет
     * 
     * @return value
     */
    public String getContainerIndicator() {
        return containerIndicator;
    }

    /** 
     * Set the 'ContainerIndicator' element value. Признак контейнерной перевозки для товарной партии: да/нет
     * 
     * @param containerIndicator
     */
    public void setContainerIndicator(String containerIndicator) {
        this.containerIndicator = containerIndicator;
    }

    /** 
     * Get the 'SMGSNumber' element value. Номер СМГС
     * 
     * @return value
     */
    public String getSMGSNumber() {
        return SMGSNumber;
    }

    /** 
     * Set the 'SMGSNumber' element value. Номер СМГС
     * 
     * @param SMGSNumber
     */
    public void setSMGSNumber(String SMGSNumber) {
        this.SMGSNumber = SMGSNumber;
    }

    /** 
     * Get the 'DestinationStation' element value. Cтанция назначения 
     * 
     * @return value
     */
    public String getDestinationStation() {
        return destinationStation;
    }

    /** 
     * Set the 'DestinationStation' element value. Cтанция назначения 
     * 
     * @param destinationStation
     */
    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    /** 
     * Get the 'DateExpectedArrival' element value. Дата ожидаемого прибытия товаров и транспортных средств в пограничный пункт пропуска
     * 
     * @return value
     */
    public LocalDate getDateExpectedArrival() {
        return dateExpectedArrival;
    }

    /** 
     * Set the 'DateExpectedArrival' element value. Дата ожидаемого прибытия товаров и транспортных средств в пограничный пункт пропуска
     * 
     * @param dateExpectedArrival
     */
    public void setDateExpectedArrival(LocalDate dateExpectedArrival) {
        this.dateExpectedArrival = dateExpectedArrival;
    }

    /** 
     * Get the 'TimeExpectedArrival' element value. Время ожидаемого прибытия товаров и транспортных средств в пограничный пункт пропуска
     * 
     * @return value
     */
    public String getTimeExpectedArrival() {
        return timeExpectedArrival;
    }

    /** 
     * Set the 'TimeExpectedArrival' element value. Время ожидаемого прибытия товаров и транспортных средств в пограничный пункт пропуска
     * 
     * @param timeExpectedArrival
     */
    public void setTimeExpectedArrival(String timeExpectedArrival) {
        this.timeExpectedArrival = timeExpectedArrival;
    }

    /** 
     * Get the list of 'Goods' element items. Товар
     * 
     * @return list
     */
    public List<PIGoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Товар
     * 
     * @param list
     */
    public void setGoodList(List<PIGoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'Consignor' element value. Сведения об отправителе
     * 
     * @return value
     */
    public OrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Сведения об отправителе
     * 
     * @param consignor
     */
    public void setConsignor(OrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. Сведения о получателе
     * 
     * @return value
     */
    public OrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Сведения о получателе
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'PIoutDestination' element value. Пункт назначения товаров
     * 
     * @return value
     */
    public PIoutDestinationType getPIoutDestination() {
        return PIoutDestination;
    }

    /** 
     * Set the 'PIoutDestination' element value. Пункт назначения товаров
     * 
     * @param PIoutDestination
     */
    public void setPIoutDestination(PIoutDestinationType PIoutDestination) {
        this.PIoutDestination = PIoutDestination;
    }

    /** 
     * Get the 'DestinationCountry' element value. Страна прибытия товаров
     * 
     * @return value
     */
    public CountryInformationType getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. Страна прибытия товаров
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(CountryInformationType destinationCountry) {
        this.destinationCountry = destinationCountry;
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
     * Get the 'BorderCustoms' element value. Таможенный орган (пограничный пункт пропуска), в который ожидается прибытие товаров и транспортных средств.
     * 
     * @return value
     */
    public CUCustomsType getBorderCustoms() {
        return borderCustoms;
    }

    /** 
     * Set the 'BorderCustoms' element value. Таможенный орган (пограничный пункт пропуска), в который ожидается прибытие товаров и транспортных средств.
     * 
     * @param borderCustoms
     */
    public void setBorderCustoms(CUCustomsType borderCustoms) {
        this.borderCustoms = borderCustoms;
    }
}

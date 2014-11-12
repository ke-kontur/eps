
package ru.acs.fts.schemas.album.esadin;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUConsigmentType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADReloadingInfoType;

/** 
 * ДТ и ТД. Внутренний формат. Сведения о перевозке товаров гр. 15, 15а, 17,17а, 18, 19, 21, 25, 26, 29
 */
public class ESADinConsigmentType extends CUConsigmentType
{
    private LocalDate dateExpectedArrival;
    private String timeExpectedArrival;
    private ESADinDepartureArrivalTransportType ESADinDepartureArrivalTransport;
    private ESADinBorderTransportType ESADinBorderTransportMeans;
    private List<ESADReloadingInfoType> ESADinReloadingInfoList = new ArrayList<ESADReloadingInfoType>();
    private CUCustomsType deliveryCustomsOffice;
    private CUCustomsType PPBorderCustoms;

    /** 
     * Get the 'DateExpectedArrival' element value. Дата ожидаемого прибытия товаров и транспортных средств в пограничный пункт пропуска. ТД
     * 
     * @return value
     */
    public LocalDate getDateExpectedArrival() {
        return dateExpectedArrival;
    }

    /** 
     * Set the 'DateExpectedArrival' element value. Дата ожидаемого прибытия товаров и транспортных средств в пограничный пункт пропуска. ТД
     * 
     * @param dateExpectedArrival
     */
    public void setDateExpectedArrival(LocalDate dateExpectedArrival) {
        this.dateExpectedArrival = dateExpectedArrival;
    }

    /** 
     * Get the 'TimeExpectedArrival' element value. Время ожидаемого прибытия товаров и транспортных средств в пограничный пункт пропуска. ТД
     * 
     * @return value
     */
    public String getTimeExpectedArrival() {
        return timeExpectedArrival;
    }

    /** 
     * Set the 'TimeExpectedArrival' element value. Время ожидаемого прибытия товаров и транспортных средств в пограничный пункт пропуска. ТД
     * 
     * @param timeExpectedArrival
     */
    public void setTimeExpectedArrival(String timeExpectedArrival) {
        this.timeExpectedArrival = timeExpectedArrival;
    }

    /** 
     * Get the 'ESADinDepartureArrivalTransport' element value. ДТ и ТД. Внутренний формат. Транспортные средства при прибытии/убытии. Гр. 18, 26 ДТ
     * 
     * @return value
     */
    public ESADinDepartureArrivalTransportType getESADinDepartureArrivalTransport() {
        return ESADinDepartureArrivalTransport;
    }

    /** 
     * Set the 'ESADinDepartureArrivalTransport' element value. ДТ и ТД. Внутренний формат. Транспортные средства при прибытии/убытии. Гр. 18, 26 ДТ
     * 
     * @param ESADinDepartureArrivalTransport
     */
    public void setESADinDepartureArrivalTransport(
            ESADinDepartureArrivalTransportType ESADinDepartureArrivalTransport) {
        this.ESADinDepartureArrivalTransport = ESADinDepartureArrivalTransport;
    }

    /** 
     * Get the 'ESADinBorderTransportMeans' element value. ДТ и ТД. Внутренний формат. Транспортные средства на границе. Гр. 21, 25 ДТ
     * 
     * @return value
     */
    public ESADinBorderTransportType getESADinBorderTransportMeans() {
        return ESADinBorderTransportMeans;
    }

    /** 
     * Set the 'ESADinBorderTransportMeans' element value. ДТ и ТД. Внутренний формат. Транспортные средства на границе. Гр. 21, 25 ДТ
     * 
     * @param ESADinBorderTransportMeans
     */
    public void setESADinBorderTransportMeans(
            ESADinBorderTransportType ESADinBorderTransportMeans) {
        this.ESADinBorderTransportMeans = ESADinBorderTransportMeans;
    }

    /** 
     * Get the list of 'ESADinReloadingInfo' element items. Информация о перегрузке товаров. Гр. 55 ТД
     * 
     * @return list
     */
    public List<ESADReloadingInfoType> getESADinReloadingInfoList() {
        return ESADinReloadingInfoList;
    }

    /** 
     * Set the list of 'ESADinReloadingInfo' element items. Информация о перегрузке товаров. Гр. 55 ТД
     * 
     * @param list
     */
    public void setESADinReloadingInfoList(List<ESADReloadingInfoType> list) {
        ESADinReloadingInfoList = list;
    }

    /** 
     * Get the 'DeliveryCustomsOffice' element value. Таможенный орган назначения при транзите.гр.53 ТД
     * 
     * @return value
     */
    public CUCustomsType getDeliveryCustomsOffice() {
        return deliveryCustomsOffice;
    }

    /** 
     * Set the 'DeliveryCustomsOffice' element value. Таможенный орган назначения при транзите.гр.53 ТД
     * 
     * @param deliveryCustomsOffice
     */
    public void setDeliveryCustomsOffice(CUCustomsType deliveryCustomsOffice) {
        this.deliveryCustomsOffice = deliveryCustomsOffice;
    }

    /** 
     * Get the 'PPBorderCustoms' element value. Таможенный орган (пограничный пункт пропуска), в который ожидается прибытие товаров и транспортных средств
     * 
     * @return value
     */
    public CUCustomsType getPPBorderCustoms() {
        return PPBorderCustoms;
    }

    /** 
     * Set the 'PPBorderCustoms' element value. Таможенный орган (пограничный пункт пропуска), в который ожидается прибытие товаров и транспортных средств
     * 
     * @param PPBorderCustoms
     */
    public void setPPBorderCustoms(CUCustomsType PPBorderCustoms) {
        this.PPBorderCustoms = PPBorderCustoms;
    }
}

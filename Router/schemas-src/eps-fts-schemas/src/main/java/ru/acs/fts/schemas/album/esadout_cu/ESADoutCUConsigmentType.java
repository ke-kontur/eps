
package ru.acs.fts.schemas.album.esadout_cu;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUConsigmentType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADReloadingInfoType;

/** 
 * Сведения о перевозке товаров. Гр. 15, 15а, 17,17а, 18, 19, 21, 25, 26, 29  -ДТ/ Гр. 15, 17, 18, 19, 21, 25, 26, 29 , 53, 55- ТД
 */
public class ESADoutCUConsigmentType extends CUConsigmentType
{
    private LocalDate dateExpectedArrival;
    private String timeExpectedArrival;
    private ESADoutCUDepartureArrivalTransportType ESADoutCUDepartureArrivalTransport;
    private ESADoutCUBorderTransportType ESADoutCUBorderTransport;
    private List<ESADReloadingInfoType> ESADoutCUReloadingInfoList = new ArrayList<ESADReloadingInfoType>();
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
     * Get the 'ESADout_CUDepartureArrivalTransport' element value. Транспортные средства при прибытии/убытии. Гр. 18, 26
     * 
     * @return value
     */
    public ESADoutCUDepartureArrivalTransportType getESADoutCUDepartureArrivalTransport() {
        return ESADoutCUDepartureArrivalTransport;
    }

    /** 
     * Set the 'ESADout_CUDepartureArrivalTransport' element value. Транспортные средства при прибытии/убытии. Гр. 18, 26
     * 
     * @param ESADoutCUDepartureArrivalTransport
     */
    public void setESADoutCUDepartureArrivalTransport(
            ESADoutCUDepartureArrivalTransportType ESADoutCUDepartureArrivalTransport) {
        this.ESADoutCUDepartureArrivalTransport = ESADoutCUDepartureArrivalTransport;
    }

    /** 
     * Get the 'ESADout_CUBorderTransport' element value. Транспортные средства на границе. Гр. 21, 25 ДТ
     * 
     * @return value
     */
    public ESADoutCUBorderTransportType getESADoutCUBorderTransport() {
        return ESADoutCUBorderTransport;
    }

    /** 
     * Set the 'ESADout_CUBorderTransport' element value. Транспортные средства на границе. Гр. 21, 25 ДТ
     * 
     * @param ESADoutCUBorderTransport
     */
    public void setESADoutCUBorderTransport(
            ESADoutCUBorderTransportType ESADoutCUBorderTransport) {
        this.ESADoutCUBorderTransport = ESADoutCUBorderTransport;
    }

    /** 
     * Get the list of 'ESADout_CUReloadingInfo' element items. Информация о перегрузке товаров. Гр. 55 ТД
     * 
     * @return list
     */
    public List<ESADReloadingInfoType> getESADoutCUReloadingInfoList() {
        return ESADoutCUReloadingInfoList;
    }

    /** 
     * Set the list of 'ESADout_CUReloadingInfo' element items. Информация о перегрузке товаров. Гр. 55 ТД
     * 
     * @param list
     */
    public void setESADoutCUReloadingInfoList(List<ESADReloadingInfoType> list) {
        ESADoutCUReloadingInfoList = list;
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

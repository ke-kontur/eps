
package ru.acs.fts.schemas.album.tir_carnet;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust.IdentityMarkType;
import ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust.TIRDestinationType;

/** 
 * Сведения о товарной партии
 */
public class TIRShipmentType
{
    private String goodsPlaceID;
    private List<String> containerIDList = new ArrayList<String>();
    private String totalPlacesQuantity;
    private String departureCustomsOffice;
    private String unloadMark;
    private PersonType consignor;
    private PersonType consignee;
    private TIRDestinationType destination;
    private List<TIRGoodsType> goodList = new ArrayList<TIRGoodsType>();
    private List<IdentityMarkType> identityMarkList = new ArrayList<IdentityMarkType>();
    private TIRCustomsPersonType identityCustPerson;
    private UnloadCustomSignType unloadCustoms;

    /** 
     * Get the 'GoodsPlaceID' element value. Опознавательные знаки, номера грузовых  мест или предметов
     * 
     * @return value
     */
    public String getGoodsPlaceID() {
        return goodsPlaceID;
    }

    /** 
     * Set the 'GoodsPlaceID' element value. Опознавательные знаки, номера грузовых  мест или предметов
     * 
     * @param goodsPlaceID
     */
    public void setGoodsPlaceID(String goodsPlaceID) {
        this.goodsPlaceID = goodsPlaceID;
    }

    /** 
     * Get the list of 'ContainerID' element items. Номер контейнера.
     * 
     * @return list
     */
    public List<String> getContainerIDList() {
        return containerIDList;
    }

    /** 
     * Set the list of 'ContainerID' element items. Номер контейнера.
     * 
     * @param list
     */
    public void setContainerIDList(List<String> list) {
        containerIDList = list;
    }

    /** 
     * Get the 'TotalPlacesQuantity' element value. Общее число грузовых  мест
     * 
     * @return value
     */
    public String getTotalPlacesQuantity() {
        return totalPlacesQuantity;
    }

    /** 
     * Set the 'TotalPlacesQuantity' element value. Общее число грузовых  мест
     * 
     * @param totalPlacesQuantity
     */
    public void setTotalPlacesQuantity(String totalPlacesQuantity) {
        this.totalPlacesQuantity = totalPlacesQuantity;
    }

    /** 
     * Get the 'DepartureCustomsOffice' element value. Наименование таможенного органа отправления
     * 
     * @return value
     */
    public String getDepartureCustomsOffice() {
        return departureCustomsOffice;
    }

    /** 
     * Set the 'DepartureCustomsOffice' element value. Наименование таможенного органа отправления
     * 
     * @param departureCustomsOffice
     */
    public void setDepartureCustomsOffice(String departureCustomsOffice) {
        this.departureCustomsOffice = departureCustomsOffice;
    }

    /** 
     * Get the 'UnloadMark' element value. Признак выгрузки товарной партии
     * 
     * @return value
     */
    public String getUnloadMark() {
        return unloadMark;
    }

    /** 
     * Set the 'UnloadMark' element value. Признак выгрузки товарной партии
     * 
     * @param unloadMark
     */
    public void setUnloadMark(String unloadMark) {
        this.unloadMark = unloadMark;
    }

    /** 
     * Get the 'Consignor' element value. Отправитель
     * 
     * @return value
     */
    public PersonType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Отправитель
     * 
     * @param consignor
     */
    public void setConsignor(PersonType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. Получатель
     * 
     * @return value
     */
    public PersonType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Получатель
     * 
     * @param consignee
     */
    public void setConsignee(PersonType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Destination' element value. Место назначения/доставки
     * 
     * @return value
     */
    public TIRDestinationType getDestination() {
        return destination;
    }

    /** 
     * Set the 'Destination' element value. Место назначения/доставки
     * 
     * @param destination
     */
    public void setDestination(TIRDestinationType destination) {
        this.destination = destination;
    }

    /** 
     * Get the list of 'Goods' element items. Товары в книжке МДП
     * 
     * @return list
     */
    public List<TIRGoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Товары в книжке МДП
     * 
     * @param list
     */
    public void setGoodList(List<TIRGoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the list of 'IdentityMark' element items. Пломбы или опознавательные знаки. (число, идентификация)
     * 
     * @return list
     */
    public List<IdentityMarkType> getIdentityMarkList() {
        return identityMarkList;
    }

    /** 
     * Set the list of 'IdentityMark' element items. Пломбы или опознавательные знаки. (число, идентификация)
     * 
     * @param list
     */
    public void setIdentityMarkList(List<IdentityMarkType> list) {
        identityMarkList = list;
    }

    /** 
     * Get the 'IdentityCustPerson' element value. гр.17. Таможня места отправления. Подпись должностного лица и штемпель таможни с датой.
     * 
     * @return value
     */
    public TIRCustomsPersonType getIdentityCustPerson() {
        return identityCustPerson;
    }

    /** 
     * Set the 'IdentityCustPerson' element value. гр.17. Таможня места отправления. Подпись должностного лица и штемпель таможни с датой.
     * 
     * @param identityCustPerson
     */
    public void setIdentityCustPerson(TIRCustomsPersonType identityCustPerson) {
        this.identityCustPerson = identityCustPerson;
    }

    /** 
     * Get the 'UnloadCustoms' element value. Реквизиты таможни,принимающей товарную партию.
     * 
     * @return value
     */
    public UnloadCustomSignType getUnloadCustoms() {
        return unloadCustoms;
    }

    /** 
     * Set the 'UnloadCustoms' element value. Реквизиты таможни,принимающей товарную партию.
     * 
     * @param unloadCustoms
     */
    public void setUnloadCustoms(UnloadCustomSignType unloadCustoms) {
        this.unloadCustoms = unloadCustoms;
    }
}

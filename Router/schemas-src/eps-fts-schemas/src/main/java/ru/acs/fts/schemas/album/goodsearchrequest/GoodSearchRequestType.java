
package ru.acs.fts.schemas.album.goodsearchrequest;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Запрос о розыске недоставленных товаров
 */
public class GoodSearchRequestType extends BaseDocType
{
    private LocalDate goodsRegistrationDate;
    private String consignmentNumber;
    private GTDIDType TD;
    private List<CarriageType> transportList = new ArrayList<CarriageType>();
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private PlaceType departurePlace;
    private PlaceType destinationPlace;
    private String documentModeID;

    /** 
     * Get the 'GoodsRegistrationDate' element value. Дата оформления товарной партии в таможне
     * 
     * @return value
     */
    public LocalDate getGoodsRegistrationDate() {
        return goodsRegistrationDate;
    }

    /** 
     * Set the 'GoodsRegistrationDate' element value. Дата оформления товарной партии в таможне
     * 
     * @param goodsRegistrationDate
     */
    public void setGoodsRegistrationDate(LocalDate goodsRegistrationDate) {
        this.goodsRegistrationDate = goodsRegistrationDate;
    }

    /** 
     * Get the 'ConsignmentNumber' element value. Номер товарно-транспортной накладной
     * 
     * @return value
     */
    public String getConsignmentNumber() {
        return consignmentNumber;
    }

    /** 
     * Set the 'ConsignmentNumber' element value. Номер товарно-транспортной накладной
     * 
     * @param consignmentNumber
     */
    public void setConsignmentNumber(String consignmentNumber) {
        this.consignmentNumber = consignmentNumber;
    }

    /** 
     * Get the 'TD' element value. Номер транзитной декларации
     * 
     * @return value
     */
    public GTDIDType getTD() {
        return TD;
    }

    /** 
     * Set the 'TD' element value. Номер транзитной декларации
     * 
     * @param TD
     */
    public void setTD(GTDIDType TD) {
        this.TD = TD;
    }

    /** 
     * Get the list of 'Transport' element items. Сведения о транспортном средстве
     * 
     * @return list
     */
    public List<CarriageType> getTransportList() {
        return transportList;
    }

    /** 
     * Set the list of 'Transport' element items. Сведения о транспортном средстве
     * 
     * @param list
     */
    public void setTransportList(List<CarriageType> list) {
        transportList = list;
    }

    /** 
     * Get the 'Customs' element value. Таможенный орган регистрации документа
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Таможенный орган регистрации документа
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPerson' element value. Сведения о должностном лице таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Сведения о должностном лице таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'DeparturePlace' element value. Место отправления
     * 
     * @return value
     */
    public PlaceType getDeparturePlace() {
        return departurePlace;
    }

    /** 
     * Set the 'DeparturePlace' element value. Место отправления
     * 
     * @param departurePlace
     */
    public void setDeparturePlace(PlaceType departurePlace) {
        this.departurePlace = departurePlace;
    }

    /** 
     * Get the 'DestinationPlace' element value. Место назначения
     * 
     * @return value
     */
    public PlaceType getDestinationPlace() {
        return destinationPlace;
    }

    /** 
     * Set the 'DestinationPlace' element value. Место назначения
     * 
     * @param destinationPlace
     */
    public void setDestinationPlace(PlaceType destinationPlace) {
        this.destinationPlace = destinationPlace;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}

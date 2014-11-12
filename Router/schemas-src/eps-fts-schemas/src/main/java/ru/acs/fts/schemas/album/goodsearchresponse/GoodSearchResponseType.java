
package ru.acs.fts.schemas.album.goodsearchresponse;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Ответ на запрос о розыске недоставленных товаров
 */
public class GoodSearchResponseType extends BaseDocType
{
    private LocalDate goodsRegistrationDate;
    private String consignmentNumber;
    private LocalDate departureDate;
    private List<CarriageType> transportList = new ArrayList<CarriageType>();
    private PlaceType departurePlace;
    private PlaceType destinationPlace;
    private CUOrganizationType consignee;
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
     * Get the 'DepartureDate' element value. Дата отправления
     * 
     * @return value
     */
    public LocalDate getDepartureDate() {
        return departureDate;
    }

    /** 
     * Set the 'DepartureDate' element value. Дата отправления
     * 
     * @param departureDate
     */
    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
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
     * Get the 'Consignee' element value. Получатель груза
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Получатель груза
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
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

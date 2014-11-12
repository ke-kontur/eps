
package ru.acs.fts.schemas.album.revealingtransportpp;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Сведения о товарной партии
 */
public class ConsignmentType
{
    private String lotID;
    private String TTNNumber;
    private LocalDate TTNDate;
    private String customsNumber;
    private String grossWeight;
    private String measureUnitQuantity;
    private String invoicedAmount;
    private String invoicedCurrencyCode3;
    private String dispatchCountryCode2;
    private String destinationCountryCode2;
    private String totalPlaces;
    private String consignmentSerNumber;
    private String netWeightQuantity;
    private String PIRegID;
    private OrganizationType consignor;
    private OrganizationType consignee;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private OrganizationType carrier;

    /** 
     * Get the 'LotID' element value. Идентификатор товарной партии, присваиваемый в АС "ПП"
     * 
     * @return value
     */
    public String getLotID() {
        return lotID;
    }

    /** 
     * Set the 'LotID' element value. Идентификатор товарной партии, присваиваемый в АС "ПП"
     * 
     * @param lotID
     */
    public void setLotID(String lotID) {
        this.lotID = lotID;
    }

    /** 
     * Get the 'TTNNumber' element value. Номер ТТН
     * 
     * @return value
     */
    public String getTTNNumber() {
        return TTNNumber;
    }

    /** 
     * Set the 'TTNNumber' element value. Номер ТТН
     * 
     * @param TTNNumber
     */
    public void setTTNNumber(String TTNNumber) {
        this.TTNNumber = TTNNumber;
    }

    /** 
     * Get the 'TTNDate' element value. Дата ТТН
     * 
     * @return value
     */
    public LocalDate getTTNDate() {
        return TTNDate;
    }

    /** 
     * Set the 'TTNDate' element value. Дата ТТН
     * 
     * @param TTNDate
     */
    public void setTTNDate(LocalDate TTNDate) {
        this.TTNDate = TTNDate;
    }

    /** 
     * Get the 'CustomsNumber' element value. Таможенный номер накладной
     * 
     * @return value
     */
    public String getCustomsNumber() {
        return customsNumber;
    }

    /** 
     * Set the 'CustomsNumber' element value. Таможенный номер накладной
     * 
     * @param customsNumber
     */
    public void setCustomsNumber(String customsNumber) {
        this.customsNumber = customsNumber;
    }

    /** 
     * Get the 'GrossWeight' element value. Вес брутто, кг
     * 
     * @return value
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /** 
     * Set the 'GrossWeight' element value. Вес брутто, кг
     * 
     * @param grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /** 
     * Get the 'MeasureUnitQuantity' element value. Количество в ДЕИ
     * 
     * @return value
     */
    public String getMeasureUnitQuantity() {
        return measureUnitQuantity;
    }

    /** 
     * Set the 'MeasureUnitQuantity' element value. Количество в ДЕИ
     * 
     * @param measureUnitQuantity
     */
    public void setMeasureUnitQuantity(String measureUnitQuantity) {
        this.measureUnitQuantity = measureUnitQuantity;
    }

    /** 
     * Get the 'InvoicedAmount' element value. Общая стоимость
     * 
     * @return value
     */
    public String getInvoicedAmount() {
        return invoicedAmount;
    }

    /** 
     * Set the 'InvoicedAmount' element value. Общая стоимость
     * 
     * @param invoicedAmount
     */
    public void setInvoicedAmount(String invoicedAmount) {
        this.invoicedAmount = invoicedAmount;
    }

    /** 
     * Get the 'InvoicedCurrencyCode3' element value. Буквенный код валюты общей стоимости
     * 
     * @return value
     */
    public String getInvoicedCurrencyCode3() {
        return invoicedCurrencyCode3;
    }

    /** 
     * Set the 'InvoicedCurrencyCode3' element value. Буквенный код валюты общей стоимости
     * 
     * @param invoicedCurrencyCode3
     */
    public void setInvoicedCurrencyCode3(String invoicedCurrencyCode3) {
        this.invoicedCurrencyCode3 = invoicedCurrencyCode3;
    }

    /** 
     * Get the 'DispatchCountryCode2' element value. Символьный код страны отправления
     * 
     * @return value
     */
    public String getDispatchCountryCode2() {
        return dispatchCountryCode2;
    }

    /** 
     * Set the 'DispatchCountryCode2' element value. Символьный код страны отправления
     * 
     * @param dispatchCountryCode2
     */
    public void setDispatchCountryCode2(String dispatchCountryCode2) {
        this.dispatchCountryCode2 = dispatchCountryCode2;
    }

    /** 
     * Get the 'DestinationCountryCode2' element value. Символьный код страны назначения
     * 
     * @return value
     */
    public String getDestinationCountryCode2() {
        return destinationCountryCode2;
    }

    /** 
     * Set the 'DestinationCountryCode2' element value. Символьный код страны назначения
     * 
     * @param destinationCountryCode2
     */
    public void setDestinationCountryCode2(String destinationCountryCode2) {
        this.destinationCountryCode2 = destinationCountryCode2;
    }

    /** 
     * Get the 'TotalPlaces' element value. Общее количество грузовых мест товаров
     * 
     * @return value
     */
    public String getTotalPlaces() {
        return totalPlaces;
    }

    /** 
     * Set the 'TotalPlaces' element value. Общее количество грузовых мест товаров
     * 
     * @param totalPlaces
     */
    public void setTotalPlaces(String totalPlaces) {
        this.totalPlaces = totalPlaces;
    }

    /** 
     * Get the 'ConsignmentSerNumber' element value. Порядковый номер партии
     * 
     * @return value
     */
    public String getConsignmentSerNumber() {
        return consignmentSerNumber;
    }

    /** 
     * Set the 'ConsignmentSerNumber' element value. Порядковый номер партии
     * 
     * @param consignmentSerNumber
     */
    public void setConsignmentSerNumber(String consignmentSerNumber) {
        this.consignmentSerNumber = consignmentSerNumber;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. Вес нетто, кг
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. Вес нетто, кг
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'PI_RegID' element value. Регистрационный идентификатор предварительной информации
     * 
     * @return value
     */
    public String getPIRegID() {
        return PIRegID;
    }

    /** 
     * Set the 'PI_RegID' element value. Регистрационный идентификатор предварительной информации
     * 
     * @param PIRegID
     */
    public void setPIRegID(String PIRegID) {
        this.PIRegID = PIRegID;
    }

    /** 
     * Get the 'Consignor' element value. Сведения об отправителе товаров
     * 
     * @return value
     */
    public OrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Сведения об отправителе товаров
     * 
     * @param consignor
     */
    public void setConsignor(OrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. Сведения о получателе товаров
     * 
     * @return value
     */
    public OrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Сведения о получателе товаров
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the list of 'Goods' element items. Сведения о товаре
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Сведения о товаре
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'Carrier' element value. Сведения о перевозчике товаров
     * 
     * @return value
     */
    public OrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Сведения о перевозчике товаров
     * 
     * @param carrier
     */
    public void setCarrier(OrganizationType carrier) {
        this.carrier = carrier;
    }
}

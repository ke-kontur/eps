
package ru.acs.fts.schemas.album.requestmca;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsGroupInformationType;

/** 
 * Информация о товарной позиции по запросу
 */
public class ITSInfoType
{
    private String goodsNumeric;
    private String goodsTNVEDCode;
    private String customsModeCode;
    private String originCountryCode;
    private String dispatchCountryCode;
    private String transportModeCode;
    private List<String> MDPNumList = new ArrayList<String>();
    private List<String> passportDealList = new ArrayList<String>();
    private String invoiceCost;
    private String placesKol;
    private List<GoodsGroupInformationType> goodsGroupInformationList = new ArrayList<GoodsGroupInformationType>();
    private List<DocumentBaseType> contractList = new ArrayList<DocumentBaseType>();
    private List<DocumentBaseType> invoiceList = new ArrayList<DocumentBaseType>();
    private ITSRequestInfoMCAType ITSRequest;

    /** 
     * Get the 'GoodsNumeric' element value. Номер товарной позиции
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Номер товарной позиции
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. Код ТН ВЭД ТС
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. Код ТН ВЭД ТС
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'CustomsModeCode' element value. Код таможенной процедуры
     * 
     * @return value
     */
    public String getCustomsModeCode() {
        return customsModeCode;
    }

    /** 
     * Set the 'CustomsModeCode' element value. Код таможенной процедуры
     * 
     * @param customsModeCode
     */
    public void setCustomsModeCode(String customsModeCode) {
        this.customsModeCode = customsModeCode;
    }

    /** 
     * Get the 'OriginCountryCode' element value. Код страны происхождения
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. Код страны происхождения
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    /** 
     * Get the 'DispatchCountryCode' element value. Код страны отправления
     * 
     * @return value
     */
    public String getDispatchCountryCode() {
        return dispatchCountryCode;
    }

    /** 
     * Set the 'DispatchCountryCode' element value. Код страны отправления
     * 
     * @param dispatchCountryCode
     */
    public void setDispatchCountryCode(String dispatchCountryCode) {
        this.dispatchCountryCode = dispatchCountryCode;
    }

    /** 
     * Get the 'TransportModeCode' element value. Код вида транспорта на границе
     * 
     * @return value
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /** 
     * Set the 'TransportModeCode' element value. Код вида транспорта на границе
     * 
     * @param transportModeCode
     */
    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }

    /** 
     * Get the list of 'MDPNum' element items. Номер МДП
     * 
     * @return list
     */
    public List<String> getMDPNumList() {
        return MDPNumList;
    }

    /** 
     * Set the list of 'MDPNum' element items. Номер МДП
     * 
     * @param list
     */
    public void setMDPNumList(List<String> list) {
        MDPNumList = list;
    }

    /** 
     * Get the list of 'PassportDeal' element items. Паспорт сделки
     * 
     * @return list
     */
    public List<String> getPassportDealList() {
        return passportDealList;
    }

    /** 
     * Set the list of 'PassportDeal' element items. Паспорт сделки
     * 
     * @param list
     */
    public void setPassportDealList(List<String> list) {
        passportDealList = list;
    }

    /** 
     * Get the 'InvoiceCost' element value. Фактурная стоимость
     * 
     * @return value
     */
    public String getInvoiceCost() {
        return invoiceCost;
    }

    /** 
     * Set the 'InvoiceCost' element value. Фактурная стоимость
     * 
     * @param invoiceCost
     */
    public void setInvoiceCost(String invoiceCost) {
        this.invoiceCost = invoiceCost;
    }

    /** 
     * Get the 'PlacesKol' element value. Количество грузовых мест
     * 
     * @return value
     */
    public String getPlacesKol() {
        return placesKol;
    }

    /** 
     * Set the 'PlacesKol' element value. Количество грузовых мест
     * 
     * @param placesKol
     */
    public void setPlacesKol(String placesKol) {
        this.placesKol = placesKol;
    }

    /** 
     * Get the list of 'GoodsGroupInformation' element items. Характеристика товаров в группе
     * 
     * @return list
     */
    public List<GoodsGroupInformationType> getGoodsGroupInformationList() {
        return goodsGroupInformationList;
    }

    /** 
     * Set the list of 'GoodsGroupInformation' element items. Характеристика товаров в группе
     * 
     * @param list
     */
    public void setGoodsGroupInformationList(
            List<GoodsGroupInformationType> list) {
        goodsGroupInformationList = list;
    }

    /** 
     * Get the list of 'Contract' element items. Контракт
     * 
     * @return list
     */
    public List<DocumentBaseType> getContractList() {
        return contractList;
    }

    /** 
     * Set the list of 'Contract' element items. Контракт
     * 
     * @param list
     */
    public void setContractList(List<DocumentBaseType> list) {
        contractList = list;
    }

    /** 
     * Get the list of 'Invoice' element items. Инвойс
     * 
     * @return list
     */
    public List<DocumentBaseType> getInvoiceList() {
        return invoiceList;
    }

    /** 
     * Set the list of 'Invoice' element items. Инвойс
     * 
     * @param list
     */
    public void setInvoiceList(List<DocumentBaseType> list) {
        invoiceList = list;
    }

    /** 
     * Get the 'ITSRequest' element value. Информация о количественных характеристиках товарной позиции для уровня таможенного поста по запросу
     * 
     * @return value
     */
    public ITSRequestInfoMCAType getITSRequest() {
        return ITSRequest;
    }

    /** 
     * Set the 'ITSRequest' element value. Информация о количественных характеристиках товарной позиции для уровня таможенного поста по запросу
     * 
     * @param ITSRequest
     */
    public void setITSRequest(ITSRequestInfoMCAType ITSRequest) {
        this.ITSRequest = ITSRequest;
    }
}

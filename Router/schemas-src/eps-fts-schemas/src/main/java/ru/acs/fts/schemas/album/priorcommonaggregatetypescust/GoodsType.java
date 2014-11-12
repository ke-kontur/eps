
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GoodsBaseType;

/** 
 * Сведения о товарах
 */
public class GoodsType extends GoodsBaseType
{
    private List<String> containerNumberList = new ArrayList<String>();
    private String originCountryCode;
    private String invoicedCost;
    private String currencyCode;
    private String currencyRate;
    private GoodsMeasureQuantityType goodsMeasureQuantity;
    private List<PresentedDocumentsType> presentedDocumentList = new ArrayList<PresentedDocumentsType>();
    private GoodsPackagingType goodsPackaging;

    /** 
     * Get the list of 'ContainerNumbers' element items. Номера контейнеров
     * 
     * @return list
     */
    public List<String> getContainerNumberList() {
        return containerNumberList;
    }

    /** 
     * Set the list of 'ContainerNumbers' element items. Номера контейнеров
     * 
     * @param list
     */
    public void setContainerNumberList(List<String> list) {
        containerNumberList = list;
    }

    /** 
     * Get the 'OriginCountryCode' element value. Буквенный код страны происхождения товара.
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. Буквенный код страны происхождения товара.
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    /** 
     * Get the 'InvoicedCost' element value. Фактурная стоимость
     * 
     * @return value
     */
    public String getInvoicedCost() {
        return invoicedCost;
    }

    /** 
     * Set the 'InvoicedCost' element value. Фактурная стоимость
     * 
     * @param invoicedCost
     */
    public void setInvoicedCost(String invoicedCost) {
        this.invoicedCost = invoicedCost;
    }

    /** 
     * Get the 'CurrencyCode' element value. Буквенный код валюты
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Буквенный код валюты
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'CurrencyRate' element value. Курс валюты
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. Курс валюты
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'GoodsMeasureQuantity' element value. Количество товара в дополнительных единицах измерения
     * 
     * @return value
     */
    public GoodsMeasureQuantityType getGoodsMeasureQuantity() {
        return goodsMeasureQuantity;
    }

    /** 
     * Set the 'GoodsMeasureQuantity' element value. Количество товара в дополнительных единицах измерения
     * 
     * @param goodsMeasureQuantity
     */
    public void setGoodsMeasureQuantity(
            GoodsMeasureQuantityType goodsMeasureQuantity) {
        this.goodsMeasureQuantity = goodsMeasureQuantity;
    }

    /** 
     * Get the list of 'PresentedDocuments' element items. Транспортные и коммерческие документы
     * 
     * @return list
     */
    public List<PresentedDocumentsType> getPresentedDocumentList() {
        return presentedDocumentList;
    }

    /** 
     * Set the list of 'PresentedDocuments' element items. Транспортные и коммерческие документы
     * 
     * @param list
     */
    public void setPresentedDocumentList(List<PresentedDocumentsType> list) {
        presentedDocumentList = list;
    }

    /** 
     * Get the 'GoodsPackaging' element value. Сведения о грузовых местах, и упаковке товаров
     * 
     * @return value
     */
    public GoodsPackagingType getGoodsPackaging() {
        return goodsPackaging;
    }

    /** 
     * Set the 'GoodsPackaging' element value. Сведения о грузовых местах, и упаковке товаров
     * 
     * @param goodsPackaging
     */
    public void setGoodsPackaging(GoodsPackagingType goodsPackaging) {
        this.goodsPackaging = goodsPackaging;
    }
}


package ru.acs.fts.schemas.album.esadoutp;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsGroupDescriptionType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsItemBaseType;

/** 
 * Информация о товаре
 */
public class ESADGoodsItemPType extends GoodsItemBaseType
{
    private String goodsTNVEDCode;
    private String originCountryCode;
    private String originCountryName;
    private String countryCodeIndicator;
    private String preferencii;
    private String destinationCountryCode;
    private String conformityStatCostIndicator;
    private String customsCostCorrectMethod;
    private String invoiceCostCurCode;
    private String goodsAddTNVEDCode;
    private List<GoodsGroupDescriptionType> goodsGroupDescriptionList = new ArrayList<GoodsGroupDescriptionType>();
    private ContainerType container;

    /** 
     * Get the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'OriginCountryCode' element value. Код страны происхождения по общероссийскому классификатору стран мира / буквенный код страны происхождения по классификатору экономических союзов и сообществ
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. Код страны происхождения по общероссийскому классификатору стран мира / буквенный код страны происхождения по классификатору экономических союзов и сообществ
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    /** 
     * Get the 'OriginCountryName' element value. Краткое наименование страны происхождения / экономического союза.
     * 
     * @return value
     */
    public String getOriginCountryName() {
        return originCountryName;
    }

    /** 
     * Set the 'OriginCountryName' element value. Краткое наименование страны происхождения / экономического союза.
     * 
     * @param originCountryName
     */
    public void setOriginCountryName(String originCountryName) {
        this.originCountryName = originCountryName;
    }

    /** 
     * Get the 'CountryCodeIndicator' element value. Признак кода страны происхождения. 1 - классификатор OKSMT 2- Классификатор союзов и сообществ EK_EU. В остальных случаях не заполняется.
     * 
     * @return value
     */
    public String getCountryCodeIndicator() {
        return countryCodeIndicator;
    }

    /** 
     * Set the 'CountryCodeIndicator' element value. Признак кода страны происхождения. 1 - классификатор OKSMT 2- Классификатор союзов и сообществ EK_EU. В остальных случаях не заполняется.
     * 
     * @param countryCodeIndicator
     */
    public void setCountryCodeIndicator(String countryCodeIndicator) {
        this.countryCodeIndicator = countryCodeIndicator;
    }

    /** 
     * Get the 'Preferencii' element value. Преференции, особенности уплаты платежей
     * 
     * @return value
     */
    public String getPreferencii() {
        return preferencii;
    }

    /** 
     * Set the 'Preferencii' element value. Преференции, особенности уплаты платежей
     * 
     * @param preferencii
     */
    public void setPreferencii(String preferencii) {
        this.preferencii = preferencii;
    }

    /** 
     * Get the 'DestinationCountryCode' element value. Код страны назначения по общероссийскому классификатору стран мира. 
     * 
     * @return value
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /** 
     * Set the 'DestinationCountryCode' element value. Код страны назначения по общероссийскому классификатору стран мира. 
     * 
     * @param destinationCountryCode
     */
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    /** 
     * Get the 'ConformityStatCostIndicator' element value. Признак приведения статистической стоимости  к установленной базе цен
     * 
     * @return value
     */
    public String getConformityStatCostIndicator() {
        return conformityStatCostIndicator;
    }

    /** 
     * Set the 'ConformityStatCostIndicator' element value. Признак приведения статистической стоимости  к установленной базе цен
     * 
     * @param conformityStatCostIndicator
     */
    public void setConformityStatCostIndicator(
            String conformityStatCostIndicator) {
        this.conformityStatCostIndicator = conformityStatCostIndicator;
    }

    /** 
     * Get the 'CustomsCostCorrectMethod' element value. Номер метода определения таможенной стоимости. Заполняется в соответствии с классификатором методов определения таможенной стоимости.
     * 
     * @return value
     */
    public String getCustomsCostCorrectMethod() {
        return customsCostCorrectMethod;
    }

    /** 
     * Set the 'CustomsCostCorrectMethod' element value. Номер метода определения таможенной стоимости. Заполняется в соответствии с классификатором методов определения таможенной стоимости.
     * 
     * @param customsCostCorrectMethod
     */
    public void setCustomsCostCorrectMethod(String customsCostCorrectMethod) {
        this.customsCostCorrectMethod = customsCostCorrectMethod;
    }

    /** 
     * Get the 'InvoiceCostCurCode' element value. Код валюты фактурной стоимости
     * 
     * @return value
     */
    public String getInvoiceCostCurCode() {
        return invoiceCostCurCode;
    }

    /** 
     * Set the 'InvoiceCostCurCode' element value. Код валюты фактурной стоимости
     * 
     * @param invoiceCostCurCode
     */
    public void setInvoiceCostCurCode(String invoiceCostCurCode) {
        this.invoiceCostCurCode = invoiceCostCurCode;
    }

    /** 
     * Get the 'GoodsAddTNVEDCode' element value. Код  товара по классификатору  дополнительной таможенной информации
     * 
     * @return value
     */
    public String getGoodsAddTNVEDCode() {
        return goodsAddTNVEDCode;
    }

    /** 
     * Set the 'GoodsAddTNVEDCode' element value. Код  товара по классификатору  дополнительной таможенной информации
     * 
     * @param goodsAddTNVEDCode
     */
    public void setGoodsAddTNVEDCode(String goodsAddTNVEDCode) {
        this.goodsAddTNVEDCode = goodsAddTNVEDCode;
    }

    /** 
     * Get the list of 'GoodsGroupDescription' element items. Описание группы товаров одного наименования с отличающимися от других групп характеристиками
     * 
     * @return list
     */
    public List<GoodsGroupDescriptionType> getGoodsGroupDescriptionList() {
        return goodsGroupDescriptionList;
    }

    /** 
     * Set the list of 'GoodsGroupDescription' element items. Описание группы товаров одного наименования с отличающимися от других групп характеристиками
     * 
     * @param list
     */
    public void setGoodsGroupDescriptionList(
            List<GoodsGroupDescriptionType> list) {
        goodsGroupDescriptionList = list;
    }

    /** 
     * Get the 'Container' element value. Информация о контейнерах
     * 
     * @return value
     */
    public ContainerType getContainer() {
        return container;
    }

    /** 
     * Set the 'Container' element value. Информация о контейнерах
     * 
     * @param container
     */
    public void setContainer(ContainerType container) {
        this.container = container;
    }
}

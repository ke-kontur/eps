
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsGroupDescriptionType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsItemBaseType;

/** 
 * ESAD. Сведения о товаре.
 */
public class ESADGoodsItemType extends GoodsItemBaseType
{
    private String goodsTNVEDCode;
    private String goodsClassificationCode;
    private String additionalSign;
    private LocalDate beginPeriodDate;
    private LocalDate endPeriodDate;
    private String originCountryCode;
    private String originCountryName;
    private String countryCodeIndicator;
    private String preferencii;
    private String destinationCountryCode;
    private String conformityStatCostIndicator;
    private String goodsShipmentUCR;
    private String intellectPropertySign;
    private String customsCostCorrectMethod;
    private String goodsAddTNVEDCode;
    private List<GoodsGroupDescriptionType> goodsGroupDescriptionList = new ArrayList<GoodsGroupDescriptionType>();

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
     * Get the 'GoodsClassificationCode' element value. Особенность классификации кода: 1 - общий, 2 - товар списка. В остальных случаях не заполняется
     * 
     * @return value
     */
    public String getGoodsClassificationCode() {
        return goodsClassificationCode;
    }

    /** 
     * Set the 'GoodsClassificationCode' element value. Особенность классификации кода: 1 - общий, 2 - товар списка. В остальных случаях не заполняется
     * 
     * @param goodsClassificationCode
     */
    public void setGoodsClassificationCode(String goodsClassificationCode) {
        this.goodsClassificationCode = goodsClassificationCode;
    }

    /** 
     * Get the 'AdditionalSign' element value. Дополнительный признак нетарифного регулирования
     * 
     * @return value
     */
    public String getAdditionalSign() {
        return additionalSign;
    }

    /** 
     * Set the 'AdditionalSign' element value. Дополнительный признак нетарифного регулирования
     * 
     * @param additionalSign
     */
    public void setAdditionalSign(String additionalSign) {
        this.additionalSign = additionalSign;
    }

    /** 
     * Get the 'BeginPeriodDate' element value. Дата начала периода (ОПД)
     * 
     * @return value
     */
    public LocalDate getBeginPeriodDate() {
        return beginPeriodDate;
    }

    /** 
     * Set the 'BeginPeriodDate' element value. Дата начала периода (ОПД)
     * 
     * @param beginPeriodDate
     */
    public void setBeginPeriodDate(LocalDate beginPeriodDate) {
        this.beginPeriodDate = beginPeriodDate;
    }

    /** 
     * Get the 'EndPeriodDate' element value. Дата окончания периода (ОПД)
     * 
     * @return value
     */
    public LocalDate getEndPeriodDate() {
        return endPeriodDate;
    }

    /** 
     * Set the 'EndPeriodDate' element value. Дата окончания периода (ОПД)
     * 
     * @param endPeriodDate
     */
    public void setEndPeriodDate(LocalDate endPeriodDate) {
        this.endPeriodDate = endPeriodDate;
    }

    /** 
     * Get the 'OriginCountryCode' element value. Код страны происхождения по классификатору стран мира 
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. Код страны происхождения по классификатору стран мира 
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
     * Get the 'DestinationCountryCode' element value. Код страны назначения по классификатору стран мира. 
     * 
     * @return value
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /** 
     * Set the 'DestinationCountryCode' element value. Код страны назначения по классификатору стран мира. 
     * 
     * @param destinationCountryCode
     */
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    /** 
     * Get the 'ConformityStatCostIndicator' element value. Признак приведения статистической стоимости  к установленной базе цен. 0 - не приведена, 1 - приведена.
     * 
     * @return value
     */
    public String getConformityStatCostIndicator() {
        return conformityStatCostIndicator;
    }

    /** 
     * Set the 'ConformityStatCostIndicator' element value. Признак приведения статистической стоимости  к установленной базе цен. 0 - не приведена, 1 - приведена.
     * 
     * @param conformityStatCostIndicator
     */
    public void setConformityStatCostIndicator(
            String conformityStatCostIndicator) {
        this.conformityStatCostIndicator = conformityStatCostIndicator;
    }

    /** 
     * Get the 'GoodsShipmentUCR' element value. Идентификатор товарной партии из системы предварительного информирования или системы транзита.
     * 
     * @return value
     */
    public String getGoodsShipmentUCR() {
        return goodsShipmentUCR;
    }

    /** 
     * Set the 'GoodsShipmentUCR' element value. Идентификатор товарной партии из системы предварительного информирования или системы транзита.
     * 
     * @param goodsShipmentUCR
     */
    public void setGoodsShipmentUCR(String goodsShipmentUCR) {
        this.goodsShipmentUCR = goodsShipmentUCR;
    }

    /** 
     * Get the 'IntellectPropertySign' element value. Признак объекта интеллектуальной собственности
     * 
     * @return value
     */
    public String getIntellectPropertySign() {
        return intellectPropertySign;
    }

    /** 
     * Set the 'IntellectPropertySign' element value. Признак объекта интеллектуальной собственности
     * 
     * @param intellectPropertySign
     */
    public void setIntellectPropertySign(String intellectPropertySign) {
        this.intellectPropertySign = intellectPropertySign;
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
     * Get the list of 'GoodsGroupDescription' element items. Описание и характеристика товаров / Описание группы товаров одного наименования с отличающимися от других групп характеристиками
     * 
     * @return list
     */
    public List<GoodsGroupDescriptionType> getGoodsGroupDescriptionList() {
        return goodsGroupDescriptionList;
    }

    /** 
     * Set the list of 'GoodsGroupDescription' element items. Описание и характеристика товаров / Описание группы товаров одного наименования с отличающимися от других групп характеристиками
     * 
     * @param list
     */
    public void setGoodsGroupDescriptionList(
            List<GoodsGroupDescriptionType> list) {
        goodsGroupDescriptionList = list;
    }
}


package ru.acs.fts.schemas.album.esadin;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DeliveryTermsType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUPreferenciiType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsGroupDescriptionType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsItemBaseType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsSTZType;

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
    private String destinationCountryCode;
    private String conformityStatCostIndicator;
    private String goodsShipmentUCR;
    private String intellectPropertySign;
    private String customsCostCorrectMethod;
    private String goodsAddTNVEDCode;
    private String quantityFact;
    private String oilField;
    private LocalDate deliveryTime;
    private LocalDate deliveryTimeEND;
    private List<GoodsGroupDescriptionType> goodsGroupDescriptionList = new ArrayList<GoodsGroupDescriptionType>();
    private List<DeliveryTermsType> goodsItemDeliveryTermList = new ArrayList<DeliveryTermsType>();
    private List<GoodsSTZType> goodsSTZList = new ArrayList<GoodsSTZType>();
    private CUPreferenciiType preferencii;

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
     * Get the 'CustomsCostCorrectMethod' element value. Резерв. Номер метода определения таможенной стоимости. Заполняется в соответствии с классификатором методов определения таможенной стоимости.
     * 
     * @return value
     */
    public String getCustomsCostCorrectMethod() {
        return customsCostCorrectMethod;
    }

    /** 
     * Set the 'CustomsCostCorrectMethod' element value. Резерв. Номер метода определения таможенной стоимости. Заполняется в соответствии с классификатором методов определения таможенной стоимости.
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
     * Get the 'QuantityFact' element value. Количество товаров, фактически переданных покупателю в соответствии с условиями поставки (элемент 8 гр. 31 ДТ).
     * 
     * @return value
     */
    public String getQuantityFact() {
        return quantityFact;
    }

    /** 
     * Set the 'QuantityFact' element value. Количество товаров, фактически переданных покупателю в соответствии с условиями поставки (элемент 8 гр. 31 ДТ).
     * 
     * @param quantityFact
     */
    public void setQuantityFact(String quantityFact) {
        this.quantityFact = quantityFact;
    }

    /** 
     * Get the 'OilField' element value. Сведения о месторождении товара
     * 
     * @return value
     */
    public String getOilField() {
        return oilField;
    }

    /** 
     * Set the 'OilField' element value. Сведения о месторождении товара
     * 
     * @param oilField
     */
    public void setOilField(String oilField) {
        this.oilField = oilField;
    }

    /** 
     * Get the 'DeliveryTime' element value. Дата начала периода поставки. (элемент 7 гр. 31 ДТ).
     * 
     * @return value
     */
    public LocalDate getDeliveryTime() {
        return deliveryTime;
    }

    /** 
     * Set the 'DeliveryTime' element value. Дата начала периода поставки. (элемент 7 гр. 31 ДТ).
     * 
     * @param deliveryTime
     */
    public void setDeliveryTime(LocalDate deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /** 
     * Get the 'DeliveryTimeEND' element value. Дата окончания периода поставки. (элемент 7 гр. 31 ДТ).
     * 
     * @return value
     */
    public LocalDate getDeliveryTimeEND() {
        return deliveryTimeEND;
    }

    /** 
     * Set the 'DeliveryTimeEND' element value. Дата окончания периода поставки. (элемент 7 гр. 31 ДТ).
     * 
     * @param deliveryTimeEND
     */
    public void setDeliveryTimeEND(LocalDate deliveryTimeEND) {
        this.deliveryTimeEND = deliveryTimeEND;
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

    /** 
     * Get the list of 'GoodsItemDeliveryTerms' element items. Условия поставки товара
     * 
     * @return list
     */
    public List<DeliveryTermsType> getGoodsItemDeliveryTermList() {
        return goodsItemDeliveryTermList;
    }

    /** 
     * Set the list of 'GoodsItemDeliveryTerms' element items. Условия поставки товара
     * 
     * @param list
     */
    public void setGoodsItemDeliveryTermList(List<DeliveryTermsType> list) {
        goodsItemDeliveryTermList = list;
    }

    /** 
     * Get the list of 'GoodsSTZ' element items. Сведения о товарах, помещенных под таможенную процедуру СТЗ или свободного склада. гр 31 п 11. Для РК и РФ
     * 
     * @return list
     */
    public List<GoodsSTZType> getGoodsSTZList() {
        return goodsSTZList;
    }

    /** 
     * Set the list of 'GoodsSTZ' element items. Сведения о товарах, помещенных под таможенную процедуру СТЗ или свободного склада. гр 31 п 11. Для РК и РФ
     * 
     * @param list
     */
    public void setGoodsSTZList(List<GoodsSTZType> list) {
        goodsSTZList = list;
    }

    /** 
     * Get the 'Preferencii' element value. Преференции, льготы и иные особенности по уплате таможенных платежей
     * 
     * @return value
     */
    public CUPreferenciiType getPreferencii() {
        return preferencii;
    }

    /** 
     * Set the 'Preferencii' element value. Преференции, льготы и иные особенности по уплате таможенных платежей
     * 
     * @param preferencii
     */
    public void setPreferencii(CUPreferenciiType preferencii) {
        this.preferencii = preferencii;
    }
}

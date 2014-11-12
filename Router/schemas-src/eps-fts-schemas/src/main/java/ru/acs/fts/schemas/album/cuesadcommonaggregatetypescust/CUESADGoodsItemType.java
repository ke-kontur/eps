
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DeliveryTermsType;

/** 
 * Сведения о товаре
 */
public class CUESADGoodsItemType extends GoodsItemBaseType
{
    private String goodsTNVEDCode;
    private String goodsClassificationCode;
    private String additionalSign;
    private String intellectPropertySign;
    private List<String> restrictionSignList = new ArrayList<String>();
    private LocalDate beginPeriodDate;
    private LocalDate endPeriodDate;
    private String originCountryCode;
    private String originCountryName;
    private String customsCostCorrectMethod;
    private String goodsAddTNVEDCode;
    private LocalDate deliveryTime;
    private LocalDate deliveryTimeEND;
    private String additionalSheetCount;
    private String quantityFact;
    private String oilField;
    private String TNVEDContract;
    private List<DeliveryTermsType> CUESADDeliveryTermList = new ArrayList<DeliveryTermsType>();
    private List<GoodsGroupDescriptionType> goodsGroupDescriptionList = new ArrayList<GoodsGroupDescriptionType>();
    private CUPreferenciiType preferencii;
    private List<GoodsSTZType> goodsSTZList = new ArrayList<GoodsSTZType>();

    /** 
     * Get the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС. Гр.33 первый раздел
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС. Гр.33 первый раздел
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'GoodsClassificationCode' element value. Особенность классификации кода: 1 - общий "О", 2 - товар списка. В остальных случаях не заполняется
     * 
     * @return value
     */
    public String getGoodsClassificationCode() {
        return goodsClassificationCode;
    }

    /** 
     * Set the 'GoodsClassificationCode' element value. Особенность классификации кода: 1 - общий "О", 2 - товар списка. В остальных случаях не заполняется
     * 
     * @param goodsClassificationCode
     */
    public void setGoodsClassificationCode(String goodsClassificationCode) {
        this.goodsClassificationCode = goodsClassificationCode;
    }

    /** 
     * Get the 'AdditionalSign' element value. Дополнительный признак нетарифного регулирования ("С"). Гр.33 второй раздел
     * 
     * @return value
     */
    public String getAdditionalSign() {
        return additionalSign;
    }

    /** 
     * Set the 'AdditionalSign' element value. Дополнительный признак нетарифного регулирования ("С"). Гр.33 второй раздел
     * 
     * @param additionalSign
     */
    public void setAdditionalSign(String additionalSign) {
        this.additionalSign = additionalSign;
    }

    /** 
     * Get the 'IntellectPropertySign' element value. Признак объекта интеллектуальной собственности ("И"). Гр.33 второй раздел  в ДТ
     * 
     * @return value
     */
    public String getIntellectPropertySign() {
        return intellectPropertySign;
    }

    /** 
     * Set the 'IntellectPropertySign' element value. Признак объекта интеллектуальной собственности ("И"). Гр.33 второй раздел  в ДТ
     * 
     * @param intellectPropertySign
     */
    public void setIntellectPropertySign(String intellectPropertySign) {
        this.intellectPropertySign = intellectPropertySign;
    }

    /** 
     * Get the list of 'RestrictionSign' element items. Буквенный код соблюдения запретов и ограничений в соответствии с классификатором. Для РК
     * 
     * @return list
     */
    public List<String> getRestrictionSignList() {
        return restrictionSignList;
    }

    /** 
     * Set the list of 'RestrictionSign' element items. Буквенный код соблюдения запретов и ограничений в соответствии с классификатором. Для РК
     * 
     * @param list
     */
    public void setRestrictionSignList(List<String> list) {
        restrictionSignList = list;
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
     * Get the 'OriginCountryCode' element value. Код страны происхождения по классификатору стран мира / "EU" / 00 (неизвестна)  Гр.34
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. Код страны происхождения по классификатору стран мира / "EU" / 00 (неизвестна)  Гр.34
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    /** 
     * Get the 'OriginCountryName' element value. Краткое название страны происхождения / экономического союза
     * 
     * @return value
     */
    public String getOriginCountryName() {
        return originCountryName;
    }

    /** 
     * Set the 'OriginCountryName' element value. Краткое название страны происхождения / экономического союза
     * 
     * @param originCountryName
     */
    public void setOriginCountryName(String originCountryName) {
        this.originCountryName = originCountryName;
    }

    /** 
     * Get the 'CustomsCostCorrectMethod' element value. Код метода определения таможенной стоимости. В соответствии с классификатором методов определения таможенной стоимости. Гр. 43
     * 
     * @return value
     */
    public String getCustomsCostCorrectMethod() {
        return customsCostCorrectMethod;
    }

    /** 
     * Set the 'CustomsCostCorrectMethod' element value. Код метода определения таможенной стоимости. В соответствии с классификатором методов определения таможенной стоимости. Гр. 43
     * 
     * @param customsCostCorrectMethod
     */
    public void setCustomsCostCorrectMethod(String customsCostCorrectMethod) {
        this.customsCostCorrectMethod = customsCostCorrectMethod;
    }

    /** 
     * Get the 'GoodsAddTNVEDCode' element value. Код  товара в соответствии с классификатором дополнительной таможенной информации
     * 
     * @return value
     */
    public String getGoodsAddTNVEDCode() {
        return goodsAddTNVEDCode;
    }

    /** 
     * Set the 'GoodsAddTNVEDCode' element value. Код  товара в соответствии с классификатором дополнительной таможенной информации
     * 
     * @param goodsAddTNVEDCode
     */
    public void setGoodsAddTNVEDCode(String goodsAddTNVEDCode) {
        this.goodsAddTNVEDCode = goodsAddTNVEDCode;
    }

    /** 
     * Get the 'DeliveryTime' element value. Дата начала периода поставки. (элемент 7 гр. 31 ДТ)
     * 
     * @return value
     */
    public LocalDate getDeliveryTime() {
        return deliveryTime;
    }

    /** 
     * Set the 'DeliveryTime' element value. Дата начала периода поставки. (элемент 7 гр. 31 ДТ)
     * 
     * @param deliveryTime
     */
    public void setDeliveryTime(LocalDate deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /** 
     * Get the 'DeliveryTimeEND' element value. Дата окончания периода поставки. (элемент 7 гр. 31 ДТ)
     * 
     * @return value
     */
    public LocalDate getDeliveryTimeEND() {
        return deliveryTimeEND;
    }

    /** 
     * Set the 'DeliveryTimeEND' element value. Дата окончания периода поставки. (элемент 7 гр. 31 ДТ)
     * 
     * @param deliveryTimeEND
     */
    public void setDeliveryTimeEND(LocalDate deliveryTimeEND) {
        this.deliveryTimeEND = deliveryTimeEND;
    }

    /** 
     * Get the 'AdditionalSheetCount' element value. Порядковый номер листа (первый подраздел гр.3)
     * 
     * @return value
     */
    public String getAdditionalSheetCount() {
        return additionalSheetCount;
    }

    /** 
     * Set the 'AdditionalSheetCount' element value. Порядковый номер листа (первый подраздел гр.3)
     * 
     * @param additionalSheetCount
     */
    public void setAdditionalSheetCount(String additionalSheetCount) {
        this.additionalSheetCount = additionalSheetCount;
    }

    /** 
     * Get the 'QuantityFact' element value. Количество товаров, фактически переданных покупателю в соответствии с условиями поставки (элемент 8 гр. 31 ДТ)
     * 
     * @return value
     */
    public String getQuantityFact() {
        return quantityFact;
    }

    /** 
     * Set the 'QuantityFact' element value. Количество товаров, фактически переданных покупателю в соответствии с условиями поставки (элемент 8 гр. 31 ДТ)
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
     * Get the 'TNVEDContract' element value. Код товара ТН ВЭД, действующий на дату заключения контрактов с недропользователем. Для РК
     * 
     * @return value
     */
    public String getTNVEDContract() {
        return TNVEDContract;
    }

    /** 
     * Set the 'TNVEDContract' element value. Код товара ТН ВЭД, действующий на дату заключения контрактов с недропользователем. Для РК
     * 
     * @param TNVEDContract
     */
    public void setTNVEDContract(String TNVEDContract) {
        this.TNVEDContract = TNVEDContract;
    }

    /** 
     * Get the list of 'CUESADDeliveryTerms' element items. Условия поставки товаров. Гр.31 пятый подраздел
     * 
     * @return list
     */
    public List<DeliveryTermsType> getCUESADDeliveryTermList() {
        return CUESADDeliveryTermList;
    }

    /** 
     * Set the list of 'CUESADDeliveryTerms' element items. Условия поставки товаров. Гр.31 пятый подраздел
     * 
     * @param list
     */
    public void setCUESADDeliveryTermList(List<DeliveryTermsType> list) {
        CUESADDeliveryTermList = list;
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
     * Get the 'Preferencii' element value. Преференции в соответствии с классификатором льгот по уплате таможенных платежей. Гр.36
     * 
     * @return value
     */
    public CUPreferenciiType getPreferencii() {
        return preferencii;
    }

    /** 
     * Set the 'Preferencii' element value. Преференции в соответствии с классификатором льгот по уплате таможенных платежей. Гр.36
     * 
     * @param preferencii
     */
    public void setPreferencii(CUPreferenciiType preferencii) {
        this.preferencii = preferencii;
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
}

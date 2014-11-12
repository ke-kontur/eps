
package ru.acs.fts.schemas.album.proforminvoice;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.InvoiceParticipantType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.MarkType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.RussianInvoiceGoodsType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.ShortCompanyDescType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DeliveryTermsRUType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Счет проформа
 */
public class ProformInvoiceType extends BaseDocType
{
    private String currencyCode;
    private String currencyRate;
    private String placesQuantity;
    private String grossWeightQuantity;
    private String netWeightQuantity;
    private OrganizationType consignor;
    private List<RussianInvoiceGoodsType> invoiceGoodList = new ArrayList<RussianInvoiceGoodsType>();
    private OrganizationType consignee;
    private InvoiceParticipantType buyer;
    private InvoiceParticipantType seler;
    private PersonSignatureType signature;
    private ShortCompanyDescType carier;
    private DocumentBaseType registration;
    private DeliveryTermsRUType deliveryTerms;
    private MarkType mark;
    private String documentModeID;

    /** 
     * Get the 'CurrencyCode' element value. Код иностранной валюты счета-проформы. Указывается, если суммы, указываемые в счете-фактуре, выражены в иностранной валюте.
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код иностранной валюты счета-проформы. Указывается, если суммы, указываемые в счете-фактуре, выражены в иностранной валюте.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'CurrencyRate' element value. Установленный курс иностранной валюты счета-проформы на дату счета-проформы. Указывается, если счет-проформа в иностранной валюте, курс  которой не равен курсы ЦБ.
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. Установленный курс иностранной валюты счета-проформы на дату счета-проформы. Указывается, если счет-проформа в иностранной валюте, курс  которой не равен курсы ЦБ.
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'PlacesQuantity' element value. Количество мест товара
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. Количество мест товара
     * 
     * @param placesQuantity
     */
    public void setPlacesQuantity(String placesQuantity) {
        this.placesQuantity = placesQuantity;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. Вес товара, брутто (кг)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. Вес товара, брутто (кг)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. Вес товара, нетто (кг)
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. Вес товара, нетто (кг)
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'Consignor' element value. Грузоотправитель и его адрес
     * 
     * @return value
     */
    public OrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Грузоотправитель и его адрес
     * 
     * @param consignor
     */
    public void setConsignor(OrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the list of 'InvoiceGoods' element items. Сведения о товарах счета-проформы
     * 
     * @return list
     */
    public List<RussianInvoiceGoodsType> getInvoiceGoodList() {
        return invoiceGoodList;
    }

    /** 
     * Set the list of 'InvoiceGoods' element items. Сведения о товарах счета-проформы
     * 
     * @param list
     */
    public void setInvoiceGoodList(List<RussianInvoiceGoodsType> list) {
        invoiceGoodList = list;
    }

    /** 
     * Get the 'Consignee' element value. Грузополучатель и его адрес
     * 
     * @return value
     */
    public OrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Грузополучатель и его адрес
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Buyer' element value. Сведения о покупателе
     * 
     * @return value
     */
    public InvoiceParticipantType getBuyer() {
        return buyer;
    }

    /** 
     * Set the 'Buyer' element value. Сведения о покупателе
     * 
     * @param buyer
     */
    public void setBuyer(InvoiceParticipantType buyer) {
        this.buyer = buyer;
    }

    /** 
     * Get the 'Seler' element value. Сведения о продавце
     * 
     * @return value
     */
    public InvoiceParticipantType getSeler() {
        return seler;
    }

    /** 
     * Set the 'Seler' element value. Сведения о продавце
     * 
     * @param seler
     */
    public void setSeler(InvoiceParticipantType seler) {
        this.seler = seler;
    }

    /** 
     * Get the 'Signature' element value. Подпись
     * 
     * @return value
     */
    public PersonSignatureType getSignature() {
        return signature;
    }

    /** 
     * Set the 'Signature' element value. Подпись
     * 
     * @param signature
     */
    public void setSignature(PersonSignatureType signature) {
        this.signature = signature;
    }

    /** 
     * Get the 'Carier' element value. Перевозчик
     * 
     * @return value
     */
    public ShortCompanyDescType getCarier() {
        return carier;
    }

    /** 
     * Set the 'Carier' element value. Перевозчик
     * 
     * @param carier
     */
    public void setCarier(ShortCompanyDescType carier) {
        this.carier = carier;
    }

    /** 
     * Get the 'Registration' element value. Регистрационные данные счета-проформы.
     * 
     * @return value
     */
    public DocumentBaseType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. Регистрационные данные счета-проформы.
     * 
     * @param registration
     */
    public void setRegistration(DocumentBaseType registration) {
        this.registration = registration;
    }

    /** 
     * Get the 'DeliveryTerms' element value. Условия поставки
     * 
     * @return value
     */
    public DeliveryTermsRUType getDeliveryTerms() {
        return deliveryTerms;
    }

    /** 
     * Set the 'DeliveryTerms' element value. Условия поставки
     * 
     * @param deliveryTerms
     */
    public void setDeliveryTerms(DeliveryTermsRUType deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }

    /** 
     * Get the 'Mark' element value. Отметки о прохождении товарами таможенного и иных видов государственного контроля.
     * 
     * @return value
     */
    public MarkType getMark() {
        return mark;
    }

    /** 
     * Set the 'Mark' element value. Отметки о прохождении товарами таможенного и иных видов государственного контроля.
     * 
     * @param mark
     */
    public void setMark(MarkType mark) {
        this.mark = mark;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}

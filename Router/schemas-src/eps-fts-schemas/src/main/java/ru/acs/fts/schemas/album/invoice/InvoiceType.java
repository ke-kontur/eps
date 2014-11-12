
package ru.acs.fts.schemas.album.invoice;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.InvoiceGoodsType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.MarkType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.TransportMeansType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Инвойс 
 */
public class InvoiceType extends BaseDocType
{
    private String currencyRate;
    private String currencyCode;
    private String placesQuantity;
    private String placesDescription;
    private String grossWeightQuantity;
    private String netWeightQuantity;
    private String GCost;
    private String discount;
    private String discountPercentage;
    private String transportCharges;
    private String insuranceCharges;
    private String otherCharges;
    private String totalCost;
    private String paymentPeriod;
    private InvoiceParticipantInfType buyer;
    private InvoiceParticipantInfType seler;
    private OrganizationType consignor;
    private OrganizationType consignee;
    private List<InvoiceGoodsType> invoiceGoodList = new ArrayList<InvoiceGoodsType>();
    private InvoiceDeliveryTermsType deliveryTerms;
    private List<TransportMeansType> transportMeanList = new ArrayList<TransportMeansType>();
    private DocumentBaseType registration;
    private DocumentBaseType contract;
    private List<DocumentBaseType> enclosureList = new ArrayList<DocumentBaseType>();
    private MarkType mark;
    private String documentModeID;

    /** 
     * Get the 'CurrencyRate' element value. Установленный курс иностранной валюты инвойса на дату инвойса. Указывается, если инвойс в иностранной валюте, курс  которой не равен курсы ЦБ.
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. Установленный курс иностранной валюты инвойса на дату инвойса. Указывается, если инвойс в иностранной валюте, курс  которой не равен курсы ЦБ.
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код иностранной валюты инвойса. 
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код иностранной валюты инвойса. 
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'PlacesQuantity' element value. Общее количество грузовых мест товара
     * 
     * @return value
     */
    public String getPlacesQuantity() {
        return placesQuantity;
    }

    /** 
     * Set the 'PlacesQuantity' element value. Общее количество грузовых мест товара
     * 
     * @param placesQuantity
     */
    public void setPlacesQuantity(String placesQuantity) {
        this.placesQuantity = placesQuantity;
    }

    /** 
     * Get the 'PlacesDescription' element value. Описание вида грузовых мест (коробок, упаковок, паллет и т.д.)
     * 
     * @return value
     */
    public String getPlacesDescription() {
        return placesDescription;
    }

    /** 
     * Set the 'PlacesDescription' element value. Описание вида грузовых мест (коробок, упаковок, паллет и т.д.)
     * 
     * @param placesDescription
     */
    public void setPlacesDescription(String placesDescription) {
        this.placesDescription = placesDescription;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. Общий вес брутто товаров (если в описании товаров нет данных, то значение вводится вручную - иначе - сумма веса брутто по товарам)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. Общий вес брутто товаров (если в описании товаров нет данных, то значение вводится вручную - иначе - сумма веса брутто по товарам)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. Общий вес нетто товаров (если в описании товаров нет данных, то значение вводится вручную - иначе - сумма веса нетто по товарам)
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. Общий вес нетто товаров (если в описании товаров нет данных, то значение вводится вручную - иначе - сумма веса нетто по товарам)
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'GCost' element value. Общая стоимость товаров по инвойсу
     * 
     * @return value
     */
    public String getGCost() {
        return GCost;
    }

    /** 
     * Set the 'GCost' element value. Общая стоимость товаров по инвойсу
     * 
     * @param GCost
     */
    public void setGCost(String GCost) {
        this.GCost = GCost;
    }

    /** 
     * Get the 'Discount' element value. Общая сумма скидки по инвойсу
     * 
     * @return value
     */
    public String getDiscount() {
        return discount;
    }

    /** 
     * Set the 'Discount' element value. Общая сумма скидки по инвойсу
     * 
     * @param discount
     */
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    /** 
     * Get the 'DiscountPercentage' element value. Общая сумма скидки по инвойсу, %
     * 
     * @return value
     */
    public String getDiscountPercentage() {
        return discountPercentage;
    }

    /** 
     * Set the 'DiscountPercentage' element value. Общая сумма скидки по инвойсу, %
     * 
     * @param discountPercentage
     */
    public void setDiscountPercentage(String discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    /** 
     * Get the 'TransportCharges' element value. Общая сумма транспортных расходов по инвойсу
     * 
     * @return value
     */
    public String getTransportCharges() {
        return transportCharges;
    }

    /** 
     * Set the 'TransportCharges' element value. Общая сумма транспортных расходов по инвойсу
     * 
     * @param transportCharges
     */
    public void setTransportCharges(String transportCharges) {
        this.transportCharges = transportCharges;
    }

    /** 
     * Get the 'InsuranceCharges' element value. Общая сумма расходов по страхованию по инвойсу
     * 
     * @return value
     */
    public String getInsuranceCharges() {
        return insuranceCharges;
    }

    /** 
     * Set the 'InsuranceCharges' element value. Общая сумма расходов по страхованию по инвойсу
     * 
     * @param insuranceCharges
     */
    public void setInsuranceCharges(String insuranceCharges) {
        this.insuranceCharges = insuranceCharges;
    }

    /** 
     * Get the 'OtherCharges' element value. Сумма прочих расходов по инвойсу
     * 
     * @return value
     */
    public String getOtherCharges() {
        return otherCharges;
    }

    /** 
     * Set the 'OtherCharges' element value. Сумма прочих расходов по инвойсу
     * 
     * @param otherCharges
     */
    public void setOtherCharges(String otherCharges) {
        this.otherCharges = otherCharges;
    }

    /** 
     * Get the 'TotalCost' element value. Общая стоимость по инвойсу с учетом расходов и скидки
     * 
     * @return value
     */
    public String getTotalCost() {
        return totalCost;
    }

    /** 
     * Set the 'TotalCost' element value. Общая стоимость по инвойсу с учетом расходов и скидки
     * 
     * @param totalCost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /** 
     * Get the 'PaymentPeriod' element value. Срок оплаты
     * 
     * @return value
     */
    public String getPaymentPeriod() {
        return paymentPeriod;
    }

    /** 
     * Set the 'PaymentPeriod' element value. Срок оплаты
     * 
     * @param paymentPeriod
     */
    public void setPaymentPeriod(String paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }

    /** 
     * Get the 'Buyer' element value. Сведения о покупателе
     * 
     * @return value
     */
    public InvoiceParticipantInfType getBuyer() {
        return buyer;
    }

    /** 
     * Set the 'Buyer' element value. Сведения о покупателе
     * 
     * @param buyer
     */
    public void setBuyer(InvoiceParticipantInfType buyer) {
        this.buyer = buyer;
    }

    /** 
     * Get the 'Seler' element value. Сведения о продавце
     * 
     * @return value
     */
    public InvoiceParticipantInfType getSeler() {
        return seler;
    }

    /** 
     * Set the 'Seler' element value. Сведения о продавце
     * 
     * @param seler
     */
    public void setSeler(InvoiceParticipantInfType seler) {
        this.seler = seler;
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
     * Get the 'Consignee' element value. Грузополучатель
     * 
     * @return value
     */
    public OrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Грузополучатель
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the list of 'InvoiceGoods' element items. Сведения о товарах инвойса
     * 
     * @return list
     */
    public List<InvoiceGoodsType> getInvoiceGoodList() {
        return invoiceGoodList;
    }

    /** 
     * Set the list of 'InvoiceGoods' element items. Сведения о товарах инвойса
     * 
     * @param list
     */
    public void setInvoiceGoodList(List<InvoiceGoodsType> list) {
        invoiceGoodList = list;
    }

    /** 
     * Get the 'DeliveryTerms' element value. Описание условий поставки
     * 
     * @return value
     */
    public InvoiceDeliveryTermsType getDeliveryTerms() {
        return deliveryTerms;
    }

    /** 
     * Set the 'DeliveryTerms' element value. Описание условий поставки
     * 
     * @param deliveryTerms
     */
    public void setDeliveryTerms(InvoiceDeliveryTermsType deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }

    /** 
     * Get the list of 'TransportMeans' element items. Описание транспортного средства для перевозки товаров
     * 
     * @return list
     */
    public List<TransportMeansType> getTransportMeanList() {
        return transportMeanList;
    }

    /** 
     * Set the list of 'TransportMeans' element items. Описание транспортного средства для перевозки товаров
     * 
     * @param list
     */
    public void setTransportMeanList(List<TransportMeansType> list) {
        transportMeanList = list;
    }

    /** 
     * Get the 'Registration' element value. Регистрационные данные инвойса
     * 
     * @return value
     */
    public DocumentBaseType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. Регистрационные данные инвойса
     * 
     * @param registration
     */
    public void setRegistration(DocumentBaseType registration) {
        this.registration = registration;
    }

    /** 
     * Get the 'Contract' element value. Дата и номер контракта
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. Дата и номер контракта
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the list of 'Enclosure' element items. Дата и номер дополнений, изменений, приложений, спецификаций
     * 
     * @return list
     */
    public List<DocumentBaseType> getEnclosureList() {
        return enclosureList;
    }

    /** 
     * Set the list of 'Enclosure' element items. Дата и номер дополнений, изменений, приложений, спецификаций
     * 
     * @param list
     */
    public void setEnclosureList(List<DocumentBaseType> list) {
        enclosureList = list;
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


package ru.acs.fts.schemas.album.waybillexpressindividual;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DimensionsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsPackagingType;

/** 
 * Товар 
 */
public class GoodsType
{
    private String commonWayBillNumber;
    private String name;
    private String TNVED;
    private String netWeight;
    private String grossWeight;
    private String invoicedCost;
    private String customsCost;
    private OrganizationBaseType receiverByCommonWayBill;
    private ESADGoodsPackagingType packaging;
    private DimensionsType dimensions;
    private CustomsPaymentType customsPayment;

    /** 
     * Get the 'CommonWayBillNumber' element value. Номер общей накладной на товар
     * 
     * @return value
     */
    public String getCommonWayBillNumber() {
        return commonWayBillNumber;
    }

    /** 
     * Set the 'CommonWayBillNumber' element value. Номер общей накладной на товар
     * 
     * @param commonWayBillNumber
     */
    public void setCommonWayBillNumber(String commonWayBillNumber) {
        this.commonWayBillNumber = commonWayBillNumber;
    }

    /** 
     * Get the 'Name' element value. Наименование
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'TNVED' element value. Код товара по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getTNVED() {
        return TNVED;
    }

    /** 
     * Set the 'TNVED' element value. Код товара по ТН ВЭД ТС
     * 
     * @param TNVED
     */
    public void setTNVED(String TNVED) {
        this.TNVED = TNVED;
    }

    /** 
     * Get the 'NetWeight' element value. Вес товара нетто, кг 
     * 
     * @return value
     */
    public String getNetWeight() {
        return netWeight;
    }

    /** 
     * Set the 'NetWeight' element value. Вес товара нетто, кг 
     * 
     * @param netWeight
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    /** 
     * Get the 'GrossWeight' element value. Вес товара брутто, кг 
     * 
     * @return value
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /** 
     * Set the 'GrossWeight' element value. Вес товара брутто, кг 
     * 
     * @param grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /** 
     * Get the 'InvoicedCost' element value. Стоимость
     * 
     * @return value
     */
    public String getInvoicedCost() {
        return invoicedCost;
    }

    /** 
     * Set the 'InvoicedCost' element value. Стоимость
     * 
     * @param invoicedCost
     */
    public void setInvoicedCost(String invoicedCost) {
        this.invoicedCost = invoicedCost;
    }

    /** 
     * Get the 'CustomsCost' element value. Таможенная стоимость
     * 
     * @return value
     */
    public String getCustomsCost() {
        return customsCost;
    }

    /** 
     * Set the 'CustomsCost' element value. Таможенная стоимость
     * 
     * @param customsCost
     */
    public void setCustomsCost(String customsCost) {
        this.customsCost = customsCost;
    }

    /** 
     * Get the 'ReceiverByCommonWayBill' element value. Получатель по общей накладной на товар
     * 
     * @return value
     */
    public OrganizationBaseType getReceiverByCommonWayBill() {
        return receiverByCommonWayBill;
    }

    /** 
     * Set the 'ReceiverByCommonWayBill' element value. Получатель по общей накладной на товар
     * 
     * @param receiverByCommonWayBill
     */
    public void setReceiverByCommonWayBill(
            OrganizationBaseType receiverByCommonWayBill) {
        this.receiverByCommonWayBill = receiverByCommonWayBill;
    }

    /** 
     * Get the 'Packaging' element value. Сведения об упаковке товара
     * 
     * @return value
     */
    public ESADGoodsPackagingType getPackaging() {
        return packaging;
    }

    /** 
     * Set the 'Packaging' element value. Сведения об упаковке товара
     * 
     * @param packaging
     */
    public void setPackaging(ESADGoodsPackagingType packaging) {
        this.packaging = packaging;
    }

    /** 
     * Get the 'Dimensions' element value. Габариты товара
     * 
     * @return value
     */
    public DimensionsType getDimensions() {
        return dimensions;
    }

    /** 
     * Set the 'Dimensions' element value. Габариты товара
     * 
     * @param dimensions
     */
    public void setDimensions(DimensionsType dimensions) {
        this.dimensions = dimensions;
    }

    /** 
     * Get the 'CustomsPayment' element value. Таможенные платежи
     * 
     * @return value
     */
    public CustomsPaymentType getCustomsPayment() {
        return customsPayment;
    }

    /** 
     * Set the 'CustomsPayment' element value. Таможенные платежи
     * 
     * @param customsPayment
     */
    public void setCustomsPayment(CustomsPaymentType customsPayment) {
        this.customsPayment = customsPayment;
    }
}

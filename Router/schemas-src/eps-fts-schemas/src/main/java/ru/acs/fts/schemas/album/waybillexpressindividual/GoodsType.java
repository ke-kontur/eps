
package ru.acs.fts.schemas.album.waybillexpressindividual;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DimensionsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsPackagingType;

/** 
 * ����� 
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
     * Get the 'CommonWayBillNumber' element value. ����� ����� ��������� �� �����
     * 
     * @return value
     */
    public String getCommonWayBillNumber() {
        return commonWayBillNumber;
    }

    /** 
     * Set the 'CommonWayBillNumber' element value. ����� ����� ��������� �� �����
     * 
     * @param commonWayBillNumber
     */
    public void setCommonWayBillNumber(String commonWayBillNumber) {
        this.commonWayBillNumber = commonWayBillNumber;
    }

    /** 
     * Get the 'Name' element value. ������������
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ������������
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'TNVED' element value. ��� ������ �� �� ��� ��
     * 
     * @return value
     */
    public String getTNVED() {
        return TNVED;
    }

    /** 
     * Set the 'TNVED' element value. ��� ������ �� �� ��� ��
     * 
     * @param TNVED
     */
    public void setTNVED(String TNVED) {
        this.TNVED = TNVED;
    }

    /** 
     * Get the 'NetWeight' element value. ��� ������ �����, �� 
     * 
     * @return value
     */
    public String getNetWeight() {
        return netWeight;
    }

    /** 
     * Set the 'NetWeight' element value. ��� ������ �����, �� 
     * 
     * @param netWeight
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    /** 
     * Get the 'GrossWeight' element value. ��� ������ ������, �� 
     * 
     * @return value
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /** 
     * Set the 'GrossWeight' element value. ��� ������ ������, �� 
     * 
     * @param grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /** 
     * Get the 'InvoicedCost' element value. ���������
     * 
     * @return value
     */
    public String getInvoicedCost() {
        return invoicedCost;
    }

    /** 
     * Set the 'InvoicedCost' element value. ���������
     * 
     * @param invoicedCost
     */
    public void setInvoicedCost(String invoicedCost) {
        this.invoicedCost = invoicedCost;
    }

    /** 
     * Get the 'CustomsCost' element value. ���������� ���������
     * 
     * @return value
     */
    public String getCustomsCost() {
        return customsCost;
    }

    /** 
     * Set the 'CustomsCost' element value. ���������� ���������
     * 
     * @param customsCost
     */
    public void setCustomsCost(String customsCost) {
        this.customsCost = customsCost;
    }

    /** 
     * Get the 'ReceiverByCommonWayBill' element value. ���������� �� ����� ��������� �� �����
     * 
     * @return value
     */
    public OrganizationBaseType getReceiverByCommonWayBill() {
        return receiverByCommonWayBill;
    }

    /** 
     * Set the 'ReceiverByCommonWayBill' element value. ���������� �� ����� ��������� �� �����
     * 
     * @param receiverByCommonWayBill
     */
    public void setReceiverByCommonWayBill(
            OrganizationBaseType receiverByCommonWayBill) {
        this.receiverByCommonWayBill = receiverByCommonWayBill;
    }

    /** 
     * Get the 'Packaging' element value. �������� �� �������� ������
     * 
     * @return value
     */
    public ESADGoodsPackagingType getPackaging() {
        return packaging;
    }

    /** 
     * Set the 'Packaging' element value. �������� �� �������� ������
     * 
     * @param packaging
     */
    public void setPackaging(ESADGoodsPackagingType packaging) {
        this.packaging = packaging;
    }

    /** 
     * Get the 'Dimensions' element value. �������� ������
     * 
     * @return value
     */
    public DimensionsType getDimensions() {
        return dimensions;
    }

    /** 
     * Set the 'Dimensions' element value. �������� ������
     * 
     * @param dimensions
     */
    public void setDimensions(DimensionsType dimensions) {
        this.dimensions = dimensions;
    }

    /** 
     * Get the 'CustomsPayment' element value. ���������� �������
     * 
     * @return value
     */
    public CustomsPaymentType getCustomsPayment() {
        return customsPayment;
    }

    /** 
     * Set the 'CustomsPayment' element value. ���������� �������
     * 
     * @param customsPayment
     */
    public void setCustomsPayment(CustomsPaymentType customsPayment) {
        this.customsPayment = customsPayment;
    }
}

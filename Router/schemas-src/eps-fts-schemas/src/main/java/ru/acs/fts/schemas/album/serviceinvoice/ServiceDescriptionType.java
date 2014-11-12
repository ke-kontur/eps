
package ru.acs.fts.schemas.album.serviceinvoice;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� ����������� �����, ��������� �����
 */
public class ServiceDescriptionType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String GCost;
    private String currencyCode;
    private String serviceName;
    private String insuranceRate;
    private String taxRate;
    private String taxSum;
    private SupplementaryQuantityType goodsQuantity;
    private PaymentDetailsType insuranceSum;
    private PaymentDetailsType servicePrice;
    private PaymentDetailsType transportCost;
    private PaymentDetailsType loadingCost;
    private PaymentDetailsType serviceCost;

    /** 
     * Get the list of 'GoodsDescription' element items. �������� ������ ���������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. �������� ������ ���������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GCost' element value. C�������� ������
     * 
     * @return value
     */
    public String getGCost() {
        return GCost;
    }

    /** 
     * Set the 'GCost' element value. C�������� ������
     * 
     * @param GCost
     */
    public void setGCost(String GCost) {
        this.GCost = GCost;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������ ��������� (����)
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������ ��������� (����)
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'ServiceName' element value. ������������ ����������� �����, ��������� �����
     * 
     * @return value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** 
     * Set the 'ServiceName' element value. ������������ ����������� �����, ��������� �����
     * 
     * @param serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /** 
     * Get the 'InsuranceRate' element value. ����� ���������� ������ (%)
     * 
     * @return value
     */
    public String getInsuranceRate() {
        return insuranceRate;
    }

    /** 
     * Set the 'InsuranceRate' element value. ����� ���������� ������ (%)
     * 
     * @param insuranceRate
     */
    public void setInsuranceRate(String insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

    /** 
     * Get the 'TaxRate' element value. ��������� ������ (%)
     * 
     * @return value
     */
    public String getTaxRate() {
        return taxRate;
    }

    /** 
     * Set the 'TaxRate' element value. ��������� ������ (%)
     * 
     * @param taxRate
     */
    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    /** 
     * Get the 'TaxSum' element value. ����� ������
     * 
     * @return value
     */
    public String getTaxSum() {
        return taxSum;
    }

    /** 
     * Set the 'TaxSum' element value. ����� ������
     * 
     * @param taxSum
     */
    public void setTaxSum(String taxSum) {
        this.taxSum = taxSum;
    }

    /** 
     * Get the 'GoodsQuantity' element value. ���������� ������ � �������� ���������
     * 
     * @return value
     */
    public SupplementaryQuantityType getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. ���������� ������ � �������� ���������
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(SupplementaryQuantityType goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'InsuranceSum' element value. ��������� �����
     * 
     * @return value
     */
    public PaymentDetailsType getInsuranceSum() {
        return insuranceSum;
    }

    /** 
     * Set the 'InsuranceSum' element value. ��������� �����
     * 
     * @param insuranceSum
     */
    public void setInsuranceSum(PaymentDetailsType insuranceSum) {
        this.insuranceSum = insuranceSum;
    }

    /** 
     * Get the 'ServicePrice' element value. ���� (�����) �����, ����� �� ������� ���������
     * 
     * @return value
     */
    public PaymentDetailsType getServicePrice() {
        return servicePrice;
    }

    /** 
     * Set the 'ServicePrice' element value. ���� (�����) �����, ����� �� ������� ���������
     * 
     * @param servicePrice
     */
    public void setServicePrice(PaymentDetailsType servicePrice) {
        this.servicePrice = servicePrice;
    }

    /** 
     * Get the 'TransportCost' element value. ��������� ����� �� ��������� (���������������) �������, ����� ��� ������
     * 
     * @return value
     */
    public PaymentDetailsType getTransportCost() {
        return transportCost;
    }

    /** 
     * Set the 'TransportCost' element value. ��������� ����� �� ��������� (���������������) �������, ����� ��� ������
     * 
     * @param transportCost
     */
    public void setTransportCost(PaymentDetailsType transportCost) {
        this.transportCost = transportCost;
    }

    /** 
     * Get the 'LoadingCost' element value. ��������� ����� �� �������� ����������/��������� �������, ����� ��� ������
     * 
     * @return value
     */
    public PaymentDetailsType getLoadingCost() {
        return loadingCost;
    }

    /** 
     * Set the 'LoadingCost' element value. ��������� ����� �� �������� ����������/��������� �������, ����� ��� ������
     * 
     * @param loadingCost
     */
    public void setLoadingCost(PaymentDetailsType loadingCost) {
        this.loadingCost = loadingCost;
    }

    /** 
     * Get the 'ServiceCost' element value. ��������� �����, �����/��������� �����, ����� � ������ ������
     * 
     * @return value
     */
    public PaymentDetailsType getServiceCost() {
        return serviceCost;
    }

    /** 
     * Set the 'ServiceCost' element value. ��������� �����, �����/��������� �����, ����� � ������ ������
     * 
     * @param serviceCost
     */
    public void setServiceCost(PaymentDetailsType serviceCost) {
        this.serviceCost = serviceCost;
    }
}

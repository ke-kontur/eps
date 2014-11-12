
package ru.acs.fts.schemas.album.staticform;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� � �������
 */
public class GoodsInfoType
{
    private String custCostCurrencyCode;
    private String goodsTNVEDCode;
    private String goodsDescription;
    private String netWeightQuantity;
    private String invoicedCost;
    private String statisticalCostRUB;
    private String statisticalCostUSD;
    private CountryInfoType originCountry;
    private SupplementaryQuantityType supplementaryQuantity;

    /** 
     * Get the 'CustCostCurrencyCode' element value. ��� ������ ���� ������ � ������������ � ��������������� �����.
     * 
     * @return value
     */
    public String getCustCostCurrencyCode() {
        return custCostCurrencyCode;
    }

    /** 
     * Set the 'CustCostCurrencyCode' element value. ��� ������ ���� ������ � ������������ � ��������������� �����.
     * 
     * @param custCostCurrencyCode
     */
    public void setCustCostCurrencyCode(String custCostCurrencyCode) {
        this.custCostCurrencyCode = custCostCurrencyCode;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'GoodsDescription' element value. ������������ (��������, ������������ ��� ���� ������������ ������������) �������.
     * 
     * @return value
     */
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. ������������ (��������, ������������ ��� ���� ������������ ������������) �������.
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. ��� ������, ����� (��).
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. ��� ������, ����� (��).
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'InvoicedCost' element value. ���� ������.
     * 
     * @return value
     */
    public String getInvoicedCost() {
        return invoicedCost;
    }

    /** 
     * Set the 'InvoicedCost' element value. ���� ������.
     * 
     * @param invoicedCost
     */
    public void setInvoicedCost(String invoicedCost) {
        this.invoicedCost = invoicedCost;
    }

    /** 
     * Get the 'StatisticalCostRUB' element value. �������������� ��������� (� ������)
     * 
     * @return value
     */
    public String getStatisticalCostRUB() {
        return statisticalCostRUB;
    }

    /** 
     * Set the 'StatisticalCostRUB' element value. �������������� ��������� (� ������)
     * 
     * @param statisticalCostRUB
     */
    public void setStatisticalCostRUB(String statisticalCostRUB) {
        this.statisticalCostRUB = statisticalCostRUB;
    }

    /** 
     * Get the 'StatisticalCostUSD' element value. �������������� ��������� (� �������� ���)
     * 
     * @return value
     */
    public String getStatisticalCostUSD() {
        return statisticalCostUSD;
    }

    /** 
     * Set the 'StatisticalCostUSD' element value. �������������� ��������� (� �������� ���)
     * 
     * @param statisticalCostUSD
     */
    public void setStatisticalCostUSD(String statisticalCostUSD) {
        this.statisticalCostUSD = statisticalCostUSD;
    }

    /** 
     * Get the 'OriginCountry' element value. ������ �������������
     * 
     * @return value
     */
    public CountryInfoType getOriginCountry() {
        return originCountry;
    }

    /** 
     * Set the 'OriginCountry' element value. ������ �������������
     * 
     * @param originCountry
     */
    public void setOriginCountry(CountryInfoType originCountry) {
        this.originCountry = originCountry;
    }

    /** 
     * Get the 'SupplementaryQuantity' element value. ���������� � �������������� ������� ���������
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryQuantity() {
        return supplementaryQuantity;
    }

    /** 
     * Set the 'SupplementaryQuantity' element value. ���������� � �������������� ������� ���������
     * 
     * @param supplementaryQuantity
     */
    public void setSupplementaryQuantity(
            SupplementaryQuantityType supplementaryQuantity) {
        this.supplementaryQuantity = supplementaryQuantity;
    }
}

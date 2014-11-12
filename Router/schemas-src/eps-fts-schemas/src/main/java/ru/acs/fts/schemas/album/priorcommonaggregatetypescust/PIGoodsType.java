
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � ������
 */
public class PIGoodsType extends PriorGoodsBaseType
{
    private List<String> containerNumberList = new ArrayList<String>();
    private String originCountryCode;
    private String invoicedCost;
    private String currencyCode;
    private String currencyRate;
    private GoodsMeasureQuantityType goodsMeasureQuantity;
    private List<GoodsPackagingType> goodsPackagingList = new ArrayList<GoodsPackagingType>();

    /** 
     * Get the list of 'ContainerNumbers' element items. ������ �����������
     * 
     * @return list
     */
    public List<String> getContainerNumberList() {
        return containerNumberList;
    }

    /** 
     * Set the list of 'ContainerNumbers' element items. ������ �����������
     * 
     * @param list
     */
    public void setContainerNumberList(List<String> list) {
        containerNumberList = list;
    }

    /** 
     * Get the 'OriginCountryCode' element value. ��������� ��� ������ ������������� ������.
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. ��������� ��� ������ ������������� ������.
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    /** 
     * Get the 'InvoicedCost' element value. ��������� ���������
     * 
     * @return value
     */
    public String getInvoicedCost() {
        return invoicedCost;
    }

    /** 
     * Set the 'InvoicedCost' element value. ��������� ���������
     * 
     * @param invoicedCost
     */
    public void setInvoicedCost(String invoicedCost) {
        this.invoicedCost = invoicedCost;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��������� ��� ������
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��������� ��� ������
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'CurrencyRate' element value. ���� ������
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. ���� ������
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'GoodsMeasureQuantity' element value. ���������� ������ � �������������� �������� ���������
     * 
     * @return value
     */
    public GoodsMeasureQuantityType getGoodsMeasureQuantity() {
        return goodsMeasureQuantity;
    }

    /** 
     * Set the 'GoodsMeasureQuantity' element value. ���������� ������ � �������������� �������� ���������
     * 
     * @param goodsMeasureQuantity
     */
    public void setGoodsMeasureQuantity(
            GoodsMeasureQuantityType goodsMeasureQuantity) {
        this.goodsMeasureQuantity = goodsMeasureQuantity;
    }

    /** 
     * Get the list of 'GoodsPackaging' element items. �������� � �������� ������, � �������� �������
     * 
     * @return list
     */
    public List<GoodsPackagingType> getGoodsPackagingList() {
        return goodsPackagingList;
    }

    /** 
     * Set the list of 'GoodsPackaging' element items. �������� � �������� ������, � �������� �������
     * 
     * @param list
     */
    public void setGoodsPackagingList(List<GoodsPackagingType> list) {
        goodsPackagingList = list;
    }
}

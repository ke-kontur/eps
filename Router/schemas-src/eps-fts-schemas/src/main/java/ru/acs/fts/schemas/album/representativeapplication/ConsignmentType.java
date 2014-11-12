
package ru.acs.fts.schemas.album.representativeapplication;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * �������� � ������
 */
public class ConsignmentType
{
    private String currencyRate;
    private String currencyRubleRate;
    private String currency;
    private String grossWeight;
    private String goodsCost;
    private String goodsCostEuro;
    private String goodsCostRuble;
    private CUOrganizationType consignor;
    private ConsigneeType consignee;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private List<WayBillType> wayBillList = new ArrayList<WayBillType>();

    /** 
     * Get the 'CurrencyRate' element value. ���� ������ ����� (������) � ����
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. ���� ������ ����� (������) � ����
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'CurrencyRubleRate' element value. ���� ������ ����� (������) � �����
     * 
     * @return value
     */
    public String getCurrencyRubleRate() {
        return currencyRubleRate;
    }

    /** 
     * Set the 'CurrencyRubleRate' element value. ���� ������ ����� (������) � �����
     * 
     * @param currencyRubleRate
     */
    public void setCurrencyRubleRate(String currencyRubleRate) {
        this.currencyRubleRate = currencyRubleRate;
    }

    /** 
     * Get the 'Currency' element value. ��� ������ ����� (������)
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. ��� ������ ����� (������)
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'GrossWeight' element value. ��� �������, ������, ��
     * 
     * @return value
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /** 
     * Set the 'GrossWeight' element value. ��� �������, ������, ��
     * 
     * @param grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /** 
     * Get the 'GoodsCost' element value. ��������� ������� � ������ ����� (������)
     * 
     * @return value
     */
    public String getGoodsCost() {
        return goodsCost;
    }

    /** 
     * Set the 'GoodsCost' element value. ��������� ������� � ������ ����� (������)
     * 
     * @param goodsCost
     */
    public void setGoodsCost(String goodsCost) {
        this.goodsCost = goodsCost;
    }

    /** 
     * Get the 'GoodsCostEuro' element value. ��������� ������� � ����
     * 
     * @return value
     */
    public String getGoodsCostEuro() {
        return goodsCostEuro;
    }

    /** 
     * Set the 'GoodsCostEuro' element value. ��������� ������� � ����
     * 
     * @param goodsCostEuro
     */
    public void setGoodsCostEuro(String goodsCostEuro) {
        this.goodsCostEuro = goodsCostEuro;
    }

    /** 
     * Get the 'GoodsCostRuble' element value. ��������� ������� � ������
     * 
     * @return value
     */
    public String getGoodsCostRuble() {
        return goodsCostRuble;
    }

    /** 
     * Set the 'GoodsCostRuble' element value. ��������� ������� � ������
     * 
     * @param goodsCostRuble
     */
    public void setGoodsCostRuble(String goodsCostRuble) {
        this.goodsCostRuble = goodsCostRuble;
    }

    /** 
     * Get the 'Consignor' element value. �����������
     * 
     * @return value
     */
    public CUOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. �����������
     * 
     * @param consignor
     */
    public void setConsignor(CUOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. ����������
     * 
     * @return value
     */
    public ConsigneeType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ����������
     * 
     * @param consignee
     */
    public void setConsignee(ConsigneeType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the list of 'Goods' element items. �������� � �������
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� � �������
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the list of 'WayBill' element items. �������� � ���������
     * 
     * @return list
     */
    public List<WayBillType> getWayBillList() {
        return wayBillList;
    }

    /** 
     * Set the list of 'WayBill' element items. �������� � ���������
     * 
     * @param list
     */
    public void setWayBillList(List<WayBillType> list) {
        wayBillList = list;
    }
}

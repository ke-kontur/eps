
package ru.acs.fts.schemas.album.rspconfirmationtarget;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� �������
 */
public class GoodsDescriptionType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String contractCost;
    private String statisticalCost;
    private String contractCurrency;
    private String goodNumber;
    private String goodMark;
    private SupplementaryQuantityType quantity;
    private SupplementaryQuantityType supplementaryQuantity;

    /** 
     * Get the list of 'GoodsDescription' element items. ������������ ������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. ������������ ������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'ContractCost' element value. ��������� ������ (� ������ ���������)
     * 
     * @return value
     */
    public String getContractCost() {
        return contractCost;
    }

    /** 
     * Set the 'ContractCost' element value. ��������� ������ (� ������ ���������)
     * 
     * @param contractCost
     */
    public void setContractCost(String contractCost) {
        this.contractCost = contractCost;
    }

    /** 
     * Get the 'StatisticalCost' element value. �������������� ��������� ������ (USD)
     * 
     * @return value
     */
    public String getStatisticalCost() {
        return statisticalCost;
    }

    /** 
     * Set the 'StatisticalCost' element value. �������������� ��������� ������ (USD)
     * 
     * @param statisticalCost
     */
    public void setStatisticalCost(String statisticalCost) {
        this.statisticalCost = statisticalCost;
    }

    /** 
     * Get the 'ContractCurrency' element value. ������ ���������
     * 
     * @return value
     */
    public String getContractCurrency() {
        return contractCurrency;
    }

    /** 
     * Set the 'ContractCurrency' element value. ������ ���������
     * 
     * @param contractCurrency
     */
    public void setContractCurrency(String contractCurrency) {
        this.contractCurrency = contractCurrency;
    }

    /** 
     * Get the 'GoodNumber' element value. ����� ������
     * 
     * @return value
     */
    public String getGoodNumber() {
        return goodNumber;
    }

    /** 
     * Set the 'GoodNumber' element value. ����� ������
     * 
     * @param goodNumber
     */
    public void setGoodNumber(String goodNumber) {
        this.goodNumber = goodNumber;
    }

    /** 
     * Get the 'GoodMark' element value. ����� ������
     * 
     * @return value
     */
    public String getGoodMark() {
        return goodMark;
    }

    /** 
     * Set the 'GoodMark' element value. ����� ������
     * 
     * @param goodMark
     */
    public void setGoodMark(String goodMark) {
        this.goodMark = goodMark;
    }

    /** 
     * Get the 'Quantity' element value. ����������
     * 
     * @return value
     */
    public SupplementaryQuantityType getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ����������
     * 
     * @param quantity
     */
    public void setQuantity(SupplementaryQuantityType quantity) {
        this.quantity = quantity;
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

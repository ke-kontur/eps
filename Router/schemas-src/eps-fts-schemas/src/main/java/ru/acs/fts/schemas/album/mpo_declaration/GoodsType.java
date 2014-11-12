
package ru.acs.fts.schemas.album.mpo_declaration;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� � �������
 */
public class GoodsType
{
    private List<String> goodDescriptionList = new ArrayList<String>();
    private String netWeight;
    private String TNVEDCode;
    private String cost;
    private String currencyCode;
    private String originCountryCode;
    private SupplementaryQuantityType goodsQuantity;

    /** 
     * Get the list of 'GoodDescription' element items. ������������ ������
     * 
     * @return list
     */
    public List<String> getGoodDescriptionList() {
        return goodDescriptionList;
    }

    /** 
     * Set the list of 'GoodDescription' element items. ������������ ������
     * 
     * @param list
     */
    public void setGoodDescriptionList(List<String> list) {
        goodDescriptionList = list;
    }

    /** 
     * Get the 'NetWeight' element value. ��� ������, ����� (��)
     * 
     * @return value
     */
    public String getNetWeight() {
        return netWeight;
    }

    /** 
     * Set the 'NetWeight' element value. ��� ������, ����� (��)
     * 
     * @param netWeight
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    /** 
     * Get the 'TNVEDCode' element value. ��� ������ �� �� ���
     * 
     * @return value
     */
    public String getTNVEDCode() {
        return TNVEDCode;
    }

    /** 
     * Set the 'TNVEDCode' element value. ��� ������ �� �� ���
     * 
     * @param TNVEDCode
     */
    public void setTNVEDCode(String TNVEDCode) {
        this.TNVEDCode = TNVEDCode;
    }

    /** 
     * Get the 'Cost' element value. ��������� ������
     * 
     * @return value
     */
    public String getCost() {
        return cost;
    }

    /** 
     * Set the 'Cost' element value. ��������� ������
     * 
     * @param cost
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'OriginCountryCode' element value. ��� ������ ������������� �� �������������� ����� ����
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. ��� ������ ������������� �� �������������� ����� ����
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    /** 
     * Get the 'GoodsQuantity' element value. ���������� ������
     * 
     * @return value
     */
    public SupplementaryQuantityType getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. ���������� ������
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(SupplementaryQuantityType goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }
}

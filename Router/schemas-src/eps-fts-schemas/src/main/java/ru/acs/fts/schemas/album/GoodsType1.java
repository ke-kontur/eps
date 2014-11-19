
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� � �������
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:ExchangeDocuments:NotifTobaccoPrices:5.4.5" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GoodsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="GoodsTNVEDCode"/>
 *     &lt;xs:element type="xs:string" name="GoodsDescription" maxOccurs="4"/>
 *     &lt;xs:element type="xs:string" name="GoodsKind"/>
 *     &lt;xs:element type="xs:string" name="MinPrice"/>
 *     &lt;xs:element type="xs:string" name="MaxPrice"/>
 *     &lt;xs:element type="xs:string" name="CurrencyCode" minOccurs="0"/>
 *     &lt;xs:element type="ns:SupplementaryQuantityType" name="QuantityPerPackage"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class GoodsType1
{
    private String goodsTNVEDCode;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodsKind;
    private String minPrice;
    private String maxPrice;
    private String currencyCode;
    private SupplementaryQuantityType quantityPerPackage;

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
     * Get the list of 'GoodsDescription' element items. ������������ (�����) ������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. ������������ (�����) ������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GoodsKind' element value. ��� ��������� �������: 0 - �������� � ��������; 1 - �������� ��� �������; 2 - ��������
     * 
     * @return value
     */
    public String getGoodsKind() {
        return goodsKind;
    }

    /** 
     * Set the 'GoodsKind' element value. ��� ��������� �������: 0 - �������� � ��������; 1 - �������� ��� �������; 2 - ��������
     * 
     * @param goodsKind
     */
    public void setGoodsKind(String goodsKind) {
        this.goodsKind = goodsKind;
    }

    /** 
     * Get the 'MinPrice' element value. ����������� ��������� ���� �� ������� ��������������� �������� (�����)
     * 
     * @return value
     */
    public String getMinPrice() {
        return minPrice;
    }

    /** 
     * Set the 'MinPrice' element value. ����������� ��������� ���� �� ������� ��������������� �������� (�����)
     * 
     * @param minPrice
     */
    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }

    /** 
     * Get the 'MaxPrice' element value. ������������ ��������� ���� �� ������� ��������������� �������� (�����)
     * 
     * @return value
     */
    public String getMaxPrice() {
        return maxPrice;
    }

    /** 
     * Set the 'MaxPrice' element value. ������������ ��������� ���� �� ������� ��������������� �������� (�����)
     * 
     * @param maxPrice
     */
    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
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
     * Get the 'QuantityPerPackage' element value. ���������� � ��������
     * 
     * @return value
     */
    public SupplementaryQuantityType getQuantityPerPackage() {
        return quantityPerPackage;
    }

    /** 
     * Set the 'QuantityPerPackage' element value. ���������� � ��������
     * 
     * @param quantityPerPackage
     */
    public void setQuantityPerPackage(
            SupplementaryQuantityType quantityPerPackage) {
        this.quantityPerPackage = quantityPerPackage;
    }
}

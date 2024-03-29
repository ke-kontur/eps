
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� � �������
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:CustomsDocuments:RefusalInFavorOfStateApplic:5.4.3" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GoodsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="GoodDescription" maxOccurs="4"/>
 *     &lt;xs:element type="xs:string" name="GoodsTNVEDCode"/>
 *     &lt;xs:element type="xs:string" name="Cost" minOccurs="0"/>
 *     &lt;xs:element type="ns:SupplementaryQuantityType" name="GoodsQuantity" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class GoodsType2
{
    private List<String> goodDescriptionList = new ArrayList<String>();
    private String goodsTNVEDCode;
    private String cost;
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

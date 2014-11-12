
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;

/** 
 * Тип, описывающий товар, на котором выявлен ПР/ЦПР
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:DTRevealedRisks:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GoodsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="GoodsNumber"/>
 *     &lt;xs:element type="ns:ProfileRefType" name="ProfileRef" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class GoodsType
{
    private String goodsNumber;
    private List<ProfileRefType> profileRefList = new ArrayList<ProfileRefType>();

    /** 
     * Get the 'GoodsNumber' element value. Порядковый номер товара
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. Порядковый номер товара
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the list of 'ProfileRef' element items. Ссылки на ПР/ЦПР, которые сработали на конкретный товар
     * 
     * @return list
     */
    public List<ProfileRefType> getProfileRefList() {
        return profileRefList;
    }

    /** 
     * Set the list of 'ProfileRef' element items. Ссылки на ПР/ЦПР, которые сработали на конкретный товар
     * 
     * @param list
     */
    public void setProfileRefList(List<ProfileRefType> list) {
        profileRefList = list;
    }
}

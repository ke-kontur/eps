
package ru.acs.fts.schemas.album.ownershiptransferdoc;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� � ������
 */
public class GoodsInfoType extends SupplementaryQuantityType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodsCost;
    private String goodsCountry;

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
     * Get the 'GoodsCost' element value. ���� ������
     * 
     * @return value
     */
    public String getGoodsCost() {
        return goodsCost;
    }

    /** 
     * Set the 'GoodsCost' element value. ���� ������
     * 
     * @param goodsCost
     */
    public void setGoodsCost(String goodsCost) {
        this.goodsCost = goodsCost;
    }

    /** 
     * Get the 'GoodsCountry' element value. ������ ������������� ������
     * 
     * @return value
     */
    public String getGoodsCountry() {
        return goodsCountry;
    }

    /** 
     * Set the 'GoodsCountry' element value. ������ ������������� ������
     * 
     * @param goodsCountry
     */
    public void setGoodsCountry(String goodsCountry) {
        this.goodsCountry = goodsCountry;
    }
}

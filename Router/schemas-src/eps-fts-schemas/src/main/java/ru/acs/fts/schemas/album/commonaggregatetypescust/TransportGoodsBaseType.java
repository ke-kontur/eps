
package ru.acs.fts.schemas.album.commonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� �������. �������
 */
public class TransportGoodsBaseType
{
    private String goodsMarking;
    private List<String> goodsDescriptionList = new ArrayList<String>();

    /** 
     * Get the 'GoodsMarking' element value. ����� � ����� �����
     * 
     * @return value
     */
    public String getGoodsMarking() {
        return goodsMarking;
    }

    /** 
     * Set the 'GoodsMarking' element value. ����� � ����� �����
     * 
     * @param goodsMarking
     */
    public void setGoodsMarking(String goodsMarking) {
        this.goodsMarking = goodsMarking;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. ������������ �����
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. ������������ �����
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }
}

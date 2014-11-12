
package ru.acs.fts.schemas.album.stopgoodscancel;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � ������
 */
public class GoodsInfoType
{
    private String goodsNumeric;
    private List<String> goodsDescriptionList = new ArrayList<String>();

    /** 
     * Get the 'GoodsNumeric' element value. ����� ������ �� ��
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ����� ������ �� ��
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the list of 'GoodsDescriptions' element items. �������� ������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescriptions' element items. �������� ������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }
}

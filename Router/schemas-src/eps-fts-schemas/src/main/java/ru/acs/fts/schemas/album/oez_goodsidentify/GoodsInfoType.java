
package ru.acs.fts.schemas.album.oez_goodsidentify;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � �������
 */
public class GoodsInfoType
{
    private String position;
    private List<String> goodsDescriptionList = new ArrayList<String>();

    /** 
     * Get the 'Position' element value. ���������� ����� ������
     * 
     * @return value
     */
    public String getPosition() {
        return position;
    }

    /** 
     * Set the 'Position' element value. ���������� ����� ������
     * 
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. �������� ������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. �������� ������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }
}

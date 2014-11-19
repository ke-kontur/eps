
package ru.acs.fts.schemas.album.goodstranshipment;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������������������ ���������
 */
public class ConsignmentType
{
    private String regNumber;
    private List<GoodsType> goodsItemList = new ArrayList<GoodsType>();

    /** 
     * Get the 'RegNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getRegNumber() {
        return regNumber;
    }

    /** 
     * Set the 'RegNumber' element value. ����� ���������
     * 
     * @param regNumber
     */
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    /** 
     * Get the list of 'GoodsItem' element items. �������� � ������
     * 
     * @return list
     */
    public List<GoodsType> getGoodsItemList() {
        return goodsItemList;
    }

    /** 
     * Set the list of 'GoodsItem' element items. �������� � ������
     * 
     * @param list
     */
    public void setGoodsItemList(List<GoodsType> list) {
        goodsItemList = list;
    }
}

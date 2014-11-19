
package ru.acs.fts.schemas.album.goodsearchrequest;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ������
 */
public class GoodsType
{
    private String goodsTNVEDCode;
    private List<String> containerList = new ArrayList<String>();

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
     * Get the list of 'Container' element items. ���������
     * 
     * @return list
     */
    public List<String> getContainerList() {
        return containerList;
    }

    /** 
     * Set the list of 'Container' element items. ���������
     * 
     * @param list
     */
    public void setContainerList(List<String> list) {
        containerList = list;
    }
}

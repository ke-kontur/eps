
package ru.acs.fts.schemas.album.transitrevealedrisks;

import java.util.ArrayList;
import java.util.List;

/** 
 * �����, �� ������� ���� �������� �����
 */
public class GoodsType
{
    private String goodsNumber;
    private List<ProfileRefType> profileRefList = new ArrayList<ProfileRefType>();

    /** 
     * Get the 'GoodsNumber' element value. ����� ������
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. ����� ������
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the list of 'ProfileRef' element items. ������ �� ��/���, ������� ��������� �� ���������� �����
     * 
     * @return list
     */
    public List<ProfileRefType> getProfileRefList() {
        return profileRefList;
    }

    /** 
     * Set the list of 'ProfileRef' element items. ������ �� ��/���, ������� ��������� �� ���������� �����
     * 
     * @param list
     */
    public void setProfileRefList(List<ProfileRefType> list) {
        profileRefList = list;
    }
}

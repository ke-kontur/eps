
package ru.acs.fts.schemas.album.pp_revealedrisks;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������ �������, �� ������� ���� �������� �����
 */
public class ConsignmentType
{
    private String lotID;
    private List<ProfileRefType> profileRefList = new ArrayList<ProfileRefType>();
    private List<GoodsType> goodList = new ArrayList<GoodsType>();

    /** 
     * Get the 'LotID' element value. ������������� ��������� � �������� ���������� ������ �������
     * 
     * @return value
     */
    public String getLotID() {
        return lotID;
    }

    /** 
     * Set the 'LotID' element value. ������������� ��������� � �������� ���������� ������ �������
     * 
     * @param lotID
     */
    public void setLotID(String lotID) {
        this.lotID = lotID;
    }

    /** 
     * Get the list of 'ProfileRef' element items. ������ �� ��/���, ������� ��������� �� ������ ������ � �����
     * 
     * @return list
     */
    public List<ProfileRefType> getProfileRefList() {
        return profileRefList;
    }

    /** 
     * Set the list of 'ProfileRef' element items. ������ �� ��/���, ������� ��������� �� ������ ������ � �����
     * 
     * @param list
     */
    public void setProfileRefList(List<ProfileRefType> list) {
        profileRefList = list;
    }

    /** 
     * Get the list of 'Goods' element items. �����, �� ������� ���� �������� �����
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �����, �� ������� ���� �������� �����
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }
}


package ru.acs.fts.schemas.album.transitrevealedrisks;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������ �������, �� ������� ���� �������� �����
 */
public class ConsignmentType
{
    private String sequence;
    private List<ProfileRefType> profileRefList = new ArrayList<ProfileRefType>();
    private List<GoodsType> goodList = new ArrayList<GoodsType>();

    /** 
     * Get the 'Sequence' element value. ���������� ����� ��������� �� ��������� � ����������� � ���������� �������
     * 
     * @return value
     */
    public String getSequence() {
        return sequence;
    }

    /** 
     * Set the 'Sequence' element value. ���������� ����� ��������� �� ��������� � ����������� � ���������� �������
     * 
     * @param sequence
     */
    public void setSequence(String sequence) {
        this.sequence = sequence;
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

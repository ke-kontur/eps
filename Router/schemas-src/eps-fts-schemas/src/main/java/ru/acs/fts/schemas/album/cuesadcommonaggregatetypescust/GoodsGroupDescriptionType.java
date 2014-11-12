
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ������ ������� ������ ������������ � ������������� �� ������ ����� ����������������
 */
public class GoodsGroupDescriptionType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String RKTNVED;
    private List<GoodsGroupInformationType> goodsGroupInformationList = new ArrayList<GoodsGroupInformationType>();

    /** 
     * Get the list of 'GoodsDescription' element items. �������� ������ ������� � ������ �������������� ������������� (������������, �����������, ������������), ����������� ��� ������������� ������ � ��� ���������� ���������� ���������. � ������ ���������� �������� ������ ������� ����������� ������ ':' (���������). ��. 31 ������ ���������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. �������� ������ ������� � ������ �������������� ������������� (������������, �����������, ������������), ����������� ��� ������������� ������ � ��� ���������� ���������� ���������. � ������ ���������� �������� ������ ������� ����������� ������ ':' (���������). ��. 31 ������ ���������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'RKTNVED' element value. ��� �� ��� �� ���������� ������ ��� ��
     * 
     * @return value
     */
    public String getRKTNVED() {
        return RKTNVED;
    }

    /** 
     * Set the 'RKTNVED' element value. ��� �� ��� �� ���������� ������ ��� ��
     * 
     * @param RKTNVED
     */
    public void setRKTNVED(String RKTNVED) {
        this.RKTNVED = RKTNVED;
    }

    /** 
     * Get the list of 'GoodsGroupInformation' element items. �������������� ������� � ������
     * 
     * @return list
     */
    public List<GoodsGroupInformationType> getGoodsGroupInformationList() {
        return goodsGroupInformationList;
    }

    /** 
     * Set the list of 'GoodsGroupInformation' element items. �������������� ������� � ������
     * 
     * @param list
     */
    public void setGoodsGroupInformationList(
            List<GoodsGroupInformationType> list) {
        goodsGroupInformationList = list;
    }
}

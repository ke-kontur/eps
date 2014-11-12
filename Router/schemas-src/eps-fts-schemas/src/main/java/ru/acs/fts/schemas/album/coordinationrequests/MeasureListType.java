
package ru.acs.fts.schemas.album.coordinationrequests;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���� �� ��������� ������� ���� ������������ ����������� � �������������� ������ ������� ��� �������� �������
 */
public class MeasureListType
{
    private String measureCode;
    private List<GoodsPRInfoType> goodsPRInfoList = new ArrayList<GoodsPRInfoType>();

    /** 
     * Get the 'MeasureCode' element value. ��� ���� �� ����������� �����
     * 
     * @return value
     */
    public String getMeasureCode() {
        return measureCode;
    }

    /** 
     * Set the 'MeasureCode' element value. ��� ���� �� ����������� �����
     * 
     * @param measureCode
     */
    public void setMeasureCode(String measureCode) {
        this.measureCode = measureCode;
    }

    /** 
     * Get the list of 'GoodsPRInfo' element items. ���������� � ������ � ����������� �� ��� ������� �����, ���������� ������ ���� �� ����������� �����
     * 
     * @return list
     */
    public List<GoodsPRInfoType> getGoodsPRInfoList() {
        return goodsPRInfoList;
    }

    /** 
     * Set the list of 'GoodsPRInfo' element items. ���������� � ������ � ����������� �� ��� ������� �����, ���������� ������ ���� �� ����������� �����
     * 
     * @param list
     */
    public void setGoodsPRInfoList(List<GoodsPRInfoType> list) {
        goodsPRInfoList = list;
    }
}

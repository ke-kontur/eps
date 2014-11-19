
package ru.acs.fts.schemas.album.transitrevealedrisks;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������������� ��������/�������
 */
public class MeasureAttributeType
{
    private String measureAttributeCode;
    private List<String> measureAttributeValueList = new ArrayList<String>();
    private String measureAttributeNecessary;

    /** 
     * Get the 'MeasureAttributeCode' element value. ��� �������������� ��������/�������. ��� �������� ����������� � ������������ �� ���������� �������������� "������������� ����������� �������� �������" - rskxdosm.dbf.
     * 
     * @return value
     */
    public String getMeasureAttributeCode() {
        return measureAttributeCode;
    }

    /** 
     * Set the 'MeasureAttributeCode' element value. ��� �������������� ��������/�������. ��� �������� ����������� � ������������ �� ���������� �������������� "������������� ����������� �������� �������" - rskxdosm.dbf.
     * 
     * @param measureAttributeCode
     */
    public void setMeasureAttributeCode(String measureAttributeCode) {
        this.measureAttributeCode = measureAttributeCode;
    }

    /** 
     * Get the list of 'MeasureAttributeValue' element items. �������� �������������� ��������/�������. ��� �������� ����������� � ������������ �� ���������� �������������� "���������� �������� ������������� ����������� �������� �������" - rskzdosm.dbf.
     * 
     * @return list
     */
    public List<String> getMeasureAttributeValueList() {
        return measureAttributeValueList;
    }

    /** 
     * Set the list of 'MeasureAttributeValue' element items. �������� �������������� ��������/�������. ��� �������� ����������� � ������������ �� ���������� �������������� "���������� �������� ������������� ����������� �������� �������" - rskzdosm.dbf.
     * 
     * @param list
     */
    public void setMeasureAttributeValueList(List<String> list) {
        measureAttributeValueList = list;
    }

    /** 
     * Get the 'MeasureAttributeNecessary' element value. �������, ������������ ����������� ������ �������� �������������� ����������� ��������. 0 - �������� �������� �������� ������������� ����������� ��������, 1 - ����������� ������ ����������� (������� ����������� � ������������ �� ���������� �������������, ������������� �������� �����)
     * 
     * @return value
     */
    public String getMeasureAttributeNecessary() {
        return measureAttributeNecessary;
    }

    /** 
     * Set the 'MeasureAttributeNecessary' element value. �������, ������������ ����������� ������ �������� �������������� ����������� ��������. 0 - �������� �������� �������� ������������� ����������� ��������, 1 - ����������� ������ ����������� (������� ����������� � ������������ �� ���������� �������������, ������������� �������� �����)
     * 
     * @param measureAttributeNecessary
     */
    public void setMeasureAttributeNecessary(String measureAttributeNecessary) {
        this.measureAttributeNecessary = measureAttributeNecessary;
    }
}

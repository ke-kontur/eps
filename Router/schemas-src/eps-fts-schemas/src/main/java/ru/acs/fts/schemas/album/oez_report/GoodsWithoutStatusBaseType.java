
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������� ��� ��� ������� �� ���� �������� ������. �������� ����� ��� ���� ������� ����, ����� ��/���. ������� ���� ������ ������ ������������� �� ����� ���� 
 */
public class GoodsWithoutStatusBaseType
{
    private List<String> nameList = new ArrayList<String>();
    private String TNVED;
    private String measureUnitQualifier;

    /** 
     * Get the list of 'Name' element items. ������������ ������
     * 
     * @return list
     */
    public List<String> getNameList() {
        return nameList;
    }

    /** 
     * Set the list of 'Name' element items. ������������ ������
     * 
     * @param list
     */
    public void setNameList(List<String> list) {
        nameList = list;
    }

    /** 
     * Get the 'TNVED' element value. ��� ������ �� �� ��� ��
     * 
     * @return value
     */
    public String getTNVED() {
        return TNVED;
    }

    /** 
     * Set the 'TNVED' element value. ��� ������ �� �� ��� ��
     * 
     * @param TNVED
     */
    public void setTNVED(String TNVED) {
        this.TNVED = TNVED;
    }

    /** 
     * Get the 'MeasureUnitQualifier' element value. ������� ��������� ���������� ������
     * 
     * @return value
     */
    public String getMeasureUnitQualifier() {
        return measureUnitQualifier;
    }

    /** 
     * Set the 'MeasureUnitQualifier' element value. ������� ��������� ���������� ������
     * 
     * @param measureUnitQualifier
     */
    public void setMeasureUnitQualifier(String measureUnitQualifier) {
        this.measureUnitQualifier = measureUnitQualifier;
    }
}

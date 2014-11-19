
package ru.acs.fts.schemas.album.transitrevealedrisks;

import java.util.ArrayList;
import java.util.List;

/** 
 * ����� ���������� � ������ ���� �� ����������� ������
 */
public class MinimizeMeasuresInfoType
{
    private String minimizeMeasureCode;
    private String minimizeMeasureNecessary;
    private String takeMeasuresSign;
    private String measureDescription;
    private String mainActionCode;
    private List<MeasureAttributeType> measureAttributeList = new ArrayList<MeasureAttributeType>();

    /** 
     * Get the 'MinimizeMeasureCode' element value. ��� ������ ��� �� ����������� ������ (�������� ����������� � ������������ � ��������������� "������ ��� �� ����������� ������" rsk_mera.dbf)
     * 
     * @return value
     */
    public String getMinimizeMeasureCode() {
        return minimizeMeasureCode;
    }

    /** 
     * Set the 'MinimizeMeasureCode' element value. ��� ������ ��� �� ����������� ������ (�������� ����������� � ������������ � ��������������� "������ ��� �� ����������� ������" rsk_mera.dbf)
     * 
     * @param minimizeMeasureCode
     */
    public void setMinimizeMeasureCode(String minimizeMeasureCode) {
        this.minimizeMeasureCode = minimizeMeasureCode;
    }

    /** 
     * Get the 'MinimizeMeasureNecessary' element value. �������������� ���������� ����. ��������� ��������: 0 - �������������� ���������� ����, 1 - ������������ ���������� ����
     * 
     * @return value
     */
    public String getMinimizeMeasureNecessary() {
        return minimizeMeasureNecessary;
    }

    /** 
     * Set the 'MinimizeMeasureNecessary' element value. �������������� ���������� ����. ��������� ��������: 0 - �������������� ���������� ����, 1 - ������������ ���������� ����
     * 
     * @param minimizeMeasureNecessary
     */
    public void setMinimizeMeasureNecessary(String minimizeMeasureNecessary) {
        this.minimizeMeasureNecessary = minimizeMeasureNecessary;
    }

    /** 
     * Get the 'TakeMeasuresSign' element value. ������� ���������� ��� �� ����������� ������: "0" - ���� (�������/������) �� ����������� �������� ����������� ��������� �������; "1" - ���� ������ ���� ��������� �������� ��; "3" - ���� �� �����������, ��������� ������� ��� ������� � �������� ���, ������������ ������, � ��������� ������� �� ����������� ���� �� ����������� ������, ������������ � ��.
     * 
     * @return value
     */
    public String getTakeMeasuresSign() {
        return takeMeasuresSign;
    }

    /** 
     * Set the 'TakeMeasuresSign' element value. ������� ���������� ��� �� ����������� ������: "0" - ���� (�������/������) �� ����������� �������� ����������� ��������� �������; "1" - ���� ������ ���� ��������� �������� ��; "3" - ���� �� �����������, ��������� ������� ��� ������� � �������� ���, ������������ ������, � ��������� ������� �� ����������� ���� �� ����������� ������, ������������ � ��.
     * 
     * @param takeMeasuresSign
     */
    public void setTakeMeasuresSign(String takeMeasuresSign) {
        this.takeMeasuresSign = takeMeasuresSign;
    }

    /** 
     * Get the 'MeasureDescription' element value. ���������� � ���� �� ����������� ������
     * 
     * @return value
     */
    public String getMeasureDescription() {
        return measureDescription;
    }

    /** 
     * Set the 'MeasureDescription' element value. ���������� � ���� �� ����������� ������
     * 
     * @param measureDescription
     */
    public void setMeasureDescription(String measureDescription) {
        this.measureDescription = measureDescription;
    }

    /** 
     * Get the 'MainActionCode' element value. ��� ������� ���� �� ����������� ������
     * 
     * @return value
     */
    public String getMainActionCode() {
        return mainActionCode;
    }

    /** 
     * Set the 'MainActionCode' element value. ��� ������� ���� �� ����������� ������
     * 
     * @param mainActionCode
     */
    public void setMainActionCode(String mainActionCode) {
        this.mainActionCode = mainActionCode;
    }

    /** 
     * Get the list of 'MeasureAttribute' element items. �������������� ��������/�������
     * 
     * @return list
     */
    public List<MeasureAttributeType> getMeasureAttributeList() {
        return measureAttributeList;
    }

    /** 
     * Set the list of 'MeasureAttribute' element items. �������������� ��������/�������
     * 
     * @param list
     */
    public void setMeasureAttributeList(List<MeasureAttributeType> list) {
        measureAttributeList = list;
    }
}

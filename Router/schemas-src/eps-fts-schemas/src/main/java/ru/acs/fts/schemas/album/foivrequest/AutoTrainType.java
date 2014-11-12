
package ru.acs.fts.schemas.album.foivrequest;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � ������������ �������� (���������)
 */
public class AutoTrainType
{
    private String totalWeight;
    private String length;
    private String width;
    private String height;
    private List<String> axisLoadList = new ArrayList<String>();
    private List<String> axisInvervalList = new ArrayList<String>();

    /** 
     * Get the 'TotalWeight' element value. ����� ��� ���������� � ������
     * 
     * @return value
     */
    public String getTotalWeight() {
        return totalWeight;
    }

    /** 
     * Set the 'TotalWeight' element value. ����� ��� ���������� � ������
     * 
     * @param totalWeight
     */
    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }

    /** 
     * Get the 'Length' element value. ����� ���������� (� ������)
     * 
     * @return value
     */
    public String getLength() {
        return length;
    }

    /** 
     * Set the 'Length' element value. ����� ���������� (� ������)
     * 
     * @param length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /** 
     * Get the 'Width' element value. ������ ���������� (� ������)
     * 
     * @return value
     */
    public String getWidth() {
        return width;
    }

    /** 
     * Set the 'Width' element value. ������ ���������� (� ������)
     * 
     * @param width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /** 
     * Get the 'Height' element value. ������ ���������� (� ������)
     * 
     * @return value
     */
    public String getHeight() {
        return height;
    }

    /** 
     * Set the 'Height' element value. ������ ���������� (� ������)
     * 
     * @param height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /** 
     * Get the list of 'AxisLoads' element items. ������ �������� �� ��� (� ������)
     * 
     * @return list
     */
    public List<String> getAxisLoadList() {
        return axisLoadList;
    }

    /** 
     * Set the list of 'AxisLoads' element items. ������ �������� �� ��� (� ������)
     * 
     * @param list
     */
    public void setAxisLoadList(List<String> list) {
        axisLoadList = list;
    }

    /** 
     * Get the list of 'AxisInvervals' element items. ������ ���������� ����� ����� (� ������)
     * 
     * @return list
     */
    public List<String> getAxisInvervalList() {
        return axisInvervalList;
    }

    /** 
     * Set the list of 'AxisInvervals' element items. ������ ���������� ����� ����� (� ������)
     * 
     * @param list
     */
    public void setAxisInvervalList(List<String> list) {
        axisInvervalList = list;
    }
}

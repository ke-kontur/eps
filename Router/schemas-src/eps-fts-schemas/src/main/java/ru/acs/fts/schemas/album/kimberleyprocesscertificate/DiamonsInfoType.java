
package ru.acs.fts.schemas.album.kimberleyprocesscertificate;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� �� �������
 */
public class DiamonsInfoType
{
    private String totalCost;
    private String totalWeight;
    private List<String> characteristicList = new ArrayList<String>();
    private String harmonizedCode;
    private String numeric;

    /** 
     * Get the 'TotalCost' element value. ��������� ������� � ����. ���
     * 
     * @return value
     */
    public String getTotalCost() {
        return totalCost;
    }

    /** 
     * Set the 'TotalCost' element value. ��������� ������� � ����. ���
     * 
     * @param totalCost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /** 
     * Get the 'TotalWeight' element value. ����� ���(�����)
     * 
     * @return value
     */
    public String getTotalWeight() {
        return totalWeight;
    }

    /** 
     * Set the 'TotalWeight' element value. ����� ���(�����)
     * 
     * @param totalWeight
     */
    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }

    /** 
     * Get the list of 'Characteristics' element items. ��������������
     * 
     * @return list
     */
    public List<String> getCharacteristicList() {
        return characteristicList;
    }

    /** 
     * Set the list of 'Characteristics' element items. ��������������
     * 
     * @param list
     */
    public void setCharacteristicList(List<String> list) {
        characteristicList = list;
    }

    /** 
     * Get the 'HarmonizedCode' element value. ��� ����������������� ������� �������� � ����������� �������
     * 
     * @return value
     */
    public String getHarmonizedCode() {
        return harmonizedCode;
    }

    /** 
     * Set the 'HarmonizedCode' element value. ��� ����������������� ������� �������� � ����������� �������
     * 
     * @param harmonizedCode
     */
    public void setHarmonizedCode(String harmonizedCode) {
        this.harmonizedCode = harmonizedCode;
    }

    /** 
     * Get the 'Numeric' element value. ����� �������
     * 
     * @return value
     */
    public String getNumeric() {
        return numeric;
    }

    /** 
     * Set the 'Numeric' element value. ����� �������
     * 
     * @param numeric
     */
    public void setNumeric(String numeric) {
        this.numeric = numeric;
    }
}

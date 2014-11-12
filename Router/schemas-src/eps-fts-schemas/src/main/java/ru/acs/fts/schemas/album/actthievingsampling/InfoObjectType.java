
package ru.acs.fts.schemas.album.actthievingsampling;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� � ���������, ������ � �������� ���� ��� ��������.
 */
public class InfoObjectType
{
    private String position;
    private List<String> nameOdjectList = new ArrayList<String>();
    private String quantityWeight;
    private String unit;
    private String cost;
    private String currency;

    /** 
     * Get the 'Position' element value. ���������� �����
     * 
     * @return value
     */
    public String getPosition() {
        return position;
    }

    /** 
     * Set the 'Position' element value. ���������� �����
     * 
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /** 
     * Get the list of 'NameOdject' element items. ������������, �������������� �������� ���������, ������ � �������� ���� ��� ��������.
     * 
     * @return list
     */
    public List<String> getNameOdjectList() {
        return nameOdjectList;
    }

    /** 
     * Set the list of 'NameOdject' element items. ������������, �������������� �������� ���������, ������ � �������� ���� ��� ��������.
     * 
     * @param list
     */
    public void setNameOdjectList(List<String> list) {
        nameOdjectList = list;
    }

    /** 
     * Get the 'QuantityWeight' element value. ����������, ���
     * 
     * @return value
     */
    public String getQuantityWeight() {
        return quantityWeight;
    }

    /** 
     * Set the 'QuantityWeight' element value. ����������, ���
     * 
     * @param quantityWeight
     */
    public void setQuantityWeight(String quantityWeight) {
        this.quantityWeight = quantityWeight;
    }

    /** 
     * Get the 'Unit' element value. ������� ��������� 
     * 
     * @return value
     */
    public String getUnit() {
        return unit;
    }

    /** 
     * Set the 'Unit' element value. ������� ��������� 
     * 
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /** 
     * Get the 'Cost' element value. ���������
     * 
     * @return value
     */
    public String getCost() {
        return cost;
    }

    /** 
     * Set the 'Cost' element value. ���������
     * 
     * @param cost
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /** 
     * Get the 'Currency' element value. ������
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. ������
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

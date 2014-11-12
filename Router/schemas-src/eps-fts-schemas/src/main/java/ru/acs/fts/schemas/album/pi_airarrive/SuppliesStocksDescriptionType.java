
package ru.acs.fts.schemas.album.pi_airarrive;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ����������� �������� ������ � ��������
 */
public class SuppliesStocksDescriptionType
{
    private List<String> descriptionList = new ArrayList<String>();
    private String quantity;
    private String measureUnitQualifier;

    /** 
     * Get the list of 'Description' element items. ��������
     * 
     * @return list
     */
    public List<String> getDescriptionList() {
        return descriptionList;
    }

    /** 
     * Set the list of 'Description' element items. ��������
     * 
     * @param list
     */
    public void setDescriptionList(List<String> list) {
        descriptionList = list;
    }

    /** 
     * Get the 'Quantity' element value. ����������
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ����������
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'MeasureUnitQualifier' element value. ������������ ������� ���������
     * 
     * @return value
     */
    public String getMeasureUnitQualifier() {
        return measureUnitQualifier;
    }

    /** 
     * Set the 'MeasureUnitQualifier' element value. ������������ ������� ���������
     * 
     * @param measureUnitQualifier
     */
    public void setMeasureUnitQualifier(String measureUnitQualifier) {
        this.measureUnitQualifier = measureUnitQualifier;
    }
}

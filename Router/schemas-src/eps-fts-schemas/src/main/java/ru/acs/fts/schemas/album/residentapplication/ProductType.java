
package ru.acs.fts.schemas.album.residentapplication;

import java.util.ArrayList;
import java.util.List;

/** 
 * �����
 */
public class ProductType
{
    private String number;
    private List<String> nameList = new ArrayList<String>();
    private String TNVEDCode;
    private String status;
    private String measureUnitQualifierName;
    private String measureUnitQualifierCode;
    private String quantity;
    private String quantityChangesQ1;
    private String quantityChangesQ2;
    private String quantityChangesQ3;
    private String quantityChangesQ4;
    private String quantityTotal;

    /** 
     * Get the 'Number' element value. ���������� ����� 
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. ���������� ����� 
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

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
     * Get the 'TNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @return value
     */
    public String getTNVEDCode() {
        return TNVEDCode;
    }

    /** 
     * Set the 'TNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @param TNVEDCode
     */
    public void setTNVEDCode(String TNVEDCode) {
        this.TNVEDCode = TNVEDCode;
    }

    /** 
     * Get the 'Status' element value. ������: 0 - ��� (����������); 1 - �� (�����������) 
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. ������: 0 - ��� (����������); 1 - �� (�����������) 
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'MeasureUnitQualifierName' element value. �������� ������� ���������
     * 
     * @return value
     */
    public String getMeasureUnitQualifierName() {
        return measureUnitQualifierName;
    }

    /** 
     * Set the 'MeasureUnitQualifierName' element value. �������� ������� ���������
     * 
     * @param measureUnitQualifierName
     */
    public void setMeasureUnitQualifierName(String measureUnitQualifierName) {
        this.measureUnitQualifierName = measureUnitQualifierName;
    }

    /** 
     * Get the 'MeasureUnitQualifierCode' element value. ��� ������� ��������� 
     * 
     * @return value
     */
    public String getMeasureUnitQualifierCode() {
        return measureUnitQualifierCode;
    }

    /** 
     * Set the 'MeasureUnitQualifierCode' element value. ��� ������� ��������� 
     * 
     * @param measureUnitQualifierCode
     */
    public void setMeasureUnitQualifierCode(String measureUnitQualifierCode) {
        this.measureUnitQualifierCode = measureUnitQualifierCode;
    }

    /** 
     * Get the 'Quantity' element value. ���������� � ��������� ��. ���. 
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ���������� � ��������� ��. ���. 
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'QuantityChangesQ1' element value. �������� � �������� ��������� � �������� 1
     * 
     * @return value
     */
    public String getQuantityChangesQ1() {
        return quantityChangesQ1;
    }

    /** 
     * Set the 'QuantityChangesQ1' element value. �������� � �������� ��������� � �������� 1
     * 
     * @param quantityChangesQ1
     */
    public void setQuantityChangesQ1(String quantityChangesQ1) {
        this.quantityChangesQ1 = quantityChangesQ1;
    }

    /** 
     * Get the 'QuantityChangesQ2' element value. �������� � �������� ��������� � �������� 2
     * 
     * @return value
     */
    public String getQuantityChangesQ2() {
        return quantityChangesQ2;
    }

    /** 
     * Set the 'QuantityChangesQ2' element value. �������� � �������� ��������� � �������� 2
     * 
     * @param quantityChangesQ2
     */
    public void setQuantityChangesQ2(String quantityChangesQ2) {
        this.quantityChangesQ2 = quantityChangesQ2;
    }

    /** 
     * Get the 'QuantityChangesQ3' element value. �������� � �������� ��������� � �������� 3
     * 
     * @return value
     */
    public String getQuantityChangesQ3() {
        return quantityChangesQ3;
    }

    /** 
     * Set the 'QuantityChangesQ3' element value. �������� � �������� ��������� � �������� 3
     * 
     * @param quantityChangesQ3
     */
    public void setQuantityChangesQ3(String quantityChangesQ3) {
        this.quantityChangesQ3 = quantityChangesQ3;
    }

    /** 
     * Get the 'QuantityChangesQ4' element value. �������� � �������� ��������� � �������� 4
     * 
     * @return value
     */
    public String getQuantityChangesQ4() {
        return quantityChangesQ4;
    }

    /** 
     * Set the 'QuantityChangesQ4' element value. �������� � �������� ��������� � �������� 4
     * 
     * @param quantityChangesQ4
     */
    public void setQuantityChangesQ4(String quantityChangesQ4) {
        this.quantityChangesQ4 = quantityChangesQ4;
    }

    /** 
     * Get the 'QuantityTotal' element value. �����
     * 
     * @return value
     */
    public String getQuantityTotal() {
        return quantityTotal;
    }

    /** 
     * Set the 'QuantityTotal' element value. �����
     * 
     * @param quantityTotal
     */
    public void setQuantityTotal(String quantityTotal) {
        this.quantityTotal = quantityTotal;
    }
}

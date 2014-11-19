
package ru.acs.fts.schemas.album.airwaybill;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� � �����
 */
public class AWBGoodsInfoType
{
    private String totalPlacesQuantity;
    private String weightUnitQualifierCode;
    private String grossWeightQuantity;
    private String totalAmount;
    private List<AWBGoodsType> AWBGoodList = new ArrayList<AWBGoodsType>();

    /** 
     * Get the 'TotalPlacesQuantity' element value. ����� ���������� �������� ���� ������
     * 
     * @return value
     */
    public String getTotalPlacesQuantity() {
        return totalPlacesQuantity;
    }

    /** 
     * Set the 'TotalPlacesQuantity' element value. ����� ���������� �������� ���� ������
     * 
     * @param totalPlacesQuantity
     */
    public void setTotalPlacesQuantity(String totalPlacesQuantity) {
        this.totalPlacesQuantity = totalPlacesQuantity;
    }

    /** 
     * Get the 'WeightUnitQualifierCode' element value. ��� ��������� ������ ���� ������ (���������� ��� �����)
     * 
     * @return value
     */
    public String getWeightUnitQualifierCode() {
        return weightUnitQualifierCode;
    }

    /** 
     * Set the 'WeightUnitQualifierCode' element value. ��� ��������� ������ ���� ������ (���������� ��� �����)
     * 
     * @param weightUnitQualifierCode
     */
    public void setWeightUnitQualifierCode(String weightUnitQualifierCode) {
        this.weightUnitQualifierCode = weightUnitQualifierCode;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. ����� ��� ������ ������� (���� � �������� ������� ��� ������, �� �������� �������� ������� - ����� - ����� ���� ������ �� �������)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ����� ��� ������ ������� (���� � �������� ������� ��� ������, �� �������� �������� ������� - ����� - ����� ���� ������ �� �������)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'TotalAmount' element value. ����� ����� (22L)
     * 
     * @return value
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /** 
     * Set the 'TotalAmount' element value. ����� ����� (22L)
     * 
     * @param totalAmount
     */
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /** 
     * Get the list of 'AWBGoods' element items. �������� �������� ���� ������� 
     * 
     * @return list
     */
    public List<AWBGoodsType> getAWBGoodList() {
        return AWBGoodList;
    }

    /** 
     * Set the list of 'AWBGoods' element items. �������� �������� ���� ������� 
     * 
     * @param list
     */
    public void setAWBGoodList(List<AWBGoodsType> list) {
        AWBGoodList = list;
    }
}


package ru.acs.fts.schemas.album.actregistrationmining;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���� ������������������ ���������
 */
public class ProductListType
{
    private List<String> productTypeList = new ArrayList<String>();
    private String weigh;
    private String conversionFactor;
    private String quantity;
    private List<String> areaMiningList = new ArrayList<String>();
    private String timingExtraction;
    private String measurementUnitTime;
    private List<String> consigneeList = new ArrayList<String>();

    /** 
     * Get the list of 'ProductType' element items. ��� ���������
     * 
     * @return list
     */
    public List<String> getProductTypeList() {
        return productTypeList;
    }

    /** 
     * Set the list of 'ProductType' element items. ��� ���������
     * 
     * @param list
     */
    public void setProductTypeList(List<String> list) {
        productTypeList = list;
    }

    /** 
     * Get the 'Weigh' element value. ��� (�����), ��
     * 
     * @return value
     */
    public String getWeigh() {
        return weigh;
    }

    /** 
     * Set the 'Weigh' element value. ��� (�����), ��
     * 
     * @param weigh
     */
    public void setWeigh(String weigh) {
        this.weigh = weigh;
    }

    /** 
     * Get the 'ConversionFactor' element value. ����������� ��������� ������� ��������� � �����
     * 
     * @return value
     */
    public String getConversionFactor() {
        return conversionFactor;
    }

    /** 
     * Set the 'ConversionFactor' element value. ����������� ��������� ������� ��������� � �����
     * 
     * @param conversionFactor
     */
    public void setConversionFactor(String conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    /** 
     * Get the 'Quantity' element value. ����� ��������������� �����, ��
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ����� ��������������� �����, ��
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the list of 'AreaMining' element items. ����� ������ (����, �������)
     * 
     * @return list
     */
    public List<String> getAreaMiningList() {
        return areaMiningList;
    }

    /** 
     * Set the list of 'AreaMining' element items. ����� ������ (����, �������)
     * 
     * @param list
     */
    public void setAreaMiningList(List<String> list) {
        areaMiningList = list;
    }

    /** 
     * Get the 'TimingExtraction' element value. ����� ������
     * 
     * @return value
     */
    public String getTimingExtraction() {
        return timingExtraction;
    }

    /** 
     * Set the 'TimingExtraction' element value. ����� ������
     * 
     * @param timingExtraction
     */
    public void setTimingExtraction(String timingExtraction) {
        this.timingExtraction = timingExtraction;
    }

    /** 
     * Get the 'MeasurementUnitTime' element value. ������� ��������� ����� ������
     * 
     * @return value
     */
    public String getMeasurementUnitTime() {
        return measurementUnitTime;
    }

    /** 
     * Set the 'MeasurementUnitTime' element value. ������� ��������� ����� ������
     * 
     * @param measurementUnitTime
     */
    public void setMeasurementUnitTime(String measurementUnitTime) {
        this.measurementUnitTime = measurementUnitTime;
    }

    /** 
     * Get the list of 'Consignee' element items. ��������������� (���� ���������� ��� ���� ������������� ���������)
     * 
     * @return list
     */
    public List<String> getConsigneeList() {
        return consigneeList;
    }

    /** 
     * Set the list of 'Consignee' element items. ��������������� (���� ���������� ��� ���� ������������� ���������)
     * 
     * @param list
     */
    public void setConsigneeList(List<String> list) {
        consigneeList = list;
    }
}


package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������� ����� ��� �������� ������
 */
public class GoodsItemBaseType
{
    private String goodsNumeric;
    private String listNumeric;
    private String goodFeatures;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String grossWeightQuantity;
    private String netWeightQuantity;
    private String netWeightQuantity2;
    private String invoicedCost;
    private String customsCost;
    private String statisticalCost;

    /** 
     * Get the 'GoodsNumeric' element value. ���������� ����� ��������������  ������ / ����� ������ �� ������/ ����� ��������������� ������. ��.32
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ���������� ����� ��������������  ������ / ����� ������ �� ������/ ����� ��������������� ������. ��.32
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'ListNumeric' element value. ����� ������ � ������. ��� ��
     * 
     * @return value
     */
    public String getListNumeric() {
        return listNumeric;
    }

    /** 
     * Set the 'ListNumeric' element value. ����� ������ � ������. ��� ��
     * 
     * @param listNumeric
     */
    public void setListNumeric(String listNumeric) {
        this.listNumeric = listNumeric;
    }

    /** 
     * Get the 'GoodFeatures' element value. ��� (��� �������������� �������, ������������ � ������������� �������� ������������). ��� (��� �������������� ��������-������). ��.32, 2-� ��������� ��
     * 
     * @return value
     */
    public String getGoodFeatures() {
        return goodFeatures;
    }

    /** 
     * Set the 'GoodFeatures' element value. ��� (��� �������������� �������, ������������ � ������������� �������� ������������). ��� (��� �������������� ��������-������). ��.32, 2-� ��������� ��
     * 
     * @param goodFeatures
     */
    public void setGoodFeatures(String goodFeatures) {
        this.goodFeatures = goodFeatures;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. ������������ (��������, ������������ ��� ���� ������������ ������������) �������/ "������ �������� ������������ ������". ��.31 ������ ���������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. ������������ (��������, ������������ ��� ���� ������������ ������������) �������/ "������ �������� ������������ ������". ��.31 ������ ���������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. ��� ������, ������ (��). ��. 35
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ��� ������, ������ (��). ��. 35
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. ��� ������, ����� (��). ��.38
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. ��� ������, ����� (��). ��.38
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'NetWeightQuantity2' element value. ��� ������, ����� ��� ����� ���� ����� ��������. ��.38
     * 
     * @return value
     */
    public String getNetWeightQuantity2() {
        return netWeightQuantity2;
    }

    /** 
     * Set the 'NetWeightQuantity2' element value. ��� ������, ����� ��� ����� ���� ����� ��������. ��.38
     * 
     * @param netWeightQuantity2
     */
    public void setNetWeightQuantity2(String netWeightQuantity2) {
        this.netWeightQuantity2 = netWeightQuantity2;
    }

    /** 
     * Get the 'InvoicedCost' element value. ����/ ��������� ������. �� 42
     * 
     * @return value
     */
    public String getInvoicedCost() {
        return invoicedCost;
    }

    /** 
     * Set the 'InvoicedCost' element value. ����/ ��������� ������. �� 42
     * 
     * @param invoicedCost
     */
    public void setInvoicedCost(String invoicedCost) {
        this.invoicedCost = invoicedCost;
    }

    /** 
     * Get the 'CustomsCost' element value. ���������� ��������� ������. ��. 45
     * 
     * @return value
     */
    public String getCustomsCost() {
        return customsCost;
    }

    /** 
     * Set the 'CustomsCost' element value. ���������� ��������� ������. ��. 45
     * 
     * @param customsCost
     */
    public void setCustomsCost(String customsCost) {
        this.customsCost = customsCost;
    }

    /** 
     * Get the 'StatisticalCost' element value. �������������� ��������� ������. ��. 46
     * 
     * @return value
     */
    public String getStatisticalCost() {
        return statisticalCost;
    }

    /** 
     * Set the 'StatisticalCost' element value. �������������� ��������� ������. ��. 46
     * 
     * @param statisticalCost
     */
    public void setStatisticalCost(String statisticalCost) {
        this.statisticalCost = statisticalCost;
    }
}

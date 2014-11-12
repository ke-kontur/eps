
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������� 1. ���������� ������, �������������� � �������� ������� 
 */
public class Table1QuantityUsedType
{
    private String quantityConformUsageGoods;
    private String quantityOEZConsumed;
    private String recyclingGoodsQuantity;
    private String residentsGoodsQuantity;
    private List<CustomsModeQuantityType> customsTreatmentModeChangedList = new ArrayList<CustomsModeQuantityType>();
    private List<GoodsUsageType> OEZDestructedGoodList = new ArrayList<GoodsUsageType>();
    private List<GoodsUsageType> otherGoodsUsageList = new ArrayList<GoodsUsageType>();
    private List<StatusDisguiseGoodsType> statusDisguiseGoodList = new ArrayList<StatusDisguiseGoodsType>();

    /** 
     * Get the 'QuantityConformUsageGoods' element value. ���������� ������, �������������� � ������������ � �.4 ��. 13 ���������� � ���
     * 
     * @return value
     */
    public String getQuantityConformUsageGoods() {
        return quantityConformUsageGoods;
    }

    /** 
     * Set the 'QuantityConformUsageGoods' element value. ���������� ������, �������������� � ������������ � �.4 ��. 13 ���������� � ���
     * 
     * @param quantityConformUsageGoods
     */
    public void setQuantityConformUsageGoods(String quantityConformUsageGoods) {
        this.quantityConformUsageGoods = quantityConformUsageGoods;
    }

    /** 
     * Get the 'QuantityOEZConsumed' element value. ���������� �������, ������������ �� ���������� ���, ��� ����� ������� ��������� � ����� 19
     * 
     * @return value
     */
    public String getQuantityOEZConsumed() {
        return quantityOEZConsumed;
    }

    /** 
     * Set the 'QuantityOEZConsumed' element value. ���������� �������, ������������ �� ���������� ���, ��� ����� ������� ��������� � ����� 19
     * 
     * @param quantityOEZConsumed
     */
    public void setQuantityOEZConsumed(String quantityOEZConsumed) {
        this.quantityOEZConsumed = quantityOEZConsumed;
    }

    /** 
     * Get the 'RecyclingGoodsQuantity' element value. ���������� �������, ������������ ��������� �� �����������(���������)
     * 
     * @return value
     */
    public String getRecyclingGoodsQuantity() {
        return recyclingGoodsQuantity;
    }

    /** 
     * Set the 'RecyclingGoodsQuantity' element value. ���������� �������, ������������ ��������� �� �����������(���������)
     * 
     * @param recyclingGoodsQuantity
     */
    public void setRecyclingGoodsQuantity(String recyclingGoodsQuantity) {
        this.recyclingGoodsQuantity = recyclingGoodsQuantity;
    }

    /** 
     * Get the 'ResidentsGoodsQuantity' element value. ������ ����������� � ��������� ��� � ��������� ������� �������������� ��������(�������������) �� ���������� ���
     * 
     * @return value
     */
    public String getResidentsGoodsQuantity() {
        return residentsGoodsQuantity;
    }

    /** 
     * Set the 'ResidentsGoodsQuantity' element value. ������ ����������� � ��������� ��� � ��������� ������� �������������� ��������(�������������) �� ���������� ���
     * 
     * @param residentsGoodsQuantity
     */
    public void setResidentsGoodsQuantity(String residentsGoodsQuantity) {
        this.residentsGoodsQuantity = residentsGoodsQuantity;
    }

    /** 
     * Get the list of 'CustomsTreatmentModeChanged' element items. ��������� ����������� ������ ��� �� ���� ���������� �����
     * 
     * @return list
     */
    public List<CustomsModeQuantityType> getCustomsTreatmentModeChangedList() {
        return customsTreatmentModeChangedList;
    }

    /** 
     * Set the list of 'CustomsTreatmentModeChanged' element items. ��������� ����������� ������ ��� �� ���� ���������� �����
     * 
     * @param list
     */
    public void setCustomsTreatmentModeChangedList(
            List<CustomsModeQuantityType> list) {
        customsTreatmentModeChangedList = list;
    }

    /** 
     * Get the list of 'OEZDestructedGoods' element items. �������� � �������, ������������ �� ���������� ���
     * 
     * @return list
     */
    public List<GoodsUsageType> getOEZDestructedGoodList() {
        return OEZDestructedGoodList;
    }

    /** 
     * Set the list of 'OEZDestructedGoods' element items. �������� � �������, ������������ �� ���������� ���
     * 
     * @param list
     */
    public void setOEZDestructedGoodList(List<GoodsUsageType> list) {
        OEZDestructedGoodList = list;
    }

    /** 
     * Get the list of 'OtherGoodsUsage' element items. �������� � �������, � ��������� ������� ���� ��������� ���� ��������
     * 
     * @return list
     */
    public List<GoodsUsageType> getOtherGoodsUsageList() {
        return otherGoodsUsageList;
    }

    /** 
     * Set the list of 'OtherGoodsUsage' element items. �������� � �������, � ��������� ������� ���� ��������� ���� ��������
     * 
     * @param list
     */
    public void setOtherGoodsUsageList(List<GoodsUsageType> list) {
        otherGoodsUsageList = list;
    }

    /** 
     * Get the list of 'StatusDisguiseGoods' element items. �������� ������� � �������� ��������
     * 
     * @return list
     */
    public List<StatusDisguiseGoodsType> getStatusDisguiseGoodList() {
        return statusDisguiseGoodList;
    }

    /** 
     * Set the list of 'StatusDisguiseGoods' element items. �������� ������� � �������� ��������
     * 
     * @param list
     */
    public void setStatusDisguiseGoodList(List<StatusDisguiseGoodsType> list) {
        statusDisguiseGoodList = list;
    }
}

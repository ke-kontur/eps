
package ru.acs.fts.schemas.album.represapplicstatinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * �������� � �������, ����� ����������� ����������
 */
public class ConsignmentType
{
    private String overWeightSign;
    private String overCostSign;
    private String previousGoodsCost;
    private String previousGoodsGrossWeight;
    private String goodsFrequency;
    private CUOrganizationType consignee;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private List<WayBillType> wayBillList = new ArrayList<WayBillType>();

    /** 
     * Get the 'OverWeightSign' element value. ������� ������� ���������� �� ���� ��� ������ �������
     * 
     * @return value
     */
    public String getOverWeightSign() {
        return overWeightSign;
    }

    /** 
     * Set the 'OverWeightSign' element value. ������� ������� ���������� �� ���� ��� ������ �������
     * 
     * @param overWeightSign
     */
    public void setOverWeightSign(String overWeightSign) {
        this.overWeightSign = overWeightSign;
    }

    /** 
     * Get the 'OverCostSign' element value. ������� ������� ���������� �� ��������� ��� ������ �������
     * 
     * @return value
     */
    public String getOverCostSign() {
        return overCostSign;
    }

    /** 
     * Set the 'OverCostSign' element value. ������� ������� ���������� �� ��������� ��� ������ �������
     * 
     * @param overCostSign
     */
    public void setOverCostSign(String overCostSign) {
        this.overCostSign = overCostSign;
    }

    /** 
     * Get the 'PreviousGoodsCost' element value. ��������� ������� �� ����������� �����, ����� ����������� � ����� ����������, ����
     * 
     * @return value
     */
    public String getPreviousGoodsCost() {
        return previousGoodsCost;
    }

    /** 
     * Set the 'PreviousGoodsCost' element value. ��������� ������� �� ����������� �����, ����� ����������� � ����� ����������, ����
     * 
     * @param previousGoodsCost
     */
    public void setPreviousGoodsCost(String previousGoodsCost) {
        this.previousGoodsCost = previousGoodsCost;
    }

    /** 
     * Get the 'PreviousGoodsGrossWeight' element value. ��� �������, ������, �� ����������� �����, ����� ����������� � ����� ����������, ��
     * 
     * @return value
     */
    public String getPreviousGoodsGrossWeight() {
        return previousGoodsGrossWeight;
    }

    /** 
     * Set the 'PreviousGoodsGrossWeight' element value. ��� �������, ������, �� ����������� �����, ����� ����������� � ����� ����������, ��
     * 
     * @param previousGoodsGrossWeight
     */
    public void setPreviousGoodsGrossWeight(String previousGoodsGrossWeight) {
        this.previousGoodsGrossWeight = previousGoodsGrossWeight;
    }

    /** 
     * Get the 'GoodsFrequency' element value. ������� ����������� ������� � ����� ����������
     * 
     * @return value
     */
    public String getGoodsFrequency() {
        return goodsFrequency;
    }

    /** 
     * Set the 'GoodsFrequency' element value. ������� ����������� ������� � ����� ����������
     * 
     * @param goodsFrequency
     */
    public void setGoodsFrequency(String goodsFrequency) {
        this.goodsFrequency = goodsFrequency;
    }

    /** 
     * Get the 'Consignee' element value. ����������
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ����������
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the list of 'Goods' element items. �������� ����� ������������ ���������� �������
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� ����� ������������ ���������� �������
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the list of 'WayBill' element items. �������� � ���������
     * 
     * @return list
     */
    public List<WayBillType> getWayBillList() {
        return wayBillList;
    }

    /** 
     * Set the list of 'WayBill' element items. �������� � ���������
     * 
     * @param list
     */
    public void setWayBillList(List<WayBillType> list) {
        wayBillList = list;
    }
}


package ru.acs.fts.schemas.album.gtdoutcustomsmark;

import java.util.ArrayList;
import java.util.List;

/** 
 * ��������� ������� � �������� ������� �� �������.
 */
public class GTDOutGoodsResolutionType
{
    private String goodsNumeric;
    private List<GTDOutResolutionType> GTDOutGoodsResultList = new ArrayList<GTDOutResolutionType>();
    private List<GTDOutGoodsMarkType> GTDOutGoodsMarkList = new ArrayList<GTDOutGoodsMarkType>();
    private CustCostMethodType custCostMethod;

    /** 
     * Get the 'GoodsNumeric' element value. ����� ������ �� ��
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ����� ������ �� ��
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the list of 'GTDOutGoodsResult' element items. �������� ������� �� �������
     * 
     * @return list
     */
    public List<GTDOutResolutionType> getGTDOutGoodsResultList() {
        return GTDOutGoodsResultList;
    }

    /** 
     * Set the list of 'GTDOutGoodsResult' element items. �������� ������� �� �������
     * 
     * @param list
     */
    public void setGTDOutGoodsResultList(List<GTDOutResolutionType> list) {
        GTDOutGoodsResultList = list;
    }

    /** 
     * Get the list of 'GTDOutGoodsMark' element items. ��������� ������� �� �������.
     * 
     * @return list
     */
    public List<GTDOutGoodsMarkType> getGTDOutGoodsMarkList() {
        return GTDOutGoodsMarkList;
    }

    /** 
     * Set the list of 'GTDOutGoodsMark' element items. ��������� ������� �� �������.
     * 
     * @param list
     */
    public void setGTDOutGoodsMarkList(List<GTDOutGoodsMarkType> list) {
        GTDOutGoodsMarkList = list;
    }

    /** 
     * Get the 'CustCostMethod' element value. ������� ������������� � ����� ����������� ���������� ��������� (��. 43 ��) 
     * 
     * @return value
     */
    public CustCostMethodType getCustCostMethod() {
        return custCostMethod;
    }

    /** 
     * Set the 'CustCostMethod' element value. ������� ������������� � ����� ����������� ���������� ��������� (��. 43 ��) 
     * 
     * @param custCostMethod
     */
    public void setCustCostMethod(CustCostMethodType custCostMethod) {
        this.custCostMethod = custCostMethod;
    }
}

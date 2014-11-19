
package ru.acs.fts.schemas.album.liquidationactin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �����, ���������� ��� ���������� ��������� ���
 */
public class GoodsType
{
    private List<String> goodDescriptionList = new ArrayList<String>();
    private String goodsNumeric;
    private String goodsTNVEDCode;
    private List<SupplementaryQuantityType> goodsQuantityList = new ArrayList<SupplementaryQuantityType>();

    /** 
     * Get the list of 'GoodDescription' element items. ������������ ������
     * 
     * @return list
     */
    public List<String> getGoodDescriptionList() {
        return goodDescriptionList;
    }

    /** 
     * Set the list of 'GoodDescription' element items. ������������ ������
     * 
     * @param list
     */
    public void setGoodDescriptionList(List<String> list) {
        goodDescriptionList = list;
    }

    /** 
     * Get the 'GoodsNumeric' element value. ����� ������
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ����� ������
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the list of 'GoodsQuantity' element items. ���������� ������
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getGoodsQuantityList() {
        return goodsQuantityList;
    }

    /** 
     * Set the list of 'GoodsQuantity' element items. ���������� ������
     * 
     * @param list
     */
    public void setGoodsQuantityList(List<SupplementaryQuantityType> list) {
        goodsQuantityList = list;
    }
}

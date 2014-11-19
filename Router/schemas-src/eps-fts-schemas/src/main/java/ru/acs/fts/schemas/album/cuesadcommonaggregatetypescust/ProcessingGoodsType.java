
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� ��������� �����������
 */
public class ProcessingGoodsType
{
    private String goodsTNVEDCode;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private SupplementaryQuantityType processingGoodsQuantity;

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
     * Get the list of 'GoodsDescription' element items. �������� � �������������� ������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. �������� � �������������� ������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'ProcessingGoodsQuantity' element value. ���������� ������� � ������� ���������
     * 
     * @return value
     */
    public SupplementaryQuantityType getProcessingGoodsQuantity() {
        return processingGoodsQuantity;
    }

    /** 
     * Set the 'ProcessingGoodsQuantity' element value. ���������� ������� � ������� ���������
     * 
     * @param processingGoodsQuantity
     */
    public void setProcessingGoodsQuantity(
            SupplementaryQuantityType processingGoodsQuantity) {
        this.processingGoodsQuantity = processingGoodsQuantity;
    }
}

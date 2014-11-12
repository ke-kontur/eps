
package ru.acs.fts.schemas.album.scvvcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GoodsBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * ����. �������� � ������ 
 */
public class SCVVGoodsType extends GoodsBaseType
{
    private String amount;
    private String goodsAddTNVEDCode;
    private SupplementaryQuantityType supplementaryGoodsQuantity;

    /** 
     * Get the 'Amount' element value. ���������� ��������� ������
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. ���������� ��������� ������
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'GoodsAddTNVEDCode' element value. ��� ������ ��  �������������� �������������� ���������� ����������.
     * 
     * @return value
     */
    public String getGoodsAddTNVEDCode() {
        return goodsAddTNVEDCode;
    }

    /** 
     * Set the 'GoodsAddTNVEDCode' element value. ��� ������ ��  �������������� �������������� ���������� ����������.
     * 
     * @param goodsAddTNVEDCode
     */
    public void setGoodsAddTNVEDCode(String goodsAddTNVEDCode) {
        this.goodsAddTNVEDCode = goodsAddTNVEDCode;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. ���������� � �������������� ������� ���������.
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. ���������� � �������������� ������� ���������.
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(
            SupplementaryQuantityType supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }
}

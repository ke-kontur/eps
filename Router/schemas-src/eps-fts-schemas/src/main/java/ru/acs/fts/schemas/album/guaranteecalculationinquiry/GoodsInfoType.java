
package ru.acs.fts.schemas.album.guaranteecalculationinquiry;

/** 
 * �������� ����� �������
 */
public class GoodsInfoType
{
    private GuaranteeGoodsType checkedItem;
    private GuaranteeGoodsType correctedItem;

    /** 
     * Get the 'CheckedItem' element value. ����� ������� ��������
     * 
     * @return value
     */
    public GuaranteeGoodsType getCheckedItem() {
        return checkedItem;
    }

    /** 
     * Set the 'CheckedItem' element value. ����� ������� ��������
     * 
     * @param checkedItem
     */
    public void setCheckedItem(GuaranteeGoodsType checkedItem) {
        this.checkedItem = checkedItem;
    }

    /** 
     * Get the 'CorrectedItem' element value. �������������� �����
     * 
     * @return value
     */
    public GuaranteeGoodsType getCorrectedItem() {
        return correctedItem;
    }

    /** 
     * Set the 'CorrectedItem' element value. �������������� �����
     * 
     * @param correctedItem
     */
    public void setCorrectedItem(GuaranteeGoodsType correctedItem) {
        this.correctedItem = correctedItem;
    }
}

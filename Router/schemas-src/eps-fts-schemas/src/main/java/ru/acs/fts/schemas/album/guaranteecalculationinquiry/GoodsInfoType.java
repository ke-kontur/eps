
package ru.acs.fts.schemas.album.guaranteecalculationinquiry;

/** 
 * Товарная часть запроса
 */
public class GoodsInfoType
{
    private GuaranteeGoodsType checkedItem;
    private GuaranteeGoodsType correctedItem;

    /** 
     * Get the 'CheckedItem' element value. Товар текущей проверки
     * 
     * @return value
     */
    public GuaranteeGoodsType getCheckedItem() {
        return checkedItem;
    }

    /** 
     * Set the 'CheckedItem' element value. Товар текущей проверки
     * 
     * @param checkedItem
     */
    public void setCheckedItem(GuaranteeGoodsType checkedItem) {
        this.checkedItem = checkedItem;
    }

    /** 
     * Get the 'CorrectedItem' element value. Корректируемый товар
     * 
     * @return value
     */
    public GuaranteeGoodsType getCorrectedItem() {
        return correctedItem;
    }

    /** 
     * Set the 'CorrectedItem' element value. Корректируемый товар
     * 
     * @param correctedItem
     */
    public void setCorrectedItem(GuaranteeGoodsType correctedItem) {
        this.correctedItem = correctedItem;
    }
}

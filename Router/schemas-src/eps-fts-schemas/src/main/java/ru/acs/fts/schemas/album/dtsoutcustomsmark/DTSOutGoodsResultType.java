
package ru.acs.fts.schemas.album.dtsoutcustomsmark;

/** 
 * Решение о таможенной стоимости и служебные отметки по товарам
 */
public class DTSOutGoodsResultType
{
    private String GTDGoodsNumber;
    private DTSOuDecisionType DTSGoodsCostDecision;
    private DTSOuDecisionType DTSGoodsRecallDecision;

    /** 
     * Get the 'GTDGoodsNumber' element value. Номер товара по ДТ
     * 
     * @return value
     */
    public String getGTDGoodsNumber() {
        return GTDGoodsNumber;
    }

    /** 
     * Set the 'GTDGoodsNumber' element value. Номер товара по ДТ
     * 
     * @param GTDGoodsNumber
     */
    public void setGTDGoodsNumber(String GTDGoodsNumber) {
        this.GTDGoodsNumber = GTDGoodsNumber;
    }

    /** 
     * Get the 'DTSGoodsCostDecision' element value. Решение о таможенной стоимости товара
     * 
     * @return value
     */
    public DTSOuDecisionType getDTSGoodsCostDecision() {
        return DTSGoodsCostDecision;
    }

    /** 
     * Set the 'DTSGoodsCostDecision' element value. Решение о таможенной стоимости товара
     * 
     * @param DTSGoodsCostDecision
     */
    public void setDTSGoodsCostDecision(DTSOuDecisionType DTSGoodsCostDecision) {
        this.DTSGoodsCostDecision = DTSGoodsCostDecision;
    }

    /** 
     * Get the 'DTSGoodsRecallDecision' element value. Решение об аннулировании или отзыве ДТС по товару
     * 
     * @return value
     */
    public DTSOuDecisionType getDTSGoodsRecallDecision() {
        return DTSGoodsRecallDecision;
    }

    /** 
     * Set the 'DTSGoodsRecallDecision' element value. Решение об аннулировании или отзыве ДТС по товару
     * 
     * @param DTSGoodsRecallDecision
     */
    public void setDTSGoodsRecallDecision(
            DTSOuDecisionType DTSGoodsRecallDecision) {
        this.DTSGoodsRecallDecision = DTSGoodsRecallDecision;
    }
}

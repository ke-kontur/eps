
package ru.acs.fts.schemas.album.scvvcommonaggregatetypescust;

/** 
 * Информация о найденных расхождениях в товаре
 */
public class GoodsDiscrepancyInfoType
{
    private String goodsDiscrepancyIndicator;
    private SCVVGoodsType planFactGoodsInfo;
    private SCVVGoodsType balance;

    /** 
     * Get the 'GoodsDiscrepancyIndicator' element value. Код найденных расхождений (в соответствии со Спецификацией обмена)
     * 
     * @return value
     */
    public String getGoodsDiscrepancyIndicator() {
        return goodsDiscrepancyIndicator;
    }

    /** 
     * Set the 'GoodsDiscrepancyIndicator' element value. Код найденных расхождений (в соответствии со Спецификацией обмена)
     * 
     * @param goodsDiscrepancyIndicator
     */
    public void setGoodsDiscrepancyIndicator(String goodsDiscrepancyIndicator) {
        this.goodsDiscrepancyIndicator = goodsDiscrepancyIndicator;
    }

    /** 
     * Get the 'PlanFactGoodsInfo' element value. Информация о планируемых к вывозу товарах
     * 
     * @return value
     */
    public SCVVGoodsType getPlanFactGoodsInfo() {
        return planFactGoodsInfo;
    }

    /** 
     * Set the 'PlanFactGoodsInfo' element value. Информация о планируемых к вывозу товарах
     * 
     * @param planFactGoodsInfo
     */
    public void setPlanFactGoodsInfo(SCVVGoodsType planFactGoodsInfo) {
        this.planFactGoodsInfo = planFactGoodsInfo;
    }

    /** 
     * Get the 'Balance' element value. Остатки по ДТ по данному товару.
     * 
     * @return value
     */
    public SCVVGoodsType getBalance() {
        return balance;
    }

    /** 
     * Set the 'Balance' element value. Остатки по ДТ по данному товару.
     * 
     * @param balance
     */
    public void setBalance(SCVVGoodsType balance) {
        this.balance = balance;
    }
}

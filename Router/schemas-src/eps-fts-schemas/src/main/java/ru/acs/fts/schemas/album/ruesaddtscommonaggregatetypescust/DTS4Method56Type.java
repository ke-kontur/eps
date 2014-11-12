
package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

/** 
 * Подробности расчета таможенной стоимости по методу 5,6
 */
public class DTS4Method56Type
{
    private String totalBasisSum;
    private String productionStoreExpense;
    private String commerceExpense;

    /** 
     * Get the 'TotalBasisSum' element value. Расчетная стоимость вывозимых товаров. 12
     * 
     * @return value
     */
    public String getTotalBasisSum() {
        return totalBasisSum;
    }

    /** 
     * Set the 'TotalBasisSum' element value. Расчетная стоимость вывозимых товаров. 12
     * 
     * @param totalBasisSum
     */
    public void setTotalBasisSum(String totalBasisSum) {
        this.totalBasisSum = totalBasisSum;
    }

    /** 
     * Get the 'ProductionStoreExpense' element value. Суммы расходов, произведенных на изготовление или приобретение материалов, и расходов на производство, а также иные операции, связанные с производством вывозимых товаров 12а
     * 
     * @return value
     */
    public String getProductionStoreExpense() {
        return productionStoreExpense;
    }

    /** 
     * Set the 'ProductionStoreExpense' element value. Суммы расходов, произведенных на изготовление или приобретение материалов, и расходов на производство, а также иные операции, связанные с производством вывозимых товаров 12а
     * 
     * @param productionStoreExpense
     */
    public void setProductionStoreExpense(String productionStoreExpense) {
        this.productionStoreExpense = productionStoreExpense;
    }

    /** 
     * Get the 'CommerceExpense' element value. Суммы прибыли и коммерческих и управленческих расходов 12б
     * 
     * @return value
     */
    public String getCommerceExpense() {
        return commerceExpense;
    }

    /** 
     * Set the 'CommerceExpense' element value. Суммы прибыли и коммерческих и управленческих расходов 12б
     * 
     * @param commerceExpense
     */
    public void setCommerceExpense(String commerceExpense) {
        this.commerceExpense = commerceExpense;
    }
}

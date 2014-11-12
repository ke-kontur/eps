
package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

/** 
 * Дополнительные начисления  (иные затраты) гр. Б  (16-17)
 */
public class Method5AdditionalSumType
{
    private String workingStockCost;
    private String productionToolkitCost;
    private String productionStoreCost;
    private String designPayment;
    private String totalAdditionalPayment;

    /** 
     * Get the 'WorkingStockCost' element value. Стоимость или соответствующая часть стоимости товаров и услуг, предоставленных изготовителю: сырьё, материалы, детали, полуфабрикаты и другие составляющие ввозимых товаров  16а
     * 
     * @return value
     */
    public String getWorkingStockCost() {
        return workingStockCost;
    }

    /** 
     * Set the 'WorkingStockCost' element value. Стоимость или соответствующая часть стоимости товаров и услуг, предоставленных изготовителю: сырьё, материалы, детали, полуфабрикаты и другие составляющие ввозимых товаров  16а
     * 
     * @param workingStockCost
     */
    public void setWorkingStockCost(String workingStockCost) {
        this.workingStockCost = workingStockCost;
    }

    /** 
     * Get the 'ProductionToolkitCost' element value. Стоимость инструментов, штампов, форм и други подобных предметов, использованных при производстве ввозимых товаров. 16б
     * 
     * @return value
     */
    public String getProductionToolkitCost() {
        return productionToolkitCost;
    }

    /** 
     * Set the 'ProductionToolkitCost' element value. Стоимость инструментов, штампов, форм и други подобных предметов, использованных при производстве ввозимых товаров. 16б
     * 
     * @param productionToolkitCost
     */
    public void setProductionToolkitCost(String productionToolkitCost) {
        this.productionToolkitCost = productionToolkitCost;
    }

    /** 
     * Get the 'ProductionStoreCost' element value. Материалы израсходованные при производстве. 16в
     * 
     * @return value
     */
    public String getProductionStoreCost() {
        return productionStoreCost;
    }

    /** 
     * Set the 'ProductionStoreCost' element value. Материалы израсходованные при производстве. 16в
     * 
     * @param productionStoreCost
     */
    public void setProductionStoreCost(String productionStoreCost) {
        this.productionStoreCost = productionStoreCost;
    }

    /** 
     * Get the 'DesignPayment' element value. Стоимость проектирования, разработки, дизайна, оформления и пр. выполненных вне территории Российской Федерации. 16г
     * 
     * @return value
     */
    public String getDesignPayment() {
        return designPayment;
    }

    /** 
     * Set the 'DesignPayment' element value. Стоимость проектирования, разработки, дизайна, оформления и пр. выполненных вне территории Российской Федерации. 16г
     * 
     * @param designPayment
     */
    public void setDesignPayment(String designPayment) {
        this.designPayment = designPayment;
    }

    /** 
     * Get the 'TotalAdditionalPayment' element value. Итого дополнительных начислений. 17
     * 
     * @return value
     */
    public String getTotalAdditionalPayment() {
        return totalAdditionalPayment;
    }

    /** 
     * Set the 'TotalAdditionalPayment' element value. Итого дополнительных начислений. 17
     * 
     * @param totalAdditionalPayment
     */
    public void setTotalAdditionalPayment(String totalAdditionalPayment) {
        this.totalAdditionalPayment = totalAdditionalPayment;
    }
}

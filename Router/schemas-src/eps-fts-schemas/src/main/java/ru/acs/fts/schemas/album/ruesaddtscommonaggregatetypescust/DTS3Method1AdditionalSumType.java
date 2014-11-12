
package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

/** 
 * Дополнительные начисления. Гр. Б (13-17)
 */
public class DTS3Method1AdditionalSumType
{
    private String agentBonus;
    private String packageExpenses;
    private String storeCost;
    private String productionToolkitCost;
    private String workingStockCost;
    private String designPayment;
    private String intellectualPropertyPayment;
    private String sellerIncome;
    private String totalAdditionalSum;

    /** 
     * Get the 'AgentBonus' element value. Расходы, произведенные покупателем на выплату вознаграждения агенту (посреднику), за исключением вознаграждений за оказание услуг, связанных с покупкой товаров. 13а
     * 
     * @return value
     */
    public String getAgentBonus() {
        return agentBonus;
    }

    /** 
     * Set the 'AgentBonus' element value. Расходы, произведенные покупателем на выплату вознаграждения агенту (посреднику), за исключением вознаграждений за оказание услуг, связанных с покупкой товаров. 13а
     * 
     * @param agentBonus
     */
    public void setAgentBonus(String agentBonus) {
        this.agentBonus = agentBonus;
    }

    /** 
     * Get the 'PackageExpenses' element value. Расходы на тару и упаковку. 13б
     * 
     * @return value
     */
    public String getPackageExpenses() {
        return packageExpenses;
    }

    /** 
     * Set the 'PackageExpenses' element value. Расходы на тару и упаковку. 13б
     * 
     * @param packageExpenses
     */
    public void setPackageExpenses(String packageExpenses) {
        this.packageExpenses = packageExpenses;
    }

    /** 
     * Get the 'StoreCost' element value. Стоимость сырья, материалов и комплектующих, которые являются составной частью вывозимых товаров. 14а
     * 
     * @return value
     */
    public String getStoreCost() {
        return storeCost;
    }

    /** 
     * Set the 'StoreCost' element value. Стоимость сырья, материалов и комплектующих, которые являются составной частью вывозимых товаров. 14а
     * 
     * @param storeCost
     */
    public void setStoreCost(String storeCost) {
        this.storeCost = storeCost;
    }

    /** 
     * Get the 'ProductionToolkitCost' element value. Стоимость инструментов, штампов, форм и других подобных предметов, использованных при производстве вывозимых товаров. 14б
     * 
     * @return value
     */
    public String getProductionToolkitCost() {
        return productionToolkitCost;
    }

    /** 
     * Set the 'ProductionToolkitCost' element value. Стоимость инструментов, штампов, форм и других подобных предметов, использованных при производстве вывозимых товаров. 14б
     * 
     * @param productionToolkitCost
     */
    public void setProductionToolkitCost(String productionToolkitCost) {
        this.productionToolkitCost = productionToolkitCost;
    }

    /** 
     * Get the 'WorkingStockCost' element value. Стоимость  материалов, израсходованных при производстве вывозимых товаров. 14в
     * 
     * @return value
     */
    public String getWorkingStockCost() {
        return workingStockCost;
    }

    /** 
     * Set the 'WorkingStockCost' element value. Стоимость  материалов, израсходованных при производстве вывозимых товаров. 14в
     * 
     * @param workingStockCost
     */
    public void setWorkingStockCost(String workingStockCost) {
        this.workingStockCost = workingStockCost;
    }

    /** 
     * Get the 'DesignPayment' element value. Стоимость проектирования, разработки, дизайна, оформления и пр., необходимых для производства оцениваемых товаров. 14г.
     * 
     * @return value
     */
    public String getDesignPayment() {
        return designPayment;
    }

    /** 
     * Set the 'DesignPayment' element value. Стоимость проектирования, разработки, дизайна, оформления и пр., необходимых для производства оцениваемых товаров. 14г.
     * 
     * @param designPayment
     */
    public void setDesignPayment(String designPayment) {
        this.designPayment = designPayment;
    }

    /** 
     * Get the 'IntellectualPropertyPayment' element value. Платежи за использование объектов интеллектуальной собственности - см. графу 9 (а). 15
     * 
     * @return value
     */
    public String getIntellectualPropertyPayment() {
        return intellectualPropertyPayment;
    }

    /** 
     * Set the 'IntellectualPropertyPayment' element value. Платежи за использование объектов интеллектуальной собственности - см. графу 9 (а). 15
     * 
     * @param intellectualPropertyPayment
     */
    public void setIntellectualPropertyPayment(
            String intellectualPropertyPayment) {
        this.intellectualPropertyPayment = intellectualPropertyPayment;
    }

    /** 
     * Get the 'SellerIncome' element value. Часть дохода, полученного в результате последующей продажи, распоряжения иным способом или использования товаров, которая прямо или косвенно причитается продавцу - см. графу 9 (б) 16
     * 
     * @return value
     */
    public String getSellerIncome() {
        return sellerIncome;
    }

    /** 
     * Set the 'SellerIncome' element value. Часть дохода, полученного в результате последующей продажи, распоряжения иным способом или использования товаров, которая прямо или косвенно причитается продавцу - см. графу 9 (б) 16
     * 
     * @param sellerIncome
     */
    public void setSellerIncome(String sellerIncome) {
        this.sellerIncome = sellerIncome;
    }

    /** 
     * Get the 'TotalAdditionalSum' element value. Итого Б в национальной валюте. 17.
     * 
     * @return value
     */
    public String getTotalAdditionalSum() {
        return totalAdditionalSum;
    }

    /** 
     * Set the 'TotalAdditionalSum' element value. Итого Б в национальной валюте. 17.
     * 
     * @param totalAdditionalSum
     */
    public void setTotalAdditionalSum(String totalAdditionalSum) {
        this.totalAdditionalSum = totalAdditionalSum;
    }
}


package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

/** 
 * Основа для расчета таможенной стоимости по методу 5.
 */
public class Method5BasisType
{
    private String storeExpense;
    private String productionExpense;
    private String borderTransportCharge;
    private String packageExpense;
    private String otherExpense;
    private String exportProfit;
    private String totalBasisAmount;

    /** 
     * Get the 'StoreExpense' element value. Затраты на сырьё, материалы, детали, полуфабрикаты и другие составляющие оцениваемых товаров, понесённые изготовителем. 11
     * 
     * @return value
     */
    public String getStoreExpense() {
        return storeExpense;
    }

    /** 
     * Set the 'StoreExpense' element value. Затраты на сырьё, материалы, детали, полуфабрикаты и другие составляющие оцениваемых товаров, понесённые изготовителем. 11
     * 
     * @param storeExpense
     */
    public void setStoreExpense(String storeExpense) {
        this.storeExpense = storeExpense;
    }

    /** 
     * Get the 'ProductionExpense' element value. Издержки, понесённые изготовителем в связи с производством оцениваемых товаров (за исключением вошедших в графу 11) 12
     * 
     * @return value
     */
    public String getProductionExpense() {
        return productionExpense;
    }

    /** 
     * Set the 'ProductionExpense' element value. Издержки, понесённые изготовителем в связи с производством оцениваемых товаров (за исключением вошедших в графу 11) 12
     * 
     * @param productionExpense
     */
    public void setProductionExpense(String productionExpense) {
        this.productionExpense = productionExpense;
    }

    /** 
     * Get the 'BorderTransportCharge' element value. Расходы по доставке до места ввоза в Российскую Федерацию. 13а
     * 
     * @return value
     */
    public String getBorderTransportCharge() {
        return borderTransportCharge;
    }

    /** 
     * Set the 'BorderTransportCharge' element value. Расходы по доставке до места ввоза в Российскую Федерацию. 13а
     * 
     * @param borderTransportCharge
     */
    public void setBorderTransportCharge(String borderTransportCharge) {
        this.borderTransportCharge = borderTransportCharge;
    }

    /** 
     * Get the 'PackageExpense' element value. Расходы на тару и упаковку. 13б
     * 
     * @return value
     */
    public String getPackageExpense() {
        return packageExpense;
    }

    /** 
     * Set the 'PackageExpense' element value. Расходы на тару и упаковку. 13б
     * 
     * @param packageExpense
     */
    public void setPackageExpense(String packageExpense) {
        this.packageExpense = packageExpense;
    }

    /** 
     * Get the 'OtherExpense' element value. Иные затраты. 13в.
     * 
     * @return value
     */
    public String getOtherExpense() {
        return otherExpense;
    }

    /** 
     * Set the 'OtherExpense' element value. Иные затраты. 13в.
     * 
     * @param otherExpense
     */
    public void setOtherExpense(String otherExpense) {
        this.otherExpense = otherExpense;
    }

    /** 
     * Get the 'ExportProfit' element value. Величина прибыли, обычно получаемая экспортёром. 14.
     * 
     * @return value
     */
    public String getExportProfit() {
        return exportProfit;
    }

    /** 
     * Set the 'ExportProfit' element value. Величина прибыли, обычно получаемая экспортёром. 14.
     * 
     * @param exportProfit
     */
    public void setExportProfit(String exportProfit) {
        this.exportProfit = exportProfit;
    }

    /** 
     * Get the 'TotalBasisAmount' element value. Итого А в рублях. 15
     * 
     * @return value
     */
    public String getTotalBasisAmount() {
        return totalBasisAmount;
    }

    /** 
     * Set the 'TotalBasisAmount' element value. Итого А в рублях. 15
     * 
     * @param totalBasisAmount
     */
    public void setTotalBasisAmount(String totalBasisAmount) {
        this.totalBasisAmount = totalBasisAmount;
    }
}

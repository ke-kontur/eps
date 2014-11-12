
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

/** 
 * Основа расчета для метода 5,6
 */
public class Method56BasisType
{
    private String productionStoreExpense;
    private String packageExpenses;
    private String designPaymentProduction;
    private String goodsCost;
    private String storeCost;
    private String productionToolkitCost;
    private String consumablesCost;
    private String designPayment;
    private String commerceExpense;
    private String borderTransportCharges;
    private String borderPlace;
    private String loadCharges;
    private String arrivalPlace;
    private String insuranceCharges;

    /** 
     * Get the 'ProductionStoreExpense' element value. Общая сумма расходов производителя (продавца) оцениваемых товаров по изготовлению и (или) приобретению материалов и расходов на производство. гр. 11
     * 
     * @return value
     */
    public String getProductionStoreExpense() {
        return productionStoreExpense;
    }

    /** 
     * Set the 'ProductionStoreExpense' element value. Общая сумма расходов производителя (продавца) оцениваемых товаров по изготовлению и (или) приобретению материалов и расходов на производство. гр. 11
     * 
     * @param productionStoreExpense
     */
    public void setProductionStoreExpense(String productionStoreExpense) {
        this.productionStoreExpense = productionStoreExpense;
    }

    /** 
     * Get the 'PackageExpenses' element value. Расходы на тару и упаковку. гр 11а
     * 
     * @return value
     */
    public String getPackageExpenses() {
        return packageExpenses;
    }

    /** 
     * Set the 'PackageExpenses' element value. Расходы на тару и упаковку. гр 11а
     * 
     * @param packageExpenses
     */
    public void setPackageExpenses(String packageExpenses) {
        this.packageExpenses = packageExpenses;
    }

    /** 
     * Get the 'DesignPaymentProduction' element value. Стоимость проектирования, разработки, инженерной, конструкторской работы, дизайна, художественного оформления, чертежей и эскизов, произведенных на таможенной территории Таможенного союза (11 б)
     * 
     * @return value
     */
    public String getDesignPaymentProduction() {
        return designPaymentProduction;
    }

    /** 
     * Set the 'DesignPaymentProduction' element value. Стоимость проектирования, разработки, инженерной, конструкторской работы, дизайна, художественного оформления, чертежей и эскизов, произведенных на таможенной территории Таможенного союза (11 б)
     * 
     * @param designPaymentProduction
     */
    public void setDesignPaymentProduction(String designPaymentProduction) {
        this.designPaymentProduction = designPaymentProduction;
    }

    /** 
     * Get the 'GoodsCost' element value. Стоимость товаров и услуг гр 12
     * 
     * @return value
     */
    public String getGoodsCost() {
        return goodsCost;
    }

    /** 
     * Set the 'GoodsCost' element value. Стоимость товаров и услуг гр 12
     * 
     * @param goodsCost
     */
    public void setGoodsCost(String goodsCost) {
        this.goodsCost = goodsCost;
    }

    /** 
     * Get the 'StoreCost' element value. Стоимость сырья, материалов, деталей, полуфабрикатов и тому подобных предметов, из которых состоят ввозимые товары (12а)
     * 
     * @return value
     */
    public String getStoreCost() {
        return storeCost;
    }

    /** 
     * Set the 'StoreCost' element value. Стоимость сырья, материалов, деталей, полуфабрикатов и тому подобных предметов, из которых состоят ввозимые товары (12а)
     * 
     * @param storeCost
     */
    public void setStoreCost(String storeCost) {
        this.storeCost = storeCost;
    }

    /** 
     * Get the 'ProductionToolkitCost' element value. Стоимость инструментов, штампов, форм и других подобных предметов, использованных при производстве ввозимых товаров. (12 б)
     * 
     * @return value
     */
    public String getProductionToolkitCost() {
        return productionToolkitCost;
    }

    /** 
     * Set the 'ProductionToolkitCost' element value. Стоимость инструментов, штампов, форм и других подобных предметов, использованных при производстве ввозимых товаров. (12 б)
     * 
     * @param productionToolkitCost
     */
    public void setProductionToolkitCost(String productionToolkitCost) {
        this.productionToolkitCost = productionToolkitCost;
    }

    /** 
     * Get the 'ConsumablesCost' element value. Стоимость материалов, израсходованных при производстве ввозимых товаров (12в)
     * 
     * @return value
     */
    public String getConsumablesCost() {
        return consumablesCost;
    }

    /** 
     * Set the 'ConsumablesCost' element value. Стоимость материалов, израсходованных при производстве ввозимых товаров (12в)
     * 
     * @param consumablesCost
     */
    public void setConsumablesCost(String consumablesCost) {
        this.consumablesCost = consumablesCost;
    }

    /** 
     * Get the 'DesignPayment' element value. Стоимость проектирования, разработки, инженерной, конструкторской работы, художественного оформления, дизайна, эскизов и чертежей выполненных вне таможенной территории Таможенного союза и необходимых для производства ввозимых товаров (12 г)
     * 
     * @return value
     */
    public String getDesignPayment() {
        return designPayment;
    }

    /** 
     * Set the 'DesignPayment' element value. Стоимость проектирования, разработки, инженерной, конструкторской работы, художественного оформления, дизайна, эскизов и чертежей выполненных вне таможенной территории Таможенного союза и необходимых для производства ввозимых товаров (12 г)
     * 
     * @param designPayment
     */
    public void setDesignPayment(String designPayment) {
        this.designPayment = designPayment;
    }

    /** 
     * Get the 'CommerceExpense' element value. Сумма прибыли и коммерческих и управленческих расходов (13)
     * 
     * @return value
     */
    public String getCommerceExpense() {
        return commerceExpense;
    }

    /** 
     * Set the 'CommerceExpense' element value. Сумма прибыли и коммерческих и управленческих расходов (13)
     * 
     * @param commerceExpense
     */
    public void setCommerceExpense(String commerceExpense) {
        this.commerceExpense = commerceExpense;
    }

    /** 
     * Get the 'BorderTransportCharges' element value. Расходы по перевозке (транспортировке) товаров до места прибытия на таможенную территорию Таможенного союза. гр. 14
     * 
     * @return value
     */
    public String getBorderTransportCharges() {
        return borderTransportCharges;
    }

    /** 
     * Set the 'BorderTransportCharges' element value. Расходы по перевозке (транспортировке) товаров до места прибытия на таможенную территорию Таможенного союза. гр. 14
     * 
     * @param borderTransportCharges
     */
    public void setBorderTransportCharges(String borderTransportCharges) {
        this.borderTransportCharges = borderTransportCharges;
    }

    /** 
     * Get the 'BorderPlace' element value. Место прибытия  / место назначения декларируемых товаров (гр. 14)
     * 
     * @return value
     */
    public String getBorderPlace() {
        return borderPlace;
    }

    /** 
     * Set the 'BorderPlace' element value. Место прибытия  / место назначения декларируемых товаров (гр. 14)
     * 
     * @param borderPlace
     */
    public void setBorderPlace(String borderPlace) {
        this.borderPlace = borderPlace;
    }

    /** 
     * Get the 'LoadCharges' element value. Расходы по погрузке, разгрузке/перегрузке товаров и операциям, связанным с перевозкой до места прибытия на таможенную территорию Таможенного союза. гр. 15
     * 
     * @return value
     */
    public String getLoadCharges() {
        return loadCharges;
    }

    /** 
     * Set the 'LoadCharges' element value. Расходы по погрузке, разгрузке/перегрузке товаров и операциям, связанным с перевозкой до места прибытия на таможенную территорию Таможенного союза. гр. 15
     * 
     * @param loadCharges
     */
    public void setLoadCharges(String loadCharges) {
        this.loadCharges = loadCharges;
    }

    /** 
     * Get the 'ArrivalPlace' element value. Место прибытия  декларируемых товаров (гр. 15)
     * 
     * @return value
     */
    public String getArrivalPlace() {
        return arrivalPlace;
    }

    /** 
     * Set the 'ArrivalPlace' element value. Место прибытия  декларируемых товаров (гр. 15)
     * 
     * @param arrivalPlace
     */
    public void setArrivalPlace(String arrivalPlace) {
        this.arrivalPlace = arrivalPlace;
    }

    /** 
     * Get the 'InsuranceCharges' element value. Расходы на страхование в связи с операциями, указанными в графах 14 и 15. гр 16
     * 
     * @return value
     */
    public String getInsuranceCharges() {
        return insuranceCharges;
    }

    /** 
     * Set the 'InsuranceCharges' element value. Расходы на страхование в связи с операциями, указанными в графах 14 и 15. гр 16
     * 
     * @param insuranceCharges
     */
    public void setInsuranceCharges(String insuranceCharges) {
        this.insuranceCharges = insuranceCharges;
    }
}

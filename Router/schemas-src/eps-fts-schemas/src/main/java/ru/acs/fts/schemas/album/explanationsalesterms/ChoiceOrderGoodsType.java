
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Выбор и заказ товара
 */
public class ChoiceOrderGoodsType
{
    private String departmentAnalysis;
    private String analysis;
    private String study;
    private String deliveryGoodsUnderContract;
    private ChoiceGoodsType choiceGood;
    private OrderGoodsType orderGoods;
    private DeliveryGoodsType deliveryGoods;

    /** 
     * Get the 'DepartmentAnalysis' element value. Признак того, что у покупателя имеется подразделение, занимающееся изучением конъюнктуры рынка и (или) оценкой эффективности сделок
     * 
     * @return value
     */
    public String getDepartmentAnalysis() {
        return departmentAnalysis;
    }

    /** 
     * Set the 'DepartmentAnalysis' element value. Признак того, что у покупателя имеется подразделение, занимающееся изучением конъюнктуры рынка и (или) оценкой эффективности сделок
     * 
     * @param departmentAnalysis
     */
    public void setDepartmentAnalysis(String departmentAnalysis) {
        this.departmentAnalysis = departmentAnalysis;
    }

    /** 
     * Get the 'Analysis' element value. Признак того, что подразделение анализировало предложения других продавцов, занимающихся поставками товаров того же класса или вида
     * 
     * @return value
     */
    public String getAnalysis() {
        return analysis;
    }

    /** 
     * Set the 'Analysis' element value. Признак того, что подразделение анализировало предложения других продавцов, занимающихся поставками товаров того же класса или вида
     * 
     * @param analysis
     */
    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    /** 
     * Get the 'Study' element value. Признак возможности предоставить материалы исследований
     * 
     * @return value
     */
    public String getStudy() {
        return study;
    }

    /** 
     * Set the 'Study' element value. Признак возможности предоставить материалы исследований
     * 
     * @param study
     */
    public void setStudy(String study) {
        this.study = study;
    }

    /** 
     * Get the 'DeliveryGoodsUnderContract' element value. Признак того, что в рамках контракта поставляются товары одного класса или вида
     * 
     * @return value
     */
    public String getDeliveryGoodsUnderContract() {
        return deliveryGoodsUnderContract;
    }

    /** 
     * Set the 'DeliveryGoodsUnderContract' element value. Признак того, что в рамках контракта поставляются товары одного класса или вида
     * 
     * @param deliveryGoodsUnderContract
     */
    public void setDeliveryGoodsUnderContract(String deliveryGoodsUnderContract) {
        this.deliveryGoodsUnderContract = deliveryGoodsUnderContract;
    }

    /** 
     * Get the 'ChoiceGood' element value. Выбор товара
     * 
     * @return value
     */
    public ChoiceGoodsType getChoiceGood() {
        return choiceGood;
    }

    /** 
     * Set the 'ChoiceGood' element value. Выбор товара
     * 
     * @param choiceGood
     */
    public void setChoiceGood(ChoiceGoodsType choiceGood) {
        this.choiceGood = choiceGood;
    }

    /** 
     * Get the 'OrderGoods' element value. Заказ товара
     * 
     * @return value
     */
    public OrderGoodsType getOrderGoods() {
        return orderGoods;
    }

    /** 
     * Set the 'OrderGoods' element value. Заказ товара
     * 
     * @param orderGoods
     */
    public void setOrderGoods(OrderGoodsType orderGoods) {
        this.orderGoods = orderGoods;
    }

    /** 
     * Get the 'DeliveryGoods' element value. Поставляемый товар
     * 
     * @return value
     */
    public DeliveryGoodsType getDeliveryGoods() {
        return deliveryGoods;
    }

    /** 
     * Set the 'DeliveryGoods' element value. Поставляемый товар
     * 
     * @param deliveryGoods
     */
    public void setDeliveryGoods(DeliveryGoodsType deliveryGoods) {
        this.deliveryGoods = deliveryGoods;
    }
}

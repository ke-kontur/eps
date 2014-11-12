
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * ����� � ����� ������
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
     * Get the 'DepartmentAnalysis' element value. ������� ����, ��� � ���������� ������� �������������, ������������ ��������� ����������� ����� � (���) ������� ������������� ������
     * 
     * @return value
     */
    public String getDepartmentAnalysis() {
        return departmentAnalysis;
    }

    /** 
     * Set the 'DepartmentAnalysis' element value. ������� ����, ��� � ���������� ������� �������������, ������������ ��������� ����������� ����� � (���) ������� ������������� ������
     * 
     * @param departmentAnalysis
     */
    public void setDepartmentAnalysis(String departmentAnalysis) {
        this.departmentAnalysis = departmentAnalysis;
    }

    /** 
     * Get the 'Analysis' element value. ������� ����, ��� ������������� ������������� ����������� ������ ���������, ������������ ���������� ������� ���� �� ������ ��� ����
     * 
     * @return value
     */
    public String getAnalysis() {
        return analysis;
    }

    /** 
     * Set the 'Analysis' element value. ������� ����, ��� ������������� ������������� ����������� ������ ���������, ������������ ���������� ������� ���� �� ������ ��� ����
     * 
     * @param analysis
     */
    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    /** 
     * Get the 'Study' element value. ������� ����������� ������������ ��������� ������������
     * 
     * @return value
     */
    public String getStudy() {
        return study;
    }

    /** 
     * Set the 'Study' element value. ������� ����������� ������������ ��������� ������������
     * 
     * @param study
     */
    public void setStudy(String study) {
        this.study = study;
    }

    /** 
     * Get the 'DeliveryGoodsUnderContract' element value. ������� ����, ��� � ������ ��������� ������������ ������ ������ ������ ��� ����
     * 
     * @return value
     */
    public String getDeliveryGoodsUnderContract() {
        return deliveryGoodsUnderContract;
    }

    /** 
     * Set the 'DeliveryGoodsUnderContract' element value. ������� ����, ��� � ������ ��������� ������������ ������ ������ ������ ��� ����
     * 
     * @param deliveryGoodsUnderContract
     */
    public void setDeliveryGoodsUnderContract(String deliveryGoodsUnderContract) {
        this.deliveryGoodsUnderContract = deliveryGoodsUnderContract;
    }

    /** 
     * Get the 'ChoiceGood' element value. ����� ������
     * 
     * @return value
     */
    public ChoiceGoodsType getChoiceGood() {
        return choiceGood;
    }

    /** 
     * Set the 'ChoiceGood' element value. ����� ������
     * 
     * @param choiceGood
     */
    public void setChoiceGood(ChoiceGoodsType choiceGood) {
        this.choiceGood = choiceGood;
    }

    /** 
     * Get the 'OrderGoods' element value. ����� ������
     * 
     * @return value
     */
    public OrderGoodsType getOrderGoods() {
        return orderGoods;
    }

    /** 
     * Set the 'OrderGoods' element value. ����� ������
     * 
     * @param orderGoods
     */
    public void setOrderGoods(OrderGoodsType orderGoods) {
        this.orderGoods = orderGoods;
    }

    /** 
     * Get the 'DeliveryGoods' element value. ������������ �����
     * 
     * @return value
     */
    public DeliveryGoodsType getDeliveryGoods() {
        return deliveryGoods;
    }

    /** 
     * Set the 'DeliveryGoods' element value. ������������ �����
     * 
     * @param deliveryGoods
     */
    public void setDeliveryGoods(DeliveryGoodsType deliveryGoods) {
        this.deliveryGoods = deliveryGoods;
    }
}

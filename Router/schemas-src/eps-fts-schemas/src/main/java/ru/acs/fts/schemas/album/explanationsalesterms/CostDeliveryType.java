
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * �������� �� ���������� ��������� ��������.
 */
public class CostDeliveryType
{
    private DescriptionCostDeliveryType exactAmount;
    private DescriptionCostDeliveryType notKnown;
    private DescriptionCostDeliveryType approximateCost;

    /** 
     * Get the 'ExactAmount' element value. �������� ������ ��������� ��������
     * 
     * @return value
     */
    public DescriptionCostDeliveryType getExactAmount() {
        return exactAmount;
    }

    /** 
     * Set the 'ExactAmount' element value. �������� ������ ��������� ��������
     * 
     * @param exactAmount
     */
    public void setExactAmount(DescriptionCostDeliveryType exactAmount) {
        this.exactAmount = exactAmount;
    }

    /** 
     * Get the 'NotKnown' element value. �� �������� ��������� ��������
     * 
     * @return value
     */
    public DescriptionCostDeliveryType getNotKnown() {
        return notKnown;
    }

    /** 
     * Set the 'NotKnown' element value. �� �������� ��������� ��������
     * 
     * @param notKnown
     */
    public void setNotKnown(DescriptionCostDeliveryType notKnown) {
        this.notKnown = notKnown;
    }

    /** 
     * Get the 'ApproximateCost' element value. �������� ��������� ��������� ��������
     * 
     * @return value
     */
    public DescriptionCostDeliveryType getApproximateCost() {
        return approximateCost;
    }

    /** 
     * Set the 'ApproximateCost' element value. �������� ��������� ��������� ��������
     * 
     * @param approximateCost
     */
    public void setApproximateCost(DescriptionCostDeliveryType approximateCost) {
        this.approximateCost = approximateCost;
    }
}

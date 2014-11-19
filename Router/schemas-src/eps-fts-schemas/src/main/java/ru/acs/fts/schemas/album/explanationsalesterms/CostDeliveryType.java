
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Известна ли Покупателю стоимость доставки.
 */
public class CostDeliveryType
{
    private DescriptionCostDeliveryType exactAmount;
    private DescriptionCostDeliveryType notKnown;
    private DescriptionCostDeliveryType approximateCost;

    /** 
     * Get the 'ExactAmount' element value. Известна точная стоимость доставки
     * 
     * @return value
     */
    public DescriptionCostDeliveryType getExactAmount() {
        return exactAmount;
    }

    /** 
     * Set the 'ExactAmount' element value. Известна точная стоимость доставки
     * 
     * @param exactAmount
     */
    public void setExactAmount(DescriptionCostDeliveryType exactAmount) {
        this.exactAmount = exactAmount;
    }

    /** 
     * Get the 'NotKnown' element value. Не известна стоимость доставки
     * 
     * @return value
     */
    public DescriptionCostDeliveryType getNotKnown() {
        return notKnown;
    }

    /** 
     * Set the 'NotKnown' element value. Не известна стоимость доставки
     * 
     * @param notKnown
     */
    public void setNotKnown(DescriptionCostDeliveryType notKnown) {
        this.notKnown = notKnown;
    }

    /** 
     * Get the 'ApproximateCost' element value. Известна примерная стоимость доставки
     * 
     * @return value
     */
    public DescriptionCostDeliveryType getApproximateCost() {
        return approximateCost;
    }

    /** 
     * Set the 'ApproximateCost' element value. Известна примерная стоимость доставки
     * 
     * @param approximateCost
     */
    public void setApproximateCost(DescriptionCostDeliveryType approximateCost) {
        this.approximateCost = approximateCost;
    }
}

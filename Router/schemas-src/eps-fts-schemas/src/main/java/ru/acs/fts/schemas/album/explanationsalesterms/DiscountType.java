
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Отличие вызвано скидкой
 */
public class DiscountType
{
    private String quantityGoods;
    private String repaymentTerms;
    private String seasonal;
    private String other;
    private String comments;

    /** 
     * Get the 'QuantityGoods' element value. Признак наличия скидки на количество товаров
     * 
     * @return value
     */
    public String getQuantityGoods() {
        return quantityGoods;
    }

    /** 
     * Set the 'QuantityGoods' element value. Признак наличия скидки на количество товаров
     * 
     * @param quantityGoods
     */
    public void setQuantityGoods(String quantityGoods) {
        this.quantityGoods = quantityGoods;
    }

    /** 
     * Get the 'RepaymentTerms' element value. Признак наличия скидки на условия оплаты
     * 
     * @return value
     */
    public String getRepaymentTerms() {
        return repaymentTerms;
    }

    /** 
     * Set the 'RepaymentTerms' element value. Признак наличия скидки на условия оплаты
     * 
     * @param repaymentTerms
     */
    public void setRepaymentTerms(String repaymentTerms) {
        this.repaymentTerms = repaymentTerms;
    }

    /** 
     * Get the 'Seasonal' element value. Признак наличия сезонной скидки
     * 
     * @return value
     */
    public String getSeasonal() {
        return seasonal;
    }

    /** 
     * Set the 'Seasonal' element value. Признак наличия сезонной скидки
     * 
     * @param seasonal
     */
    public void setSeasonal(String seasonal) {
        this.seasonal = seasonal;
    }

    /** 
     * Get the 'Other' element value. Признак наличия иной скидки
     * 
     * @return value
     */
    public String getOther() {
        return other;
    }

    /** 
     * Set the 'Other' element value. Признак наличия иной скидки
     * 
     * @param other
     */
    public void setOther(String other) {
        this.other = other;
    }

    /** 
     * Get the 'Comments' element value. Иные (указать вид)
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Иные (указать вид)
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}

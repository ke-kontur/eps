
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * ������� ������� �������
 */
public class DiscountType
{
    private String quantityGoods;
    private String repaymentTerms;
    private String seasonal;
    private String other;
    private String comments;

    /** 
     * Get the 'QuantityGoods' element value. ������� ������� ������ �� ���������� �������
     * 
     * @return value
     */
    public String getQuantityGoods() {
        return quantityGoods;
    }

    /** 
     * Set the 'QuantityGoods' element value. ������� ������� ������ �� ���������� �������
     * 
     * @param quantityGoods
     */
    public void setQuantityGoods(String quantityGoods) {
        this.quantityGoods = quantityGoods;
    }

    /** 
     * Get the 'RepaymentTerms' element value. ������� ������� ������ �� ������� ������
     * 
     * @return value
     */
    public String getRepaymentTerms() {
        return repaymentTerms;
    }

    /** 
     * Set the 'RepaymentTerms' element value. ������� ������� ������ �� ������� ������
     * 
     * @param repaymentTerms
     */
    public void setRepaymentTerms(String repaymentTerms) {
        this.repaymentTerms = repaymentTerms;
    }

    /** 
     * Get the 'Seasonal' element value. ������� ������� �������� ������
     * 
     * @return value
     */
    public String getSeasonal() {
        return seasonal;
    }

    /** 
     * Set the 'Seasonal' element value. ������� ������� �������� ������
     * 
     * @param seasonal
     */
    public void setSeasonal(String seasonal) {
        this.seasonal = seasonal;
    }

    /** 
     * Get the 'Other' element value. ������� ������� ���� ������
     * 
     * @return value
     */
    public String getOther() {
        return other;
    }

    /** 
     * Set the 'Other' element value. ������� ������� ���� ������
     * 
     * @param other
     */
    public void setOther(String other) {
        this.other = other;
    }

    /** 
     * Get the 'Comments' element value. ���� (������� ���)
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. ���� (������� ���)
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}

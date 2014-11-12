
package ru.acs.fts.schemas.album.serviceinvoice;

/** 
 * ��������� ������ �����
 */
public class PaymentDetailsType
{
    private String amount;
    private String currency;

    /** 
     * Get the 'Amount' element value. �����
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. �����
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'Currency' element value. ��� ������
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. ��� ������
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

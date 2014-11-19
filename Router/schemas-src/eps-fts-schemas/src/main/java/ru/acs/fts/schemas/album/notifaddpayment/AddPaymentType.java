
package ru.acs.fts.schemas.album.notifaddpayment;

/** 
 * Дополнительный платеж
 */
public class AddPaymentType
{
    private String summa;
    private String currency;
    private String comments;

    /** 
     * Get the 'Summa' element value. Сумма платежа
     * 
     * @return value
     */
    public String getSumma() {
        return summa;
    }

    /** 
     * Set the 'Summa' element value. Сумма платежа
     * 
     * @param summa
     */
    public void setSumma(String summa) {
        this.summa = summa;
    }

    /** 
     * Get the 'Currency' element value. Код валюты платежа
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. Код валюты платежа
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'Comments' element value. Комментарии
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Комментарии
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}

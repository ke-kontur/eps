
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Сведения о платежах
 */
public class PaymentInformationType
{
    private LocalDate dateInf;
    private String summa;
    private String currency;
    private String comments;

    /** 
     * Get the 'DateInf' element value. Дата платежа
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. Дата платежа
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }

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

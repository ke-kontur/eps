
package ru.acs.fts.schemas.album.airwaybill;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Информация о платежах 
 */
public class PaymentType
{
    private String paymentMode;
    private String amount;
    private String currencyCode;
    private String place;
    private LocalDate dateInf;
    private String nameInf;
    private List<String> commentList = new ArrayList<String>();

    /** 
     * Get the 'PaymentMode' element value. Вид платежа.
     * 
     * @return value
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /** 
     * Set the 'PaymentMode' element value. Вид платежа.
     * 
     * @param paymentMode
     */
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    /** 
     * Get the 'Amount' element value. Сумма платежа
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Сумма платежа
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код иностранной валюты платежа
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код иностранной валюты платежа
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'Place' element value. Место платежа
     * 
     * @return value
     */
    public String getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. Место платежа
     * 
     * @param place
     */
    public void setPlace(String place) {
        this.place = place;
    }

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
     * Get the 'NameInf' element value. Наименование лица, которое должно 
     * 
     * @return value
     */
    public String getNameInf() {
        return nameInf;
    }

    /** 
     * Set the 'NameInf' element value. Наименование лица, которое должно 
     * 
     * @param nameInf
     */
    public void setNameInf(String nameInf) {
        this.nameInf = nameInf;
    }

    /** 
     * Get the list of 'Comments' element items. Дополнительная информация
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comments' element items. Дополнительная информация
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }
}

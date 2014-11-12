
package ru.acs.fts.schemas.album.ktdin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADoutCUCustomsPaymentType;

/** 
 * Уплата таможенных платежей. Гр. В
 */
public class KDTSectionBCustomsPaymentType extends ESADoutCUCustomsPaymentType
{
    private String paymentPrevious;
    private String rateCurrencyCodePrevious;
    private String changeAmount;
    private List<PaymentDocumentType> paymentDocumentList = new ArrayList<PaymentDocumentType>();

    /** 
     * Get the 'PaymentPrevious' element value. Предыдущая сумма платежа
     * 
     * @return value
     */
    public String getPaymentPrevious() {
        return paymentPrevious;
    }

    /** 
     * Set the 'PaymentPrevious' element value. Предыдущая сумма платежа
     * 
     * @param paymentPrevious
     */
    public void setPaymentPrevious(String paymentPrevious) {
        this.paymentPrevious = paymentPrevious;
    }

    /** 
     * Get the 'RateCurrencyCodePrevious' element value. Цифровой код валюты предыдущей суммы платежа
     * 
     * @return value
     */
    public String getRateCurrencyCodePrevious() {
        return rateCurrencyCodePrevious;
    }

    /** 
     * Set the 'RateCurrencyCodePrevious' element value. Цифровой код валюты предыдущей суммы платежа
     * 
     * @param rateCurrencyCodePrevious
     */
    public void setRateCurrencyCodePrevious(String rateCurrencyCodePrevious) {
        this.rateCurrencyCodePrevious = rateCurrencyCodePrevious;
    }

    /** 
     * Get the 'ChangeAmount' element value. Изменение
     * 
     * @return value
     */
    public String getChangeAmount() {
        return changeAmount;
    }

    /** 
     * Set the 'ChangeAmount' element value. Изменение
     * 
     * @param changeAmount
     */
    public void setChangeAmount(String changeAmount) {
        this.changeAmount = changeAmount;
    }

    /** 
     * Get the list of 'PaymentDocument' element items. Платежный документ
     * 
     * @return list
     */
    public List<PaymentDocumentType> getPaymentDocumentList() {
        return paymentDocumentList;
    }

    /** 
     * Set the list of 'PaymentDocument' element items. Платежный документ
     * 
     * @param list
     */
    public void setPaymentDocumentList(List<PaymentDocumentType> list) {
        paymentDocumentList = list;
    }
}

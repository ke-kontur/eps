
package ru.acs.fts.schemas.album.ktdin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADoutCUCustomsPaymentType;

/** 
 * ������ ���������� ��������. ��. �
 */
public class KDTSectionBCustomsPaymentType extends ESADoutCUCustomsPaymentType
{
    private String paymentPrevious;
    private String rateCurrencyCodePrevious;
    private String changeAmount;
    private List<PaymentDocumentType> paymentDocumentList = new ArrayList<PaymentDocumentType>();

    /** 
     * Get the 'PaymentPrevious' element value. ���������� ����� �������
     * 
     * @return value
     */
    public String getPaymentPrevious() {
        return paymentPrevious;
    }

    /** 
     * Set the 'PaymentPrevious' element value. ���������� ����� �������
     * 
     * @param paymentPrevious
     */
    public void setPaymentPrevious(String paymentPrevious) {
        this.paymentPrevious = paymentPrevious;
    }

    /** 
     * Get the 'RateCurrencyCodePrevious' element value. �������� ��� ������ ���������� ����� �������
     * 
     * @return value
     */
    public String getRateCurrencyCodePrevious() {
        return rateCurrencyCodePrevious;
    }

    /** 
     * Set the 'RateCurrencyCodePrevious' element value. �������� ��� ������ ���������� ����� �������
     * 
     * @param rateCurrencyCodePrevious
     */
    public void setRateCurrencyCodePrevious(String rateCurrencyCodePrevious) {
        this.rateCurrencyCodePrevious = rateCurrencyCodePrevious;
    }

    /** 
     * Get the 'ChangeAmount' element value. ���������
     * 
     * @return value
     */
    public String getChangeAmount() {
        return changeAmount;
    }

    /** 
     * Set the 'ChangeAmount' element value. ���������
     * 
     * @param changeAmount
     */
    public void setChangeAmount(String changeAmount) {
        this.changeAmount = changeAmount;
    }

    /** 
     * Get the list of 'PaymentDocument' element items. ��������� ��������
     * 
     * @return list
     */
    public List<PaymentDocumentType> getPaymentDocumentList() {
        return paymentDocumentList;
    }

    /** 
     * Set the list of 'PaymentDocument' element items. ��������� ��������
     * 
     * @param list
     */
    public void setPaymentDocumentList(List<PaymentDocumentType> list) {
        paymentDocumentList = list;
    }
}

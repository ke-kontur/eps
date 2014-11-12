
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * ��������� � ������� ��������� �� �������
 */
public class ImportContractTermsType
{
    private String amount;
    private String discount;
    private String currencyCode;
    private String paymentModeCode;
    private List<String> dueDateCodeList = new ArrayList<String>();
    private LocalDate lastDate;
    private List<String> paymentCurrencyCodeList = new ArrayList<String>();

    /** 
     * Get the 'Amount' element value. ����� ����� ������
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. ����� ����� ������
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'Discount' element value. ����� ����� ������ �� ���������
     * 
     * @return value
     */
    public String getDiscount() {
        return discount;
    }

    /** 
     * Set the 'Discount' element value. ����� ����� ������ �� ���������
     * 
     * @param discount
     */
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������ ��������� (����)
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������ ��������� (����)
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'PaymentModeCode' element value. ��� ���������� ����� ������ ������ (������) �� ��������� 
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. ��� ���������� ����� ������ ������ (������) �� ��������� 
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the list of 'DueDateCode' element items. ��� ����������� ����� �������� �� ���������
     * 
     * @return list
     */
    public List<String> getDueDateCodeList() {
        return dueDateCodeList;
    }

    /** 
     * Set the list of 'DueDateCode' element items. ��� ����������� ����� �������� �� ���������
     * 
     * @param list
     */
    public void setDueDateCodeList(List<String> list) {
        dueDateCodeList = list;
    }

    /** 
     * Get the 'LastDate' element value. ��������� ���� �������� �� ���������
     * 
     * @return value
     */
    public LocalDate getLastDate() {
        return lastDate;
    }

    /** 
     * Set the 'LastDate' element value. ��������� ���� �������� �� ���������
     * 
     * @param lastDate
     */
    public void setLastDate(LocalDate lastDate) {
        this.lastDate = lastDate;
    }

    /** 
     * Get the list of 'PaymentCurrencyCode' element items. ��� ������ �������
     * 
     * @return list
     */
    public List<String> getPaymentCurrencyCodeList() {
        return paymentCurrencyCodeList;
    }

    /** 
     * Set the list of 'PaymentCurrencyCode' element items. ��� ������ �������
     * 
     * @param list
     */
    public void setPaymentCurrencyCodeList(List<String> list) {
        paymentCurrencyCodeList = list;
    }
}

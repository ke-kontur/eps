
package ru.acs.fts.schemas.album.tpo;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � �������
 */
public class PaymentInfoType
{
    private String paymentModeCode;
    private String paymentName;
    private String taxBase;
    private String rate;
    private String amount;
    private String taxBaseQualifierCode;
    private String rateQualifierCode;
    private List<PaymentDetailsType> paymentDetailList = new ArrayList<PaymentDetailsType>();

    /** 
     * Get the 'PaymentModeCode' element value. ��� ���� ������� � ������������ � ��������������� ����� ���������� � ���� ��������
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. ��� ���� ������� � ������������ � ��������������� ����� ���������� � ���� ��������
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'PaymentName' element value. ������������ �������
     * 
     * @return value
     */
    public String getPaymentName() {
        return paymentName;
    }

    /** 
     * Set the 'PaymentName' element value. ������������ �������
     * 
     * @param paymentName
     */
    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    /** 
     * Get the 'TaxBase' element value. ������ ����������
     * 
     * @return value
     */
    public String getTaxBase() {
        return taxBase;
    }

    /** 
     * Set the 'TaxBase' element value. ������ ����������
     * 
     * @param taxBase
     */
    public void setTaxBase(String taxBase) {
        this.taxBase = taxBase;
    }

    /** 
     * Get the 'Rate' element value. ������
     * 
     * @return value
     */
    public String getRate() {
        return rate;
    }

    /** 
     * Set the 'Rate' element value. ������
     * 
     * @param rate
     */
    public void setRate(String rate) {
        this.rate = rate;
    }

    /** 
     * Get the 'Amount' element value. ����������� �����
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. ����������� �����
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'TaxBaseQualifierCode' element value. ������� ������ ���������� �������
     * 
     * @return value
     */
    public String getTaxBaseQualifierCode() {
        return taxBaseQualifierCode;
    }

    /** 
     * Set the 'TaxBaseQualifierCode' element value. ������� ������ ���������� �������
     * 
     * @param taxBaseQualifierCode
     */
    public void setTaxBaseQualifierCode(String taxBaseQualifierCode) {
        this.taxBaseQualifierCode = taxBaseQualifierCode;
    }

    /** 
     * Get the 'RateQualifierCode' element value. ��� ������� ��������� ������
     * 
     * @return value
     */
    public String getRateQualifierCode() {
        return rateQualifierCode;
    }

    /** 
     * Set the 'RateQualifierCode' element value. ��� ������� ��������� ������
     * 
     * @param rateQualifierCode
     */
    public void setRateQualifierCode(String rateQualifierCode) {
        this.rateQualifierCode = rateQualifierCode;
    }

    /** 
     * Get the list of 'PaymentDetails' element items. ����������� ������
     * 
     * @return list
     */
    public List<PaymentDetailsType> getPaymentDetailList() {
        return paymentDetailList;
    }

    /** 
     * Set the list of 'PaymentDetails' element items. ����������� ������
     * 
     * @param list
     */
    public void setPaymentDetailList(List<PaymentDetailsType> list) {
        paymentDetailList = list;
    }
}

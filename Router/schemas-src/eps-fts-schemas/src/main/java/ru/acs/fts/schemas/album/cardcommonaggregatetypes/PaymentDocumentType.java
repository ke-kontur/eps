
package ru.acs.fts.schemas.album.cardcommonaggregatetypes;

import org.joda.time.LocalDate;

/** 
 * �������� ��������
 */
public class PaymentDocumentType
{
    private String paymentModeCode;
    private String paymentDocumentNumber;
    private LocalDate paymentDocumentDate;
    private String totalAmount;
    private String writtenoffAmount;
    private String paymentCurrencyCode;
    private String writtenoffAmountCurrencyCode;
    private String returnSign;
    private String INNID;
    private String KPPCode;

    /** 
     * Get the 'PaymentModeCode' element value. ��� ���� ����������� ������� �� �������������� ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. ��� ���� ����������� ������� �� �������������� ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'PaymentDocumentNumber' element value. ����� ���������� ���������
     * 
     * @return value
     */
    public String getPaymentDocumentNumber() {
        return paymentDocumentNumber;
    }

    /** 
     * Set the 'PaymentDocumentNumber' element value. ����� ���������� ���������
     * 
     * @param paymentDocumentNumber
     */
    public void setPaymentDocumentNumber(String paymentDocumentNumber) {
        this.paymentDocumentNumber = paymentDocumentNumber;
    }

    /** 
     * Get the 'PaymentDocumentDate' element value. ���� ���������� ���������
     * 
     * @return value
     */
    public LocalDate getPaymentDocumentDate() {
        return paymentDocumentDate;
    }

    /** 
     * Set the 'PaymentDocumentDate' element value. ���� ���������� ���������
     * 
     * @param paymentDocumentDate
     */
    public void setPaymentDocumentDate(LocalDate paymentDocumentDate) {
        this.paymentDocumentDate = paymentDocumentDate;
    }

    /** 
     * Get the 'TotalAmount' element value. ����� ����� �� ���������� ���������
     * 
     * @return value
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /** 
     * Set the 'TotalAmount' element value. ����� ����� �� ���������� ���������
     * 
     * @param totalAmount
     */
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /** 
     * Get the 'WrittenoffAmount' element value. ����������� ����� �� ���������� ���������
     * 
     * @return value
     */
    public String getWrittenoffAmount() {
        return writtenoffAmount;
    }

    /** 
     * Set the 'WrittenoffAmount' element value. ����������� ����� �� ���������� ���������
     * 
     * @param writtenoffAmount
     */
    public void setWrittenoffAmount(String writtenoffAmount) {
        this.writtenoffAmount = writtenoffAmount;
    }

    /** 
     * Get the 'PaymentCurrencyCode' element value. �������� ��� ������ ����� ������� / �����������
     * 
     * @return value
     */
    public String getPaymentCurrencyCode() {
        return paymentCurrencyCode;
    }

    /** 
     * Set the 'PaymentCurrencyCode' element value. �������� ��� ������ ����� ������� / �����������
     * 
     * @param paymentCurrencyCode
     */
    public void setPaymentCurrencyCode(String paymentCurrencyCode) {
        this.paymentCurrencyCode = paymentCurrencyCode;
    }

    /** 
     * Get the 'WrittenoffAmountCurrencyCode' element value. ��� ������ ����������� ����� �� ���������� ���������
     * 
     * @return value
     */
    public String getWrittenoffAmountCurrencyCode() {
        return writtenoffAmountCurrencyCode;
    }

    /** 
     * Set the 'WrittenoffAmountCurrencyCode' element value. ��� ������ ����������� ����� �� ���������� ���������
     * 
     * @param writtenoffAmountCurrencyCode
     */
    public void setWrittenoffAmountCurrencyCode(
            String writtenoffAmountCurrencyCode) {
        this.writtenoffAmountCurrencyCode = writtenoffAmountCurrencyCode;
    }

    /** 
     * Get the 'ReturnSign' element value. ������� �������� �������� �������
     * 
     * @return value
     */
    public String getReturnSign() {
        return returnSign;
    }

    /** 
     * Set the 'ReturnSign' element value. ������� �������� �������� �������
     * 
     * @param returnSign
     */
    public void setReturnSign(String returnSign) {
        this.returnSign = returnSign;
    }

    /** 
     * Get the 'INNID' element value. �������������� ����� ����������������� �����������
     * 
     * @return value
     */
    public String getINNID() {
        return INNID;
    }

    /** 
     * Set the 'INNID' element value. �������������� ����� ����������������� �����������
     * 
     * @param INNID
     */
    public void setINNID(String INNID) {
        this.INNID = INNID;
    }

    /** 
     * Get the 'KPPCode' element value. ��� ������� ���������� �� ��������� ���� �����������
     * 
     * @return value
     */
    public String getKPPCode() {
        return KPPCode;
    }

    /** 
     * Set the 'KPPCode' element value. ��� ������� ���������� �� ��������� ���� �����������
     * 
     * @param KPPCode
     */
    public void setKPPCode(String KPPCode) {
        this.KPPCode = KPPCode;
    }
}

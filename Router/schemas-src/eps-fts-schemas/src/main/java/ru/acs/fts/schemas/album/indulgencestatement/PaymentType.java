
package ru.acs.fts.schemas.album.indulgencestatement;

import org.joda.time.LocalDate;

/** 
 * �������� � ��������
 */
public class PaymentType
{
    private String customsPaymentModeCode;
    private LocalDate dateInf;
    private String amount;
    private String currencyCode;
    private String securityText;

    /** 
     * Get the 'CustomsPaymentModeCode' element value. ��� �������
     * 
     * @return value
     */
    public String getCustomsPaymentModeCode() {
        return customsPaymentModeCode;
    }

    /** 
     * Set the 'CustomsPaymentModeCode' element value. ��� �������
     * 
     * @param customsPaymentModeCode
     */
    public void setCustomsPaymentModeCode(String customsPaymentModeCode) {
        this.customsPaymentModeCode = customsPaymentModeCode;
    }

    /** 
     * Get the 'DateInf' element value. ����, �� ������� ������������� ��������
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. ����, �� ������� ������������� ��������
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }

    /** 
     * Get the 'Amount' element value. �����, �� ������� ������������� �������� (� ������ ���� �� ���������)
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. �����, �� ������� ������������� �������� (� ������ ���� �� ���������)
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������ �������
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������ �������
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'SecurityText' element value. ����� ����������� ������ ���������� �������� �� ��������������� ���������
     * 
     * @return value
     */
    public String getSecurityText() {
        return securityText;
    }

    /** 
     * Set the 'SecurityText' element value. ����� ����������� ������ ���������� �������� �� ��������������� ���������
     * 
     * @param securityText
     */
    public void setSecurityText(String securityText) {
        this.securityText = securityText;
    }
}

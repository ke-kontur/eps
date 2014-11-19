
package ru.acs.fts.schemas.album.paymentdocument;

import org.joda.time.LocalDate;

/** 
 * �� - ����� � ������/������������� �����
 */
public class PayableAmountType
{
    private String BCC;
    private LocalDate dateAccrual;
    private String paymentModeCode;
    private String amount;
    private String kindAccrual;
    private String serialNumber;
    private String currencyCode;
    private String currencyRate;

    /** 
     * Get the 'BCC' element value. ��� ��������� ������������� (���) �������� ��������������  ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������.
     * 
     * @return value
     */
    public String getBCC() {
        return BCC;
    }

    /** 
     * Set the 'BCC' element value. ��� ��������� ������������� (���) �������� ��������������  ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������.
     * 
     * @param BCC
     */
    public void setBCC(String BCC) {
        this.BCC = BCC;
    }

    /** 
     * Get the 'DateAccrual' element value. ���� ����������, ������������ ��� ������������ ��������� ���������� ��������
     * 
     * @return value
     */
    public LocalDate getDateAccrual() {
        return dateAccrual;
    }

    /** 
     * Set the 'DateAccrual' element value. ���� ����������, ������������ ��� ������������ ��������� ���������� ��������
     * 
     * @param dateAccrual
     */
    public void setDateAccrual(LocalDate dateAccrual) {
        this.dateAccrual = dateAccrual;
    }

    /** 
     * Get the 'PaymentModeCode' element value. ��� ���� ������� � ������������ � ���������������  ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. ��� ���� ������� � ������������ � ���������������  ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'Amount' element value. ��/��, ��/���: - ����� �������, ����������� (�������������) � ������; ��/��: - ������������� �����
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. ��/��, ��/���: - ����� �������, ����������� (�������������) � ������; ��/��: - ������������� �����
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'KindAccrual' element value. ��/��: - ��� ���������� - ��� ���������, ������� �������� ���������� ��� ���������� � ������ ��������: "1" - "��"; "2" - "���"; "3" - "���".
     * 
     * @return value
     */
    public String getKindAccrual() {
        return kindAccrual;
    }

    /** 
     * Set the 'KindAccrual' element value. ��/��: - ��� ���������� - ��� ���������, ������� �������� ���������� ��� ���������� � ������ ��������: "1" - "��"; "2" - "���"; "3" - "���".
     * 
     * @param kindAccrual
     */
    public void setKindAccrual(String kindAccrual) {
        this.kindAccrual = kindAccrual;
    }

    /** 
     * Get the 'SerialNumber' element value. ��/��: - ���������� ����� ��� (���), �� ������� ����������� ������������ �������� 
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. ��/��: - ���������� ����� ��� (���), �� ������� ����������� ������������ �������� 
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /** 
     * Get the 'CurrencyCode' element value. �������� ��� ������ ������� / ������������� �����
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. �������� ��� ������ ������� / ������������� �����
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'CurrencyRate' element value. ���� ������ ������� / ������������� �����
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. ���� ������ ������� / ������������� �����
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }
}

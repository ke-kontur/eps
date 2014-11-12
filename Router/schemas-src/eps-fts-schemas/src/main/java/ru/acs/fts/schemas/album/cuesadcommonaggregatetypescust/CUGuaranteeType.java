
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * ��������
 */
public class CUGuaranteeType
{
    private String paymentWayCode;
    private String amount;
    private String documentNumber;
    private LocalDate documentDate;
    private String UNP;
    private String BIC;

    /** 
     * Get the 'PaymentWayCode' element value. ��� �������� ����������� ������ � ������������ � ��������������� �������� ����������� ������ ���������� ������, �������
     * 
     * @return value
     */
    public String getPaymentWayCode() {
        return paymentWayCode;
    }

    /** 
     * Set the 'PaymentWayCode' element value. ��� �������� ����������� ������ � ������������ � ��������������� �������� ����������� ������ ���������� ������, �������
     * 
     * @param paymentWayCode
     */
    public void setPaymentWayCode(String paymentWayCode) {
        this.paymentWayCode = paymentWayCode;
    }

    /** 
     * Get the 'Amount' element value. �����
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. �����
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'DocumentNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. ����� ���������
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'DocumentDate' element value. ���� ���������
     * 
     * @return value
     */
    public LocalDate getDocumentDate() {
        return documentDate;
    }

    /** 
     * Set the 'DocumentDate' element value. ���� ���������
     * 
     * @param documentDate
     */
    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    /** 
     * Get the 'UNP' element value. ������� ����� ����������� (���)
     * 
     * @return value
     */
    public String getUNP() {
        return UNP;
    }

    /** 
     * Set the 'UNP' element value. ������� ����� ����������� (���)
     * 
     * @param UNP
     */
    public void setUNP(String UNP) {
        this.UNP = UNP;
    }

    /** 
     * Get the 'BIC' element value. ���������� ����������������� ��� ��� ������������ ����������������� ��� ��������-���������� �����������
     * 
     * @return value
     */
    public String getBIC() {
        return BIC;
    }

    /** 
     * Set the 'BIC' element value. ���������� ����������������� ��� ��� ������������ ����������������� ��� ��������-���������� �����������
     * 
     * @param BIC
     */
    public void setBIC(String BIC) {
        this.BIC = BIC;
    }
}

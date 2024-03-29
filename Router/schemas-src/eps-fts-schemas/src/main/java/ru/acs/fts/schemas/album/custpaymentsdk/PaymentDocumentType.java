
package ru.acs.fts.schemas.album.custpaymentsdk;

import org.joda.time.LocalDate;

/** 
 * ��������� ���������
 */
public class PaymentDocumentType
        extends
            ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.PaymentDocumentType
{
    private String OKPOID;
    private LocalDate receiptDate;
    private String BIC;
    private String paymentWayCode;
    private String incomeCode;
    private String PRIZ;
    private String WHO;
    private String CRYPT;

    /** 
     * Get the 'OKPOID' element value. ���� �����������.
     * 
     * @return value
     */
    public String getOKPOID() {
        return OKPOID;
    }

    /** 
     * Set the 'OKPOID' element value. ���� �����������.
     * 
     * @param OKPOID
     */
    public void setOKPOID(String OKPOID) {
        this.OKPOID = OKPOID;
    }

    /** 
     * Get the 'ReceiptDate' element value. ���� ����������� ����� �� ����.
     * 
     * @return value
     */
    public LocalDate getReceiptDate() {
        return receiptDate;
    }

    /** 
     * Set the 'ReceiptDate' element value. ���� ����������� ����� �� ����.
     * 
     * @param receiptDate
     */
    public void setReceiptDate(LocalDate receiptDate) {
        this.receiptDate = receiptDate;
    }

    /** 
     * Get the 'BIC' element value. ���
     * 
     * @return value
     */
    public String getBIC() {
        return BIC;
    }

    /** 
     * Set the 'BIC' element value. ���
     * 
     * @param BIC
     */
    public void setBIC(String BIC) {
        this.BIC = BIC;
    }

    /** 
     * Get the 'PaymentWayCode' element value. ������ �������
     * 
     * @return value
     */
    public String getPaymentWayCode() {
        return paymentWayCode;
    }

    /** 
     * Set the 'PaymentWayCode' element value. ������ �������
     * 
     * @param paymentWayCode
     */
    public void setPaymentWayCode(String paymentWayCode) {
        this.paymentWayCode = paymentWayCode;
    }

    /** 
     * Get the 'IncomeCode' element value. ��� ������ �� ��������� �������������
     * 
     * @return value
     */
    public String getIncomeCode() {
        return incomeCode;
    }

    /** 
     * Set the 'IncomeCode' element value. ��� ������ �� ��������� �������������
     * 
     * @param incomeCode
     */
    public void setIncomeCode(String incomeCode) {
        this.incomeCode = incomeCode;
    }

    /** 
     * Get the 'PRIZ' element value. ���������
     * 
     * @return value
     */
    public String getPRIZ() {
        return PRIZ;
    }

    /** 
     * Set the 'PRIZ' element value. ���������
     * 
     * @param PRIZ
     */
    public void setPRIZ(String PRIZ) {
        this.PRIZ = PRIZ;
    }

    /** 
     * Get the 'WHO' element value. ���������
     * 
     * @return value
     */
    public String getWHO() {
        return WHO;
    }

    /** 
     * Set the 'WHO' element value. ���������
     * 
     * @param WHO
     */
    public void setWHO(String WHO) {
        this.WHO = WHO;
    }

    /** 
     * Get the 'CRYPT' element value. ����������� ����� ������
     * 
     * @return value
     */
    public String getCRYPT() {
        return CRYPT;
    }

    /** 
     * Set the 'CRYPT' element value. ����������� ����� ������
     * 
     * @param CRYPT
     */
    public void setCRYPT(String CRYPT) {
        this.CRYPT = CRYPT;
    }
}

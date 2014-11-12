
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * �������� �������� ��.48
 */
public class CUDelayPaymentsType
{
    private String paymentModeCode;
    private String delayDocumentNumber;
    private LocalDate delayDocumentDate;
    private LocalDate delayDate;

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
     * Get the 'DelayDocumentNumber' element value. ����� ���������, �� ��������� �������� ������������� �������� 
     * 
     * @return value
     */
    public String getDelayDocumentNumber() {
        return delayDocumentNumber;
    }

    /** 
     * Set the 'DelayDocumentNumber' element value. ����� ���������, �� ��������� �������� ������������� �������� 
     * 
     * @param delayDocumentNumber
     */
    public void setDelayDocumentNumber(String delayDocumentNumber) {
        this.delayDocumentNumber = delayDocumentNumber;
    }

    /** 
     * Get the 'DelayDocumentDate' element value. ���� ���������, �� ��������� �������� ������������� �������� 
     * 
     * @return value
     */
    public LocalDate getDelayDocumentDate() {
        return delayDocumentDate;
    }

    /** 
     * Set the 'DelayDocumentDate' element value. ���� ���������, �� ��������� �������� ������������� �������� 
     * 
     * @param delayDocumentDate
     */
    public void setDelayDocumentDate(LocalDate delayDocumentDate) {
        this.delayDocumentDate = delayDocumentDate;
    }

    /** 
     * Get the 'DelayDate' element value. ���� ������
     * 
     * @return value
     */
    public LocalDate getDelayDate() {
        return delayDate;
    }

    /** 
     * Set the 'DelayDate' element value. ���� ������
     * 
     * @param delayDate
     */
    public void setDelayDate(LocalDate delayDate) {
        this.delayDate = delayDate;
    }
}

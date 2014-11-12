
package ru.acs.fts.schemas.album.tpo;

/** 
 * ����������� ������
 */
public class PaymentDetailsType
{
    private String factPaidAmount;
    private String paymentMethodCode;
    private PresentedDocumentType paymentDocument;

    /** 
     * Get the 'FactPaidAmount' element value. �������� � ���������� ���������� �����
     * 
     * @return value
     */
    public String getFactPaidAmount() {
        return factPaidAmount;
    }

    /** 
     * Set the 'FactPaidAmount' element value. �������� � ���������� ���������� �����
     * 
     * @param factPaidAmount
     */
    public void setFactPaidAmount(String factPaidAmount) {
        this.factPaidAmount = factPaidAmount;
    }

    /** 
     * Get the 'PaymentMethodCode' element value. ������ ������� � ������������ � ��������������� �������� � ������������ ������ ���������� � ���� ��������
     * 
     * @return value
     */
    public String getPaymentMethodCode() {
        return paymentMethodCode;
    }

    /** 
     * Set the 'PaymentMethodCode' element value. ������ ������� � ������������ � ��������������� �������� � ������������ ������ ���������� � ���� ��������
     * 
     * @param paymentMethodCode
     */
    public void setPaymentMethodCode(String paymentMethodCode) {
        this.paymentMethodCode = paymentMethodCode;
    }

    /** 
     * Get the 'PaymentDocument' element value. ��������, �� �������� ����������� ������
     * 
     * @return value
     */
    public PresentedDocumentType getPaymentDocument() {
        return paymentDocument;
    }

    /** 
     * Set the 'PaymentDocument' element value. ��������, �� �������� ����������� ������
     * 
     * @param paymentDocument
     */
    public void setPaymentDocument(PresentedDocumentType paymentDocument) {
        this.paymentDocument = paymentDocument;
    }
}

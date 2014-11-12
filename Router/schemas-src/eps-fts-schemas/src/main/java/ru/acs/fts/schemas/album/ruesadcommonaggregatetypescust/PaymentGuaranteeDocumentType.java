
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * ��������� �� ������� ������� ����������� ������ ���������� ��������. ��. 44. �.7.2
 */
public class PaymentGuaranteeDocumentType extends PresentedDocumentType
{
    private String presentedDocumentModeCode;
    private String customsPaymentModeCodeType;

    /** 
     * Get the 'PresentedDocumentModeCode' element value. ��� ���� ��������������� ���������. ����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44.
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value. ��� ���� ��������������� ���������. ����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44.
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }

    /** 
     * Get the 'CustomsPaymentModeCodeType' element value. ��� ���� ����������� ������� �� �������������� ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������.
     * 
     * @return value
     */
    public String getCustomsPaymentModeCodeType() {
        return customsPaymentModeCodeType;
    }

    /** 
     * Set the 'CustomsPaymentModeCodeType' element value. ��� ���� ����������� ������� �� �������������� ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������.
     * 
     * @param customsPaymentModeCodeType
     */
    public void setCustomsPaymentModeCodeType(String customsPaymentModeCodeType) {
        this.customsPaymentModeCodeType = customsPaymentModeCodeType;
    }
}


package ru.acs.fts.schemas.album.gtdobligationin;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������������� ���������
 */
public class PresentedDocumentsType extends DocumentBaseType
{
    private String docSign;
    private String modeCode;
    private LocalDate expirationDate;
    private String amountCustomaPay;
    private String addPaymentCode;

    /** 
     * Get the 'DocSign' element value. �������: 1 - ���������, ����������� ���������������� ������; 2 - ���������, �������������� ���������� �����������, ������������� ����������������� �� � ������������� �������������� ������������; 3 - ���������, ����������������� �� ������/����������� ������ ���������� ��������
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. �������: 1 - ���������, ����������� ���������������� ������; 2 - ���������, �������������� ���������� �����������, ������������� ����������������� �� � ������������� �������������� ������������; 3 - ���������, ����������������� �� ������/����������� ������ ���������� ��������
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'ModeCode' element value. ��� ���� ��������� (����������� � ������������ � ��������������� ����� ����������, ������������ ��� ���������� ��������������)
     * 
     * @return value
     */
    public String getModeCode() {
        return modeCode;
    }

    /** 
     * Set the 'ModeCode' element value. ��� ���� ��������� (����������� � ������������ � ��������������� ����� ����������, ������������ ��� ���������� ��������������)
     * 
     * @param modeCode
     */
    public void setModeCode(String modeCode) {
        this.modeCode = modeCode;
    }

    /** 
     * Get the 'ExpirationDate' element value. ���� ��������� �������� ���������
     * 
     * @return value
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /** 
     * Set the 'ExpirationDate' element value. ���� ��������� �������� ���������
     * 
     * @param expirationDate
     */
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    /** 
     * Get the 'AmountCustomaPay' element value. ����� ������/����������� ������ ���������� �������� �� ���������
     * 
     * @return value
     */
    public String getAmountCustomaPay() {
        return amountCustomaPay;
    }

    /** 
     * Set the 'AmountCustomaPay' element value. ����� ������/����������� ������ ���������� �������� �� ���������
     * 
     * @param amountCustomaPay
     */
    public void setAmountCustomaPay(String amountCustomaPay) {
        this.amountCustomaPay = amountCustomaPay;
    }

    /** 
     * Get the 'AddPaymentCode' element value. ��� ������� ����������� ������ ���������� ������, �������
     * 
     * @return value
     */
    public String getAddPaymentCode() {
        return addPaymentCode;
    }

    /** 
     * Set the 'AddPaymentCode' element value. ��� ������� ����������� ������ ���������� ������, �������
     * 
     * @param addPaymentCode
     */
    public void setAddPaymentCode(String addPaymentCode) {
        this.addPaymentCode = addPaymentCode;
    }
}

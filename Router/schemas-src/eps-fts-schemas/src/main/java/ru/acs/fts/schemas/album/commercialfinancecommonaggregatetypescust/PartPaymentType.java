
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������� � ��������� �������
 */
public class PartPaymentType
{
    private String partPaymentNum;
    private String partPaymentPP;
    private LocalDate partPaymentPPDate;
    private String partPaymentSumm;
    private String remainder;
    private PersonBaseType partPaymentSign;

    /** 
     * Get the 'PartPaymentNum' element value. ����� ���������� �������
     * 
     * @return value
     */
    public String getPartPaymentNum() {
        return partPaymentNum;
    }

    /** 
     * Set the 'PartPaymentNum' element value. ����� ���������� �������
     * 
     * @param partPaymentNum
     */
    public void setPartPaymentNum(String partPaymentNum) {
        this.partPaymentNum = partPaymentNum;
    }

    /** 
     * Get the 'PartPaymentPP' element value. ����� ���������� ������
     * 
     * @return value
     */
    public String getPartPaymentPP() {
        return partPaymentPP;
    }

    /** 
     * Set the 'PartPaymentPP' element value. ����� ���������� ������
     * 
     * @param partPaymentPP
     */
    public void setPartPaymentPP(String partPaymentPP) {
        this.partPaymentPP = partPaymentPP;
    }

    /** 
     * Get the 'PartPaymentPPDate' element value. ���� ���������� ������
     * 
     * @return value
     */
    public LocalDate getPartPaymentPPDate() {
        return partPaymentPPDate;
    }

    /** 
     * Set the 'PartPaymentPPDate' element value. ���� ���������� ������
     * 
     * @param partPaymentPPDate
     */
    public void setPartPaymentPPDate(LocalDate partPaymentPPDate) {
        this.partPaymentPPDate = partPaymentPPDate;
    }

    /** 
     * Get the 'PartPaymentSumm' element value. ����� ���������� �������
     * 
     * @return value
     */
    public String getPartPaymentSumm() {
        return partPaymentSumm;
    }

    /** 
     * Set the 'PartPaymentSumm' element value. ����� ���������� �������
     * 
     * @param partPaymentSumm
     */
    public void setPartPaymentSumm(String partPaymentSumm) {
        this.partPaymentSumm = partPaymentSumm;
    }

    /** 
     * Get the 'Remainder' element value. ����� ������� �������
     * 
     * @return value
     */
    public String getRemainder() {
        return remainder;
    }

    /** 
     * Set the 'Remainder' element value. ����� ������� �������
     * 
     * @param remainder
     */
    public void setRemainder(String remainder) {
        this.remainder = remainder;
    }

    /** 
     * Get the 'PartPaymentSign' element value. ������� ������������ ����, ������������ ������ � ��������� �������
     * 
     * @return value
     */
    public PersonBaseType getPartPaymentSign() {
        return partPaymentSign;
    }

    /** 
     * Set the 'PartPaymentSign' element value. ������� ������������ ����, ������������ ������ � ��������� �������
     * 
     * @param partPaymentSign
     */
    public void setPartPaymentSign(PersonBaseType partPaymentSign) {
        this.partPaymentSign = partPaymentSign;
    }
}

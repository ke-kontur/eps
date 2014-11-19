
package ru.acs.fts.schemas.album.contractdealpassport;

import org.joda.time.LocalDate;

/** 
 * �������� �� ����������, � �������� � �������� ��
 */
public class AdditionalInfoType
{
    private String bankRegistrationNumber;
    private String affilianceRegistrationNumber;
    private LocalDate transferDate;
    private LocalDate closingDate;
    private String closingReasons;
    private String notaryAttorneyRegNumber;

    /** 
     * Get the 'BankRegistrationNumber' element value. ��������������� ����� ��������������� �����, ���������������� ���������� ����� ������, ����������� �� (���������� �� ������������ ����������� ����� � ������ �������������� ����� ��)
     * 
     * @return value
     */
    public String getBankRegistrationNumber() {
        return bankRegistrationNumber;
    }

    /** 
     * Set the 'BankRegistrationNumber' element value. ��������������� ����� ��������������� �����, ���������������� ���������� ����� ������, ����������� �� (���������� �� ������������ ����������� ����� � ������ �������������� ����� ��)
     * 
     * @param bankRegistrationNumber
     */
    public void setBankRegistrationNumber(String bankRegistrationNumber) {
        this.bankRegistrationNumber = bankRegistrationNumber;
    }

    /** 
     * Get the 'AffilianceRegistrationNumber' element value. ��������������� ����� ������� �����, ����������� �� (���������� �� ������������ ����������� ����� � ������ �������������� ����� ��)
     * 
     * @return value
     */
    public String getAffilianceRegistrationNumber() {
        return affilianceRegistrationNumber;
    }

    /** 
     * Set the 'AffilianceRegistrationNumber' element value. ��������������� ����� ������� �����, ����������� �� (���������� �� ������������ ����������� ����� � ������ �������������� ����� ��)
     * 
     * @param affilianceRegistrationNumber
     */
    public void setAffilianceRegistrationNumber(
            String affilianceRegistrationNumber) {
        this.affilianceRegistrationNumber = affilianceRegistrationNumber;
    }

    /** 
     * Get the 'TransferDate' element value. ���� �������� �� ��� �������� �� ������������ ������ �������������� ������.
     * 
     * @return value
     */
    public LocalDate getTransferDate() {
        return transferDate;
    }

    /** 
     * Set the 'TransferDate' element value. ���� �������� �� ��� �������� �� ������������ ������ �������������� ������.
     * 
     * @param transferDate
     */
    public void setTransferDate(LocalDate transferDate) {
        this.transferDate = transferDate;
    }

    /** 
     * Get the 'ClosingDate' element value. ���� �������� ��
     * 
     * @return value
     */
    public LocalDate getClosingDate() {
        return closingDate;
    }

    /** 
     * Set the 'ClosingDate' element value. ���� �������� ��
     * 
     * @param closingDate
     */
    public void setClosingDate(LocalDate closingDate) {
        this.closingDate = closingDate;
    }

    /** 
     * Get the 'ClosingReasons' element value. ��������� �������� ��
     * 
     * @return value
     */
    public String getClosingReasons() {
        return closingReasons;
    }

    /** 
     * Set the 'ClosingReasons' element value. ��������� �������� ��
     * 
     * @param closingReasons
     */
    public void setClosingReasons(String closingReasons) {
        this.closingReasons = closingReasons;
    }

    /** 
     * Get the 'NotaryAttorneyRegNumber' element value. ��������������� ����� ���������/��������
     * 
     * @return value
     */
    public String getNotaryAttorneyRegNumber() {
        return notaryAttorneyRegNumber;
    }

    /** 
     * Set the 'NotaryAttorneyRegNumber' element value. ��������������� ����� ���������/��������
     * 
     * @param notaryAttorneyRegNumber
     */
    public void setNotaryAttorneyRegNumber(String notaryAttorneyRegNumber) {
        this.notaryAttorneyRegNumber = notaryAttorneyRegNumber;
    }
}

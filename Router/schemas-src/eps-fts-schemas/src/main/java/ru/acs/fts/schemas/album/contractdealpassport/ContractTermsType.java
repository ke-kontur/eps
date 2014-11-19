
package ru.acs.fts.schemas.album.contractdealpassport;

import org.joda.time.LocalDate;

/** 
 * ����� �������� � ���������
 */
public class ContractTermsType
{
    private String number;
    private LocalDate mostLaterDate;
    private String currencyName;
    private String currencyCode;
    private String contractSum;
    private String nonContractSum;
    private LocalDate completionDate;

    /** 
     * Get the 'Number' element value. ����� ��������� / "��"
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. ����� ��������� / "��"
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'MostLaterDate' element value. �������� ������� �� ����� ���� (���� ���������� ���������, ���� ���������� ��� � ����, ���� �����������)
     * 
     * @return value
     */
    public LocalDate getMostLaterDate() {
        return mostLaterDate;
    }

    /** 
     * Set the 'MostLaterDate' element value. �������� ������� �� ����� ���� (���� ���������� ���������, ���� ���������� ��� � ����, ���� �����������)
     * 
     * @param mostLaterDate
     */
    public void setMostLaterDate(LocalDate mostLaterDate) {
        this.mostLaterDate = mostLaterDate;
    }

    /** 
     * Get the 'CurrencyName' element value. ������������ ������ ���������
     * 
     * @return value
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /** 
     * Set the 'CurrencyName' element value. ������������ ������ ���������
     * 
     * @param currencyName
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    /** 
     * Get the 'CurrencyCode' element value. �������� ��� ������ ���������
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. �������� ��� ������ ���������
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'ContractSum' element value. ����� ����� �������������, ��������������� ����������
     * 
     * @return value
     */
    public String getContractSum() {
        return contractSum;
    }

    /** 
     * Set the 'ContractSum' element value. ����� ����� �������������, ��������������� ����������
     * 
     * @param contractSum
     */
    public void setContractSum(String contractSum) {
        this.contractSum = contractSum;
    }

    /** 
     * Get the 'NonContractSum' element value. C����� "��" (����������� � ������ ���������� ���������� ��� ���������� ����� ����� �����)
     * 
     * @return value
     */
    public String getNonContractSum() {
        return nonContractSum;
    }

    /** 
     * Set the 'NonContractSum' element value. C����� "��" (����������� � ������ ���������� ���������� ��� ���������� ����� ����� �����)
     * 
     * @param nonContractSum
     */
    public void setNonContractSum(String nonContractSum) {
        this.nonContractSum = nonContractSum;
    }

    /** 
     * Get the 'CompletionDate' element value. ���� ���������� ���������� ���� ������������ �� ���������
     * 
     * @return value
     */
    public LocalDate getCompletionDate() {
        return completionDate;
    }

    /** 
     * Set the 'CompletionDate' element value. ���� ���������� ���������� ���� ������������ �� ���������
     * 
     * @param completionDate
     */
    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }
}

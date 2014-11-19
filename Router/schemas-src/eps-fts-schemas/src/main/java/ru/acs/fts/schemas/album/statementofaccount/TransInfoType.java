
package ru.acs.fts.schemas.album.statementofaccount;

import org.joda.time.LocalDate;

/** 
 * ���������� �� ����� �������� �� �������� ����� � �������. �� ����������� ��� ��������� ������� � �������, ���������� ������� ������� �� �����
 */
public class TransInfoType
{
    private String accDocNo;
    private String transKind;
    private String BICCorr;
    private String corrAccBrf;
    private String payerPersonalAccount;
    private String payeePersonalAccount;
    private String turnoverKind;
    private String DC;
    private String amount;
    private LocalDate transDate;

    /** 
     * Get the 'AccDocNo' element value. ����� ���������� ���������
     * 
     * @return value
     */
    public String getAccDocNo() {
        return accDocNo;
    }

    /** 
     * Set the 'AccDocNo' element value. ����� ���������� ���������
     * 
     * @param accDocNo
     */
    public void setAccDocNo(String accDocNo) {
        this.accDocNo = accDocNo;
    }

    /** 
     * Get the 'TransKind' element value. ��� ��������. ����������� � ������������ �� ������������ ����� ��������
     * 
     * @return value
     */
    public String getTransKind() {
        return transKind;
    }

    /** 
     * Set the 'TransKind' element value. ��� ��������. ����������� � ������������ �� ������������ ����� ��������
     * 
     * @param transKind
     */
    public void setTransKind(String transKind) {
        this.transKind = transKind;
    }

    /** 
     * Get the 'BICCorr' element value. ��� ����� ��������������. ��� ��� ���������� (�����������) �������, ���� ����������� (������������) ������� �������� ������ ���, ���� ��� ��������� �����������, ���� ����������� (������������) �������� �� ������
     * 
     * @return value
     */
    public String getBICCorr() {
        return BICCorr;
    }

    /** 
     * Set the 'BICCorr' element value. ��� ����� ��������������. ��� ��� ���������� (�����������) �������, ���� ����������� (������������) ������� �������� ������ ���, ���� ��� ��������� �����������, ���� ����������� (������������) �������� �� ������
     * 
     * @param BICCorr
     */
    public void setBICCorr(String BICCorr) {
        this.BICCorr = BICCorr;
    }

    /** 
     * Get the 'CorrAccBrf' element value. ����������������� ����. ����� ����������� ����� ������� �������, ����� ������� �������������� �������� �� ���������� (��������) ������� �� ����������������� ��� ������� ���� ������� ��� � ����������� �� ������� �������� ����� ���
     * 
     * @return value
     */
    public String getCorrAccBrf() {
        return corrAccBrf;
    }

    /** 
     * Set the 'CorrAccBrf' element value. ����������������� ����. ����� ����������� ����� ������� �������, ����� ������� �������������� �������� �� ���������� (��������) ������� �� ����������������� ��� ������� ���� ������� ��� � ����������� �� ������� �������� ����� ���
     * 
     * @param corrAccBrf
     */
    public void setCorrAccBrf(String corrAccBrf) {
        this.corrAccBrf = corrAccBrf;
    }

    /** 
     * Get the 'PayerPersonalAccount' element value. ���� �����������/ �����������
     * 
     * @return value
     */
    public String getPayerPersonalAccount() {
        return payerPersonalAccount;
    }

    /** 
     * Set the 'PayerPersonalAccount' element value. ���� �����������/ �����������
     * 
     * @param payerPersonalAccount
     */
    public void setPayerPersonalAccount(String payerPersonalAccount) {
        this.payerPersonalAccount = payerPersonalAccount;
    }

    /** 
     * Get the 'PayeePersonalAccount' element value. ���� ����������
     * 
     * @return value
     */
    public String getPayeePersonalAccount() {
        return payeePersonalAccount;
    }

    /** 
     * Set the 'PayeePersonalAccount' element value. ���� ����������
     * 
     * @param payeePersonalAccount
     */
    public void setPayeePersonalAccount(String payeePersonalAccount) {
        this.payeePersonalAccount = payeePersonalAccount;
    }

    /** 
     * Get the 'TurnoverKind' element value. ��� �������� (1 - ��������, 2 - ��������������, 3 - ����������� ��������������)
     * 
     * @return value
     */
    public String getTurnoverKind() {
        return turnoverKind;
    }

    /** 
     * Set the 'TurnoverKind' element value. ��� �������� (1 - ��������, 2 - ��������������, 3 - ����������� ��������������)
     * 
     * @param turnoverKind
     */
    public void setTurnoverKind(String turnoverKind) {
        this.turnoverKind = turnoverKind;
    }

    /** 
     * Get the 'DC' element value. ������� ������/������� ����� ������� (1 - �����, 2 - ������)
     * 
     * @return value
     */
    public String getDC() {
        return DC;
    }

    /** 
     * Set the 'DC' element value. ������� ������/������� ����� ������� (1 - �����, 2 - ������)
     * 
     * @param DC
     */
    public void setDC(String DC) {
        this.DC = DC;
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
     * Get the 'TransDate' element value. ���� ���������� �������� �� �����
     * 
     * @return value
     */
    public LocalDate getTransDate() {
        return transDate;
    }

    /** 
     * Set the 'TransDate' element value. ���� ���������� �������� �� �����
     * 
     * @param transDate
     */
    public void setTransDate(LocalDate transDate) {
        this.transDate = transDate;
    }
}

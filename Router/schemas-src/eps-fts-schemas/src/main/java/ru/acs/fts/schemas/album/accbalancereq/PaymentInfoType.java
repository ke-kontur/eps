
package ru.acs.fts.schemas.album.accbalancereq;

import org.joda.time.LocalDate;

/** 
 * �������� � ��������� ��������� (���� ������������� ������� �� ���������� ��)
 */
public class PaymentInfoType
{
    private String ID;
    private LocalDate issueDate;
    private String amount;

    /** 
     * Get the 'ID' element value. ����� ���������� ���������
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' element value. ����� ���������� ���������
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /** 
     * Get the 'IssueDate' element value. ���� ���������� ���������
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ���������� ���������
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'Amount' element value. ����� ����� ���������� ���������.
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. ����� ����� ���������� ���������.
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
}

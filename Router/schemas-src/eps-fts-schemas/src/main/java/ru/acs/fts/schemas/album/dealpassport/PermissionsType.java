
package ru.acs.fts.schemas.album.dealpassport;

import org.joda.time.LocalDate;

/** 
 * ���������� � �����������
 */
public class PermissionsType
{
    private String documentNumber;
    private LocalDate issueDate;
    private String summa;
    private LocalDate permitEndDate;

    /** 
     * Get the 'DocumentNumber' element value. ����� ����������. � ������ ���������� ������ ��������� "�/�"
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. ����� ����������. � ������ ���������� ������ ��������� "�/�"
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'IssueDate' element value. ���� ����������
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ����������
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'Summa' element value. ����� ����������� �������� � ������ ����
     * 
     * @return value
     */
    public String getSumma() {
        return summa;
    }

    /** 
     * Set the 'Summa' element value. ����� ����������� �������� � ������ ����
     * 
     * @param summa
     */
    public void setSumma(String summa) {
        this.summa = summa;
    }

    /** 
     * Get the 'PermitEndDate' element value. ���� ��������� �������� ����������
     * 
     * @return value
     */
    public LocalDate getPermitEndDate() {
        return permitEndDate;
    }

    /** 
     * Set the 'PermitEndDate' element value. ���� ��������� �������� ����������
     * 
     * @param permitEndDate
     */
    public void setPermitEndDate(LocalDate permitEndDate) {
        this.permitEndDate = permitEndDate;
    }
}

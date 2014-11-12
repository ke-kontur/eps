
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * ��������� ��������
 */
public class GuaranteeDocumentType
{
    private String documentNumber;
    private String GRN;
    private LocalDate issueDate;
    private String notValid4EC;
    private List<LimitationNonECType> limitationNonECList = new ArrayList<LimitationNonECType>();

    /** 
     * Get the 'DocumentNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. ����� ���������
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'GRN' element value. ��������������� ����� �������� (GRN) ����������� � ������ ������������� �������� NCTS.
     * 
     * @return value
     */
    public String getGRN() {
        return GRN;
    }

    /** 
     * Set the 'GRN' element value. ��������������� ����� �������� (GRN) ����������� � ������ ������������� �������� NCTS.
     * 
     * @param GRN
     */
    public void setGRN(String GRN) {
        this.GRN = GRN;
    }

    /** 
     * Get the 'IssueDate' element value. ���� ���������
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ���������
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'NotValid4EC' element value. ������� ������� ����������� ��� ����� ��, ����������� � ������ ������������� �������� NCTS
     * 
     * @return value
     */
    public String getNotValid4EC() {
        return notValid4EC;
    }

    /** 
     * Set the 'NotValid4EC' element value. ������� ������� ����������� ��� ����� ��, ����������� � ������ ������������� �������� NCTS
     * 
     * @param notValid4EC
     */
    public void setNotValid4EC(String notValid4EC) {
        this.notValid4EC = notValid4EC;
    }

    /** 
     * Get the list of 'LimitationNonEC' element items. ����������� �������� �������� ��� ��
     * 
     * @return list
     */
    public List<LimitationNonECType> getLimitationNonECList() {
        return limitationNonECList;
    }

    /** 
     * Set the list of 'LimitationNonEC' element items. ����������� �������� �������� ��� ��
     * 
     * @param list
     */
    public void setLimitationNonECList(List<LimitationNonECType> list) {
        limitationNonECList = list;
    }
}

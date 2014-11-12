
package ru.acs.fts.schemas.album.dealpassport;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * ����������� �������� � ���������
 */
public class SpecialInformationType
{
    private List<String> contractTermList = new ArrayList<String>();
    private String term;
    private LocalDate list2IssueDate;

    /** 
     * Get the list of 'ContractTerms' element items. ������� � ������ � ������� �������� �� ���������
     * 
     * @return list
     */
    public List<String> getContractTermList() {
        return contractTermList;
    }

    /** 
     * Set the list of 'ContractTerms' element items. ������� � ������ � ������� �������� �� ���������
     * 
     * @param list
     */
    public void setContractTermList(List<String> list) {
        contractTermList = list;
    }

    /** 
     * Get the 'Term' element value. �������� �������/��������������� ������ (0000, ����, ���� ���������� ����)
     * 
     * @return value
     */
    public String getTerm() {
        return term;
    }

    /** 
     * Set the 'Term' element value. �������� �������/��������������� ������ (0000, ����, ���� ���������� ����)
     * 
     * @param term
     */
    public void setTerm(String term) {
        this.term = term;
    }

    /** 
     * Get the 'List2IssueDate' element value. ���� ���������� ����� 2
     * 
     * @return value
     */
    public LocalDate getList2IssueDate() {
        return list2IssueDate;
    }

    /** 
     * Set the 'List2IssueDate' element value. ���� ���������� ����� 2
     * 
     * @param list2IssueDate
     */
    public void setList2IssueDate(LocalDate list2IssueDate) {
        this.list2IssueDate = list2IssueDate;
    }
}

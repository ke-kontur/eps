
package ru.acs.fts.schemas.album.billoflading;

import org.joda.time.LocalDate;

/** 
 * �������.���.�������� ������������ ���� � ��� ����.
 */
public class PersonNamePostTypeType
{
    private String personName;
    private String personPost;
    private LocalDate issueDate;

    /** 
     * Get the 'PersonName' element value. �������. ���. ��������.
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. �������. ���. ��������.
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'PersonPost' element value. ���������.
     * 
     * @return value
     */
    public String getPersonPost() {
        return personPost;
    }

    /** 
     * Set the 'PersonPost' element value. ���������.
     * 
     * @param personPost
     */
    public void setPersonPost(String personPost) {
        this.personPost = personPost;
    }

    /** 
     * Get the 'IssueDate' element value. ���� ����������.
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ����������.
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }
}

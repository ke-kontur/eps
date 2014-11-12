
package ru.acs.fts.schemas.album.recallinotreatment;

import org.joda.time.LocalDate;

/** 
 * ��� ������������� ���������� ���������, �� ��������� �������� ���������� ����������
 */
public class GovermentActType
{
    private String form;
    private String nameInf;
    private LocalDate issueDate;
    private LocalDate beginDate;

    /** 
     * Get the 'Form' element value. ��� ����
     * 
     * @return value
     */
    public String getForm() {
        return form;
    }

    /** 
     * Set the 'Form' element value. ��� ����
     * 
     * @param form
     */
    public void setForm(String form) {
        this.form = form;
    }

    /** 
     * Get the 'NameInf' element value. �������� ����
     * 
     * @return value
     */
    public String getNameInf() {
        return nameInf;
    }

    /** 
     * Set the 'NameInf' element value. �������� ����
     * 
     * @param nameInf
     */
    public void setNameInf(String nameInf) {
        this.nameInf = nameInf;
    }

    /** 
     * Get the 'IssueDate' element value. ���� ������ ����
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ������ ����
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'BeginDate' element value. ���� ���������� � ���� ����
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. ���� ���������� � ���� ����
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }
}

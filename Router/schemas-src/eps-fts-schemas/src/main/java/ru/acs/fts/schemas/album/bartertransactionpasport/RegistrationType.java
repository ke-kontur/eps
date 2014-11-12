
package ru.acs.fts.schemas.album.bartertransactionpasport;

import org.joda.time.LocalDate;

/** 
 * ��������������� ������ �������� ��������� ������
 */
public class RegistrationType
{
    private LocalDate issueDate;
    private PasportIDType pasportID;

    /** 
     * Get the 'IssueDate' element value. ���� ����������� �������� � ���� ������    
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ����������� �������� � ���� ������    
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'PasportID' element value. ����� �������� ��������� ������ 
     * 
     * @return value
     */
    public PasportIDType getPasportID() {
        return pasportID;
    }

    /** 
     * Set the 'PasportID' element value. ����� �������� ��������� ������ 
     * 
     * @param pasportID
     */
    public void setPasportID(PasportIDType pasportID) {
        this.pasportID = pasportID;
    }
}

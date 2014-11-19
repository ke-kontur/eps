
package ru.acs.fts.schemas.album.veterinarycertificate;

import org.joda.time.LocalDate;

/** 
 * �������� � �����������
 */
public class RegistrationInfoType
{
    private String registrationNumber;
    private LocalDate issueDate;
    private String territorialAuthority;
    private String competentAuthority;
    private String issueCountry;

    /** 
     * Get the 'RegistrationNumber' element value. ��������������� �����
     * 
     * @return value
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. ��������������� �����
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'IssueDate' element value. ���� ������ �����������
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ������ �����������
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'TerritorialAuthority' element value. ������������ ���������������� ������ ����������������� / ���������� ������ - ����������, �������� ����������
     * 
     * @return value
     */
    public String getTerritorialAuthority() {
        return territorialAuthority;
    }

    /** 
     * Set the 'TerritorialAuthority' element value. ������������ ���������������� ������ ����������������� / ���������� ������ - ����������, �������� ����������
     * 
     * @param territorialAuthority
     */
    public void setTerritorialAuthority(String territorialAuthority) {
        this.territorialAuthority = territorialAuthority;
    }

    /** 
     * Get the 'CompetentAuthority' element value. ������������ ��������� ������ - ����������
     * 
     * @return value
     */
    public String getCompetentAuthority() {
        return competentAuthority;
    }

    /** 
     * Set the 'CompetentAuthority' element value. ������������ ��������� ������ - ����������
     * 
     * @param competentAuthority
     */
    public void setCompetentAuthority(String competentAuthority) {
        this.competentAuthority = competentAuthority;
    }

    /** 
     * Get the 'IssueCountry' element value. ������, �������� ����������
     * 
     * @return value
     */
    public String getIssueCountry() {
        return issueCountry;
    }

    /** 
     * Set the 'IssueCountry' element value. ������, �������� ����������
     * 
     * @param issueCountry
     */
    public void setIssueCountry(String issueCountry) {
        this.issueCountry = issueCountry;
    }
}

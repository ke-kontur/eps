
package ru.acs.fts.schemas.album.residentsezsertificate;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * �������������, �������������� ����������� ���� � �������� ��������� ������ ������������� ���� 
 */
public class ResidentSEZSertificateType extends BaseDocType
{
    private String sertificateNumber;
    private LocalDate issueDate;
    private LocalDate registrationDate;
    private String SEZType;
    private RegistratorAuthorityType registratorAuthority;
    private ResidentOrganisationType residentOrganisation;
    private FormType form;
    private String documentModeID;

    /** 
     * Get the 'SertificateNumber' element value. ��������������� ����� ������������� 
     * 
     * @return value
     */
    public String getSertificateNumber() {
        return sertificateNumber;
    }

    /** 
     * Set the 'SertificateNumber' element value. ��������������� ����� ������������� 
     * 
     * @param sertificateNumber
     */
    public void setSertificateNumber(String sertificateNumber) {
        this.sertificateNumber = sertificateNumber;
    }

    /** 
     * Get the 'IssueDate' element value. ���� ������ ������������� 
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ������ ������������� 
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'RegistrationDate' element value. ���� ����������� 
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. ���� ����������� 
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'SEZType' element value. ��� ���: 1 - �����������-����������������, 0 - �������-������������� 
     * 
     * @return value
     */
    public String getSEZType() {
        return SEZType;
    }

    /** 
     * Set the 'SEZType' element value. ��� ���: 1 - �����������-����������������, 0 - �������-������������� 
     * 
     * @param SEZType
     */
    public void setSEZType(String SEZType) {
        this.SEZType = SEZType;
    }

    /** 
     * Get the 'RegistratorAuthority' element value. �������� �� ������, �������� �������������, � ������� ��������������� ���� ����� ������ 
     * 
     * @return value
     */
    public RegistratorAuthorityType getRegistratorAuthority() {
        return registratorAuthority;
    }

    /** 
     * Set the 'RegistratorAuthority' element value. �������� �� ������, �������� �������������, � ������� ��������������� ���� ����� ������ 
     * 
     * @param registratorAuthority
     */
    public void setRegistratorAuthority(
            RegistratorAuthorityType registratorAuthority) {
        this.registratorAuthority = registratorAuthority;
    }

    /** 
     * Get the 'ResidentOrganisation' element value. �������� � ����������� ���� ��� �� �������������� ��������������� - ��������� ��� 
     * 
     * @return value
     */
    public ResidentOrganisationType getResidentOrganisation() {
        return residentOrganisation;
    }

    /** 
     * Set the 'ResidentOrganisation' element value. �������� � ����������� ���� ��� �� �������������� ��������������� - ��������� ��� 
     * 
     * @param residentOrganisation
     */
    public void setResidentOrganisation(
            ResidentOrganisationType residentOrganisation) {
        this.residentOrganisation = residentOrganisation;
    }

    /** 
     * Get the 'Form' element value. ����� � ����� ������
     * 
     * @return value
     */
    public FormType getForm() {
        return form;
    }

    /** 
     * Set the 'Form' element value. ����� � ����� ������
     * 
     * @param form
     */
    public void setForm(FormType form) {
        this.form = form;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}


package ru.acs.fts.schemas.album.naturalpersonregistrationcertificate;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ������������� � ��������������� ����������� ����������� ���� � �������� ��������������� ��������������� �� ����� �61001
 */
public class NaturalPersonRegistrationCertificateType extends BaseDocType
{
    private LocalDate registrationDate;
    private String businessman;
    private String registrationOrganization;
    private String registrationNumberID;
    private String formName;
    private PersonBaseType documentSignature;
    private FormType form;
    private String documentModeID;

    /** 
     * Get the 'RegistrationDate' element value. ���� ��������������� ����������� ����������� ���� � �������� ��������������� ��������������� � ������ ���������
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. ���� ��������������� ����������� ����������� ���� � �������� ��������������� ��������������� � ������ ���������
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'Businessman' element value. �������, ���, �������� ���������������
     * 
     * @return value
     */
    public String getBusinessman() {
        return businessman;
    }

    /** 
     * Set the 'Businessman' element value. �������, ���, �������� ���������������
     * 
     * @param businessman
     */
    public void setBusinessman(String businessman) {
        this.businessman = businessman;
    }

    /** 
     * Get the 'RegistrationOrganization' element value. ������������ ��������������� ������
     * 
     * @return value
     */
    public String getRegistrationOrganization() {
        return registrationOrganization;
    }

    /** 
     * Set the 'RegistrationOrganization' element value. ������������ ��������������� ������
     * 
     * @param registrationOrganization
     */
    public void setRegistrationOrganization(String registrationOrganization) {
        this.registrationOrganization = registrationOrganization;
    }

    /** 
     * Get the 'RegistrationNumberID' element value. ��������������� ��������������� ����� ������, �������� � ������ ��������������� ������ �������������� ����������������
     * 
     * @return value
     */
    public String getRegistrationNumberID() {
        return registrationNumberID;
    }

    /** 
     * Set the 'RegistrationNumberID' element value. ��������������� ��������������� ����� ������, �������� � ������ ��������������� ������ �������������� ����������������
     * 
     * @param registrationNumberID
     */
    public void setRegistrationNumberID(String registrationNumberID) {
        this.registrationNumberID = registrationNumberID;
    }

    /** 
     * Get the 'FormName' element value. �����
     * 
     * @return value
     */
    public String getFormName() {
        return formName;
    }

    /** 
     * Set the 'FormName' element value. �����
     * 
     * @param formName
     */
    public void setFormName(String formName) {
        this.formName = formName;
    }

    /** 
     * Get the 'DocumentSignature' element value. ������� ��������������� ���� ��������������� ������
     * 
     * @return value
     */
    public PersonBaseType getDocumentSignature() {
        return documentSignature;
    }

    /** 
     * Set the 'DocumentSignature' element value. ������� ��������������� ���� ��������������� ������
     * 
     * @param documentSignature
     */
    public void setDocumentSignature(PersonBaseType documentSignature) {
        this.documentSignature = documentSignature;
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

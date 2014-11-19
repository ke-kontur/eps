
package ru.acs.fts.schemas.album.taxorganregistrationcertificate;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ������������� � ���������� �� ���� � ��������� ������ ������������ ����. 
 */
public class TaxOrganRegistrationCertificateType extends BaseDocType
{
    private LocalDate registrationDate;
    private String taxOrganName;
    private LocalDate certificateDate;
    private String certificateID;
    private String taxOrganID;
    private OrganizationType company;
    private PersonBaseType taxOrganClerkSignature;
    private RegistrationDocumentType registrationDocument;
    private String documentModeID;

    /** 
     * Get the 'RegistrationDate' element value. ���� ���������� �� ����
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. ���� ���������� �� ����
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'TaxOrganName' element value. ������������ ���������� ������
     * 
     * @return value
     */
    public String getTaxOrganName() {
        return taxOrganName;
    }

    /** 
     * Set the 'TaxOrganName' element value. ������������ ���������� ������
     * 
     * @param taxOrganName
     */
    public void setTaxOrganName(String taxOrganName) {
        this.taxOrganName = taxOrganName;
    }

    /** 
     * Get the 'CertificateDate' element value. ���� ������ �������������
     * 
     * @return value
     */
    public LocalDate getCertificateDate() {
        return certificateDate;
    }

    /** 
     * Set the 'CertificateDate' element value. ���� ������ �������������
     * 
     * @param certificateDate
     */
    public void setCertificateDate(LocalDate certificateDate) {
        this.certificateDate = certificateDate;
    }

    /** 
     * Get the 'CertificateID' element value. ����� � ����� �������������
     * 
     * @return value
     */
    public String getCertificateID() {
        return certificateID;
    }

    /** 
     * Set the 'CertificateID' element value. ����� � ����� �������������
     * 
     * @param certificateID
     */
    public void setCertificateID(String certificateID) {
        this.certificateID = certificateID;
    }

    /** 
     * Get the 'TaxOrganID' element value. ��� ���������� ������
     * 
     * @return value
     */
    public String getTaxOrganID() {
        return taxOrganID;
    }

    /** 
     * Set the 'TaxOrganID' element value. ��� ���������� ������
     * 
     * @param taxOrganID
     */
    public void setTaxOrganID(String taxOrganID) {
        this.taxOrganID = taxOrganID;
    }

    /** 
     * Get the 'Company' element value. ������ ������������ � ����� ����� ���������� ������������ ���� � ������������ � �������������� �����������
     * 
     * @return value
     */
    public OrganizationType getCompany() {
        return company;
    }

    /** 
     * Set the 'Company' element value. ������ ������������ � ����� ����� ���������� ������������ ���� � ������������ � �������������� �����������
     * 
     * @param company
     */
    public void setCompany(OrganizationType company) {
        this.company = company;
    }

    /** 
     * Get the 'TaxOrganClerkSignature' element value. ������� ������������ ���������� ������
     * 
     * @return value
     */
    public PersonBaseType getTaxOrganClerkSignature() {
        return taxOrganClerkSignature;
    }

    /** 
     * Set the 'TaxOrganClerkSignature' element value. ������� ������������ ���������� ������
     * 
     * @param taxOrganClerkSignature
     */
    public void setTaxOrganClerkSignature(PersonBaseType taxOrganClerkSignature) {
        this.taxOrganClerkSignature = taxOrganClerkSignature;
    }

    /** 
     * Get the 'RegistrationDocument' element value. �������� � ����������, �������������� �������� ������������ ���� � �� ��������� ������� �������� �������������
     * 
     * @return value
     */
    public RegistrationDocumentType getRegistrationDocument() {
        return registrationDocument;
    }

    /** 
     * Set the 'RegistrationDocument' element value. �������� � ����������, �������������� �������� ������������ ���� � �� ��������� ������� �������� �������������
     * 
     * @param registrationDocument
     */
    public void setRegistrationDocument(
            RegistrationDocumentType registrationDocument) {
        this.registrationDocument = registrationDocument;
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

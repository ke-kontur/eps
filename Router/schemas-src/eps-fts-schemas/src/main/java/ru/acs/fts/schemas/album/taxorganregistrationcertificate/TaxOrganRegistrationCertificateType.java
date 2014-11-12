
package ru.acs.fts.schemas.album.taxorganregistrationcertificate;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Свидетельство о постановке на учет в налоговом органе юридического лица. 
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
     * Get the 'RegistrationDate' element value. Дата постановки на учет
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. Дата постановки на учет
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'TaxOrganName' element value. Наименование налогового органа
     * 
     * @return value
     */
    public String getTaxOrganName() {
        return taxOrganName;
    }

    /** 
     * Set the 'TaxOrganName' element value. Наименование налогового органа
     * 
     * @param taxOrganName
     */
    public void setTaxOrganName(String taxOrganName) {
        this.taxOrganName = taxOrganName;
    }

    /** 
     * Get the 'CertificateDate' element value. Дата выдачи свидетельства
     * 
     * @return value
     */
    public LocalDate getCertificateDate() {
        return certificateDate;
    }

    /** 
     * Set the 'CertificateDate' element value. Дата выдачи свидетельства
     * 
     * @param certificateDate
     */
    public void setCertificateDate(LocalDate certificateDate) {
        this.certificateDate = certificateDate;
    }

    /** 
     * Get the 'CertificateID' element value. Серия и номер свидетельства
     * 
     * @return value
     */
    public String getCertificateID() {
        return certificateID;
    }

    /** 
     * Set the 'CertificateID' element value. Серия и номер свидетельства
     * 
     * @param certificateID
     */
    public void setCertificateID(String certificateID) {
        this.certificateID = certificateID;
    }

    /** 
     * Get the 'TaxOrganID' element value. Код налогового органа
     * 
     * @return value
     */
    public String getTaxOrganID() {
        return taxOrganID;
    }

    /** 
     * Set the 'TaxOrganID' element value. Код налогового органа
     * 
     * @param taxOrganID
     */
    public void setTaxOrganID(String taxOrganID) {
        this.taxOrganID = taxOrganID;
    }

    /** 
     * Get the 'Company' element value. Полное наименование и адрес места нахождения юридического лица в соответствии с учредительными документами
     * 
     * @return value
     */
    public OrganizationType getCompany() {
        return company;
    }

    /** 
     * Set the 'Company' element value. Полное наименование и адрес места нахождения юридического лица в соответствии с учредительными документами
     * 
     * @param company
     */
    public void setCompany(OrganizationType company) {
        this.company = company;
    }

    /** 
     * Get the 'TaxOrganClerkSignature' element value. Подпись руководителя налогового органа
     * 
     * @return value
     */
    public PersonBaseType getTaxOrganClerkSignature() {
        return taxOrganClerkSignature;
    }

    /** 
     * Set the 'TaxOrganClerkSignature' element value. Подпись руководителя налогового органа
     * 
     * @param taxOrganClerkSignature
     */
    public void setTaxOrganClerkSignature(PersonBaseType taxOrganClerkSignature) {
        this.taxOrganClerkSignature = taxOrganClerkSignature;
    }

    /** 
     * Get the 'RegistrationDocument' element value. Сведения о документах, подтверждающий создание юридического лица и на основании которых выдается свидетельство
     * 
     * @return value
     */
    public RegistrationDocumentType getRegistrationDocument() {
        return registrationDocument;
    }

    /** 
     * Set the 'RegistrationDocument' element value. Сведения о документах, подтверждающий создание юридического лица и на основании которых выдается свидетельство
     * 
     * @param registrationDocument
     */
    public void setRegistrationDocument(
            RegistrationDocumentType registrationDocument) {
        this.registrationDocument = registrationDocument;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}

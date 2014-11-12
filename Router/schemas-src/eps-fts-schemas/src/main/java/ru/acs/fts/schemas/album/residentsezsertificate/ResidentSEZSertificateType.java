
package ru.acs.fts.schemas.album.residentsezsertificate;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Свидетельство, удостоверяющее регистрацию лица в качестве резидента особой экономической зоны 
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
     * Get the 'SertificateNumber' element value. Регистрационный номер свидетельства 
     * 
     * @return value
     */
    public String getSertificateNumber() {
        return sertificateNumber;
    }

    /** 
     * Set the 'SertificateNumber' element value. Регистрационный номер свидетельства 
     * 
     * @param sertificateNumber
     */
    public void setSertificateNumber(String sertificateNumber) {
        this.sertificateNumber = sertificateNumber;
    }

    /** 
     * Get the 'IssueDate' element value. Дата выдачи свидетельства 
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата выдачи свидетельства 
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'RegistrationDate' element value. Дата регистрации 
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. Дата регистрации 
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'SEZType' element value. Тип ОЭЗ: 1 - промышленно-производственная, 0 - технико-внедренческая 
     * 
     * @return value
     */
    public String getSEZType() {
        return SEZType;
    }

    /** 
     * Set the 'SEZType' element value. Тип ОЭЗ: 1 - промышленно-производственная, 0 - технико-внедренческая 
     * 
     * @param SEZType
     */
    public void setSEZType(String SEZType) {
        this.SEZType = SEZType;
    }

    /** 
     * Get the 'RegistratorAuthority' element value. Сведения об органе, выдавшем свидетельство, и подпись уполномоченного лица этого органа 
     * 
     * @return value
     */
    public RegistratorAuthorityType getRegistratorAuthority() {
        return registratorAuthority;
    }

    /** 
     * Set the 'RegistratorAuthority' element value. Сведения об органе, выдавшем свидетельство, и подпись уполномоченного лица этого органа 
     * 
     * @param registratorAuthority
     */
    public void setRegistratorAuthority(
            RegistratorAuthorityType registratorAuthority) {
        this.registratorAuthority = registratorAuthority;
    }

    /** 
     * Get the 'ResidentOrganisation' element value. Сведения о юридическом лице или об индивидуальном предпринимателе - резиденте ОЭЗ 
     * 
     * @return value
     */
    public ResidentOrganisationType getResidentOrganisation() {
        return residentOrganisation;
    }

    /** 
     * Set the 'ResidentOrganisation' element value. Сведения о юридическом лице или об индивидуальном предпринимателе - резиденте ОЭЗ 
     * 
     * @param residentOrganisation
     */
    public void setResidentOrganisation(
            ResidentOrganisationType residentOrganisation) {
        this.residentOrganisation = residentOrganisation;
    }

    /** 
     * Get the 'Form' element value. Серия и номер бланка
     * 
     * @return value
     */
    public FormType getForm() {
        return form;
    }

    /** 
     * Set the 'Form' element value. Серия и номер бланка
     * 
     * @param form
     */
    public void setForm(FormType form) {
        this.form = form;
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

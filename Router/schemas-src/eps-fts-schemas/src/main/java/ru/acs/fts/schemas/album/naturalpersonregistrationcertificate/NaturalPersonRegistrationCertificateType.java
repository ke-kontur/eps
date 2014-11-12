
package ru.acs.fts.schemas.album.naturalpersonregistrationcertificate;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Свидетельство о государственной регистрации физического лица в качестве индивидуального предпринимателя по форме Р61001
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
     * Get the 'RegistrationDate' element value. Дата государственной регистрации физического лица в качестве индивидуального предпринимателя и данные документа
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. Дата государственной регистрации физического лица в качестве индивидуального предпринимателя и данные документа
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'Businessman' element value. Фамилия, имя, отчество предпринимателя
     * 
     * @return value
     */
    public String getBusinessman() {
        return businessman;
    }

    /** 
     * Set the 'Businessman' element value. Фамилия, имя, отчество предпринимателя
     * 
     * @param businessman
     */
    public void setBusinessman(String businessman) {
        this.businessman = businessman;
    }

    /** 
     * Get the 'RegistrationOrganization' element value. Наименование регистрирующего органа
     * 
     * @return value
     */
    public String getRegistrationOrganization() {
        return registrationOrganization;
    }

    /** 
     * Set the 'RegistrationOrganization' element value. Наименование регистрирующего органа
     * 
     * @param registrationOrganization
     */
    public void setRegistrationOrganization(String registrationOrganization) {
        this.registrationOrganization = registrationOrganization;
    }

    /** 
     * Get the 'RegistrationNumberID' element value. Государственный регистрационный номер записи, вносимой в Единый государственный реестр индивидуальных предпринимателей
     * 
     * @return value
     */
    public String getRegistrationNumberID() {
        return registrationNumberID;
    }

    /** 
     * Set the 'RegistrationNumberID' element value. Государственный регистрационный номер записи, вносимой в Единый государственный реестр индивидуальных предпринимателей
     * 
     * @param registrationNumberID
     */
    public void setRegistrationNumberID(String registrationNumberID) {
        this.registrationNumberID = registrationNumberID;
    }

    /** 
     * Get the 'FormName' element value. Форма
     * 
     * @return value
     */
    public String getFormName() {
        return formName;
    }

    /** 
     * Set the 'FormName' element value. Форма
     * 
     * @param formName
     */
    public void setFormName(String formName) {
        this.formName = formName;
    }

    /** 
     * Get the 'DocumentSignature' element value. Подпись уполномоченного лица регистрирующего органа
     * 
     * @return value
     */
    public PersonBaseType getDocumentSignature() {
        return documentSignature;
    }

    /** 
     * Set the 'DocumentSignature' element value. Подпись уполномоченного лица регистрирующего органа
     * 
     * @param documentSignature
     */
    public void setDocumentSignature(PersonBaseType documentSignature) {
        this.documentSignature = documentSignature;
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

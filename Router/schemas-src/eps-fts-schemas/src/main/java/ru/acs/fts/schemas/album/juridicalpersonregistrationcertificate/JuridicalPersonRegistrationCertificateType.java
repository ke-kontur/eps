
package ru.acs.fts.schemas.album.juridicalpersonregistrationcertificate;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Свидетельство о государственной регистрации юридического лица по форме P51001
 */
public class JuridicalPersonRegistrationCertificateType extends BaseDocType
{
    private LocalDate registrationDate;
    private String registrationNumberID;
    private String registrationOrganization;
    private String juridicalPersonLongTitle;
    private String juridicalPersonShortcut;
    private String juridicalPersonFirmName;
    private String formName;
    private PersonBaseType registeringClerkSignature;
    private FormType form;
    private String documentModeID;

    /** 
     * Get the 'RegistrationDate' element value. Дата государственной регистрации юридического лица
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. Дата государственной регистрации юридического лица
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'RegistrationNumberID' element value. Государственный регистрационный номер записи, вносимой в Единый государственный реестр юридических лиц
     * 
     * @return value
     */
    public String getRegistrationNumberID() {
        return registrationNumberID;
    }

    /** 
     * Set the 'RegistrationNumberID' element value. Государственный регистрационный номер записи, вносимой в Единый государственный реестр юридических лиц
     * 
     * @param registrationNumberID
     */
    public void setRegistrationNumberID(String registrationNumberID) {
        this.registrationNumberID = registrationNumberID;
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
     * Get the 'JuridicalPersonLongTitle' element value. Полное наименование юридического лица с указанием организационно-правовой формы
     * 
     * @return value
     */
    public String getJuridicalPersonLongTitle() {
        return juridicalPersonLongTitle;
    }

    /** 
     * Set the 'JuridicalPersonLongTitle' element value. Полное наименование юридического лица с указанием организационно-правовой формы
     * 
     * @param juridicalPersonLongTitle
     */
    public void setJuridicalPersonLongTitle(String juridicalPersonLongTitle) {
        this.juridicalPersonLongTitle = juridicalPersonLongTitle;
    }

    /** 
     * Get the 'JuridicalPersonShortcut' element value. Сокращенное наименование юридического лица
     * 
     * @return value
     */
    public String getJuridicalPersonShortcut() {
        return juridicalPersonShortcut;
    }

    /** 
     * Set the 'JuridicalPersonShortcut' element value. Сокращенное наименование юридического лица
     * 
     * @param juridicalPersonShortcut
     */
    public void setJuridicalPersonShortcut(String juridicalPersonShortcut) {
        this.juridicalPersonShortcut = juridicalPersonShortcut;
    }

    /** 
     * Get the 'JuridicalPersonFirmName' element value. Фирменное наименование
     * 
     * @return value
     */
    public String getJuridicalPersonFirmName() {
        return juridicalPersonFirmName;
    }

    /** 
     * Set the 'JuridicalPersonFirmName' element value. Фирменное наименование
     * 
     * @param juridicalPersonFirmName
     */
    public void setJuridicalPersonFirmName(String juridicalPersonFirmName) {
        this.juridicalPersonFirmName = juridicalPersonFirmName;
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
     * Get the 'RegisteringClerkSignature' element value. Подпись уполномоченного лица регистрирующего органа
     * 
     * @return value
     */
    public PersonBaseType getRegisteringClerkSignature() {
        return registeringClerkSignature;
    }

    /** 
     * Set the 'RegisteringClerkSignature' element value. Подпись уполномоченного лица регистрирующего органа
     * 
     * @param registeringClerkSignature
     */
    public void setRegisteringClerkSignature(
            PersonBaseType registeringClerkSignature) {
        this.registeringClerkSignature = registeringClerkSignature;
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

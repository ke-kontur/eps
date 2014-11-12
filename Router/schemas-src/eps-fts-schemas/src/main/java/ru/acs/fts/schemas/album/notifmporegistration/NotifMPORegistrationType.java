
package ru.acs.fts.schemas.album.notifmporegistration;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Уведомление о регистрации МПО
 */
public class NotifMPORegistrationType extends BaseDocType
{
    private LocalDate registrationDate;
    private String registrationTime;
    private String comments;
    private MPORegistrationType MPORegistration;
    private PersonSignatureType customsPerson;
    private CustomsType customs;
    private String documentModeID;

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
     * Get the 'RegistrationTime' element value. Время регистрации
     * 
     * @return value
     */
    public String getRegistrationTime() {
        return registrationTime;
    }

    /** 
     * Set the 'RegistrationTime' element value. Время регистрации
     * 
     * @param registrationTime
     */
    public void setRegistrationTime(String registrationTime) {
        this.registrationTime = registrationTime;
    }

    /** 
     * Get the 'Comments' element value. Комментарии
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Комментарии
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'MPO_Registration' element value. Сведения о регистрационном номере МПО
     * 
     * @return value
     */
    public MPORegistrationType getMPORegistration() {
        return MPORegistration;
    }

    /** 
     * Set the 'MPO_Registration' element value. Сведения о регистрационном номере МПО
     * 
     * @param MPORegistration
     */
    public void setMPORegistration(MPORegistrationType MPORegistration) {
        this.MPORegistration = MPORegistration;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public PersonSignatureType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(PersonSignatureType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
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

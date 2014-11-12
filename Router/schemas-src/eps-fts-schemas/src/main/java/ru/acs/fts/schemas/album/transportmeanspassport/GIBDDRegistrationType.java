
package ru.acs.fts.schemas.album.transportmeanspassport;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Сведения об учете ТС в ГИБДД
 */
public class GIBDDRegistrationType
{
    private LocalDate strakeOffDate;
    private CertificateRegistrationType certificateRegistration;
    private PersonBaseType registrationSign;
    private PersonBaseType strikeOffSign;
    private PersonBaseType issuingDocuments;

    /** 
     * Get the 'StrakeOffDate' element value. Дата снятия с учета
     * 
     * @return value
     */
    public LocalDate getStrakeOffDate() {
        return strakeOffDate;
    }

    /** 
     * Set the 'StrakeOffDate' element value. Дата снятия с учета
     * 
     * @param strakeOffDate
     */
    public void setStrakeOffDate(LocalDate strakeOffDate) {
        this.strakeOffDate = strakeOffDate;
    }

    /** 
     * Get the 'CertificateRegistration' element value. Свидетельство о регистрации ТС
     * 
     * @return value
     */
    public CertificateRegistrationType getCertificateRegistration() {
        return certificateRegistration;
    }

    /** 
     * Set the 'CertificateRegistration' element value. Свидетельство о регистрации ТС
     * 
     * @param certificateRegistration
     */
    public void setCertificateRegistration(
            CertificateRegistrationType certificateRegistration) {
        this.certificateRegistration = certificateRegistration;
    }

    /** 
     * Get the 'RegistrationSign' element value. Подпись при  регистрации ТС
     * 
     * @return value
     */
    public PersonBaseType getRegistrationSign() {
        return registrationSign;
    }

    /** 
     * Set the 'RegistrationSign' element value. Подпись при  регистрации ТС
     * 
     * @param registrationSign
     */
    public void setRegistrationSign(PersonBaseType registrationSign) {
        this.registrationSign = registrationSign;
    }

    /** 
     * Get the 'StrikeOffSign' element value. Подпись лица при снятии с учета
     * 
     * @return value
     */
    public PersonBaseType getStrikeOffSign() {
        return strikeOffSign;
    }

    /** 
     * Set the 'StrikeOffSign' element value. Подпись лица при снятии с учета
     * 
     * @param strikeOffSign
     */
    public void setStrikeOffSign(PersonBaseType strikeOffSign) {
        this.strikeOffSign = strikeOffSign;
    }

    /** 
     * Get the 'IssuingDocuments' element value. Подпись лица, выдавшего ПТС.
     * 
     * @return value
     */
    public PersonBaseType getIssuingDocuments() {
        return issuingDocuments;
    }

    /** 
     * Set the 'IssuingDocuments' element value. Подпись лица, выдавшего ПТС.
     * 
     * @param issuingDocuments
     */
    public void setIssuingDocuments(PersonBaseType issuingDocuments) {
        this.issuingDocuments = issuingDocuments;
    }
}

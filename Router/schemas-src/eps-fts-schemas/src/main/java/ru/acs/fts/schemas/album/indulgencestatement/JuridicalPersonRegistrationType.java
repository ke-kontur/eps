
package ru.acs.fts.schemas.album.indulgencestatement;

import org.joda.time.LocalDate;

/** 
 * Сведения о государственной регистрации юридического лица
 */
public class JuridicalPersonRegistrationType
{
    private String registrationOrganization;
    private LocalDate dateInf;
    private String place;
    private String certificateNumber;
    private String certificateSeriesCode;

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
     * Get the 'DateInf' element value. Дата регистрации
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. Дата регистрации
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }

    /** 
     * Get the 'Place' element value. Место регистрации
     * 
     * @return value
     */
    public String getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. Место регистрации
     * 
     * @param place
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /** 
     * Get the 'CertificateNumber' element value. Номер свидетельства о государственной регистрации 
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. Номер свидетельства о государственной регистрации 
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /** 
     * Get the 'CertificateSeriesCode' element value. Серия свидетельства о государственной регистрации 
     * 
     * @return value
     */
    public String getCertificateSeriesCode() {
        return certificateSeriesCode;
    }

    /** 
     * Set the 'CertificateSeriesCode' element value. Серия свидетельства о государственной регистрации 
     * 
     * @param certificateSeriesCode
     */
    public void setCertificateSeriesCode(String certificateSeriesCode) {
        this.certificateSeriesCode = certificateSeriesCode;
    }
}


package ru.acs.fts.schemas.album.indulgencestatement;

import org.joda.time.LocalDate;

/** 
 * Сведения о государственной регистрации индивидуального предпринимателя
 */
public class NaturalPersonRegistrationType
{
    private String registrationOrganization;
    private LocalDate dateInf;

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
     * Get the 'DateInf' element value. Дата государственной регистрации физического лица в качестве индивидуального предпринимателя и данные документа
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. Дата государственной регистрации физического лица в качестве индивидуального предпринимателя и данные документа
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }
}

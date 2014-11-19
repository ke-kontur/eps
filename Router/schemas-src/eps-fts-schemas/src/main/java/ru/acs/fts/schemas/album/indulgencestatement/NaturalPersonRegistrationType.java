
package ru.acs.fts.schemas.album.indulgencestatement;

import org.joda.time.LocalDate;

/** 
 * —ведени€ о государственной регистрации индивидуального предпринимател€
 */
public class NaturalPersonRegistrationType
{
    private String registrationOrganization;
    private LocalDate dateInf;

    /** 
     * Get the 'RegistrationOrganization' element value. Ќаименование регистрирующего органа
     * 
     * @return value
     */
    public String getRegistrationOrganization() {
        return registrationOrganization;
    }

    /** 
     * Set the 'RegistrationOrganization' element value. Ќаименование регистрирующего органа
     * 
     * @param registrationOrganization
     */
    public void setRegistrationOrganization(String registrationOrganization) {
        this.registrationOrganization = registrationOrganization;
    }

    /** 
     * Get the 'DateInf' element value. ƒата государственной регистрации физического лица в качестве индивидуального предпринимател€ и данные документа
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. ƒата государственной регистрации физического лица в качестве индивидуального предпринимател€ и данные документа
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }
}

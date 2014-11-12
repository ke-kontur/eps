
package ru.acs.fts.schemas.album.declarationconformity;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Органа, зарегистрировавшем декларацию о соответствии
 */
public class RegisterType extends OrganizationType
{
    private String registrationAuthority;
    private LocalDate registrationDate;
    private String registrationNumber;

    /** 
     * Get the 'RegistrationAuthority' element value. Наименование органа по аккредитации, выдавшего аттестат аккредитации.
     * 
     * @return value
     */
    public String getRegistrationAuthority() {
        return registrationAuthority;
    }

    /** 
     * Set the 'RegistrationAuthority' element value. Наименование органа по аккредитации, выдавшего аттестат аккредитации.
     * 
     * @param registrationAuthority
     */
    public void setRegistrationAuthority(String registrationAuthority) {
        this.registrationAuthority = registrationAuthority;
    }

    /** 
     * Get the 'RegistrationDate' element value. Дата аттестата аккредитации регистрации
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. Дата аттестата аккредитации регистрации
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'RegistrationNumber' element value. Регистрационный номер аттестата аккредитации органа по сертификации
     * 
     * @return value
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. Регистрационный номер аттестата аккредитации органа по сертификации
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}

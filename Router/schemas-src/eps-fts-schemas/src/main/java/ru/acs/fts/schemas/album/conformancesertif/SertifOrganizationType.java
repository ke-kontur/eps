
package ru.acs.fts.schemas.album.conformancesertif;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.sertifcommonaggregatetypescust.SertifOrgBaseType;

/** 
 * Сведения об органе сертификации
 */
public class SertifOrganizationType extends SertifOrgBaseType
{
    private String organizationNumber;
    private String fieldOfAction;
    private LocalDate certificateDate;
    private CertificateOrgType certificateOrg;

    /** 
     * Get the 'OrganizationNumber' element value. Регистрационный номер органа сертификации
     * 
     * @return value
     */
    public String getOrganizationNumber() {
        return organizationNumber;
    }

    /** 
     * Set the 'OrganizationNumber' element value. Регистрационный номер органа сертификации
     * 
     * @param organizationNumber
     */
    public void setOrganizationNumber(String organizationNumber) {
        this.organizationNumber = organizationNumber;
    }

    /** 
     * Get the 'FieldOfAction' element value. Сфера деятельности
     * 
     * @return value
     */
    public String getFieldOfAction() {
        return fieldOfAction;
    }

    /** 
     * Set the 'FieldOfAction' element value. Сфера деятельности
     * 
     * @param fieldOfAction
     */
    public void setFieldOfAction(String fieldOfAction) {
        this.fieldOfAction = fieldOfAction;
    }

    /** 
     * Get the 'CertificateDate' element value. Дата  регистрационного номера аттестата аккредитации
     * 
     * @return value
     */
    public LocalDate getCertificateDate() {
        return certificateDate;
    }

    /** 
     * Set the 'CertificateDate' element value. Дата  регистрационного номера аттестата аккредитации
     * 
     * @param certificateDate
     */
    public void setCertificateDate(LocalDate certificateDate) {
        this.certificateDate = certificateDate;
    }

    /** 
     * Get the 'CertificateOrg' element value. Орган, аккредитовавший орган сертификации
     * 
     * @return value
     */
    public CertificateOrgType getCertificateOrg() {
        return certificateOrg;
    }

    /** 
     * Set the 'CertificateOrg' element value. Орган, аккредитовавший орган сертификации
     * 
     * @param certificateOrg
     */
    public void setCertificateOrg(CertificateOrgType certificateOrg) {
        this.certificateOrg = certificateOrg;
    }
}

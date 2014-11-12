
package ru.acs.fts.schemas.album.residentsezsertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Сведения об органе, выдавшем свидетельство, и подпись уполномоченного лица этого органа 
 */
public class RegistratorAuthorityType
{
    private OrganizationBaseType organisation;
    private PersonSignatureType authorisdPersonSignature;

    /** 
     * Get the 'Organisation' element value. Реквизиты организации 
     * 
     * @return value
     */
    public OrganizationBaseType getOrganisation() {
        return organisation;
    }

    /** 
     * Set the 'Organisation' element value. Реквизиты организации 
     * 
     * @param organisation
     */
    public void setOrganisation(OrganizationBaseType organisation) {
        this.organisation = organisation;
    }

    /** 
     * Get the 'AuthorisdPersonSignature' element value. Подпись уполномоченного лица органа, выдавшее свидетельство 
     * 
     * @return value
     */
    public PersonSignatureType getAuthorisdPersonSignature() {
        return authorisdPersonSignature;
    }

    /** 
     * Set the 'AuthorisdPersonSignature' element value. Подпись уполномоченного лица органа, выдавшее свидетельство 
     * 
     * @param authorisdPersonSignature
     */
    public void setAuthorisdPersonSignature(
            PersonSignatureType authorisdPersonSignature) {
        this.authorisdPersonSignature = authorisdPersonSignature;
    }
}

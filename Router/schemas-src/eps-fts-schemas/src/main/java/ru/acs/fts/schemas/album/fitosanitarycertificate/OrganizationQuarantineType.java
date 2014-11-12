
package ru.acs.fts.schemas.album.fitosanitarycertificate;

import ru.acs.fts.schemas.album.sertifcommonaggregatetypescust.SertifOrgBaseType;

/** 
 * Организации(ям) по карантину и защите растений (страны)
 */
public class OrganizationQuarantineType
{
    private String counryName;
    private SertifOrgBaseType organization;

    /** 
     * Get the 'CounryName' element value. Краткое наименование страны.
     * 
     * @return value
     */
    public String getCounryName() {
        return counryName;
    }

    /** 
     * Set the 'CounryName' element value. Краткое наименование страны.
     * 
     * @param counryName
     */
    public void setCounryName(String counryName) {
        this.counryName = counryName;
    }

    /** 
     * Get the 'Organization' element value. Сведения об организации 
     * 
     * @return value
     */
    public SertifOrgBaseType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. Сведения об организации 
     * 
     * @param organization
     */
    public void setOrganization(SertifOrgBaseType organization) {
        this.organization = organization;
    }
}

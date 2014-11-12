
package ru.acs.fts.schemas.album.cardcommonaggregatetypes;

/** 
 * Реквизиты организации. Базовый класс
 */
public class OrganizationBaseType extends RFOrganizationFeaturesType
{
    private String organizationName;

    /** 
     * Get the 'OrganizationName' element value. Наименование организации
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Наименование организации
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}

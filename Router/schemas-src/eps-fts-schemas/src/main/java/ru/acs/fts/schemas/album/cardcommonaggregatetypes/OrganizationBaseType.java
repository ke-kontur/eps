
package ru.acs.fts.schemas.album.cardcommonaggregatetypes;

/** 
 * ��������� �����������. ������� �����.
 */
public class OrganizationBaseType extends RFOrganizationFeaturesType
{
    private String organizationName;

    /** 
     * Get the 'OrganizationName' element value. ������������ �����������
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ �����������
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}

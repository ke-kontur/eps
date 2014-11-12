
package ru.acs.fts.schemas.album.fitosanitarycertificate;

import ru.acs.fts.schemas.album.sertifcommonaggregatetypescust.SertifOrgBaseType;

/** 
 * �����������(��) �� ��������� � ������ �������� (������)
 */
public class OrganizationQuarantineType
{
    private String counryName;
    private SertifOrgBaseType organization;

    /** 
     * Get the 'CounryName' element value. ������� ������������ ������.
     * 
     * @return value
     */
    public String getCounryName() {
        return counryName;
    }

    /** 
     * Set the 'CounryName' element value. ������� ������������ ������.
     * 
     * @param counryName
     */
    public void setCounryName(String counryName) {
        this.counryName = counryName;
    }

    /** 
     * Get the 'Organization' element value. �������� �� ����������� 
     * 
     * @return value
     */
    public SertifOrgBaseType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. �������� �� ����������� 
     * 
     * @param organization
     */
    public void setOrganization(SertifOrgBaseType organization) {
        this.organization = organization;
    }
}

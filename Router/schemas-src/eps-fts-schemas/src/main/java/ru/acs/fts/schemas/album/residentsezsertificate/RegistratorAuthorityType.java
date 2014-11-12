
package ru.acs.fts.schemas.album.residentsezsertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * �������� �� ������, �������� �������������, � ������� ��������������� ���� ����� ������ 
 */
public class RegistratorAuthorityType
{
    private OrganizationBaseType organisation;
    private PersonSignatureType authorisdPersonSignature;

    /** 
     * Get the 'Organisation' element value. ��������� ����������� 
     * 
     * @return value
     */
    public OrganizationBaseType getOrganisation() {
        return organisation;
    }

    /** 
     * Set the 'Organisation' element value. ��������� ����������� 
     * 
     * @param organisation
     */
    public void setOrganisation(OrganizationBaseType organisation) {
        this.organisation = organisation;
    }

    /** 
     * Get the 'AuthorisdPersonSignature' element value. ������� ��������������� ���� ������, �������� ������������� 
     * 
     * @return value
     */
    public PersonSignatureType getAuthorisdPersonSignature() {
        return authorisdPersonSignature;
    }

    /** 
     * Set the 'AuthorisdPersonSignature' element value. ������� ��������������� ���� ������, �������� ������������� 
     * 
     * @param authorisdPersonSignature
     */
    public void setAuthorisdPersonSignature(
            PersonSignatureType authorisdPersonSignature) {
        this.authorisdPersonSignature = authorisdPersonSignature;
    }
}

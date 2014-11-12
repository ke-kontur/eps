
package ru.acs.fts.schemas.album.rzndesignatedpurpose;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������� �� �����������
 */
public class OrganizationType extends CUOrganizationType
{
    private String orgSign;
    private PersonBaseType authorizedPerson;

    /** 
     * Get the 'OrgSign' element value. �������: 0 - ���. ����; 1 - ��. ����
     * 
     * @return value
     */
    public String getOrgSign() {
        return orgSign;
    }

    /** 
     * Set the 'OrgSign' element value. �������: 0 - ���. ����; 1 - ��. ����
     * 
     * @param orgSign
     */
    public void setOrgSign(String orgSign) {
        this.orgSign = orgSign;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. �������������� ����
     * 
     * @return value
     */
    public PersonBaseType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. �������������� ����
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(PersonBaseType authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }
}


package ru.acs.fts.schemas.album.servicelicense;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * ����� ������
 */
public class AuthorityOrgType extends OrganizationType
{
    private String authorityOrgCode;

    /** 
     * Get the 'AuthorityOrgCode' element value. ��� ������ ������
     * 
     * @return value
     */
    public String getAuthorityOrgCode() {
        return authorityOrgCode;
    }

    /** 
     * Set the 'AuthorityOrgCode' element value. ��� ������ ������
     * 
     * @param authorityOrgCode
     */
    public void setAuthorityOrgCode(String authorityOrgCode) {
        this.authorityOrgCode = authorityOrgCode;
    }
}

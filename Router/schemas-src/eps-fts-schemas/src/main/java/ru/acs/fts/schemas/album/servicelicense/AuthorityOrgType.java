
package ru.acs.fts.schemas.album.servicelicense;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Орган власти
 */
public class AuthorityOrgType extends OrganizationType
{
    private String authorityOrgCode;

    /** 
     * Get the 'AuthorityOrgCode' element value. Код органа власти
     * 
     * @return value
     */
    public String getAuthorityOrgCode() {
        return authorityOrgCode;
    }

    /** 
     * Set the 'AuthorityOrgCode' element value. Код органа власти
     * 
     * @param authorityOrgCode
     */
    public void setAuthorityOrgCode(String authorityOrgCode) {
        this.authorityOrgCode = authorityOrgCode;
    }
}

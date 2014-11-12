
package ru.acs.fts.schemas.album.servicelicense;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * ���������/��������������� ����
 */
public class LicenseeType extends OrganizationType
{
    private String orgSign;

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
}

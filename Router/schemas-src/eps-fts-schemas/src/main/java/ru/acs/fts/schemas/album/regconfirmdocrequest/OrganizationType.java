
package ru.acs.fts.schemas.album.regconfirmdocrequest;

/** 
 * �������� �� �����������/���. ���� (��. ����/��)
 */
public class OrganizationType
        extends
            ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType
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

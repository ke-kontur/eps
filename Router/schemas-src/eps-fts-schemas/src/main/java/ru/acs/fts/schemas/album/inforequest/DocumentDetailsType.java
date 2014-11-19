
package ru.acs.fts.schemas.album.inforequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ��������� ���������
 */
public class DocumentDetailsType extends DocumentBaseType
{
    private CUOrganizationType issueOrg;

    /** 
     * Get the 'IssueOrg' element value. �������� �� �����������, �������� ��������
     * 
     * @return value
     */
    public CUOrganizationType getIssueOrg() {
        return issueOrg;
    }

    /** 
     * Set the 'IssueOrg' element value. �������� �� �����������, �������� ��������
     * 
     * @param issueOrg
     */
    public void setIssueOrg(CUOrganizationType issueOrg) {
        this.issueOrg = issueOrg;
    }
}

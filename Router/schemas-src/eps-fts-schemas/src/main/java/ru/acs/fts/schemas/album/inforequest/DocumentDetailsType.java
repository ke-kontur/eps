
package ru.acs.fts.schemas.album.inforequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Реквизиты документа
 */
public class DocumentDetailsType extends DocumentBaseType
{
    private CUOrganizationType issueOrg;

    /** 
     * Get the 'IssueOrg' element value. Сведения об организации, выдавшей документ
     * 
     * @return value
     */
    public CUOrganizationType getIssueOrg() {
        return issueOrg;
    }

    /** 
     * Set the 'IssueOrg' element value. Сведения об организации, выдавшей документ
     * 
     * @param issueOrg
     */
    public void setIssueOrg(CUOrganizationType issueOrg) {
        this.issueOrg = issueOrg;
    }
}

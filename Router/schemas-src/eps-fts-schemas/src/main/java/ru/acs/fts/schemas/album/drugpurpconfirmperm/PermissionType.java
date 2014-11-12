
package ru.acs.fts.schemas.album.drugpurpconfirmperm;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ����������
 */
public class PermissionType extends DocumentBaseType
{
    private String issuePeriod;

    /** 
     * Get the 'IssuePeriod' element value. ������ �������� ����������
     * 
     * @return value
     */
    public String getIssuePeriod() {
        return issuePeriod;
    }

    /** 
     * Set the 'IssuePeriod' element value. ������ �������� ����������
     * 
     * @param issuePeriod
     */
    public void setIssuePeriod(String issuePeriod) {
        this.issuePeriod = issuePeriod;
    }
}

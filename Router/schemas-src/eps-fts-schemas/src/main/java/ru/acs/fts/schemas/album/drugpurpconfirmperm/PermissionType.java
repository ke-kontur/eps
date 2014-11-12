
package ru.acs.fts.schemas.album.drugpurpconfirmperm;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Разрешение
 */
public class PermissionType extends DocumentBaseType
{
    private String issuePeriod;

    /** 
     * Get the 'IssuePeriod' element value. Период действия разрешения
     * 
     * @return value
     */
    public String getIssuePeriod() {
        return issuePeriod;
    }

    /** 
     * Set the 'IssuePeriod' element value. Период действия разрешения
     * 
     * @param issuePeriod
     */
    public void setIssuePeriod(String issuePeriod) {
        this.issuePeriod = issuePeriod;
    }
}

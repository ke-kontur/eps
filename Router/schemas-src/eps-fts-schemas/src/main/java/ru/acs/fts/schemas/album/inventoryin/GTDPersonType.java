
package ru.acs.fts.schemas.album.inventoryin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Сведения о лице, подающем ДТ
 */
public class GTDPersonType extends OrganizationBaseType
{
    private String branchOrganizationName;

    /** 
     * Get the 'BranchOrganizationName' element value. Наименование обособленного подразделения.
     * 
     * @return value
     */
    public String getBranchOrganizationName() {
        return branchOrganizationName;
    }

    /** 
     * Set the 'BranchOrganizationName' element value. Наименование обособленного подразделения.
     * 
     * @param branchOrganizationName
     */
    public void setBranchOrganizationName(String branchOrganizationName) {
        this.branchOrganizationName = branchOrganizationName;
    }
}

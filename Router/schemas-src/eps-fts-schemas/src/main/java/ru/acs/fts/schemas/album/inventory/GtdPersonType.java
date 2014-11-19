
package ru.acs.fts.schemas.album.inventory;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �������� � ����, �������� ��������(�)
 */
public class GtdPersonType extends OrganizationBaseType
{
    private String branchOrganizationName;

    /** 
     * Get the 'BranchOrganizationName' element value. ������������ ������������� �������������.
     * 
     * @return value
     */
    public String getBranchOrganizationName() {
        return branchOrganizationName;
    }

    /** 
     * Set the 'BranchOrganizationName' element value. ������������ ������������� �������������.
     * 
     * @param branchOrganizationName
     */
    public void setBranchOrganizationName(String branchOrganizationName) {
        this.branchOrganizationName = branchOrganizationName;
    }
}

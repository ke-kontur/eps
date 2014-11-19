
package ru.acs.fts.schemas.album.inventoryin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �������� � ����, �������� ��
 */
public class GTDPersonType extends OrganizationBaseType
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

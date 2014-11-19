
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.BranchDescriptionType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.ESADOrganizationInType;

/** 
 * �������� ����������� ��������
 */
public class InParticipantType extends ESADOrganizationInType
{
    private BranchDescriptionType branchDescription;

    /** 
     * Get the 'BranchDescription' element value. �������� �� ������������ �������������.
     * 
     * @return value
     */
    public BranchDescriptionType getBranchDescription() {
        return branchDescription;
    }

    /** 
     * Set the 'BranchDescription' element value. �������� �� ������������ �������������.
     * 
     * @param branchDescription
     */
    public void setBranchDescription(BranchDescriptionType branchDescription) {
        this.branchDescription = branchDescription;
    }
}

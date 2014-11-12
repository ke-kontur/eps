
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.BranchDescriptionType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.ESADOrganizationInType;

/** 
 * Участник таможенного процесса
 */
public class InParticipantType extends ESADOrganizationInType
{
    private BranchDescriptionType branchDescription;

    /** 
     * Get the 'BranchDescription' element value. Сведения об обособленном подразделении.
     * 
     * @return value
     */
    public BranchDescriptionType getBranchDescription() {
        return branchDescription;
    }

    /** 
     * Set the 'BranchDescription' element value. Сведения об обособленном подразделении.
     * 
     * @param branchDescription
     */
    public void setBranchDescription(BranchDescriptionType branchDescription) {
        this.branchDescription = branchDescription;
    }
}

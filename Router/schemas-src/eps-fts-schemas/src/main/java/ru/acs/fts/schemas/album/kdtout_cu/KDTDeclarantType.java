
package ru.acs.fts.schemas.album.kdtout_cu;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUBranchDescriptionType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Сведения о декларанте/представителе
 */
public class KDTDeclarantType extends CUOrganizationType
{
    private CUBranchDescriptionType branchDescription;

    /** 
     * Get the 'BranchDescription' element value. Сведения об обособленном подразделении
     * 
     * @return value
     */
    public CUBranchDescriptionType getBranchDescription() {
        return branchDescription;
    }

    /** 
     * Set the 'BranchDescription' element value. Сведения об обособленном подразделении
     * 
     * @param branchDescription
     */
    public void setBranchDescription(CUBranchDescriptionType branchDescription) {
        this.branchDescription = branchDescription;
    }
}

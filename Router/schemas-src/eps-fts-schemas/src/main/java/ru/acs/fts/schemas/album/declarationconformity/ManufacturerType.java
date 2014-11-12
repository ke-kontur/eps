
package ru.acs.fts.schemas.album.declarationconformity;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUBranchDescriptionType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Сведения о изготовителе
 */
public class ManufacturerType extends OrganizationType
{
    private List<CUBranchDescriptionType> branchList = new ArrayList<CUBranchDescriptionType>();

    /** 
     * Get the list of 'Branch' element items. Филиал
     * 
     * @return list
     */
    public List<CUBranchDescriptionType> getBranchList() {
        return branchList;
    }

    /** 
     * Set the list of 'Branch' element items. Филиал
     * 
     * @param list
     */
    public void setBranchList(List<CUBranchDescriptionType> list) {
        branchList = list;
    }
}

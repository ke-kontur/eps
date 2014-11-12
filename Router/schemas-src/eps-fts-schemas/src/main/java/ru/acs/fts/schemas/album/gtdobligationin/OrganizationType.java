
package ru.acs.fts.schemas.album.gtdobligationin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUBranchDescriptionType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;

/** 
 * Сведения о юр. лице/физ. лице
 */
public class OrganizationType
        extends
            ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType
{
    private IdentityCardType identityCard;
    private List<CUBranchDescriptionType> subdivisionInfoList = new ArrayList<CUBranchDescriptionType>();

    /** 
     * Get the 'IdentityCard' element value. Документ, удостоверяющий личность
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. Документ, удостоверяющий личность
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }

    /** 
     * Get the list of 'SubdivisionInfo' element items. Обособленное подразделение
     * 
     * @return list
     */
    public List<CUBranchDescriptionType> getSubdivisionInfoList() {
        return subdivisionInfoList;
    }

    /** 
     * Set the list of 'SubdivisionInfo' element items. Обособленное подразделение
     * 
     * @param list
     */
    public void setSubdivisionInfoList(List<CUBranchDescriptionType> list) {
        subdivisionInfoList = list;
    }
}

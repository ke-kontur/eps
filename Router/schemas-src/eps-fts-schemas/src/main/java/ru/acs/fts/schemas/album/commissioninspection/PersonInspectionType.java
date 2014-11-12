
package ru.acs.fts.schemas.album.commissioninspection;

import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Ћицо,обладающего полномочи€ми в отношении товаров и (или) транспортных средств.
 */
public class PersonInspectionType extends OrganizationBaseType
{
    private IdentityCardType identityCard;

    /** 
     * Get the 'IdentityCard' element value. ƒокумент, удостовер€ющий личность
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. ƒокумент, удостовер€ющий личность
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }
}

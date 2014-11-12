
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Информация о водителях
 */
public class DriverInformationType extends PersonBaseType
{
    private IdentityCardType identityCard;

    /** 
     * Get the 'IdentityCard' element value. Документ, удостоверяющий личность водителя
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. Документ, удостоверяющий личность водителя
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }
}

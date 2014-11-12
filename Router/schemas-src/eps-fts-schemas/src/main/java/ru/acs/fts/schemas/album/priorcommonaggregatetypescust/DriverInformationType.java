
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ���������� � ���������
 */
public class DriverInformationType extends PersonBaseType
{
    private IdentityCardType identityCard;

    /** 
     * Get the 'IdentityCard' element value. ��������, �������������� �������� ��������
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. ��������, �������������� �������� ��������
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }
}

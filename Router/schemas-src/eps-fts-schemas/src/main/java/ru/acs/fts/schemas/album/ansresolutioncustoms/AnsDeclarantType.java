
package ru.acs.fts.schemas.album.ansresolutioncustoms;

import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * ���������
 */
public class AnsDeclarantType
{
    private IdentityCardType identityCard;
    private OrganizationType infoAnsDeclarant;

    /** 
     * Get the 'IdentityCard' element value. ��������, �������������� ��������
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. ��������, �������������� ��������
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }

    /** 
     * Get the 'InfoAnsDeclarant' element value. �������� � ����������
     * 
     * @return value
     */
    public OrganizationType getInfoAnsDeclarant() {
        return infoAnsDeclarant;
    }

    /** 
     * Set the 'InfoAnsDeclarant' element value. �������� � ����������
     * 
     * @param infoAnsDeclarant
     */
    public void setInfoAnsDeclarant(OrganizationType infoAnsDeclarant) {
        this.infoAnsDeclarant = infoAnsDeclarant;
    }
}


package ru.acs.fts.schemas.album.reqadditionaldocuments;

import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * ���������
 */
public class InfoDeclType
{
    private OrganizationType organization;
    private IdentityCardType identityCard;

    /** 
     * Get the 'Organization' element value. �������� �� �����������./ ��� ����������
     * 
     * @return value
     */
    public OrganizationType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. �������� �� �����������./ ��� ����������
     * 
     * @param organization
     */
    public void setOrganization(OrganizationType organization) {
        this.organization = organization;
    }

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
}

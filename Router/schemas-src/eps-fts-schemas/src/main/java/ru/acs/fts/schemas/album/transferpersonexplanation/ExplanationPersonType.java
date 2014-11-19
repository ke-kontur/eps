
package ru.acs.fts.schemas.album.transferpersonexplanation;

import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ����,  ������ ���������
 */
public class ExplanationPersonType extends PersonBaseType
{
    private String personOrganization;
    private IdentityCardType identityCard;

    /** 
     * Get the 'PersonOrganization' element value. ������������ �����������, �������  ������������ ����
     * 
     * @return value
     */
    public String getPersonOrganization() {
        return personOrganization;
    }

    /** 
     * Set the 'PersonOrganization' element value. ������������ �����������, �������  ������������ ����
     * 
     * @param personOrganization
     */
    public void setPersonOrganization(String personOrganization) {
        this.personOrganization = personOrganization;
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

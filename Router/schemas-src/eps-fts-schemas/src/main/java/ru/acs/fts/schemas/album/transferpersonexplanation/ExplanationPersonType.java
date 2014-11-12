
package ru.acs.fts.schemas.album.transferpersonexplanation;

import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Лицо,  дающее пояснения
 */
public class ExplanationPersonType extends PersonBaseType
{
    private String personOrganization;
    private IdentityCardType identityCard;

    /** 
     * Get the 'PersonOrganization' element value. Наименование организации, которую  представляет лицо
     * 
     * @return value
     */
    public String getPersonOrganization() {
        return personOrganization;
    }

    /** 
     * Set the 'PersonOrganization' element value. Наименование организации, которую  представляет лицо
     * 
     * @param personOrganization
     */
    public void setPersonOrganization(String personOrganization) {
        this.personOrganization = personOrganization;
    }

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
}

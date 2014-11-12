
package ru.acs.fts.schemas.album.rspconfirmationtarget;

import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Участник таможенной процедуры
 */
public class ParticipantType extends OrganizationBaseType
{
    private String status;
    private String address;
    private IdentityCardType identityCard;

    /** 
     * Get the 'Status' element value. Статус: 1 - юридическое лицо, 2 - индивидуальный предприниматель
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. Статус: 1 - юридическое лицо, 2 - индивидуальный предприниматель
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'Address' element value. Адрес
     * 
     * @return value
     */
    public String getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
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

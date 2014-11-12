
package ru.acs.fts.schemas.album.piint_transitinformation;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Грузополучатель
 */
public class ConsigneeType extends OrganizationBaseType
{
    private String ITN;
    private IdentityCardType identityCard;
    private AddressType address;

    /** 
     * Get the 'ITN' element value. ИТН
     * 
     * @return value
     */
    public String getITN() {
        return ITN;
    }

    /** 
     * Set the 'ITN' element value. ИТН
     * 
     * @param ITN
     */
    public void setITN(String ITN) {
        this.ITN = ITN;
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

    /** 
     * Get the 'Address' element value. Адрес организации / физического лица
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес организации / физического лица
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}

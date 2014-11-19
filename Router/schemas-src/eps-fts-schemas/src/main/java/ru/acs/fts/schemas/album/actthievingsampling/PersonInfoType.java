
package ru.acs.fts.schemas.album.actthievingsampling;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Сведения о лице
 */
public class PersonInfoType extends PersonSignatureType
{
    private AddressType addressWitness;
    private OrganizationBaseType placeEmployment;
    private IdentityCardType identityCard;

    /** 
     * Get the 'AddressWitness' element value. Домашний адрес
     * 
     * @return value
     */
    public AddressType getAddressWitness() {
        return addressWitness;
    }

    /** 
     * Set the 'AddressWitness' element value. Домашний адрес
     * 
     * @param addressWitness
     */
    public void setAddressWitness(AddressType addressWitness) {
        this.addressWitness = addressWitness;
    }

    /** 
     * Get the 'PlaceEmployment' element value. Место работы 
     * 
     * @return value
     */
    public OrganizationBaseType getPlaceEmployment() {
        return placeEmployment;
    }

    /** 
     * Set the 'PlaceEmployment' element value. Место работы 
     * 
     * @param placeEmployment
     */
    public void setPlaceEmployment(OrganizationBaseType placeEmployment) {
        this.placeEmployment = placeEmployment;
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

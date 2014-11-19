
package ru.acs.fts.schemas.album.actthievingsampling;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * �������� � ����
 */
public class PersonInfoType extends PersonSignatureType
{
    private AddressType addressWitness;
    private OrganizationBaseType placeEmployment;
    private IdentityCardType identityCard;

    /** 
     * Get the 'AddressWitness' element value. �������� �����
     * 
     * @return value
     */
    public AddressType getAddressWitness() {
        return addressWitness;
    }

    /** 
     * Set the 'AddressWitness' element value. �������� �����
     * 
     * @param addressWitness
     */
    public void setAddressWitness(AddressType addressWitness) {
        this.addressWitness = addressWitness;
    }

    /** 
     * Get the 'PlaceEmployment' element value. ����� ������ 
     * 
     * @return value
     */
    public OrganizationBaseType getPlaceEmployment() {
        return placeEmployment;
    }

    /** 
     * Set the 'PlaceEmployment' element value. ����� ������ 
     * 
     * @param placeEmployment
     */
    public void setPlaceEmployment(OrganizationBaseType placeEmployment) {
        this.placeEmployment = placeEmployment;
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

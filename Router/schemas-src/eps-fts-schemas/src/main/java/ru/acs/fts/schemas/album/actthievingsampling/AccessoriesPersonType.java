
package ru.acs.fts.schemas.album.actthievingsampling;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Лицо, обладающее полномочиями в отношении товаров.
 */
public class AccessoriesPersonType extends PersonSignatureType
{
    private String yearBirth;
    private String birthPlace;
    private IdentityCardType identityCard;
    private AddressType address;

    /** 
     * Get the 'YearBirth' element value. Год рождения
     * 
     * @return value
     */
    public String getYearBirth() {
        return yearBirth;
    }

    /** 
     * Set the 'YearBirth' element value. Год рождения
     * 
     * @param yearBirth
     */
    public void setYearBirth(String yearBirth) {
        this.yearBirth = yearBirth;
    }

    /** 
     * Get the 'BirthPlace' element value. Место рождения
     * 
     * @return value
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /** 
     * Set the 'BirthPlace' element value. Место рождения
     * 
     * @param birthPlace
     */
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
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
     * Get the 'Address' element value. Домашний адрес
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Домашний адрес
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}

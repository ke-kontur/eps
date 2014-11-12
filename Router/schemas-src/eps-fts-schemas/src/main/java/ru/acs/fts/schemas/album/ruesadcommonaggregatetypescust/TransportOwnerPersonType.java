
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;

/** 
 * Владелец транспортного средства - физическое лицо.
 */
public class TransportOwnerPersonType
{
    private String firstName;
    private String lastname;
    private String patronymicname;
    private IdentityCardType identityCard;
    private AddressType address;

    /** 
     * Get the 'FirstName' element value. Имя
     * 
     * @return value
     */
    public String getFirstName() {
        return firstName;
    }

    /** 
     * Set the 'FirstName' element value. Имя
     * 
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** 
     * Get the 'Lastname' element value. Фамилия
     * 
     * @return value
     */
    public String getLastname() {
        return lastname;
    }

    /** 
     * Set the 'Lastname' element value. Фамилия
     * 
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /** 
     * Get the 'Patronymicname' element value. Отчество
     * 
     * @return value
     */
    public String getPatronymicname() {
        return patronymicname;
    }

    /** 
     * Set the 'Patronymicname' element value. Отчество
     * 
     * @param patronymicname
     */
    public void setPatronymicname(String patronymicname) {
        this.patronymicname = patronymicname;
    }

    /** 
     * Get the 'IdentityCard' element value. Документ, удостоверяющий личность.
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. Документ, удостоверяющий личность.
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }

    /** 
     * Get the 'Address' element value. Адрес.
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес.
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}

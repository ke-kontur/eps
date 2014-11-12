
package ru.acs.fts.schemas.album.waybillexpressindividual;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Отправитель 
 */
public class SenderType
{
    private String account;
    private String notes;
    private OrganizationBaseType organisation;
    private AddressType address;
    private PersonSignatureType signature;

    /** 
     * Get the 'Account' element value. Номер счёта 
     * 
     * @return value
     */
    public String getAccount() {
        return account;
    }

    /** 
     * Set the 'Account' element value. Номер счёта 
     * 
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /** 
     * Get the 'Notes' element value. Особые отметки 
     * 
     * @return value
     */
    public String getNotes() {
        return notes;
    }

    /** 
     * Set the 'Notes' element value. Особые отметки 
     * 
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /** 
     * Get the 'Organisation' element value. Реквизиты организации.
     * 
     * @return value
     */
    public OrganizationBaseType getOrganisation() {
        return organisation;
    }

    /** 
     * Set the 'Organisation' element value. Реквизиты организации.
     * 
     * @param organisation
     */
    public void setOrganisation(OrganizationBaseType organisation) {
        this.organisation = organisation;
    }

    /** 
     * Get the 'Address' element value. Адрес 
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес 
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }

    /** 
     * Get the 'Signature' element value. Подпись уполномоченного лица отправителя 
     * 
     * @return value
     */
    public PersonSignatureType getSignature() {
        return signature;
    }

    /** 
     * Set the 'Signature' element value. Подпись уполномоченного лица отправителя 
     * 
     * @param signature
     */
    public void setSignature(PersonSignatureType signature) {
        this.signature = signature;
    }
}

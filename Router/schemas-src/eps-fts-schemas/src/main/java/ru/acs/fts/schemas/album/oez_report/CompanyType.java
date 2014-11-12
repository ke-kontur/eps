
package ru.acs.fts.schemas.album.oez_report;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Сведения о лице или об организации
 */
public class CompanyType
{
    private String residentLicenseNumber;
    private OrganizationBaseType organisation;
    private AddressType address;
    private IdentityCardType identityCard;

    /** 
     * Get the 'ResidentLicenseNumber' element value. Номер свидетельства о регистрации резидента ОЭЗ
     * 
     * @return value
     */
    public String getResidentLicenseNumber() {
        return residentLicenseNumber;
    }

    /** 
     * Set the 'ResidentLicenseNumber' element value. Номер свидетельства о регистрации резидента ОЭЗ
     * 
     * @param residentLicenseNumber
     */
    public void setResidentLicenseNumber(String residentLicenseNumber) {
        this.residentLicenseNumber = residentLicenseNumber;
    }

    /** 
     * Get the 'Organisation' element value. Реквизиты организации
     * 
     * @return value
     */
    public OrganizationBaseType getOrganisation() {
        return organisation;
    }

    /** 
     * Set the 'Organisation' element value. Реквизиты организации
     * 
     * @param organisation
     */
    public void setOrganisation(OrganizationBaseType organisation) {
        this.organisation = organisation;
    }

    /** 
     * Get the 'Address' element value. Адрес организации
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес организации
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
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

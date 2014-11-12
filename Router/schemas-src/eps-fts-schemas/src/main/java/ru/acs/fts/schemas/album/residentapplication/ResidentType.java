
package ru.acs.fts.schemas.album.residentapplication;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Сведения о резиденте ОЭЗ 
 */
public class ResidentType
{
    private OrganizationBaseType organisation;
    private IdentityCardType identityCard;
    private DocumentBaseType licenseNumber;
    private AddressType address;

    /** 
     * Get the 'Organisation' element value.
     * 
     * @return value
     */
    public OrganizationBaseType getOrganisation() {
        return organisation;
    }

    /** 
     * Set the 'Organisation' element value.
     * 
     * @param organisation
     */
    public void setOrganisation(OrganizationBaseType organisation) {
        this.organisation = organisation;
    }

    /** 
     * Get the 'IdentityCard' element value. Паспорт резидента ОЭЗ 
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. Паспорт резидента ОЭЗ 
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }

    /** 
     * Get the 'LicenseNumber' element value. Свидетельство, удостоверяющее регистрацию лица в качестве резидента ОЭЗ 
     * 
     * @return value
     */
    public DocumentBaseType getLicenseNumber() {
        return licenseNumber;
    }

    /** 
     * Set the 'LicenseNumber' element value. Свидетельство, удостоверяющее регистрацию лица в качестве резидента ОЭЗ 
     * 
     * @param licenseNumber
     */
    public void setLicenseNumber(DocumentBaseType licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    /** 
     * Get the 'Address' element value. Адрес резидента ОЭЗ 
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес резидента ОЭЗ 
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}

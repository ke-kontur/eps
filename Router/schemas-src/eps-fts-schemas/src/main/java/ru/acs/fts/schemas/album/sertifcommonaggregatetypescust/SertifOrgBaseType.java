
package ru.acs.fts.schemas.album.sertifcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Базовый класс  для указания организации в сертификате
 */
public class SertifOrgBaseType extends OrganizationBaseType
{
    private String phone;
    private String fax;
    private String email;
    private AddressType legalAddress;
    private AddressType factAddress;

    /** 
     * Get the 'Phone' element value. Телефон
     * 
     * @return value
     */
    public String getPhone() {
        return phone;
    }

    /** 
     * Set the 'Phone' element value. Телефон
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /** 
     * Get the 'Fax' element value. Телефон/факс
     * 
     * @return value
     */
    public String getFax() {
        return fax;
    }

    /** 
     * Set the 'Fax' element value. Телефон/факс
     * 
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /** 
     * Get the 'Email' element value. Электронная почта
     * 
     * @return value
     */
    public String getEmail() {
        return email;
    }

    /** 
     * Set the 'Email' element value. Электронная почта
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /** 
     * Get the 'LegalAddress' element value. Юридический адрес.
     * 
     * @return value
     */
    public AddressType getLegalAddress() {
        return legalAddress;
    }

    /** 
     * Set the 'LegalAddress' element value. Юридический адрес.
     * 
     * @param legalAddress
     */
    public void setLegalAddress(AddressType legalAddress) {
        this.legalAddress = legalAddress;
    }

    /** 
     * Get the 'FactAddress' element value. Фактический адрес
     * 
     * @return value
     */
    public AddressType getFactAddress() {
        return factAddress;
    }

    /** 
     * Set the 'FactAddress' element value. Фактический адрес
     * 
     * @param factAddress
     */
    public void setFactAddress(AddressType factAddress) {
        this.factAddress = factAddress;
    }
}

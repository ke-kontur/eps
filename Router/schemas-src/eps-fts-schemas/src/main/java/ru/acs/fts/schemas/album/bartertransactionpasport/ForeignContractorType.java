
package ru.acs.fts.schemas.album.bartertransactionpasport;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Реквизиты иностранного контрагента
 */
public class ForeignContractorType
{
    private String name;
    private String countryCode;
    private AddressType legalAddress;

    /** 
     * Get the 'Name' element value. Наименование иностранного контрагента
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование иностранного контрагента
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'CountryCode' element value. Код страны регистрации контрагента
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Код страны регистрации контрагента
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'LegalAddress' element value. Юридический адрес
     * 
     * @return value
     */
    public AddressType getLegalAddress() {
        return legalAddress;
    }

    /** 
     * Set the 'LegalAddress' element value. Юридический адрес
     * 
     * @param legalAddress
     */
    public void setLegalAddress(AddressType legalAddress) {
        this.legalAddress = legalAddress;
    }
}

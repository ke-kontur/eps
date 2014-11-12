
package ru.acs.fts.schemas.album.automobileinsurancepolicy;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;

/** 
 * Сведения о страхователе
 */
public class InsurerType
{
    private String name;
    private String countryCode;
    private String phone;
    private String naturalPersonIndicator;
    private AddressType postalAddress;
    private IdentityCardType identityCard;

    /** 
     * Get the 'Name' element value. ФИО физического лица/Наименование организации
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ФИО физического лица/Наименование организации
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'CountryCode' element value. Гражданство физического лица или страна регистрации организации
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Гражданство физического лица или страна регистрации организации
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

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
     * Get the 'NaturalPersonIndicator' element value. Индикатор типа страхователя, заполняется в случае, если страхователь - физическое лицо
     * 
     * @return value
     */
    public String getNaturalPersonIndicator() {
        return naturalPersonIndicator;
    }

    /** 
     * Set the 'NaturalPersonIndicator' element value. Индикатор типа страхователя, заполняется в случае, если страхователь - физическое лицо
     * 
     * @param naturalPersonIndicator
     */
    public void setNaturalPersonIndicator(String naturalPersonIndicator) {
        this.naturalPersonIndicator = naturalPersonIndicator;
    }

    /** 
     * Get the 'PostalAddress' element value. Описание почтового адреса страхователя
     * 
     * @return value
     */
    public AddressType getPostalAddress() {
        return postalAddress;
    }

    /** 
     * Set the 'PostalAddress' element value. Описание почтового адреса страхователя
     * 
     * @param postalAddress
     */
    public void setPostalAddress(AddressType postalAddress) {
        this.postalAddress = postalAddress;
    }

    /** 
     * Get the 'IdentityCard' element value. Сведения документа удостоверяющего личность 
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. Сведения документа удостоверяющего личность 
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }
}

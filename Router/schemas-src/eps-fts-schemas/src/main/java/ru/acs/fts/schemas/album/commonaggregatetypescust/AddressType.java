
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * Адрес организации / физического лица
 */
public class AddressType
{
    private String postalCode;
    private String countryCode;
    private String counryName;
    private String region;
    private String city;
    private String streetHouse;

    /** 
     * Get the 'PostalCode' element value. Почтовый индекс
     * 
     * @return value
     */
    public String getPostalCode() {
        return postalCode;
    }

    /** 
     * Set the 'PostalCode' element value. Почтовый индекс
     * 
     * @param postalCode
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /** 
     * Get the 'CountryCode' element value. Буквенный код страны в соответствии с классификатором стран мира
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Буквенный код страны в соответствии с классификатором стран мира
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'CounryName' element value. Краткое название страны в соответствии с классификатором стран мира
     * 
     * @return value
     */
    public String getCounryName() {
        return counryName;
    }

    /** 
     * Set the 'CounryName' element value. Краткое название страны в соответствии с классификатором стран мира
     * 
     * @param counryName
     */
    public void setCounryName(String counryName) {
        this.counryName = counryName;
    }

    /** 
     * Get the 'Region' element value. Область (регион, штат, провинция и т.п.)
     * 
     * @return value
     */
    public String getRegion() {
        return region;
    }

    /** 
     * Set the 'Region' element value. Область (регион, штат, провинция и т.п.)
     * 
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /** 
     * Get the 'City' element value. Населенный пункт
     * 
     * @return value
     */
    public String getCity() {
        return city;
    }

    /** 
     * Set the 'City' element value. Населенный пункт
     * 
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /** 
     * Get the 'StreetHouse' element value. Улица, номер дома, номер офиса
     * 
     * @return value
     */
    public String getStreetHouse() {
        return streetHouse;
    }

    /** 
     * Set the 'StreetHouse' element value. Улица, номер дома, номер офиса
     * 
     * @param streetHouse
     */
    public void setStreetHouse(String streetHouse) {
        this.streetHouse = streetHouse;
    }
}

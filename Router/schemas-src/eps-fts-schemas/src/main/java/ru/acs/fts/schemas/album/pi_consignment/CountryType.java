
package ru.acs.fts.schemas.album.pi_consignment;

/** 
 * Страна
 */
public class CountryType
{
    private String countryCode;
    private String countryName;

    /** 
     * Get the 'CountryCode' element value. Буквенный код страны по классификатору стран мира / 00 (неизвестна)
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Буквенный код страны по классификатору стран мира / 00 (неизвестна)
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'CountryName' element value. Краткое название страны
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. Краткое название страны
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}

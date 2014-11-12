
package ru.acs.fts.schemas.album.staticform;

/** 
 * Сведения о стране
 */
public class CountryInfoType
{
    private String countryName;
    private String countryCode;

    /** 
     * Get the 'CountryName' element value. Наименование страны
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. Наименование страны
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /** 
     * Get the 'CountryCode' element value. Код страны в соответствии с классификатором
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Код страны в соответствии с классификатором
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}

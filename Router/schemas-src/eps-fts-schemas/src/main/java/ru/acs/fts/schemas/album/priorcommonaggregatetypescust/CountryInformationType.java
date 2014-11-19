
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

/** 
 * Сведения о стране
 */
public class CountryInformationType
{
    private String countryName;
    private String countryACode;

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
     * Get the 'CountryACode' element value. Буквенный код страны
     * 
     * @return value
     */
    public String getCountryACode() {
        return countryACode;
    }

    /** 
     * Set the 'CountryACode' element value. Буквенный код страны
     * 
     * @param countryACode
     */
    public void setCountryACode(String countryACode) {
        this.countryACode = countryACode;
    }
}

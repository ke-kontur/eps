
package ru.acs.fts.schemas.album.sertifaform;

/** 
 * Государство грузополучателя
 */
public class ConsigneeCountryType
{
    private String countryCode;

    /** 
     * Get the 'CountryCode' element value. Код страны
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Код страны
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}

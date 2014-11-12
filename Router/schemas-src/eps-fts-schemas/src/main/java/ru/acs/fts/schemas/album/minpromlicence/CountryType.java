
package ru.acs.fts.schemas.album.minpromlicence;

/** 
 * Информация о стране
 */
public class CountryType
{
    private String countryName;
    private String countryAlpha2;

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
     * Get the 'CountryAlpha2' element value. Код альфа-2 страны
     * 
     * @return value
     */
    public String getCountryAlpha2() {
        return countryAlpha2;
    }

    /** 
     * Set the 'CountryAlpha2' element value. Код альфа-2 страны
     * 
     * @param countryAlpha2
     */
    public void setCountryAlpha2(String countryAlpha2) {
        this.countryAlpha2 = countryAlpha2;
    }
}

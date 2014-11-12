
package ru.acs.fts.schemas.album.resulttk;

/** 
 * Код страны, код региона, наименование пункта
 */
public class CountryRegionType
{
    private String countryCode;
    private String regionCode;
    private String placeName;

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

    /** 
     * Get the 'RegionCode' element value. Код региона
     * 
     * @return value
     */
    public String getRegionCode() {
        return regionCode;
    }

    /** 
     * Set the 'RegionCode' element value. Код региона
     * 
     * @param regionCode
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    /** 
     * Get the 'PlaceName' element value. Наименование пункта
     * 
     * @return value
     */
    public String getPlaceName() {
        return placeName;
    }

    /** 
     * Set the 'PlaceName' element value. Наименование пункта
     * 
     * @param placeName
     */
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
}

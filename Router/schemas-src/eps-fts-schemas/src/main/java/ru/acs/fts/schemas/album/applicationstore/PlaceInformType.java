
package ru.acs.fts.schemas.album.applicationstore;

/** 
 * Сведения о месте назначения
 */
public class PlaceInformType
{
    private String placeName;
    private String countryName;
    private String countryCode;
    private String airlineIATACode;

    /** 
     * Get the 'PlaceName' element value. Наименование порта/аэропорта/станции
     * 
     * @return value
     */
    public String getPlaceName() {
        return placeName;
    }

    /** 
     * Set the 'PlaceName' element value. Наименование порта/аэропорта/станции
     * 
     * @param placeName
     */
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    /** 
     * Get the 'CountryName' element value. Страна назначения (название) 
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. Страна назначения (название) 
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /** 
     * Get the 'CountryCode' element value. Страна назначения (код)
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Страна назначения (код)
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'AirlineIATACode' element value. Код ИАТА аэропорта назначения
     * 
     * @return value
     */
    public String getAirlineIATACode() {
        return airlineIATACode;
    }

    /** 
     * Set the 'AirlineIATACode' element value. Код ИАТА аэропорта назначения
     * 
     * @param airlineIATACode
     */
    public void setAirlineIATACode(String airlineIATACode) {
        this.airlineIATACode = airlineIATACode;
    }
}

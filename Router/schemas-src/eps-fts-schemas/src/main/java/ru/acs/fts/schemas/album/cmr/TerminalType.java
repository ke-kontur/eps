
package ru.acs.fts.schemas.album.cmr;

/** 
 * Наименование и местоположение склада / терминала
 */
public class TerminalType
{
    private String terminalName;
    private String placeName;
    private String countryName;
    private String countryCode;

    /** 
     * Get the 'TerminalName' element value. Наименование склада
     * 
     * @return value
     */
    public String getTerminalName() {
        return terminalName;
    }

    /** 
     * Set the 'TerminalName' element value. Наименование склада
     * 
     * @param terminalName
     */
    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    /** 
     * Get the 'PlaceName' element value. Местонахождение склада
     * 
     * @return value
     */
    public String getPlaceName() {
        return placeName;
    }

    /** 
     * Set the 'PlaceName' element value. Местонахождение склада
     * 
     * @param placeName
     */
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    /** 
     * Get the 'CountryName' element value. Страна
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. Страна
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /** 
     * Get the 'CountryCode' element value. Буквенный код страны
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Буквенный код страны
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}


package ru.acs.fts.schemas.album.actquarantinefitosancontrol;

/** 
 * Сведения о прибытии и происхождении груза
 */
public class ArrivalOriginInfoType
{
    private String countryName;
    private String regionName;

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
     * Get the 'RegionName' element value. Наименование региона
     * 
     * @return value
     */
    public String getRegionName() {
        return regionName;
    }

    /** 
     * Set the 'RegionName' element value. Наименование региона
     * 
     * @param regionName
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
}

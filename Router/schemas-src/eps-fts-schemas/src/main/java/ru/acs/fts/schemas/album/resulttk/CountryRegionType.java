
package ru.acs.fts.schemas.album.resulttk;

/** 
 * ��� ������, ��� �������, ������������ ������
 */
public class CountryRegionType
{
    private String countryCode;
    private String regionCode;
    private String placeName;

    /** 
     * Get the 'CountryCode' element value. ��� ������
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. ��� ������
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'RegionCode' element value. ��� �������
     * 
     * @return value
     */
    public String getRegionCode() {
        return regionCode;
    }

    /** 
     * Set the 'RegionCode' element value. ��� �������
     * 
     * @param regionCode
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    /** 
     * Get the 'PlaceName' element value. ������������ ������
     * 
     * @return value
     */
    public String getPlaceName() {
        return placeName;
    }

    /** 
     * Set the 'PlaceName' element value. ������������ ������
     * 
     * @param placeName
     */
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
}

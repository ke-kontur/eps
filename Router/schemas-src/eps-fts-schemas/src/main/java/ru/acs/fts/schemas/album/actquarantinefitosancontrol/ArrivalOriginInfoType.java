
package ru.acs.fts.schemas.album.actquarantinefitosancontrol;

/** 
 * �������� � �������� � ������������� �����
 */
public class ArrivalOriginInfoType
{
    private String countryName;
    private String regionName;

    /** 
     * Get the 'CountryName' element value. ������������ ������
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. ������������ ������
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /** 
     * Get the 'RegionName' element value. ������������ �������
     * 
     * @return value
     */
    public String getRegionName() {
        return regionName;
    }

    /** 
     * Set the 'RegionName' element value. ������������ �������
     * 
     * @param regionName
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
}

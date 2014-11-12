
package ru.acs.fts.schemas.album.resulttk;

/** 
 * Пост (пункт пропуска), где осуществлялся транспортный контроль
 */
public class CheckPointType
{
    private String checkPointCode;
    private String checkPointName;
    private String countryCode;

    /** 
     * Get the 'CheckPointCode' element value. Код поста (пункта пропуска)
     * 
     * @return value
     */
    public String getCheckPointCode() {
        return checkPointCode;
    }

    /** 
     * Set the 'CheckPointCode' element value. Код поста (пункта пропуска)
     * 
     * @param checkPointCode
     */
    public void setCheckPointCode(String checkPointCode) {
        this.checkPointCode = checkPointCode;
    }

    /** 
     * Get the 'CheckPointName' element value. Наименование поста (пункта пропуска)
     * 
     * @return value
     */
    public String getCheckPointName() {
        return checkPointName;
    }

    /** 
     * Set the 'CheckPointName' element value. Наименование поста (пункта пропуска)
     * 
     * @param checkPointName
     */
    public void setCheckPointName(String checkPointName) {
        this.checkPointName = checkPointName;
    }

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

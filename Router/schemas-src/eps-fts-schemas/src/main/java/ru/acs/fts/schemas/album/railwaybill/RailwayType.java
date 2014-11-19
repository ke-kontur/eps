
package ru.acs.fts.schemas.album.railwaybill;

/** 
 * Сведения о железной дороге
 */
public class RailwayType
{
    private String railwayCode;
    private String stationCode;
    private String railwayAndStationName;

    /** 
     * Get the 'RailwayCode' element value. Код железнодорожной дороги 
     * 
     * @return value
     */
    public String getRailwayCode() {
        return railwayCode;
    }

    /** 
     * Set the 'RailwayCode' element value. Код железнодорожной дороги 
     * 
     * @param railwayCode
     */
    public void setRailwayCode(String railwayCode) {
        this.railwayCode = railwayCode;
    }

    /** 
     * Get the 'StationCode' element value. Код железнодорожной станции
     * 
     * @return value
     */
    public String getStationCode() {
        return stationCode;
    }

    /** 
     * Set the 'StationCode' element value. Код железнодорожной станции
     * 
     * @param stationCode
     */
    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    /** 
     * Get the 'RailwayAndStationName' element value. Наименование дороги и станции назначения
     * 
     * @return value
     */
    public String getRailwayAndStationName() {
        return railwayAndStationName;
    }

    /** 
     * Set the 'RailwayAndStationName' element value. Наименование дороги и станции назначения
     * 
     * @param railwayAndStationName
     */
    public void setRailwayAndStationName(String railwayAndStationName) {
        this.railwayAndStationName = railwayAndStationName;
    }
}

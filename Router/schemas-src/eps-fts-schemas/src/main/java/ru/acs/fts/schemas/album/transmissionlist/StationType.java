
package ru.acs.fts.schemas.album.transmissionlist;

/** 
 * Сведения о железнодорожной станции и дороги
 */
public class StationType
{
    private String stationCode;
    private String stationName;
    private String railwayCode;

    /** 
     * Get the 'StationCode' element value. Код железнодорожной станции, указывается при перевозке  грузов из/в КНДР 
     * 
     * @return value
     */
    public String getStationCode() {
        return stationCode;
    }

    /** 
     * Set the 'StationCode' element value. Код железнодорожной станции, указывается при перевозке  грузов из/в КНДР 
     * 
     * @param stationCode
     */
    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    /** 
     * Get the 'StationName' element value. Тарифное наименование станции
     * 
     * @return value
     */
    public String getStationName() {
        return stationName;
    }

    /** 
     * Set the 'StationName' element value. Тарифное наименование станции
     * 
     * @param stationName
     */
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

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
}

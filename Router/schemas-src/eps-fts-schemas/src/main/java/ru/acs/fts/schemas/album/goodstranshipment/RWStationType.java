
package ru.acs.fts.schemas.album.goodstranshipment;

/** 
 * ЖД станция на которой предполагаются грузовые операции
 */
public class RWStationType
{
    private String stationCode;
    private String stationName;
    private String railwayCode;

    /** 
     * Get the 'StationCode' element value. Код станции
     * 
     * @return value
     */
    public String getStationCode() {
        return stationCode;
    }

    /** 
     * Set the 'StationCode' element value. Код станции
     * 
     * @param stationCode
     */
    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    /** 
     * Get the 'StationName' element value. Наименование станции
     * 
     * @return value
     */
    public String getStationName() {
        return stationName;
    }

    /** 
     * Set the 'StationName' element value. Наименование станции
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

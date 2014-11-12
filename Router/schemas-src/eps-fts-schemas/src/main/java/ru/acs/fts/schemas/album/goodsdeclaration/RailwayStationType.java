
package ru.acs.fts.schemas.album.goodsdeclaration;

/** 
 * Сведения о ж.д. станции
 */
public class RailwayStationType
{
    private String railwayStationName;
    private String railwayStationCode;
    private String railwayCode;

    /** 
     * Get the 'RailwayStationName' element value. Наименование станции
     * 
     * @return value
     */
    public String getRailwayStationName() {
        return railwayStationName;
    }

    /** 
     * Set the 'RailwayStationName' element value. Наименование станции
     * 
     * @param railwayStationName
     */
    public void setRailwayStationName(String railwayStationName) {
        this.railwayStationName = railwayStationName;
    }

    /** 
     * Get the 'RailwayStationCode' element value. Код станции
     * 
     * @return value
     */
    public String getRailwayStationCode() {
        return railwayStationCode;
    }

    /** 
     * Set the 'RailwayStationCode' element value. Код станции
     * 
     * @param railwayStationCode
     */
    public void setRailwayStationCode(String railwayStationCode) {
        this.railwayStationCode = railwayStationCode;
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

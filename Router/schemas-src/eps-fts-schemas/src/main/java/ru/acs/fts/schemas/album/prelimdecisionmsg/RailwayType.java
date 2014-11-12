
package ru.acs.fts.schemas.album.prelimdecisionmsg;

/** 
 * Сведения о железной дороге
 */
public class RailwayType
{
    private String railwayCode;
    private String stationCode;
    private String railwayAndStationName;
    private String trainIndex;
    private String trainNumber;

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

    /** 
     * Get the 'TrainIndex' element value. Индекс поезда
     * 
     * @return value
     */
    public String getTrainIndex() {
        return trainIndex;
    }

    /** 
     * Set the 'TrainIndex' element value. Индекс поезда
     * 
     * @param trainIndex
     */
    public void setTrainIndex(String trainIndex) {
        this.trainIndex = trainIndex;
    }

    /** 
     * Get the 'TrainNumber' element value. Номер поезда
     * 
     * @return value
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /** 
     * Set the 'TrainNumber' element value. Номер поезда
     * 
     * @param trainNumber
     */
    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }
}

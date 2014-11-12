
package ru.acs.fts.schemas.album.prelimdecisionmsg;

/** 
 * �������� � �������� ������
 */
public class RailwayType
{
    private String railwayCode;
    private String stationCode;
    private String railwayAndStationName;
    private String trainIndex;
    private String trainNumber;

    /** 
     * Get the 'RailwayCode' element value. ��� ��������������� ������ 
     * 
     * @return value
     */
    public String getRailwayCode() {
        return railwayCode;
    }

    /** 
     * Set the 'RailwayCode' element value. ��� ��������������� ������ 
     * 
     * @param railwayCode
     */
    public void setRailwayCode(String railwayCode) {
        this.railwayCode = railwayCode;
    }

    /** 
     * Get the 'StationCode' element value. ��� ��������������� �������
     * 
     * @return value
     */
    public String getStationCode() {
        return stationCode;
    }

    /** 
     * Set the 'StationCode' element value. ��� ��������������� �������
     * 
     * @param stationCode
     */
    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    /** 
     * Get the 'RailwayAndStationName' element value. ������������ ������ � ������� ����������
     * 
     * @return value
     */
    public String getRailwayAndStationName() {
        return railwayAndStationName;
    }

    /** 
     * Set the 'RailwayAndStationName' element value. ������������ ������ � ������� ����������
     * 
     * @param railwayAndStationName
     */
    public void setRailwayAndStationName(String railwayAndStationName) {
        this.railwayAndStationName = railwayAndStationName;
    }

    /** 
     * Get the 'TrainIndex' element value. ������ ������
     * 
     * @return value
     */
    public String getTrainIndex() {
        return trainIndex;
    }

    /** 
     * Set the 'TrainIndex' element value. ������ ������
     * 
     * @param trainIndex
     */
    public void setTrainIndex(String trainIndex) {
        this.trainIndex = trainIndex;
    }

    /** 
     * Get the 'TrainNumber' element value. ����� ������
     * 
     * @return value
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /** 
     * Set the 'TrainNumber' element value. ����� ������
     * 
     * @param trainNumber
     */
    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }
}

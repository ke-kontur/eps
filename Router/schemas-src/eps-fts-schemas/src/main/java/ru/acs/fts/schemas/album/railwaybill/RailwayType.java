
package ru.acs.fts.schemas.album.railwaybill;

/** 
 * �������� � �������� ������
 */
public class RailwayType
{
    private String railwayCode;
    private String stationCode;
    private String railwayAndStationName;

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
}

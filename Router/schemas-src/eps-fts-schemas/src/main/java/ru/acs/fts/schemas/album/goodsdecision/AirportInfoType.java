
package ru.acs.fts.schemas.album.goodsdecision;

/** 
 * �������� �� ���������
 */
public class AirportInfoType
{
    private String airportName;
    private String IATACode;

    /** 
     * Get the 'AirportName' element value. �������� ���������
     * 
     * @return value
     */
    public String getAirportName() {
        return airportName;
    }

    /** 
     * Set the 'AirportName' element value. �������� ���������
     * 
     * @param airportName
     */
    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    /** 
     * Get the 'IATACode' element value. ��� ����
     * 
     * @return value
     */
    public String getIATACode() {
        return IATACode;
    }

    /** 
     * Set the 'IATACode' element value. ��� ����
     * 
     * @param IATACode
     */
    public void setIATACode(String IATACode) {
        this.IATACode = IATACode;
    }
}

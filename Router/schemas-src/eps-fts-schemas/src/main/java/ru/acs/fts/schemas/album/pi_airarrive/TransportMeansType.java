
package ru.acs.fts.schemas.album.pi_airarrive;

/** 
 * �������� � ������������ ��������
 */
public class TransportMeansType
{
    private String airModification;
    private String airClass;
    private String airRegNumber;
    private String airNationalityCode;
    private String airOwerInfo;
    private String flightNumber;

    /** 
     * Get the 'AirModification' element value. ������������ � ����������� ���������� �����
     * 
     * @return value
     */
    public String getAirModification() {
        return airModification;
    }

    /** 
     * Set the 'AirModification' element value. ������������ � ����������� ���������� �����
     * 
     * @param airModification
     */
    public void setAirModification(String airModification) {
        this.airModification = airModification;
    }

    /** 
     * Get the 'AirClass' element value. ��������� ���������� �����: 1- ��(��������-������������) 2 - ��(��������-��������) 3 - �� (��������-�����������������)
     * 
     * @return value
     */
    public String getAirClass() {
        return airClass;
    }

    /** 
     * Set the 'AirClass' element value. ��������� ���������� �����: 1- ��(��������-������������) 2 - ��(��������-��������) 3 - �� (��������-�����������������)
     * 
     * @param airClass
     */
    public void setAirClass(String airClass) {
        this.airClass = airClass;
    }

    /** 
     * Get the 'AirRegNumber' element value. ��������������� ����� ���������� ����� (����� ����� ��� ��������)
     * 
     * @return value
     */
    public String getAirRegNumber() {
        return airRegNumber;
    }

    /** 
     * Set the 'AirRegNumber' element value. ��������������� ����� ���������� ����� (����� ����� ��� ��������)
     * 
     * @param airRegNumber
     */
    public void setAirRegNumber(String airRegNumber) {
        this.airRegNumber = airRegNumber;
    }

    /** 
     * Get the 'AirNationalityCode' element value. ��� ������ �������������� ����������
     * 
     * @return value
     */
    public String getAirNationalityCode() {
        return airNationalityCode;
    }

    /** 
     * Set the 'AirNationalityCode' element value. ��� ������ �������������� ����������
     * 
     * @param airNationalityCode
     */
    public void setAirNationalityCode(String airNationalityCode) {
        this.airNationalityCode = airNationalityCode;
    }

    /** 
     * Get the 'AirOwerInfo' element value. �������� � ��������� ���������� �����
     * 
     * @return value
     */
    public String getAirOwerInfo() {
        return airOwerInfo;
    }

    /** 
     * Set the 'AirOwerInfo' element value. �������� � ��������� ���������� �����
     * 
     * @param airOwerInfo
     */
    public void setAirOwerInfo(String airOwerInfo) {
        this.airOwerInfo = airOwerInfo;
    }

    /** 
     * Get the 'FlightNumber' element value. ����� �����
     * 
     * @return value
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'FlightNumber' element value. ����� �����
     * 
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}

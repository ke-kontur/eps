
package ru.acs.fts.schemas.album.applicationstore;

/** 
 * �������� � ������������ ��������
 */
public class TransportMeansType
{
    private String transportName;
    private String flightNumber;
    private String countryRegTrans;
    private String codeCountryRegTrans;
    private String transportType;

    /** 
     * Get the 'TransportName' element value. �������� �������� �����/�������� ����� ���������� �����/����� ������.
     * 
     * @return value
     */
    public String getTransportName() {
        return transportName;
    }

    /** 
     * Set the 'TransportName' element value. �������� �������� �����/�������� ����� ���������� �����/����� ������.
     * 
     * @param transportName
     */
    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    /** 
     * Get the 'FlightNumber' element value. ����� ����� ���������� �����
     * 
     * @return value
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'FlightNumber' element value. ����� ����� ���������� �����
     * 
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /** 
     * Get the 'CountryRegTrans' element value. ������  �����������  ������������� ��������
     * 
     * @return value
     */
    public String getCountryRegTrans() {
        return countryRegTrans;
    }

    /** 
     * Set the 'CountryRegTrans' element value. ������  �����������  ������������� ��������
     * 
     * @param countryRegTrans
     */
    public void setCountryRegTrans(String countryRegTrans) {
        this.countryRegTrans = countryRegTrans;
    }

    /** 
     * Get the 'CodeCountryRegTrans' element value. ��� ������, ��� ��������������  ������������� ��������
     * 
     * @return value
     */
    public String getCodeCountryRegTrans() {
        return codeCountryRegTrans;
    }

    /** 
     * Set the 'CodeCountryRegTrans' element value. ��� ������, ��� ��������������  ������������� ��������
     * 
     * @param codeCountryRegTrans
     */
    public void setCodeCountryRegTrans(String codeCountryRegTrans) {
        this.codeCountryRegTrans = codeCountryRegTrans;
    }

    /** 
     * Get the 'TransportType' element value. ��� ������������� ��������, �� ������� ������������ �����. "1"- ��������� �����; "2" - ������� �����; "3" - �� ���������.
     * 
     * @return value
     */
    public String getTransportType() {
        return transportType;
    }

    /** 
     * Set the 'TransportType' element value. ��� ������������� ��������, �� ������� ������������ �����. "1"- ��������� �����; "2" - ������� �����; "3" - �� ���������.
     * 
     * @param transportType
     */
    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }
}

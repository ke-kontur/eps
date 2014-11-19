
package ru.acs.fts.schemas.album.veterinarycertificate;

/** 
 * �������� � ����������
 */
public class TransportInfoType
{
    private String transportName;
    private String transportNumber;
    private String transportModeCode;
    private String transportMeansNationalityCode;

    /** 
     * Get the 'TransportName' element value. ������������ ���� ������������� ��������.
     * 
     * @return value
     */
    public String getTransportName() {
        return transportName;
    }

    /** 
     * Set the 'TransportName' element value. ������������ ���� ������������� ��������.
     * 
     * @param transportName
     */
    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    /** 
     * Get the 'TransportNumber' element value. ����� ������������� ��������, �������� �����, ����� ���������, ����� ������.
     * 
     * @return value
     */
    public String getTransportNumber() {
        return transportNumber;
    }

    /** 
     * Set the 'TransportNumber' element value. ����� ������������� ��������, �������� �����, ����� ���������, ����� ������.
     * 
     * @param transportNumber
     */
    public void setTransportNumber(String transportNumber) {
        this.transportNumber = transportNumber;
    }

    /** 
     * Get the 'TransportModeCode' element value. ��� ���� ������������� �������� �� �������������� ����� ���������� � ��������������� �������.
     * 
     * @return value
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /** 
     * Set the 'TransportModeCode' element value. ��� ���� ������������� �������� �� �������������� ����� ���������� � ��������������� �������.
     * 
     * @param transportModeCode
     */
    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }

    /** 
     * Get the 'TransportMeansNationalityCode' element value. ��������� ��� ������ �������������� ������������� �������� �� ��������������� �������������� ����� ����.
     * 
     * @return value
     */
    public String getTransportMeansNationalityCode() {
        return transportMeansNationalityCode;
    }

    /** 
     * Set the 'TransportMeansNationalityCode' element value. ��������� ��� ������ �������������� ������������� �������� �� ��������������� �������������� ����� ����.
     * 
     * @param transportMeansNationalityCode
     */
    public void setTransportMeansNationalityCode(
            String transportMeansNationalityCode) {
        this.transportMeansNationalityCode = transportMeansNationalityCode;
    }
}

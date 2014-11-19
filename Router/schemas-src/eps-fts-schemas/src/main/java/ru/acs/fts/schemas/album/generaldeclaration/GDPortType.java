
package ru.acs.fts.schemas.album.generaldeclaration;

/** 
 * �������� � ��������/������ �����
 */
public class GDPortType
{
    private String dateTimeInf;
    private String portName;
    private String countyName;
    private String countryCode;

    /** 
     * Get the 'DateTimeInf' element value. ���� � �����
     * 
     * @return value
     */
    public String getDateTimeInf() {
        return dateTimeInf;
    }

    /** 
     * Set the 'DateTimeInf' element value. ���� � �����
     * 
     * @param dateTimeInf
     */
    public void setDateTimeInf(String dateTimeInf) {
        this.dateTimeInf = dateTimeInf;
    }

    /** 
     * Get the 'PortName' element value. �������� �����
     * 
     * @return value
     */
    public String getPortName() {
        return portName;
    }

    /** 
     * Set the 'PortName' element value. �������� �����
     * 
     * @param portName
     */
    public void setPortName(String portName) {
        this.portName = portName;
    }

    /** 
     * Get the 'CountyName' element value. ������������ ������
     * 
     * @return value
     */
    public String getCountyName() {
        return countyName;
    }

    /** 
     * Set the 'CountyName' element value. ������������ ������
     * 
     * @param countyName
     */
    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    /** 
     * Get the 'CountryCode' element value. ��� ������
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. ��� ������
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}

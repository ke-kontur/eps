
package ru.acs.fts.schemas.album.pi_seaarrive;

/** 
 * �������� � ������ � �����
 */
public class CountryPortInfoType
{
    private String countryCode;
    private String portName;

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
}

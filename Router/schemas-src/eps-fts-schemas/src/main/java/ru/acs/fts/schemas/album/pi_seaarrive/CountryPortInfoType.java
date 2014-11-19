
package ru.acs.fts.schemas.album.pi_seaarrive;

/** 
 * Сведения о стране и порте
 */
public class CountryPortInfoType
{
    private String countryCode;
    private String portName;

    /** 
     * Get the 'CountryCode' element value. Код страны
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Код страны
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'PortName' element value. Название порта
     * 
     * @return value
     */
    public String getPortName() {
        return portName;
    }

    /** 
     * Set the 'PortName' element value. Название порта
     * 
     * @param portName
     */
    public void setPortName(String portName) {
        this.portName = portName;
    }
}

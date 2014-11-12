
package ru.acs.fts.schemas.album.generaldeclaration;

/** 
 * Сведения о прибытии/убытии судна
 */
public class GDPortType
{
    private String dateTimeInf;
    private String portName;
    private String countyName;
    private String countryCode;

    /** 
     * Get the 'DateTimeInf' element value. Дата и время
     * 
     * @return value
     */
    public String getDateTimeInf() {
        return dateTimeInf;
    }

    /** 
     * Set the 'DateTimeInf' element value. Дата и время
     * 
     * @param dateTimeInf
     */
    public void setDateTimeInf(String dateTimeInf) {
        this.dateTimeInf = dateTimeInf;
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

    /** 
     * Get the 'CountyName' element value. Наименование страны
     * 
     * @return value
     */
    public String getCountyName() {
        return countyName;
    }

    /** 
     * Set the 'CountyName' element value. Наименование страны
     * 
     * @param countyName
     */
    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

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
}

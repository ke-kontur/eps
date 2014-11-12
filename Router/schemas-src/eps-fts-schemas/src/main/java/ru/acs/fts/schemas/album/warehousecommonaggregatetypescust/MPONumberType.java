
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * Номер МПО
 */
public class MPONumberType
{
    private String serviceIndicator;
    private String serialNumber;
    private String countryCode;

    /** 
     * Get the 'ServiceIndicator' element value. Указатель сервиса
     * 
     * @return value
     */
    public String getServiceIndicator() {
        return serviceIndicator;
    }

    /** 
     * Set the 'ServiceIndicator' element value. Указатель сервиса
     * 
     * @param serviceIndicator
     */
    public void setServiceIndicator(String serviceIndicator) {
        this.serviceIndicator = serviceIndicator;
    }

    /** 
     * Get the 'SerialNumber' element value. Порядковый номер
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. Порядковый номер
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
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

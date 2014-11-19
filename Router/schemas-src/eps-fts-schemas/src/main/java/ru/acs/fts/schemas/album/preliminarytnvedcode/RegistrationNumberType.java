
package ru.acs.fts.schemas.album.preliminarytnvedcode;

/** 
 * Регистрационный номер
 */
public class RegistrationNumberType
{
    private String countryCode;
    private String customsCode;
    private String year;
    private String serialNumber;

    /** 
     * Get the 'CountryCode' element value. Код государства 
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Код государства 
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'CustomsCode' element value. Код таможенного органа 
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа 
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'Year' element value. Последние цифры года принятия предварительного решения 
     * 
     * @return value
     */
    public String getYear() {
        return year;
    }

    /** 
     * Set the 'Year' element value. Последние цифры года принятия предварительного решения 
     * 
     * @param year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /** 
     * Get the 'SerialNumber' element value. Порядковый исходящий номер предварительного решения по классификации товара в календарного года
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. Порядковый исходящий номер предварительного решения по классификации товара в календарного года
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}

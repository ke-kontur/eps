
package ru.acs.fts.schemas.album.declarationconformity;

/** 
 * Регистрационный номер
 */
public class RegistrationNumberType
{
    private String serialNumber;
    private String customsCountryCode;

    /** 
     * Get the 'SerialNumber' element value. Номер декларации о соответствии
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. Номер декларации о соответствии
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /** 
     * Get the 'CustomsCountryCode' element value. Код государства члена Таможенного союза
     * 
     * @return value
     */
    public String getCustomsCountryCode() {
        return customsCountryCode;
    }

    /** 
     * Set the 'CustomsCountryCode' element value. Код государства члена Таможенного союза
     * 
     * @param customsCountryCode
     */
    public void setCustomsCountryCode(String customsCountryCode) {
        this.customsCountryCode = customsCountryCode;
    }
}

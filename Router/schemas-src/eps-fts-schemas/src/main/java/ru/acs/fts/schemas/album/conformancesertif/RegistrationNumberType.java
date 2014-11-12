
package ru.acs.fts.schemas.album.conformancesertif;

/** 
 * Регистрационный номер
 */
public class RegistrationNumberType
{
    private String sertifNumber;
    private String customsCountryCode;

    /** 
     * Get the 'SertifNumber' element value. Номер сертификата
     * 
     * @return value
     */
    public String getSertifNumber() {
        return sertifNumber;
    }

    /** 
     * Set the 'SertifNumber' element value. Номер сертификата
     * 
     * @param sertifNumber
     */
    public void setSertifNumber(String sertifNumber) {
        this.sertifNumber = sertifNumber;
    }

    /** 
     * Get the 'CustomsCountryCode' element value. Код государства члена Таможенного союза. 
     * 
     * @return value
     */
    public String getCustomsCountryCode() {
        return customsCountryCode;
    }

    /** 
     * Set the 'CustomsCountryCode' element value. Код государства члена Таможенного союза. 
     * 
     * @param customsCountryCode
     */
    public void setCustomsCountryCode(String customsCountryCode) {
        this.customsCountryCode = customsCountryCode;
    }
}

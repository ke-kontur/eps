
package ru.acs.fts.schemas.album.exportdiamondscertificate;

/** 
 * Уникальный номер сертификата
 */
public class CertificateNumberType
{
    private String countryCode;
    private String number;

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
     * Get the 'Number' element value. Номер сертификата
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер сертификата
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }
}

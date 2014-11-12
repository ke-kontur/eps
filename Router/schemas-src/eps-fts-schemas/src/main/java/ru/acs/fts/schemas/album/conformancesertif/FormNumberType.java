
package ru.acs.fts.schemas.album.conformancesertif;

/** 
 * Номер бланка сертификата
 */
public class FormNumberType
{
    private String number;
    private String customsCountryCode;

    /** 
     * Get the 'Number' element value. Номер
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
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

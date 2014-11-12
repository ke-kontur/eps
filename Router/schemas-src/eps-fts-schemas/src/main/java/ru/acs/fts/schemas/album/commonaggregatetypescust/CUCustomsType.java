
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * Сведения о таможенном органе
 */
public class CUCustomsType extends CustomsType
{
    private String customsCountryCode;

    /** 
     * Get the 'CustomsCountryCode' element value. Код государства - члена Таможенного союза. Трехзначный цифровой код
     * 
     * @return value
     */
    public String getCustomsCountryCode() {
        return customsCountryCode;
    }

    /** 
     * Set the 'CustomsCountryCode' element value. Код государства - члена Таможенного союза. Трехзначный цифровой код
     * 
     * @param customsCountryCode
     */
    public void setCustomsCountryCode(String customsCountryCode) {
        this.customsCountryCode = customsCountryCode;
    }
}

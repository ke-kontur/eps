
package ru.acs.fts.schemas.album.exportdiamondscertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Сведения о предприятии
 */
public class OrganizationInfoType extends OrganizationBaseType
{
    private String countryName;
    private String countryCodeN;
    private String countryCodeA;

    /** 
     * Get the 'CountryName' element value. Наименование страны
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. Наименование страны
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /** 
     * Get the 'CountryCodeN' element value. Цифровой код страны
     * 
     * @return value
     */
    public String getCountryCodeN() {
        return countryCodeN;
    }

    /** 
     * Set the 'CountryCodeN' element value. Цифровой код страны
     * 
     * @param countryCodeN
     */
    public void setCountryCodeN(String countryCodeN) {
        this.countryCodeN = countryCodeN;
    }

    /** 
     * Get the 'CountryCodeA' element value. Буквенный код страны
     * 
     * @return value
     */
    public String getCountryCodeA() {
        return countryCodeA;
    }

    /** 
     * Set the 'CountryCodeA' element value. Буквенный код страны
     * 
     * @param countryCodeA
     */
    public void setCountryCodeA(String countryCodeA) {
        this.countryCodeA = countryCodeA;
    }
}

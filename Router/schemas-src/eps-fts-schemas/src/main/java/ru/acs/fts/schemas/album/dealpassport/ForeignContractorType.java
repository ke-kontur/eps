
package ru.acs.fts.schemas.album.dealpassport;

/** 
 * Реквизиты иностранного контрагента
 */
public class ForeignContractorType
{
    private String name;
    private String countryCode;
    private String countryName;

    /** 
     * Get the 'Name' element value. Наименование иностранного контрагента
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование иностранного контрагента
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'CountryCode' element value. Код страны регистрации контрагента
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Код страны регистрации контрагента
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

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
}

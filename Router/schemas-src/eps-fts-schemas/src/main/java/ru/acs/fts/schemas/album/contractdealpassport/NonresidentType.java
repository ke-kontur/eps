
package ru.acs.fts.schemas.album.contractdealpassport;

/** 
 * Реквизиты нерезидента (нерезидентов)
 */
public class NonresidentType
{
    private String name;
    private String countryCode;
    private String countryName;

    /** 
     * Get the 'Name' element value. Наименование нерезидента по контрактному договору
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование нерезидента по контрактному договору
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'CountryCode' element value. Цифровой код страны
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Цифровой код страны
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'CountryName' element value. Наименование страны места нахождения / места жительства.
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. Наименование страны места нахождения / места жительства.
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}

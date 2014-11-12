
package ru.acs.fts.schemas.album.pi_tiauto;

import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;

/** 
 * Сведения документа, удостоверяющего личность
 */
public class IdentityCardInfoType extends IdentityCardType
{
    private String countryCode;
    private String countryName;

    /** 
     * Get the 'CountryCode' element value. Буквенный код страны в соответствии с классификатором стран мира
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Буквенный код страны в соответствии с классификатором стран мира
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'CountryName' element value. Краткое название страны в соответствии с классификатором стран мира
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. Краткое название страны в соответствии с классификатором стран мира
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}

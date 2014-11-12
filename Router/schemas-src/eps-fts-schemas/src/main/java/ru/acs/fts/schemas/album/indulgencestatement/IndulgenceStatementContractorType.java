
package ru.acs.fts.schemas.album.indulgencestatement;

/** 
 * Сведения о контрагенте
 */
public class IndulgenceStatementContractorType
{
    private String name;
    private String countryCode;
    private String registrationPlace;
    private String goodsCountryCode;

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
     * Get the 'RegistrationPlace' element value. Место регистрации
     * 
     * @return value
     */
    public String getRegistrationPlace() {
        return registrationPlace;
    }

    /** 
     * Set the 'RegistrationPlace' element value. Место регистрации
     * 
     * @param registrationPlace
     */
    public void setRegistrationPlace(String registrationPlace) {
        this.registrationPlace = registrationPlace;
    }

    /** 
     * Get the 'GoodsCountryCode' element value. Код страны происхождения товаров
     * 
     * @return value
     */
    public String getGoodsCountryCode() {
        return goodsCountryCode;
    }

    /** 
     * Set the 'GoodsCountryCode' element value. Код страны происхождения товаров
     * 
     * @param goodsCountryCode
     */
    public void setGoodsCountryCode(String goodsCountryCode) {
        this.goodsCountryCode = goodsCountryCode;
    }
}

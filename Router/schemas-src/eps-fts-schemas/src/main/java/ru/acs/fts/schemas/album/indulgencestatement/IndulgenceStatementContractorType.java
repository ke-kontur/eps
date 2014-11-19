
package ru.acs.fts.schemas.album.indulgencestatement;

/** 
 * �������� � �����������
 */
public class IndulgenceStatementContractorType
{
    private String name;
    private String countryCode;
    private String registrationPlace;
    private String goodsCountryCode;

    /** 
     * Get the 'Name' element value. ������������ ������������ �����������
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ������������ ������������ �����������
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'CountryCode' element value. ��� ������ ����������� �����������
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. ��� ������ ����������� �����������
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'RegistrationPlace' element value. ����� �����������
     * 
     * @return value
     */
    public String getRegistrationPlace() {
        return registrationPlace;
    }

    /** 
     * Set the 'RegistrationPlace' element value. ����� �����������
     * 
     * @param registrationPlace
     */
    public void setRegistrationPlace(String registrationPlace) {
        this.registrationPlace = registrationPlace;
    }

    /** 
     * Get the 'GoodsCountryCode' element value. ��� ������ ������������� �������
     * 
     * @return value
     */
    public String getGoodsCountryCode() {
        return goodsCountryCode;
    }

    /** 
     * Set the 'GoodsCountryCode' element value. ��� ������ ������������� �������
     * 
     * @param goodsCountryCode
     */
    public void setGoodsCountryCode(String goodsCountryCode) {
        this.goodsCountryCode = goodsCountryCode;
    }
}


package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * Комплексный тип для описания грузоотправителя
 */
public class ConsignorType
{
    private String countryCode;
    private String organizationName;
    private WHAddressType address;

    /** 
     * Get the 'CountryCode' element value. Цифровой код страны отправителя  (по справочнику ОКСМ)
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Цифровой код страны отправителя  (по справочнику ОКСМ)
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'OrganizationName' element value. Наименование организации / ФИО физического лица
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Наименование организации / ФИО физического лица
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'Address' element value. Адрес
     * 
     * @return value
     */
    public WHAddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес
     * 
     * @param address
     */
    public void setAddress(WHAddressType address) {
        this.address = address;
    }
}


package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Комплексный тип для описания организации-перевозчика
 */
public class WHCarrierType extends OrganizationBaseType
{
    private String countryCode;
    private WHAddressType address;
    private PersonBaseType carrierPerson;

    /** 
     * Get the 'CountryCode' element value. Цифровой код страны перевозчика (по справочнику ОКСМ)
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Цифровой код страны перевозчика (по справочнику ОКСМ)
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'Address' element value. Адрес лица, помещающего  товары на ВХ
     * 
     * @return value
     */
    public WHAddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес лица, помещающего  товары на ВХ
     * 
     * @param address
     */
    public void setAddress(WHAddressType address) {
        this.address = address;
    }

    /** 
     * Get the 'CarrierPerson' element value. Представитель перевозчика
     * 
     * @return value
     */
    public PersonBaseType getCarrierPerson() {
        return carrierPerson;
    }

    /** 
     * Set the 'CarrierPerson' element value. Представитель перевозчика
     * 
     * @param carrierPerson
     */
    public void setCarrierPerson(PersonBaseType carrierPerson) {
        this.carrierPerson = carrierPerson;
    }
}

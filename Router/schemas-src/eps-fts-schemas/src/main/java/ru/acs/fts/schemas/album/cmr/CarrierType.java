
package ru.acs.fts.schemas.album.cmr;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Описание перевозчика (гр.16)
 */
public class CarrierType extends OrganizationBaseType
{
    private String phone;
    private String OKPOID;
    private String OKATOCode;
    private AddressType postalAddress;

    /** 
     * Get the 'Phone' element value. Телефон 
     * 
     * @return value
     */
    public String getPhone() {
        return phone;
    }

    /** 
     * Set the 'Phone' element value. Телефон 
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /** 
     * Get the 'OKPOID' element value. Код организации по ОКПО
     * 
     * @return value
     */
    public String getOKPOID() {
        return OKPOID;
    }

    /** 
     * Set the 'OKPOID' element value. Код организации по ОКПО
     * 
     * @param OKPOID
     */
    public void setOKPOID(String OKPOID) {
        this.OKPOID = OKPOID;
    }

    /** 
     * Get the 'OKATOCode' element value. Код ОКАТО
     * 
     * @return value
     */
    public String getOKATOCode() {
        return OKATOCode;
    }

    /** 
     * Set the 'OKATOCode' element value. Код ОКАТО
     * 
     * @param OKATOCode
     */
    public void setOKATOCode(String OKATOCode) {
        this.OKATOCode = OKATOCode;
    }

    /** 
     * Get the 'PostalAddress' element value. Почтовый адрес перевозчика
     * 
     * @return value
     */
    public AddressType getPostalAddress() {
        return postalAddress;
    }

    /** 
     * Set the 'PostalAddress' element value. Почтовый адрес перевозчика
     * 
     * @param postalAddress
     */
    public void setPostalAddress(AddressType postalAddress) {
        this.postalAddress = postalAddress;
    }
}

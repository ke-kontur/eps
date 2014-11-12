
package ru.acs.fts.schemas.album.goodsdeclaration;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Сведения о грузоотправителе/грузополучателе
 */
public class OrganizationType extends OrganizationBaseType
{
    private String code;
    private AddressType address;

    /** 
     * Get the 'Code' element value. Код грузоотправителя/грузополучателя
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' element value. Код грузоотправителя/грузополучателя
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'Address' element value. Адрес организации / физического лица
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес организации / физического лица
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}

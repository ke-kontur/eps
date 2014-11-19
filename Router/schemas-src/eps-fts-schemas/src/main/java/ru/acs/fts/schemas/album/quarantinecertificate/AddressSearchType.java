
package ru.acs.fts.schemas.album.quarantinecertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Адрес проведения карантинного досмотра
 */
public class AddressSearchType extends AddressType
{
    private String phone;

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
}

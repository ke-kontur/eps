
package ru.acs.fts.schemas.album.collectionletter;

import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.PayCustomerType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Реквизиты плательщика
 */
public class PayerType extends PayCustomerType
{
    private AddressType address;

    /** 
     * Get the 'Address' element value. Адрес
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}

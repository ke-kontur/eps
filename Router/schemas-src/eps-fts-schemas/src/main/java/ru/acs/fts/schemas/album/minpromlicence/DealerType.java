
package ru.acs.fts.schemas.album.minpromlicence;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Информация о покупателе/продавце
 */
public class DealerType extends OrganizationBaseType
{
    private AddressType dealerAddress;

    /** 
     * Get the 'DealerAddress' element value. Адрес Покупателя/Продавца
     * 
     * @return value
     */
    public AddressType getDealerAddress() {
        return dealerAddress;
    }

    /** 
     * Set the 'DealerAddress' element value. Адрес Покупателя/Продавца
     * 
     * @param dealerAddress
     */
    public void setDealerAddress(AddressType dealerAddress) {
        this.dealerAddress = dealerAddress;
    }
}


package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Владелец ТС - юридическое лицо.
 */
public class TransportOwnerOrganizationType extends OrganizationBaseType
{
    private String OKPO;
    private AddressType address;

    /** 
     * Get the 'OKPO' element value. Код ОКПО владельца.
     * 
     * @return value
     */
    public String getOKPO() {
        return OKPO;
    }

    /** 
     * Set the 'OKPO' element value. Код ОКПО владельца.
     * 
     * @param OKPO
     */
    public void setOKPO(String OKPO) {
        this.OKPO = OKPO;
    }

    /** 
     * Get the 'Address' element value. Адрес организации.
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес организации.
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}

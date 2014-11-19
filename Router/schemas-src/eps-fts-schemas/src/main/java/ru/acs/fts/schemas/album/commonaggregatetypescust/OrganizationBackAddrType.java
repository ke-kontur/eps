
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * Сведения об организации.  Юридический и фактический адрес
 */
public class OrganizationBackAddrType extends OrganizationType
{
    private AddressType factAddress;

    /** 
     * Get the 'FactAddress' element value. Фактический адрес организации
     * 
     * @return value
     */
    public AddressType getFactAddress() {
        return factAddress;
    }

    /** 
     * Set the 'FactAddress' element value. Фактический адрес организации
     * 
     * @param factAddress
     */
    public void setFactAddress(AddressType factAddress) {
        this.factAddress = factAddress;
    }
}

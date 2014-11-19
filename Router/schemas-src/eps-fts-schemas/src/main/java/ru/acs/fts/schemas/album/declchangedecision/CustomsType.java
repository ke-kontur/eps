
package ru.acs.fts.schemas.album.declchangedecision;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;

/** 
 * Таможенный орган
 */
public class CustomsType extends CUCustomsType
{
    private AddressType address;
    private AddressType postalAddress;

    /** 
     * Get the 'Address' element value. Юридический адрес
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Юридический адрес
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }

    /** 
     * Get the 'PostalAddress' element value. Почтовый адрес (заполняется в случае отличия почтового адреса от юридического)
     * 
     * @return value
     */
    public AddressType getPostalAddress() {
        return postalAddress;
    }

    /** 
     * Set the 'PostalAddress' element value. Почтовый адрес (заполняется в случае отличия почтового адреса от юридического)
     * 
     * @param postalAddress
     */
    public void setPostalAddress(AddressType postalAddress) {
        this.postalAddress = postalAddress;
    }
}

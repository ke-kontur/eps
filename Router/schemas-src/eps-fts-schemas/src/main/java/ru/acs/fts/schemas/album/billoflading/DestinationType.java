
package ru.acs.fts.schemas.album.billoflading;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Место назначения груза либо, при наличие чартера, место назначения или направления судна 
 */
public class DestinationType
{
    private String name;
    private AddressType address;

    /** 
     * Get the 'Name' element value. Наименование места назначения  
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование места назначения  
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Address' element value. Адрес места назначения
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес места назначения
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}

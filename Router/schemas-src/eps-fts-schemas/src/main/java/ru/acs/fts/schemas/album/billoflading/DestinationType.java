
package ru.acs.fts.schemas.album.billoflading;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * ћесто назначени€ груза либо, при наличие чартера, место назначени€ или направлени€ судна 
 */
public class DestinationType
{
    private String name;
    private AddressType address;

    /** 
     * Get the 'Name' element value. Ќаименование места назначени€  
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Ќаименование места назначени€  
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Address' element value. јдрес места назначени€
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. јдрес места назначени€
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}

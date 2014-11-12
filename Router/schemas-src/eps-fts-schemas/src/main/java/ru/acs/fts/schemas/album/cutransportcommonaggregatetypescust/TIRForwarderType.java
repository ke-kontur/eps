
package ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Экспедитор в книжке МДП
 */
public class TIRForwarderType
{
    private String name;
    private AddressType address;

    /** 
     * Get the 'Name' element value. Наименование
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

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

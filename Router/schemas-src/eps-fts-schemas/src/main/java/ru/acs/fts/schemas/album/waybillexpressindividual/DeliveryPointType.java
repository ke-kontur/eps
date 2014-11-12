
package ru.acs.fts.schemas.album.waybillexpressindividual;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Пункт назначения
 */
public class DeliveryPointType
{
    private String name;
    private String IATACode;
    private AddressType address;

    /** 
     * Get the 'Name' element value. Название
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Название
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'IATACode' element value. Код ИАТА
     * 
     * @return value
     */
    public String getIATACode() {
        return IATACode;
    }

    /** 
     * Set the 'IATACode' element value. Код ИАТА
     * 
     * @param IATACode
     */
    public void setIATACode(String IATACode) {
        this.IATACode = IATACode;
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

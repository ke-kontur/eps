
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Изготовитель транспортного средства.
 */
public class TransportManufacturerType
{
    private String transportManufacturerName;
    private String transportManufacturerCode;
    private String manufacturerCountryCode;
    private AddressType address;

    /** 
     * Get the 'TransportManufacturerName' element value. Наименование изготовителя.
     * 
     * @return value
     */
    public String getTransportManufacturerName() {
        return transportManufacturerName;
    }

    /** 
     * Set the 'TransportManufacturerName' element value. Наименование изготовителя.
     * 
     * @param transportManufacturerName
     */
    public void setTransportManufacturerName(String transportManufacturerName) {
        this.transportManufacturerName = transportManufacturerName;
    }

    /** 
     * Get the 'TransportManufacturerCode' element value. Код изготовителя.
     * 
     * @return value
     */
    public String getTransportManufacturerCode() {
        return transportManufacturerCode;
    }

    /** 
     * Set the 'TransportManufacturerCode' element value. Код изготовителя.
     * 
     * @param transportManufacturerCode
     */
    public void setTransportManufacturerCode(String transportManufacturerCode) {
        this.transportManufacturerCode = transportManufacturerCode;
    }

    /** 
     * Get the 'ManufacturerCountryCode' element value. Код альфа-2 страны изготовления
     * 
     * @return value
     */
    public String getManufacturerCountryCode() {
        return manufacturerCountryCode;
    }

    /** 
     * Set the 'ManufacturerCountryCode' element value. Код альфа-2 страны изготовления
     * 
     * @param manufacturerCountryCode
     */
    public void setManufacturerCountryCode(String manufacturerCountryCode) {
        this.manufacturerCountryCode = manufacturerCountryCode;
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

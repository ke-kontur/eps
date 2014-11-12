
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * ������������ ������������� ��������.
 */
public class TransportManufacturerType
{
    private String transportManufacturerName;
    private String transportManufacturerCode;
    private String manufacturerCountryCode;
    private AddressType address;

    /** 
     * Get the 'TransportManufacturerName' element value. ������������ ������������.
     * 
     * @return value
     */
    public String getTransportManufacturerName() {
        return transportManufacturerName;
    }

    /** 
     * Set the 'TransportManufacturerName' element value. ������������ ������������.
     * 
     * @param transportManufacturerName
     */
    public void setTransportManufacturerName(String transportManufacturerName) {
        this.transportManufacturerName = transportManufacturerName;
    }

    /** 
     * Get the 'TransportManufacturerCode' element value. ��� ������������.
     * 
     * @return value
     */
    public String getTransportManufacturerCode() {
        return transportManufacturerCode;
    }

    /** 
     * Set the 'TransportManufacturerCode' element value. ��� ������������.
     * 
     * @param transportManufacturerCode
     */
    public void setTransportManufacturerCode(String transportManufacturerCode) {
        this.transportManufacturerCode = transportManufacturerCode;
    }

    /** 
     * Get the 'ManufacturerCountryCode' element value. ��� �����-2 ������ ������������
     * 
     * @return value
     */
    public String getManufacturerCountryCode() {
        return manufacturerCountryCode;
    }

    /** 
     * Set the 'ManufacturerCountryCode' element value. ��� �����-2 ������ ������������
     * 
     * @param manufacturerCountryCode
     */
    public void setManufacturerCountryCode(String manufacturerCountryCode) {
        this.manufacturerCountryCode = manufacturerCountryCode;
    }

    /** 
     * Get the 'Address' element value. ����� �����������.
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� �����������.
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}

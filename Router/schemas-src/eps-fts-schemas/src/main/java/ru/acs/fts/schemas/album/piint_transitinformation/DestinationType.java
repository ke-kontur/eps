
package ru.acs.fts.schemas.album.piint_transitinformation;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.DestinationWarehouseType;

/** 
 * ����� �������� �������
 */
public class DestinationType
{
    private String destinationRWStationCode;
    private String destinationRWStationName;
    private String destinantionPlaceName;
    private AddressType address;
    private DestinationWarehouseType destinationWarehouse;
    private CustomsType destinationCustoms;

    /** 
     * Get the 'DestinationRWStationCode' element value. ��� �/� ������� ����������
     * 
     * @return value
     */
    public String getDestinationRWStationCode() {
        return destinationRWStationCode;
    }

    /** 
     * Set the 'DestinationRWStationCode' element value. ��� �/� ������� ����������
     * 
     * @param destinationRWStationCode
     */
    public void setDestinationRWStationCode(String destinationRWStationCode) {
        this.destinationRWStationCode = destinationRWStationCode;
    }

    /** 
     * Get the 'DestinationRWStationName' element value. ������������ ��������������� ������� ����������
     * 
     * @return value
     */
    public String getDestinationRWStationName() {
        return destinationRWStationName;
    }

    /** 
     * Set the 'DestinationRWStationName' element value. ������������ ��������������� ������� ����������
     * 
     * @param destinationRWStationName
     */
    public void setDestinationRWStationName(String destinationRWStationName) {
        this.destinationRWStationName = destinationRWStationName;
    }

    /** 
     * Get the 'DestinantionPlaceName' element value. ������������ ����� ����������
     * 
     * @return value
     */
    public String getDestinantionPlaceName() {
        return destinantionPlaceName;
    }

    /** 
     * Set the 'DestinantionPlaceName' element value. ������������ ����� ����������
     * 
     * @param destinantionPlaceName
     */
    public void setDestinantionPlaceName(String destinantionPlaceName) {
        this.destinantionPlaceName = destinantionPlaceName;
    }

    /** 
     * Get the 'Address' element value. ����� ����� ����������
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� ����� ����������
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }

    /** 
     * Get the 'DestinationWarehouse' element value. ��� ����� ����������
     * 
     * @return value
     */
    public DestinationWarehouseType getDestinationWarehouse() {
        return destinationWarehouse;
    }

    /** 
     * Set the 'DestinationWarehouse' element value. ��� ����� ����������
     * 
     * @param destinationWarehouse
     */
    public void setDestinationWarehouse(
            DestinationWarehouseType destinationWarehouse) {
        this.destinationWarehouse = destinationWarehouse;
    }

    /** 
     * Get the 'DestinationCustoms' element value. ������� ����������
     * 
     * @return value
     */
    public CustomsType getDestinationCustoms() {
        return destinationCustoms;
    }

    /** 
     * Set the 'DestinationCustoms' element value. ������� ����������
     * 
     * @param destinationCustoms
     */
    public void setDestinationCustoms(CustomsType destinationCustoms) {
        this.destinationCustoms = destinationCustoms;
    }
}

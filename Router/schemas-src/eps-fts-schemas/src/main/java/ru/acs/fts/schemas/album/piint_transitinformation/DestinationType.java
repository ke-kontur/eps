
package ru.acs.fts.schemas.album.piint_transitinformation;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.DestinationWarehouseType;

/** 
 * Место доставки товаров
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
     * Get the 'DestinationRWStationCode' element value. Код ж/д станции назначения
     * 
     * @return value
     */
    public String getDestinationRWStationCode() {
        return destinationRWStationCode;
    }

    /** 
     * Set the 'DestinationRWStationCode' element value. Код ж/д станции назначения
     * 
     * @param destinationRWStationCode
     */
    public void setDestinationRWStationCode(String destinationRWStationCode) {
        this.destinationRWStationCode = destinationRWStationCode;
    }

    /** 
     * Get the 'DestinationRWStationName' element value. Наименование железнодорожной станции назанчения
     * 
     * @return value
     */
    public String getDestinationRWStationName() {
        return destinationRWStationName;
    }

    /** 
     * Set the 'DestinationRWStationName' element value. Наименование железнодорожной станции назанчения
     * 
     * @param destinationRWStationName
     */
    public void setDestinationRWStationName(String destinationRWStationName) {
        this.destinationRWStationName = destinationRWStationName;
    }

    /** 
     * Get the 'DestinantionPlaceName' element value. Наименование места назначения
     * 
     * @return value
     */
    public String getDestinantionPlaceName() {
        return destinantionPlaceName;
    }

    /** 
     * Set the 'DestinantionPlaceName' element value. Наименование места назначения
     * 
     * @param destinantionPlaceName
     */
    public void setDestinantionPlaceName(String destinantionPlaceName) {
        this.destinantionPlaceName = destinantionPlaceName;
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

    /** 
     * Get the 'DestinationWarehouse' element value. СВХ места назначения
     * 
     * @return value
     */
    public DestinationWarehouseType getDestinationWarehouse() {
        return destinationWarehouse;
    }

    /** 
     * Set the 'DestinationWarehouse' element value. СВХ места назначения
     * 
     * @param destinationWarehouse
     */
    public void setDestinationWarehouse(
            DestinationWarehouseType destinationWarehouse) {
        this.destinationWarehouse = destinationWarehouse;
    }

    /** 
     * Get the 'DestinationCustoms' element value. Таможня назначения
     * 
     * @return value
     */
    public CustomsType getDestinationCustoms() {
        return destinationCustoms;
    }

    /** 
     * Set the 'DestinationCustoms' element value. Таможня назначения
     * 
     * @param destinationCustoms
     */
    public void setDestinationCustoms(CustomsType destinationCustoms) {
        this.destinationCustoms = destinationCustoms;
    }
}

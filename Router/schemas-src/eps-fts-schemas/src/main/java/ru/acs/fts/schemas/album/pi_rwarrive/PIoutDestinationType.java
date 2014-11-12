
package ru.acs.fts.schemas.album.pi_rwarrive;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.DestinationWarehouseType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.PIDestinationPlaceType;

/** 
 * Пункт назначения товаров
 */
public class PIoutDestinationType extends PIDestinationPlaceType
{
    private DestinationWarehouseType destinationWarehouse;
    private CustomsType destinationCustoms;
    private AddressType address;

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
     * Get the 'DestinationCustoms' element value. Таможенный орган назначения
     * 
     * @return value
     */
    public CustomsType getDestinationCustoms() {
        return destinationCustoms;
    }

    /** 
     * Set the 'DestinationCustoms' element value. Таможенный орган назначения
     * 
     * @param destinationCustoms
     */
    public void setDestinationCustoms(CustomsType destinationCustoms) {
        this.destinationCustoms = destinationCustoms;
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

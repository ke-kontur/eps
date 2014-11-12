
package ru.acs.fts.schemas.album.actthievingsampling;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.GoodsLocationPlaceType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.WarehousePlaceType;

/** 
 * Адрес, по которому проводилось отбор проб или образцов.
 */
public class AddressThievingSamplingType
{
    private WarehousePlaceType warehousePlace;
    private GoodsLocationPlaceType goodsLocationPlace;

    /** 
     * Get the 'WarehousePlace' element value. Сведения о лицензии/ свидетельстве склада.
     * 
     * @return value
     */
    public WarehousePlaceType getWarehousePlace() {
        return warehousePlace;
    }

    /** 
     * Set the 'WarehousePlace' element value. Сведения о лицензии/ свидетельстве склада.
     * 
     * @param warehousePlace
     */
    public void setWarehousePlace(WarehousePlaceType warehousePlace) {
        this.warehousePlace = warehousePlace;
    }

    /** 
     * Get the 'GoodsLocationPlace' element value. Сведения о местонахождении товара. (склад получателя, иное место).
     * 
     * @return value
     */
    public GoodsLocationPlaceType getGoodsLocationPlace() {
        return goodsLocationPlace;
    }

    /** 
     * Set the 'GoodsLocationPlace' element value. Сведения о местонахождении товара. (склад получателя, иное место).
     * 
     * @param goodsLocationPlace
     */
    public void setGoodsLocationPlace(GoodsLocationPlaceType goodsLocationPlace) {
        this.goodsLocationPlace = goodsLocationPlace;
    }
}

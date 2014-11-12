
package ru.acs.fts.schemas.album.commissioninspection;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.GoodsLocationPlaceType;

/** 
 * Местонахождение товаров.
 */
public class GoodsLocationType
{
    private CIWarehousePlaceType warehousePlace;
    private GoodsLocationPlaceType goodsLocationPlace;

    /** 
     * Get the 'WarehousePlace' element value. Место погрузки/разгрузки. Сведения о лицензии/ свидетельстве склада.
     * 
     * @return value
     */
    public CIWarehousePlaceType getWarehousePlace() {
        return warehousePlace;
    }

    /** 
     * Set the 'WarehousePlace' element value. Место погрузки/разгрузки. Сведения о лицензии/ свидетельстве склада.
     * 
     * @param warehousePlace
     */
    public void setWarehousePlace(CIWarehousePlaceType warehousePlace) {
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

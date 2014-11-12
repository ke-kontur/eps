
package ru.acs.fts.schemas.album.resolutiondestinationexamination;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.GoodsLocationPlaceType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.WarehousePlaceType;

/** 
 * Местонахождение товаров.
 */
public class GoodsLocationType
{
    private String informationTypeCode;
    private GoodsLocationPlaceType goodsLocationPlace;
    private WarehousePlaceType warehousePlace;

    /** 
     * Get the 'InformationTypeCode' element value. Код информации.
     * 
     * @return value
     */
    public String getInformationTypeCode() {
        return informationTypeCode;
    }

    /** 
     * Set the 'InformationTypeCode' element value. Код информации.
     * 
     * @param informationTypeCode
     */
    public void setInformationTypeCode(String informationTypeCode) {
        this.informationTypeCode = informationTypeCode;
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

    /** 
     * Get the 'WarehousePlace' element value. Место погрузки/разгрузки. Сведения о лицензии/ свидетельстве склада.
     * 
     * @return value
     */
    public WarehousePlaceType getWarehousePlace() {
        return warehousePlace;
    }

    /** 
     * Set the 'WarehousePlace' element value. Место погрузки/разгрузки. Сведения о лицензии/ свидетельстве склада.
     * 
     * @param warehousePlace
     */
    public void setWarehousePlace(WarehousePlaceType warehousePlace) {
        this.warehousePlace = warehousePlace;
    }
}

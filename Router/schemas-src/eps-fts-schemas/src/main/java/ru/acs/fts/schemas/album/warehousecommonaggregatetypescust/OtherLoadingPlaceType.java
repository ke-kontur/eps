
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Иное место нахождения товаров
 */
public class OtherLoadingPlaceType
{
    private String goodsLocationPlaceDesc;
    private String railwayStationCode;
    private String railwayStationName;
    private AddressType address;

    /** 
     * Get the 'GoodsLocationPlaceDesc' element value. Место нахождения товаров/СКЛАД ПОЛУЧАТЕЛЯ (кроме названия ж/д cтанции)
     * 
     * @return value
     */
    public String getGoodsLocationPlaceDesc() {
        return goodsLocationPlaceDesc;
    }

    /** 
     * Set the 'GoodsLocationPlaceDesc' element value. Место нахождения товаров/СКЛАД ПОЛУЧАТЕЛЯ (кроме названия ж/д cтанции)
     * 
     * @param goodsLocationPlaceDesc
     */
    public void setGoodsLocationPlaceDesc(String goodsLocationPlaceDesc) {
        this.goodsLocationPlaceDesc = goodsLocationPlaceDesc;
    }

    /** 
     * Get the 'RailwayStationCode' element value. Код ж/д станции местонахождения товара.
     * 
     * @return value
     */
    public String getRailwayStationCode() {
        return railwayStationCode;
    }

    /** 
     * Set the 'RailwayStationCode' element value. Код ж/д станции местонахождения товара.
     * 
     * @param railwayStationCode
     */
    public void setRailwayStationCode(String railwayStationCode) {
        this.railwayStationCode = railwayStationCode;
    }

    /** 
     * Get the 'RailwayStationName' element value. Наименование ж/д станции местонахождения товара.
     * 
     * @return value
     */
    public String getRailwayStationName() {
        return railwayStationName;
    }

    /** 
     * Set the 'RailwayStationName' element value. Наименование ж/д станции местонахождения товара.
     * 
     * @param railwayStationName
     */
    public void setRailwayStationName(String railwayStationName) {
        this.railwayStationName = railwayStationName;
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

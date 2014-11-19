
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Сведения о местонахождении товара. (склад получателя, иное место).
 */
public class GoodsLocationPlaceType
{
    private String goodsLocationPlaceDesc;
    private String customsOfficeID;
    private String railwayStationCode;
    private String railwayStationName;
    private AddressType address;

    /** 
     * Get the 'GoodsLocationPlaceDesc' element value. Место нахождения товаров/СКЛАД ПОЛУЧАТЕЛЯ (кроме названия ж/д станции / ТРУБОПРОВОДНЫЙ / ЭЛЕКТРОПЕРЕДАЧА)
     * 
     * @return value
     */
    public String getGoodsLocationPlaceDesc() {
        return goodsLocationPlaceDesc;
    }

    /** 
     * Set the 'GoodsLocationPlaceDesc' element value. Место нахождения товаров/СКЛАД ПОЛУЧАТЕЛЯ (кроме названия ж/д станции / ТРУБОПРОВОДНЫЙ / ЭЛЕКТРОПЕРЕДАЧА)
     * 
     * @param goodsLocationPlaceDesc
     */
    public void setGoodsLocationPlaceDesc(String goodsLocationPlaceDesc) {
        this.goodsLocationPlaceDesc = goodsLocationPlaceDesc;
    }

    /** 
     * Get the 'CustomsOfficeID' element value. Код таможенного органа  в регионе деятельности которого находится место нахождения,  хранения товаров.
     * 
     * @return value
     */
    public String getCustomsOfficeID() {
        return customsOfficeID;
    }

    /** 
     * Set the 'CustomsOfficeID' element value. Код таможенного органа  в регионе деятельности которого находится место нахождения,  хранения товаров.
     * 
     * @param customsOfficeID
     */
    public void setCustomsOfficeID(String customsOfficeID) {
        this.customsOfficeID = customsOfficeID;
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
     * Get the 'Address' element value. Точный адрес местонахождения товаров. 
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Точный адрес местонахождения товаров. 
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}

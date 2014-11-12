
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * Место погрузки/разгрузки. Иное место выгрузки товаров.
 */
public class LoadingPlaceOtherType
{
    private String goodsLoadingPlaceDesc;
    private String customsOfficeID;

    /** 
     * Get the 'GoodsLoadingPlaceDesc' element value. Место нахождения / погрузки товаров / название морского или речного порта 
     * 
     * @return value
     */
    public String getGoodsLoadingPlaceDesc() {
        return goodsLoadingPlaceDesc;
    }

    /** 
     * Set the 'GoodsLoadingPlaceDesc' element value. Место нахождения / погрузки товаров / название морского или речного порта 
     * 
     * @param goodsLoadingPlaceDesc
     */
    public void setGoodsLoadingPlaceDesc(String goodsLoadingPlaceDesc) {
        this.goodsLoadingPlaceDesc = goodsLoadingPlaceDesc;
    }

    /** 
     * Get the 'CustomsOfficeID' element value. Код таможенного органа, владельца СВХ/ТС/ код таможенного органа, в регионе деятельности которого находится место  разгрузки товаров. 
     * 
     * @return value
     */
    public String getCustomsOfficeID() {
        return customsOfficeID;
    }

    /** 
     * Set the 'CustomsOfficeID' element value. Код таможенного органа, владельца СВХ/ТС/ код таможенного органа, в регионе деятельности которого находится место  разгрузки товаров. 
     * 
     * @param customsOfficeID
     */
    public void setCustomsOfficeID(String customsOfficeID) {
        this.customsOfficeID = customsOfficeID;
    }
}


package ru.acs.fts.schemas.album.railwaybill;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Сведения из декларации на товары
 */
public class DTInfoType
{
    private String goodsNumeric;
    private GTDIDType DTNumber;

    /** 
     * Get the 'GoodsNumeric' element value. Номер товара по ДТ
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Номер товара по ДТ
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'DTNumber' element value. Регистрационный номер декларации на товары
     * 
     * @return value
     */
    public GTDIDType getDTNumber() {
        return DTNumber;
    }

    /** 
     * Set the 'DTNumber' element value. Регистрационный номер декларации на товары
     * 
     * @param DTNumber
     */
    public void setDTNumber(GTDIDType DTNumber) {
        this.DTNumber = DTNumber;
    }
}

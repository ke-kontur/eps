
package ru.acs.fts.schemas.album.cargomanifest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Сведения о ДТ
 */
public class DTInfoType
{
    private String goodNumber;
    private GTDIDType DTNumber;

    /** 
     * Get the 'GoodNumber' element value. Номер товара по ДТ
     * 
     * @return value
     */
    public String getGoodNumber() {
        return goodNumber;
    }

    /** 
     * Set the 'GoodNumber' element value. Номер товара по ДТ
     * 
     * @param goodNumber
     */
    public void setGoodNumber(String goodNumber) {
        this.goodNumber = goodNumber;
    }

    /** 
     * Get the 'DTNumber' element value. Номер декларации на товары
     * 
     * @return value
     */
    public GTDIDType getDTNumber() {
        return DTNumber;
    }

    /** 
     * Set the 'DTNumber' element value. Номер декларации на товары
     * 
     * @param DTNumber
     */
    public void setDTNumber(GTDIDType DTNumber) {
        this.DTNumber = DTNumber;
    }
}

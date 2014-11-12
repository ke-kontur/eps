
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * Сведения о декларируемом товаре по лицензии
 */
public class LicenseGoodsType
{
    private String appNumber;
    private String goodsNumericLic;

    /** 
     * Get the 'AppNumber' element value. Номер приложения/ перечня к лицензии 
     * 
     * @return value
     */
    public String getAppNumber() {
        return appNumber;
    }

    /** 
     * Set the 'AppNumber' element value. Номер приложения/ перечня к лицензии 
     * 
     * @param appNumber
     */
    public void setAppNumber(String appNumber) {
        this.appNumber = appNumber;
    }

    /** 
     * Get the 'GoodsNumericLic' element value. Порядковый номер декларируемого товара по приложению/перечню к лицензии
     * 
     * @return value
     */
    public String getGoodsNumericLic() {
        return goodsNumericLic;
    }

    /** 
     * Set the 'GoodsNumericLic' element value. Порядковый номер декларируемого товара по приложению/перечню к лицензии
     * 
     * @param goodsNumericLic
     */
    public void setGoodsNumericLic(String goodsNumericLic) {
        this.goodsNumericLic = goodsNumericLic;
    }
}

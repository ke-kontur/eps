
package ru.acs.fts.schemas.album.liquidationapplicationin;

import java.util.ArrayList;
import java.util.List;

/** 
 * Товар, помещенный под таможенную процедуру СТЗ
 */
public class GoodsType
{
    private List<String> goodDescriptionList = new ArrayList<String>();
    private String goodsNumeric;
    private String goodsTNVEDCode;

    /** 
     * Get the list of 'GoodDescription' element items. Наименование товара
     * 
     * @return list
     */
    public List<String> getGoodDescriptionList() {
        return goodDescriptionList;
    }

    /** 
     * Set the list of 'GoodDescription' element items. Наименование товара
     * 
     * @param list
     */
    public void setGoodDescriptionList(List<String> list) {
        goodDescriptionList = list;
    }

    /** 
     * Get the 'GoodsNumeric' element value. Номер товара
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Номер товара
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }
}

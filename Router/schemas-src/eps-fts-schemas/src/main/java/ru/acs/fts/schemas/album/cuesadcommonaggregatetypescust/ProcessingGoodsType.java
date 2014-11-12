
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Описание продуктов переработки
 */
public class ProcessingGoodsType
{
    private String goodsTNVEDCode;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private SupplementaryQuantityType processingGoodsQuantity;

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

    /** 
     * Get the list of 'GoodsDescription' element items. Описание и характеристика товара
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Описание и характеристика товара
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'ProcessingGoodsQuantity' element value. Количество товаров в единице измерения
     * 
     * @return value
     */
    public SupplementaryQuantityType getProcessingGoodsQuantity() {
        return processingGoodsQuantity;
    }

    /** 
     * Set the 'ProcessingGoodsQuantity' element value. Количество товаров в единице измерения
     * 
     * @param processingGoodsQuantity
     */
    public void setProcessingGoodsQuantity(
            SupplementaryQuantityType processingGoodsQuantity) {
        this.processingGoodsQuantity = processingGoodsQuantity;
    }
}


package ru.acs.fts.schemas.album.scvvcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GoodsBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * СКВВ. Сведения о товаре 
 */
public class SCVVGoodsType extends GoodsBaseType
{
    private String amount;
    private String goodsAddTNVEDCode;
    private SupplementaryQuantityType supplementaryGoodsQuantity;

    /** 
     * Get the 'Amount' element value. Таможенная стоимость товара
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Таможенная стоимость товара
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'GoodsAddTNVEDCode' element value. Код товара по  классификатору дополнительной таможенной информации.
     * 
     * @return value
     */
    public String getGoodsAddTNVEDCode() {
        return goodsAddTNVEDCode;
    }

    /** 
     * Set the 'GoodsAddTNVEDCode' element value. Код товара по  классификатору дополнительной таможенной информации.
     * 
     * @param goodsAddTNVEDCode
     */
    public void setGoodsAddTNVEDCode(String goodsAddTNVEDCode) {
        this.goodsAddTNVEDCode = goodsAddTNVEDCode;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. Количество в дополнительной единице измерения.
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. Количество в дополнительной единице измерения.
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(
            SupplementaryQuantityType supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }
}

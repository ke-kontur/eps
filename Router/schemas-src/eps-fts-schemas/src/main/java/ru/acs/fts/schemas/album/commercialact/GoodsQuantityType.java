
package ru.acs.fts.schemas.album.commercialact;

import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHSuppQuantityType;

/** 
 * Описание несоответствия количества товара в дополнительной единице измерения сведениям, заявленным в товаросопроводительных документах
 */
public class GoodsQuantityType
{
    private WHSuppQuantityType goodsQuantityByDocs;
    private WHSuppQuantityType goodsQuantityByFact;

    /** 
     * Get the 'GoodsQuantityByDocs' element value. Количество товара в дополнительной единице измерения согласно товаросопроводительным документам
     * 
     * @return value
     */
    public WHSuppQuantityType getGoodsQuantityByDocs() {
        return goodsQuantityByDocs;
    }

    /** 
     * Set the 'GoodsQuantityByDocs' element value. Количество товара в дополнительной единице измерения согласно товаросопроводительным документам
     * 
     * @param goodsQuantityByDocs
     */
    public void setGoodsQuantityByDocs(WHSuppQuantityType goodsQuantityByDocs) {
        this.goodsQuantityByDocs = goodsQuantityByDocs;
    }

    /** 
     * Get the 'GoodsQuantityByFact' element value. Количество товара в дополнительной единице фактическое
     * 
     * @return value
     */
    public WHSuppQuantityType getGoodsQuantityByFact() {
        return goodsQuantityByFact;
    }

    /** 
     * Set the 'GoodsQuantityByFact' element value. Количество товара в дополнительной единице фактическое
     * 
     * @param goodsQuantityByFact
     */
    public void setGoodsQuantityByFact(WHSuppQuantityType goodsQuantityByFact) {
        this.goodsQuantityByFact = goodsQuantityByFact;
    }
}

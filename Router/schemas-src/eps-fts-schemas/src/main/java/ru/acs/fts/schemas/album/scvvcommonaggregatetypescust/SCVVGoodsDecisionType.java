
package ru.acs.fts.schemas.album.scvvcommonaggregatetypescust;

/** 
 * СКВВ. Сведения о товаре  с выявленными расхождениями
 */
public class SCVVGoodsDecisionType extends SCVVGoodsType
{
    private String goodsDiscrepancyIndicator;

    /** 
     * Get the 'GoodsDiscrepancyIndicator' element value. Вид найденных расхождений (00- расхождений не выявлено; 11-товар с указанным порядковым номером не найден в ГТД; 12 - код товара по ТНВЭД не совпадает с указанным в ГТД; 13 - превышен вес брутто по ГТД; 14 - превышен вес нетто по ГТД; 15 - превышено количество товара в ДЕИ; 16 - таможенная стоимость товара не совпадает с заявленной в ГТД)
     * 
     * @return value
     */
    public String getGoodsDiscrepancyIndicator() {
        return goodsDiscrepancyIndicator;
    }

    /** 
     * Set the 'GoodsDiscrepancyIndicator' element value. Вид найденных расхождений (00- расхождений не выявлено; 11-товар с указанным порядковым номером не найден в ГТД; 12 - код товара по ТНВЭД не совпадает с указанным в ГТД; 13 - превышен вес брутто по ГТД; 14 - превышен вес нетто по ГТД; 15 - превышено количество товара в ДЕИ; 16 - таможенная стоимость товара не совпадает с заявленной в ГТД)
     * 
     * @param goodsDiscrepancyIndicator
     */
    public void setGoodsDiscrepancyIndicator(String goodsDiscrepancyIndicator) {
        this.goodsDiscrepancyIndicator = goodsDiscrepancyIndicator;
    }
}


package ru.acs.fts.schemas.album.cwstoragequitance;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GoodsBaseType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHSuppQuantityType;

/** 
 * Информация о товаре
 */
public class CommodityType extends GoodsBaseType
{
    private String goodsNumericPred;
    private String goodsNumberInGTD;
    private String goodsPlacesIn;
    private String ratableValueIn;
    private String goodsPlacesRest;
    private String ratableValueRest;
    private String grossWeightQuantityRest;
    private WHSuppQuantityType grossWeightSuppQuantityIn;
    private GTDIDType GTDOutNumber;

    /** 
     * Get the 'GoodsNumericPred' element value. Порядковый номер товара в предыдущей квитанции
     * 
     * @return value
     */
    public String getGoodsNumericPred() {
        return goodsNumericPred;
    }

    /** 
     * Set the 'GoodsNumericPred' element value. Порядковый номер товара в предыдущей квитанции
     * 
     * @param goodsNumericPred
     */
    public void setGoodsNumericPred(String goodsNumericPred) {
        this.goodsNumericPred = goodsNumericPred;
    }

    /** 
     * Get the 'GoodsNumberInGTD' element value. Порядковый номер товара в ДТ, по которой принят груз
     * 
     * @return value
     */
    public String getGoodsNumberInGTD() {
        return goodsNumberInGTD;
    }

    /** 
     * Set the 'GoodsNumberInGTD' element value. Порядковый номер товара в ДТ, по которой принят груз
     * 
     * @param goodsNumberInGTD
     */
    public void setGoodsNumberInGTD(String goodsNumberInGTD) {
        this.goodsNumberInGTD = goodsNumberInGTD;
    }

    /** 
     * Get the 'GoodsPlacesIn' element value. Количество принятых грузовых мест
     * 
     * @return value
     */
    public String getGoodsPlacesIn() {
        return goodsPlacesIn;
    }

    /** 
     * Set the 'GoodsPlacesIn' element value. Количество принятых грузовых мест
     * 
     * @param goodsPlacesIn
     */
    public void setGoodsPlacesIn(String goodsPlacesIn) {
        this.goodsPlacesIn = goodsPlacesIn;
    }

    /** 
     * Get the 'RatableValueIn' element value. Оценочная стоимость принятого груза
     * 
     * @return value
     */
    public String getRatableValueIn() {
        return ratableValueIn;
    }

    /** 
     * Set the 'RatableValueIn' element value. Оценочная стоимость принятого груза
     * 
     * @param ratableValueIn
     */
    public void setRatableValueIn(String ratableValueIn) {
        this.ratableValueIn = ratableValueIn;
    }

    /** 
     * Get the 'GoodsPlacesRest' element value. Количество остатка мест товаров на складе
     * 
     * @return value
     */
    public String getGoodsPlacesRest() {
        return goodsPlacesRest;
    }

    /** 
     * Set the 'GoodsPlacesRest' element value. Количество остатка мест товаров на складе
     * 
     * @param goodsPlacesRest
     */
    public void setGoodsPlacesRest(String goodsPlacesRest) {
        this.goodsPlacesRest = goodsPlacesRest;
    }

    /** 
     * Get the 'RatableValueRest' element value. Оценочная стоимость остатка товаров на складе
     * 
     * @return value
     */
    public String getRatableValueRest() {
        return ratableValueRest;
    }

    /** 
     * Set the 'RatableValueRest' element value. Оценочная стоимость остатка товаров на складе
     * 
     * @param ratableValueRest
     */
    public void setRatableValueRest(String ratableValueRest) {
        this.ratableValueRest = ratableValueRest;
    }

    /** 
     * Get the 'GrossWeightQuantityRest' element value. Вес брутто остатков товара на складе (в кг или ДЕИ)
     * 
     * @return value
     */
    public String getGrossWeightQuantityRest() {
        return grossWeightQuantityRest;
    }

    /** 
     * Set the 'GrossWeightQuantityRest' element value. Вес брутто остатков товара на складе (в кг или ДЕИ)
     * 
     * @param grossWeightQuantityRest
     */
    public void setGrossWeightQuantityRest(String grossWeightQuantityRest) {
        this.grossWeightQuantityRest = grossWeightQuantityRest;
    }

    /** 
     * Get the 'GrossWeightSuppQuantityIn' element value. Вес брутто принятого груза в ДЕИ
     * 
     * @return value
     */
    public WHSuppQuantityType getGrossWeightSuppQuantityIn() {
        return grossWeightSuppQuantityIn;
    }

    /** 
     * Set the 'GrossWeightSuppQuantityIn' element value. Вес брутто принятого груза в ДЕИ
     * 
     * @param grossWeightSuppQuantityIn
     */
    public void setGrossWeightSuppQuantityIn(
            WHSuppQuantityType grossWeightSuppQuantityIn) {
        this.grossWeightSuppQuantityIn = grossWeightSuppQuantityIn;
    }

    /** 
     * Get the 'GTDOutNumber' element value. Номер ДТ, по которому товары выпущены со склада
     * 
     * @return value
     */
    public GTDIDType getGTDOutNumber() {
        return GTDOutNumber;
    }

    /** 
     * Set the 'GTDOutNumber' element value. Номер ДТ, по которому товары выпущены со склада
     * 
     * @param GTDOutNumber
     */
    public void setGTDOutNumber(GTDIDType GTDOutNumber) {
        this.GTDOutNumber = GTDOutNumber;
    }
}


package ru.acs.fts.schemas.album.cwformular;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHSuppQuantityType;

/** 
 * Информация о выпуске товара
 */
public class CommodityOutType
{
    private String goodsNumber;
    private String goodsNumberInGTD;
    private String customsModeCode;
    private String goodsWeight;
    private String notes;
    private String goodsNumberMain;
    private WHSuppQuantityType goodsValue;
    private WHSuppQuantityType goodsValue1;
    private WHSuppQuantityType goodsValue2;
    private GTDIDType GTDNumber;

    /** 
     * Get the 'GoodsNumber' element value. Порядковый номер в списке выпускаемых товаров
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. Порядковый номер в списке выпускаемых товаров
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the 'GoodsNumberInGTD' element value. Порядковый номер товара в ДТ, по которой товар помещен на склад
     * 
     * @return value
     */
    public String getGoodsNumberInGTD() {
        return goodsNumberInGTD;
    }

    /** 
     * Set the 'GoodsNumberInGTD' element value. Порядковый номер товара в ДТ, по которой товар помещен на склад
     * 
     * @param goodsNumberInGTD
     */
    public void setGoodsNumberInGTD(String goodsNumberInGTD) {
        this.goodsNumberInGTD = goodsNumberInGTD;
    }

    /** 
     * Get the 'CustomsModeCode' element value. Таможенный режим, по которому выпускается товар
     * 
     * @return value
     */
    public String getCustomsModeCode() {
        return customsModeCode;
    }

    /** 
     * Set the 'CustomsModeCode' element value. Таможенный режим, по которому выпускается товар
     * 
     * @param customsModeCode
     */
    public void setCustomsModeCode(String customsModeCode) {
        this.customsModeCode = customsModeCode;
    }

    /** 
     * Get the 'GoodsWeight' element value. Вес товара в кг
     * 
     * @return value
     */
    public String getGoodsWeight() {
        return goodsWeight;
    }

    /** 
     * Set the 'GoodsWeight' element value. Вес товара в кг
     * 
     * @param goodsWeight
     */
    public void setGoodsWeight(String goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    /** 
     * Get the 'Notes' element value. Примечание
     * 
     * @return value
     */
    public String getNotes() {
        return notes;
    }

    /** 
     * Set the 'Notes' element value. Примечание
     * 
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /** 
     * Get the 'GoodsNumberMain' element value. Порядковый номер товара в формуляре.
     * 
     * @return value
     */
    public String getGoodsNumberMain() {
        return goodsNumberMain;
    }

    /** 
     * Set the 'GoodsNumberMain' element value. Порядковый номер товара в формуляре.
     * 
     * @param goodsNumberMain
     */
    public void setGoodsNumberMain(String goodsNumberMain) {
        this.goodsNumberMain = goodsNumberMain;
    }

    /** 
     * Get the 'GoodsValue' element value. Количество товара в дополнительной единице измерения
     * 
     * @return value
     */
    public WHSuppQuantityType getGoodsValue() {
        return goodsValue;
    }

    /** 
     * Set the 'GoodsValue' element value. Количество товара в дополнительной единице измерения
     * 
     * @param goodsValue
     */
    public void setGoodsValue(WHSuppQuantityType goodsValue) {
        this.goodsValue = goodsValue;
    }

    /** 
     * Get the 'GoodsValue1' element value. Количество товара в физической единице измерения
     * 
     * @return value
     */
    public WHSuppQuantityType getGoodsValue1() {
        return goodsValue1;
    }

    /** 
     * Set the 'GoodsValue1' element value. Количество товара в физической единице измерения
     * 
     * @param goodsValue1
     */
    public void setGoodsValue1(WHSuppQuantityType goodsValue1) {
        this.goodsValue1 = goodsValue1;
    }

    /** 
     * Get the 'GoodsValue2' element value. Количество товара в физической единице измерения
     * 
     * @return value
     */
    public WHSuppQuantityType getGoodsValue2() {
        return goodsValue2;
    }

    /** 
     * Set the 'GoodsValue2' element value. Количество товара в физической единице измерения
     * 
     * @param goodsValue2
     */
    public void setGoodsValue2(WHSuppQuantityType goodsValue2) {
        this.goodsValue2 = goodsValue2;
    }

    /** 
     * Get the 'GTDNumber' element value. Номер ДТ, по которому выпускается товар
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. Номер ДТ, по которому выпускается товар
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }
}

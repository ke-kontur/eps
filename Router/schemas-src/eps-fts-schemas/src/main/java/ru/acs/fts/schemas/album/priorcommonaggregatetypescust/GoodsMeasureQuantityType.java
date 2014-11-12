
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

/** 
 * Количество товара в дополнительных единицах измерения
 */
public class GoodsMeasureQuantityType
{
    private String goodsQuantity;
    private String measureUnitQualifierName;
    private String measureUnitQualifierCode;

    /** 
     * Get the 'GoodsQuantity' element value. Количество товара в единице измерения.
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. Количество товара в единице измерения.
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'MeasureUnitQualifierName' element value. Краткое наименование единицы измерения.
     * 
     * @return value
     */
    public String getMeasureUnitQualifierName() {
        return measureUnitQualifierName;
    }

    /** 
     * Set the 'MeasureUnitQualifierName' element value. Краткое наименование единицы измерения.
     * 
     * @param measureUnitQualifierName
     */
    public void setMeasureUnitQualifierName(String measureUnitQualifierName) {
        this.measureUnitQualifierName = measureUnitQualifierName;
    }

    /** 
     * Get the 'MeasureUnitQualifierCode' element value. Код единицы измерения в соответствии с единицами измерения, применяемыми в Таможенном тарифе Российской Федерации..
     * 
     * @return value
     */
    public String getMeasureUnitQualifierCode() {
        return measureUnitQualifierCode;
    }

    /** 
     * Set the 'MeasureUnitQualifierCode' element value. Код единицы измерения в соответствии с единицами измерения, применяемыми в Таможенном тарифе Российской Федерации..
     * 
     * @param measureUnitQualifierCode
     */
    public void setMeasureUnitQualifierCode(String measureUnitQualifierCode) {
        this.measureUnitQualifierCode = measureUnitQualifierCode;
    }
}

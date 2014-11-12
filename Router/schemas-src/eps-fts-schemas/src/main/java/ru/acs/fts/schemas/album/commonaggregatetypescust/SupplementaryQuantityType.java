
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * Количество в дополнительной единице измерения
 */
public class SupplementaryQuantityType
{
    private String goodsQuantity;
    private String measureUnitQualifierName;
    private String measureUnitQualifierCode;

    /** 
     * Get the 'GoodsQuantity' element value. Количество товара в единице измерения
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. Количество товара в единице измерения
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'MeasureUnitQualifierName' element value. Условное обозначение единицы измерения
     * 
     * @return value
     */
    public String getMeasureUnitQualifierName() {
        return measureUnitQualifierName;
    }

    /** 
     * Set the 'MeasureUnitQualifierName' element value. Условное обозначение единицы измерения
     * 
     * @param measureUnitQualifierName
     */
    public void setMeasureUnitQualifierName(String measureUnitQualifierName) {
        this.measureUnitQualifierName = measureUnitQualifierName;
    }

    /** 
     * Get the 'MeasureUnitQualifierCode' element value. Код единицы измерения в соответствии с единицами измерения, применяемыми в ТН ВЭД ТС
     * 
     * @return value
     */
    public String getMeasureUnitQualifierCode() {
        return measureUnitQualifierCode;
    }

    /** 
     * Set the 'MeasureUnitQualifierCode' element value. Код единицы измерения в соответствии с единицами измерения, применяемыми в ТН ВЭД ТС
     * 
     * @param measureUnitQualifierCode
     */
    public void setMeasureUnitQualifierCode(String measureUnitQualifierCode) {
        this.measureUnitQualifierCode = measureUnitQualifierCode;
    }
}

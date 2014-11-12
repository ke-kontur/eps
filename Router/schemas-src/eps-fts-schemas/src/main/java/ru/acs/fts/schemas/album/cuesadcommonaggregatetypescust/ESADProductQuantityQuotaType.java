
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * Сведения об остатке квоты, выраженные в количестве продукта. Заполняется в случае, если квота указывается в единицах измерения
 */
public class ESADProductQuantityQuotaType
{
    private String quotaQuantity;
    private String quotaMeasureUnitQualifierCode;
    private String quotaMeasurementName;

    /** 
     * Get the 'QuotaQuantity' element value. Остаток квоты в единице измерения
     * 
     * @return value
     */
    public String getQuotaQuantity() {
        return quotaQuantity;
    }

    /** 
     * Set the 'QuotaQuantity' element value. Остаток квоты в единице измерения
     * 
     * @param quotaQuantity
     */
    public void setQuotaQuantity(String quotaQuantity) {
        this.quotaQuantity = quotaQuantity;
    }

    /** 
     * Get the 'QuotaMeasureUnitQualifierCode' element value. Код единицы измерения квоты в соответствии с классификатором единиц измерения
     * 
     * @return value
     */
    public String getQuotaMeasureUnitQualifierCode() {
        return quotaMeasureUnitQualifierCode;
    }

    /** 
     * Set the 'QuotaMeasureUnitQualifierCode' element value. Код единицы измерения квоты в соответствии с классификатором единиц измерения
     * 
     * @param quotaMeasureUnitQualifierCode
     */
    public void setQuotaMeasureUnitQualifierCode(
            String quotaMeasureUnitQualifierCode) {
        this.quotaMeasureUnitQualifierCode = quotaMeasureUnitQualifierCode;
    }

    /** 
     * Get the 'QuotaMeasurementName' element value. Наименование единицы измерения квоты
     * 
     * @return value
     */
    public String getQuotaMeasurementName() {
        return quotaMeasurementName;
    }

    /** 
     * Set the 'QuotaMeasurementName' element value. Наименование единицы измерения квоты
     * 
     * @param quotaMeasurementName
     */
    public void setQuotaMeasurementName(String quotaMeasurementName) {
        this.quotaMeasurementName = quotaMeasurementName;
    }
}


package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * —ведени€ об остатке квоты, выраженные в количестве продукта. «аполн€етс€ в случае, если квота указываетс€ в единицах измерени€
 */
public class ESADProductQuantityQuotaType
{
    private String quotaQuantity;
    private String quotaMeasureUnitQualifierCode;
    private String quotaMeasurementName;

    /** 
     * Get the 'QuotaQuantity' element value. ќстаток квоты в единице измерени€
     * 
     * @return value
     */
    public String getQuotaQuantity() {
        return quotaQuantity;
    }

    /** 
     * Set the 'QuotaQuantity' element value. ќстаток квоты в единице измерени€
     * 
     * @param quotaQuantity
     */
    public void setQuotaQuantity(String quotaQuantity) {
        this.quotaQuantity = quotaQuantity;
    }

    /** 
     * Get the 'QuotaMeasureUnitQualifierCode' element value.  од единицы измерени€ квоты в соответствии с классификатором единиц измерени€
     * 
     * @return value
     */
    public String getQuotaMeasureUnitQualifierCode() {
        return quotaMeasureUnitQualifierCode;
    }

    /** 
     * Set the 'QuotaMeasureUnitQualifierCode' element value.  од единицы измерени€ квоты в соответствии с классификатором единиц измерени€
     * 
     * @param quotaMeasureUnitQualifierCode
     */
    public void setQuotaMeasureUnitQualifierCode(
            String quotaMeasureUnitQualifierCode) {
        this.quotaMeasureUnitQualifierCode = quotaMeasureUnitQualifierCode;
    }

    /** 
     * Get the 'QuotaMeasurementName' element value. Ќаименование единицы измерени€ квоты
     * 
     * @return value
     */
    public String getQuotaMeasurementName() {
        return quotaMeasurementName;
    }

    /** 
     * Set the 'QuotaMeasurementName' element value. Ќаименование единицы измерени€ квоты
     * 
     * @param quotaMeasurementName
     */
    public void setQuotaMeasurementName(String quotaMeasurementName) {
        this.quotaMeasurementName = quotaMeasurementName;
    }
}

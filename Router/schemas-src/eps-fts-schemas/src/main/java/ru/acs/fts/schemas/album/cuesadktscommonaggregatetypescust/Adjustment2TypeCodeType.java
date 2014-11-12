
package ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust;

/** 
 * Тип корректировки - блок 2
 */
public class Adjustment2TypeCodeType
{
    private String basisCalculating;
    private String addAccrual;
    private String cost;
    private String basisCompilationKTS;

    /** 
     * Get the 'BasisCalculating' element value. Признак корректировки основы для расчета таможенной стоимости товаров
     * 
     * @return value
     */
    public String getBasisCalculating() {
        return basisCalculating;
    }

    /** 
     * Set the 'BasisCalculating' element value. Признак корректировки основы для расчета таможенной стоимости товаров
     * 
     * @param basisCalculating
     */
    public void setBasisCalculating(String basisCalculating) {
        this.basisCalculating = basisCalculating;
    }

    /** 
     * Get the 'AddAccrual' element value. Признак корректировки дополнительных начислений к основе для расчета таможенной стоимости
     * 
     * @return value
     */
    public String getAddAccrual() {
        return addAccrual;
    }

    /** 
     * Set the 'AddAccrual' element value. Признак корректировки дополнительных начислений к основе для расчета таможенной стоимости
     * 
     * @param addAccrual
     */
    public void setAddAccrual(String addAccrual) {
        this.addAccrual = addAccrual;
    }

    /** 
     * Get the 'Cost' element value. Признак корректировки величины затрат, разрешенных к вычету из основы для расчета таможенной стоимости
     * 
     * @return value
     */
    public String getCost() {
        return cost;
    }

    /** 
     * Set the 'Cost' element value. Признак корректировки величины затрат, разрешенных к вычету из основы для расчета таможенной стоимости
     * 
     * @param cost
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /** 
     * Get the 'BasisCompilationKTS' element value. Признак обстоятельств, послуживших основанием для составления КТС
     * 
     * @return value
     */
    public String getBasisCompilationKTS() {
        return basisCompilationKTS;
    }

    /** 
     * Set the 'BasisCompilationKTS' element value. Признак обстоятельств, послуживших основанием для составления КТС
     * 
     * @param basisCompilationKTS
     */
    public void setBasisCompilationKTS(String basisCompilationKTS) {
        this.basisCompilationKTS = basisCompilationKTS;
    }
}

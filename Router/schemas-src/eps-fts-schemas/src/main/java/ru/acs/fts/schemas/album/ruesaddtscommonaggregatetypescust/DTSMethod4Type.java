
package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

/** 
 * Метод вычитания. (4)
 */
public class DTSMethod4Type
{
    private Method4BasisType method4Basis;
    private Method4DeductionType method4Deduction;

    /** 
     * Get the 'Method4Basis' element value. Основа для расчета таможенной стоимости по методу 4 гр. А (11)
     * 
     * @return value
     */
    public Method4BasisType getMethod4Basis() {
        return method4Basis;
    }

    /** 
     * Set the 'Method4Basis' element value. Основа для расчета таможенной стоимости по методу 4 гр. А (11)
     * 
     * @param method4Basis
     */
    public void setMethod4Basis(Method4BasisType method4Basis) {
        this.method4Basis = method4Basis;
    }

    /** 
     * Get the 'Method4Deduction' element value. Вычеты сумм, которые вошли в раздел А гр. Б (12-17)
     * 
     * @return value
     */
    public Method4DeductionType getMethod4Deduction() {
        return method4Deduction;
    }

    /** 
     * Set the 'Method4Deduction' element value. Вычеты сумм, которые вошли в раздел А гр. Б (12-17)
     * 
     * @param method4Deduction
     */
    public void setMethod4Deduction(Method4DeductionType method4Deduction) {
        this.method4Deduction = method4Deduction;
    }
}

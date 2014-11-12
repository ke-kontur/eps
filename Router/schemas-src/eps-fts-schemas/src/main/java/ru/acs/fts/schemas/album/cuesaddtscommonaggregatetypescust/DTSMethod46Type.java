
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

/** 
 * Подробности расчета таможенной стоимости по методу вычитания и (или) резервному методу на его основе (4,6)
 */
public class DTSMethod46Type
{
    private Method46BasisType method46Basis;
    private Method46DeductionType method46Deduction;
    private DTSSupplementaryQuantityType declaratedGoodsQuantity;

    /** 
     * Get the 'Method46Basis' element value. Основа для расчета таможенной стоимости по методу 4,6 гр. А (11)
     * 
     * @return value
     */
    public Method46BasisType getMethod46Basis() {
        return method46Basis;
    }

    /** 
     * Set the 'Method46Basis' element value. Основа для расчета таможенной стоимости по методу 4,6 гр. А (11)
     * 
     * @param method46Basis
     */
    public void setMethod46Basis(Method46BasisType method46Basis) {
        this.method46Basis = method46Basis;
    }

    /** 
     * Get the 'Method46Deduction' element value. Вычеты сумм, которые вошли в раздел А гр. Б (12-16)
     * 
     * @return value
     */
    public Method46DeductionType getMethod46Deduction() {
        return method46Deduction;
    }

    /** 
     * Set the 'Method46Deduction' element value. Вычеты сумм, которые вошли в раздел А гр. Б (12-16)
     * 
     * @param method46Deduction
     */
    public void setMethod46Deduction(Method46DeductionType method46Deduction) {
        this.method46Deduction = method46Deduction;
    }

    /** 
     * Get the 'DeclaratedGoodsQuantity' element value. Количество оцениваемых товаров
     * 
     * @return value
     */
    public DTSSupplementaryQuantityType getDeclaratedGoodsQuantity() {
        return declaratedGoodsQuantity;
    }

    /** 
     * Set the 'DeclaratedGoodsQuantity' element value. Количество оцениваемых товаров
     * 
     * @param declaratedGoodsQuantity
     */
    public void setDeclaratedGoodsQuantity(
            DTSSupplementaryQuantityType declaratedGoodsQuantity) {
        this.declaratedGoodsQuantity = declaratedGoodsQuantity;
    }
}

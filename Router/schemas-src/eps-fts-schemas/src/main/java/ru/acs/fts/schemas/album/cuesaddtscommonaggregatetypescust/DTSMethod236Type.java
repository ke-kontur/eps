
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

/** 
 * Подробности расчета таможенной стоимости по методу стоимости сделки с идентичными или с однородными товарами и (или) резервному методу на их основе (2,3,6)
 */
public class DTSMethod236Type
{
    private Method2BasisType method2Basis;
    private Method2DealCorrectType method2DealCorrect;
    private DTSSupplementaryQuantityType identicalGoodsQuantity;
    private DTSSupplementaryQuantityType declaratedGoodsQuantity;

    /** 
     * Get the 'Method2Basis' element value. Основа расчета таможенной стоимости по методу 2,3,6. Гр. А (11)
     * 
     * @return value
     */
    public Method2BasisType getMethod2Basis() {
        return method2Basis;
    }

    /** 
     * Set the 'Method2Basis' element value. Основа расчета таможенной стоимости по методу 2,3,6. Гр. А (11)
     * 
     * @param method2Basis
     */
    public void setMethod2Basis(Method2BasisType method2Basis) {
        this.method2Basis = method2Basis;
    }

    /** 
     * Get the 'Method2DealCorrect' element value. Корректировка стоимости  сделки
     * 
     * @return value
     */
    public Method2DealCorrectType getMethod2DealCorrect() {
        return method2DealCorrect;
    }

    /** 
     * Set the 'Method2DealCorrect' element value. Корректировка стоимости  сделки
     * 
     * @param method2DealCorrect
     */
    public void setMethod2DealCorrect(Method2DealCorrectType method2DealCorrect) {
        this.method2DealCorrect = method2DealCorrect;
    }

    /** 
     * Get the 'IdenticalGoodsQuantity' element value. Количество идентичных/однородных товаров
     * 
     * @return value
     */
    public DTSSupplementaryQuantityType getIdenticalGoodsQuantity() {
        return identicalGoodsQuantity;
    }

    /** 
     * Set the 'IdenticalGoodsQuantity' element value. Количество идентичных/однородных товаров
     * 
     * @param identicalGoodsQuantity
     */
    public void setIdenticalGoodsQuantity(
            DTSSupplementaryQuantityType identicalGoodsQuantity) {
        this.identicalGoodsQuantity = identicalGoodsQuantity;
    }

    /** 
     * Get the 'DeclaratedGoodsQuantity' element value. Количество оцениваемых товаров. 17б
     * 
     * @return value
     */
    public DTSSupplementaryQuantityType getDeclaratedGoodsQuantity() {
        return declaratedGoodsQuantity;
    }

    /** 
     * Set the 'DeclaratedGoodsQuantity' element value. Количество оцениваемых товаров. 17б
     * 
     * @param declaratedGoodsQuantity
     */
    public void setDeclaratedGoodsQuantity(
            DTSSupplementaryQuantityType declaratedGoodsQuantity) {
        this.declaratedGoodsQuantity = declaratedGoodsQuantity;
    }
}

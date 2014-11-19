
package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.Method2BasisType;

/** 
 * Подробности расчета таможенной стоимости по методу 2,3,6
 */
public class DTS4Method236Type
{
    private Method2BasisType method2Basis;
    private DTS4Method2DealCorrectType method2DealCorrect;
    private SupplementaryQuantityType declaratedGoodsQuantity;
    private SupplementaryQuantityType identicalGoodsQuantity;

    /** 
     * Get the 'Method2Basis' element value. Основа расчета таможенной стоимости по методу 2,3,6.
     * 
     * @return value
     */
    public Method2BasisType getMethod2Basis() {
        return method2Basis;
    }

    /** 
     * Set the 'Method2Basis' element value. Основа расчета таможенной стоимости по методу 2,3,6.
     * 
     * @param method2Basis
     */
    public void setMethod2Basis(Method2BasisType method2Basis) {
        this.method2Basis = method2Basis;
    }

    /** 
     * Get the 'Method2DealCorrect' element value. Корректировка стоимости  сделки.
     * 
     * @return value
     */
    public DTS4Method2DealCorrectType getMethod2DealCorrect() {
        return method2DealCorrect;
    }

    /** 
     * Set the 'Method2DealCorrect' element value. Корректировка стоимости  сделки.
     * 
     * @param method2DealCorrect
     */
    public void setMethod2DealCorrect(
            DTS4Method2DealCorrectType method2DealCorrect) {
        this.method2DealCorrect = method2DealCorrect;
    }

    /** 
     * Get the 'DeclaratedGoodsQuantity' element value. Количество декларируемых (оцениваемых) товаров. 16б
     * 
     * @return value
     */
    public SupplementaryQuantityType getDeclaratedGoodsQuantity() {
        return declaratedGoodsQuantity;
    }

    /** 
     * Set the 'DeclaratedGoodsQuantity' element value. Количество декларируемых (оцениваемых) товаров. 16б
     * 
     * @param declaratedGoodsQuantity
     */
    public void setDeclaratedGoodsQuantity(
            SupplementaryQuantityType declaratedGoodsQuantity) {
        this.declaratedGoodsQuantity = declaratedGoodsQuantity;
    }

    /** 
     * Get the 'IdenticalGoodsQuantity' element value. Количество идентичных/однородных товаров.16а
     * 
     * @return value
     */
    public SupplementaryQuantityType getIdenticalGoodsQuantity() {
        return identicalGoodsQuantity;
    }

    /** 
     * Set the 'IdenticalGoodsQuantity' element value. Количество идентичных/однородных товаров.16а
     * 
     * @param identicalGoodsQuantity
     */
    public void setIdenticalGoodsQuantity(
            SupplementaryQuantityType identicalGoodsQuantity) {
        this.identicalGoodsQuantity = identicalGoodsQuantity;
    }
}


package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Квота
 */
public class ESADGoodsQuotaType
{
    private List<ESADProductQuantityQuotaType> ESADProductQuantityQuotaList = new ArrayList<ESADProductQuantityQuotaType>();
    private ESADCurrencyQuotaType ESADCurrencyQuota;
    private SupplementaryQuantityType supplementaryGoodsQuantity;

    /** 
     * Get the list of 'ESADProductQuantityQuota' element items. Сведения об остатке квоты, выраженные в количестве продукта. Заполняется в случае, если квота указывается в единицах измерения
     * 
     * @return list
     */
    public List<ESADProductQuantityQuotaType> getESADProductQuantityQuotaList() {
        return ESADProductQuantityQuotaList;
    }

    /** 
     * Set the list of 'ESADProductQuantityQuota' element items. Сведения об остатке квоты, выраженные в количестве продукта. Заполняется в случае, если квота указывается в единицах измерения
     * 
     * @param list
     */
    public void setESADProductQuantityQuotaList(
            List<ESADProductQuantityQuotaType> list) {
        ESADProductQuantityQuotaList = list;
    }

    /** 
     * Get the 'ESADCurrencyQuota' element value. Сведения об остатке квоты в стоимостном выражении. Заполняется в случае, если квота установлена в стоимостном выражении
     * 
     * @return value
     */
    public ESADCurrencyQuotaType getESADCurrencyQuota() {
        return ESADCurrencyQuota;
    }

    /** 
     * Set the 'ESADCurrencyQuota' element value. Сведения об остатке квоты в стоимостном выражении. Заполняется в случае, если квота установлена в стоимостном выражении
     * 
     * @param ESADCurrencyQuota
     */
    public void setESADCurrencyQuota(ESADCurrencyQuotaType ESADCurrencyQuota) {
        this.ESADCurrencyQuota = ESADCurrencyQuota;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. Количество декларируемого товара в единице измерения, необходимое для списания квоты. Для РК
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. Количество декларируемого товара в единице измерения, необходимое для списания квоты. Для РК
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(
            SupplementaryQuantityType supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }
}

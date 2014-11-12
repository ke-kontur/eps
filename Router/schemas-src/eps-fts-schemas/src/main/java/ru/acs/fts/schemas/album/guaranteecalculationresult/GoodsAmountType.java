
package ru.acs.fts.schemas.album.guaranteecalculationresult;

import ru.acs.fts.schemas.album.guaranteecommonaggregatetypescust.TotalAmountType;

/** 
 * Рассчитанные суммы обеспечения по товару.
 */
public class GoodsAmountType
{
    private String numeric;
    private String TNVEDCode;
    private TotalAmountType guaranteeAmount;

    /** 
     * Get the 'Numeric' element value. Номер товара по порядку
     * 
     * @return value
     */
    public String getNumeric() {
        return numeric;
    }

    /** 
     * Set the 'Numeric' element value. Номер товара по порядку
     * 
     * @param numeric
     */
    public void setNumeric(String numeric) {
        this.numeric = numeric;
    }

    /** 
     * Get the 'TNVEDCode' element value. Код товара по ТН ВЭД ТС (указывается от 6 до 10 знаков)
     * 
     * @return value
     */
    public String getTNVEDCode() {
        return TNVEDCode;
    }

    /** 
     * Set the 'TNVEDCode' element value. Код товара по ТН ВЭД ТС (указывается от 6 до 10 знаков)
     * 
     * @param TNVEDCode
     */
    public void setTNVEDCode(String TNVEDCode) {
        this.TNVEDCode = TNVEDCode;
    }

    /** 
     * Get the 'GuaranteeAmount' element value. Сумма обеспечения по товару
     * 
     * @return value
     */
    public TotalAmountType getGuaranteeAmount() {
        return guaranteeAmount;
    }

    /** 
     * Set the 'GuaranteeAmount' element value. Сумма обеспечения по товару
     * 
     * @param guaranteeAmount
     */
    public void setGuaranteeAmount(TotalAmountType guaranteeAmount) {
        this.guaranteeAmount = guaranteeAmount;
    }
}

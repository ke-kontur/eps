
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

/** 
 * Информация о прочих расходах
 */
public class OtherChargesType
{
    private String chargeType;
    private String chargeAmount;

    /** 
     * Get the 'ChargeType' element value. Тип расхода (например, упаковка, перегрузка в порту и прочее).
     * 
     * @return value
     */
    public String getChargeType() {
        return chargeType;
    }

    /** 
     * Set the 'ChargeType' element value. Тип расхода (например, упаковка, перегрузка в порту и прочее).
     * 
     * @param chargeType
     */
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    /** 
     * Get the 'ChargeAmount' element value. Сумма расхода.
     * 
     * @return value
     */
    public String getChargeAmount() {
        return chargeAmount;
    }

    /** 
     * Set the 'ChargeAmount' element value. Сумма расхода.
     * 
     * @param chargeAmount
     */
    public void setChargeAmount(String chargeAmount) {
        this.chargeAmount = chargeAmount;
    }
}

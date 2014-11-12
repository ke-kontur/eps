
package ru.acs.fts.schemas.album.airwaybill;

/** 
 * Другие сборы
 */
public class OtherChargesType
{
    private String otherChargeCode;
    private String entitlementCode;
    private String otherChargeAmount;

    /** 
     * Get the 'OtherChargeCode' element value. Код  прочих  сборов
     * 
     * @return value
     */
    public String getOtherChargeCode() {
        return otherChargeCode;
    }

    /** 
     * Set the 'OtherChargeCode' element value. Код  прочих  сборов
     * 
     * @param otherChargeCode
     */
    public void setOtherChargeCode(String otherChargeCode) {
        this.otherChargeCode = otherChargeCode;
    }

    /** 
     * Get the 'EntitlementCode' element value. Дополнительный код
     * 
     * @return value
     */
    public String getEntitlementCode() {
        return entitlementCode;
    }

    /** 
     * Set the 'EntitlementCode' element value. Дополнительный код
     * 
     * @param entitlementCode
     */
    public void setEntitlementCode(String entitlementCode) {
        this.entitlementCode = entitlementCode;
    }

    /** 
     * Get the 'OtherChargeAmount' element value. Сумма
     * 
     * @return value
     */
    public String getOtherChargeAmount() {
        return otherChargeAmount;
    }

    /** 
     * Set the 'OtherChargeAmount' element value. Сумма
     * 
     * @param otherChargeAmount
     */
    public void setOtherChargeAmount(String otherChargeAmount) {
        this.otherChargeAmount = otherChargeAmount;
    }
}


package ru.acs.fts.schemas.album.airwaybill;

/** 
 * ������ �����
 */
public class OtherChargesType
{
    private String otherChargeCode;
    private String entitlementCode;
    private String otherChargeAmount;

    /** 
     * Get the 'OtherChargeCode' element value. ���  ������  ������
     * 
     * @return value
     */
    public String getOtherChargeCode() {
        return otherChargeCode;
    }

    /** 
     * Set the 'OtherChargeCode' element value. ���  ������  ������
     * 
     * @param otherChargeCode
     */
    public void setOtherChargeCode(String otherChargeCode) {
        this.otherChargeCode = otherChargeCode;
    }

    /** 
     * Get the 'EntitlementCode' element value. �������������� ���
     * 
     * @return value
     */
    public String getEntitlementCode() {
        return entitlementCode;
    }

    /** 
     * Set the 'EntitlementCode' element value. �������������� ���
     * 
     * @param entitlementCode
     */
    public void setEntitlementCode(String entitlementCode) {
        this.entitlementCode = entitlementCode;
    }

    /** 
     * Get the 'OtherChargeAmount' element value. �����
     * 
     * @return value
     */
    public String getOtherChargeAmount() {
        return otherChargeAmount;
    }

    /** 
     * Set the 'OtherChargeAmount' element value. �����
     * 
     * @param otherChargeAmount
     */
    public void setOtherChargeAmount(String otherChargeAmount) {
        this.otherChargeAmount = otherChargeAmount;
    }
}

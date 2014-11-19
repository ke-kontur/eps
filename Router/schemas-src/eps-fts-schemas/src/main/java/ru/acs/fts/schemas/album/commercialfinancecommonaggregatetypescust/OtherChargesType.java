
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

/** 
 * ���������� � ������ ��������
 */
public class OtherChargesType
{
    private String chargeType;
    private String chargeAmount;

    /** 
     * Get the 'ChargeType' element value. ��� ������� (��������, ��������, ���������� � ����� � ������).
     * 
     * @return value
     */
    public String getChargeType() {
        return chargeType;
    }

    /** 
     * Set the 'ChargeType' element value. ��� ������� (��������, ��������, ���������� � ����� � ������).
     * 
     * @param chargeType
     */
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    /** 
     * Get the 'ChargeAmount' element value. ����� �������.
     * 
     * @return value
     */
    public String getChargeAmount() {
        return chargeAmount;
    }

    /** 
     * Set the 'ChargeAmount' element value. ����� �������.
     * 
     * @param chargeAmount
     */
    public void setChargeAmount(String chargeAmount) {
        this.chargeAmount = chargeAmount;
    }
}

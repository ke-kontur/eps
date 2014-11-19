
package ru.acs.fts.schemas.album.guaranteecalculationresult;

import ru.acs.fts.schemas.album.guaranteecommonaggregatetypescust.TotalAmountType;

/** 
 * ������������ ����� ����������� �� ������.
 */
public class GoodsAmountType
{
    private String numeric;
    private String TNVEDCode;
    private TotalAmountType guaranteeAmount;

    /** 
     * Get the 'Numeric' element value. ����� ������ �� �������
     * 
     * @return value
     */
    public String getNumeric() {
        return numeric;
    }

    /** 
     * Set the 'Numeric' element value. ����� ������ �� �������
     * 
     * @param numeric
     */
    public void setNumeric(String numeric) {
        this.numeric = numeric;
    }

    /** 
     * Get the 'TNVEDCode' element value. ��� ������ �� �� ��� �� (����������� �� 6 �� 10 ������)
     * 
     * @return value
     */
    public String getTNVEDCode() {
        return TNVEDCode;
    }

    /** 
     * Set the 'TNVEDCode' element value. ��� ������ �� �� ��� �� (����������� �� 6 �� 10 ������)
     * 
     * @param TNVEDCode
     */
    public void setTNVEDCode(String TNVEDCode) {
        this.TNVEDCode = TNVEDCode;
    }

    /** 
     * Get the 'GuaranteeAmount' element value. ����� ����������� �� ������
     * 
     * @return value
     */
    public TotalAmountType getGuaranteeAmount() {
        return guaranteeAmount;
    }

    /** 
     * Set the 'GuaranteeAmount' element value. ����� ����������� �� ������
     * 
     * @param guaranteeAmount
     */
    public void setGuaranteeAmount(TotalAmountType guaranteeAmount) {
        this.guaranteeAmount = guaranteeAmount;
    }
}

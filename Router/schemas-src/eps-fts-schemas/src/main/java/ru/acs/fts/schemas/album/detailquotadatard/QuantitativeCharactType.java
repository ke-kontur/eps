
package ru.acs.fts.schemas.album.detailquotadatard;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������������� ��������������
 */
public class QuantitativeCharactType extends SupplementaryQuantityType
{
    private String restQuota;
    private String packing;
    private String quantityPacking;
    private String regForm;
    private String statisticalCost;
    private String invoice;
    private String currencyCode;

    /** 
     * Get the 'RestQuota' element value. ������� �� �����
     * 
     * @return value
     */
    public String getRestQuota() {
        return restQuota;
    }

    /** 
     * Set the 'RestQuota' element value. ������� �� �����
     * 
     * @param restQuota
     */
    public void setRestQuota(String restQuota) {
        this.restQuota = restQuota;
    }

    /** 
     * Get the 'Packing' element value. �������
     * 
     * @return value
     */
    public String getPacking() {
        return packing;
    }

    /** 
     * Set the 'Packing' element value. �������
     * 
     * @param packing
     */
    public void setPacking(String packing) {
        this.packing = packing;
    }

    /** 
     * Get the 'QuantityPacking' element value. ���������� ��������
     * 
     * @return value
     */
    public String getQuantityPacking() {
        return quantityPacking;
    }

    /** 
     * Set the 'QuantityPacking' element value. ���������� ��������
     * 
     * @param quantityPacking
     */
    public void setQuantityPacking(String quantityPacking) {
        this.quantityPacking = quantityPacking;
    }

    /** 
     * Get the 'RegForm' element value. ����� �������, ��������� ������������� �������
     * 
     * @return value
     */
    public String getRegForm() {
        return regForm;
    }

    /** 
     * Set the 'RegForm' element value. ����� �������, ��������� ������������� �������
     * 
     * @param regForm
     */
    public void setRegForm(String regForm) {
        this.regForm = regForm;
    }

    /** 
     * Get the 'StatisticalCost' element value. �������������� ��������� 
     * 
     * @return value
     */
    public String getStatisticalCost() {
        return statisticalCost;
    }

    /** 
     * Set the 'StatisticalCost' element value. �������������� ��������� 
     * 
     * @param statisticalCost
     */
    public void setStatisticalCost(String statisticalCost) {
        this.statisticalCost = statisticalCost;
    }

    /** 
     * Get the 'Invoice' element value. ��������� ���������
     * 
     * @return value
     */
    public String getInvoice() {
        return invoice;
    }

    /** 
     * Set the 'Invoice' element value. ��������� ���������
     * 
     * @param invoice
     */
    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������ 
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������ 
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}

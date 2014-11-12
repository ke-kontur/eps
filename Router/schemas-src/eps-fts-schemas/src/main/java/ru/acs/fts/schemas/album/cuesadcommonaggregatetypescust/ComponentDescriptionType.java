
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� ��������������� ����� ��� ����������
 */
public class ComponentDescriptionType
{
    private String goodsTNVEDCode;
    private String KGWeight;
    private String invoicedCost;
    private String invoiceCurrencyCode;
    private SupplementaryQuantityType supplementaryQuantity;

    /** 
     * Get the 'GoodsTNVEDCode' element value. ���  �� �� ��� ��
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. ���  �� �� ��� ��
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'KGWeight' element value. ���������� � ��
     * 
     * @return value
     */
    public String getKGWeight() {
        return KGWeight;
    }

    /** 
     * Set the 'KGWeight' element value. ���������� � ��
     * 
     * @param KGWeight
     */
    public void setKGWeight(String KGWeight) {
        this.KGWeight = KGWeight;
    }

    /** 
     * Get the 'InvoicedCost' element value.  ���� ������ /��������� ���������
     * 
     * @return value
     */
    public String getInvoicedCost() {
        return invoicedCost;
    }

    /** 
     * Set the 'InvoicedCost' element value.  ���� ������ /��������� ���������
     * 
     * @param invoicedCost
     */
    public void setInvoicedCost(String invoicedCost) {
        this.invoicedCost = invoicedCost;
    }

    /** 
     * Get the 'InvoiceCurrencyCode' element value. ��������� ��� ������ ��������� ���������
     * 
     * @return value
     */
    public String getInvoiceCurrencyCode() {
        return invoiceCurrencyCode;
    }

    /** 
     * Set the 'InvoiceCurrencyCode' element value. ��������� ��� ������ ��������� ���������
     * 
     * @param invoiceCurrencyCode
     */
    public void setInvoiceCurrencyCode(String invoiceCurrencyCode) {
        this.invoiceCurrencyCode = invoiceCurrencyCode;
    }

    /** 
     * Get the 'SupplementaryQuantity' element value. ���������� � �������������� ������� ���������
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryQuantity() {
        return supplementaryQuantity;
    }

    /** 
     * Set the 'SupplementaryQuantity' element value. ���������� � �������������� ������� ���������
     * 
     * @param supplementaryQuantity
     */
    public void setSupplementaryQuantity(
            SupplementaryQuantityType supplementaryQuantity) {
        this.supplementaryQuantity = supplementaryQuantity;
    }
}

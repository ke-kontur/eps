
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * �������� ��������� ��������.
 */
public class DescriptionCostDeliveryType
{
    private String value;
    private String quantity;
    private String currency;

    /** 
     * Get the 'Value' element value. ���� �������� ����: true ��� 1 - ��; false ��� 0 - ���
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'Value' element value. ���� �������� ����: true ��� 1 - ��; false ��� 0 - ���
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /** 
     * Get the 'Quantity' element value. ��������� ��������
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ��������� ��������
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'Currency' element value. ������ 
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. ������ 
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}


package ru.acs.fts.schemas.album.oez_report;

/** 
 * �����, ������������� (����������) �� �������, ���������� ��� ���������� ��������� ��������� ���������� ����
 */
public class Table4GoodsType extends GoodsWithoutStatusBaseType
{
    private String quantity;

    /** 
     * Get the 'Quantity' element value. ���������� ������, ����������� �� ���������� ��� �� ���� ������
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ���������� ������, ����������� �� ���������� ��� �� ���� ������
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}

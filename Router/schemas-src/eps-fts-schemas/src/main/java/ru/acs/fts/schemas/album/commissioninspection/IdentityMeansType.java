
package ru.acs.fts.schemas.album.commissioninspection;

/** 
 * �������� �������������
 */
public class IdentityMeansType
{
    private String kind;
    private String quantity;

    /** 
     * Get the 'Kind' element value. ��� ������� �������������
     * 
     * @return value
     */
    public String getKind() {
        return kind;
    }

    /** 
     * Set the 'Kind' element value. ��� ������� �������������
     * 
     * @param kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /** 
     * Get the 'Quantity' element value. ���-�� ������� �������������, ������� ��������� ��������
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ���-�� ������� �������������, ������� ��������� ��������
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}

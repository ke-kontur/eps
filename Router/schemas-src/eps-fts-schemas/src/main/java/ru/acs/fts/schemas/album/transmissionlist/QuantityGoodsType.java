
package ru.acs.fts.schemas.album.transmissionlist;

/** 
 * ���������� �����
 */
public class QuantityGoodsType
{
    private String packagesQuantity;
    private String quantity;

    /** 
     * Get the 'PackagesQuantity' element value. ���������� ����.
     * 
     * @return value
     */
    public String getPackagesQuantity() {
        return packagesQuantity;
    }

    /** 
     * Set the 'PackagesQuantity' element value. ���������� ����.
     * 
     * @param packagesQuantity
     */
    public void setPackagesQuantity(String packagesQuantity) {
        this.packagesQuantity = packagesQuantity;
    }

    /** 
     * Get the 'Quantity' element value. ��� � ��
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ��� � ��
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}

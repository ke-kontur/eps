
package ru.acs.fts.schemas.album.transmissionlist;

/** 
 * Количество груза
 */
public class QuantityGoodsType
{
    private String packagesQuantity;
    private String quantity;

    /** 
     * Get the 'PackagesQuantity' element value. Количество мест.
     * 
     * @return value
     */
    public String getPackagesQuantity() {
        return packagesQuantity;
    }

    /** 
     * Set the 'PackagesQuantity' element value. Количество мест.
     * 
     * @param packagesQuantity
     */
    public void setPackagesQuantity(String packagesQuantity) {
        this.packagesQuantity = packagesQuantity;
    }

    /** 
     * Get the 'Quantity' element value. Вес в кг
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Вес в кг
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}

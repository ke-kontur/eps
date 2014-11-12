
package ru.acs.fts.schemas.album.commissioninspection;

/** 
 * Средства идентификации
 */
public class IdentityMeansType
{
    private String kind;
    private String quantity;

    /** 
     * Get the 'Kind' element value. Вид средств идентификации
     * 
     * @return value
     */
    public String getKind() {
        return kind;
    }

    /** 
     * Set the 'Kind' element value. Вид средств идентификации
     * 
     * @param kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /** 
     * Get the 'Quantity' element value. Кол-во средств идентификации, которые требуется наложить
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Кол-во средств идентификации, которые требуется наложить
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}

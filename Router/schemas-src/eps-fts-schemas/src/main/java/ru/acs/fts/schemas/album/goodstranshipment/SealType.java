
package ru.acs.fts.schemas.album.goodstranshipment;

/** 
 * Информация о вновь наложенных пломбах.
 */
public class SealType
{
    private String identNumber;
    private String identKind;
    private String identDesc;
    private String quantity;

    /** 
     * Get the 'IdentNumber' element value. Номер наложенного средства идентификации
     * 
     * @return value
     */
    public String getIdentNumber() {
        return identNumber;
    }

    /** 
     * Set the 'IdentNumber' element value. Номер наложенного средства идентификации
     * 
     * @param identNumber
     */
    public void setIdentNumber(String identNumber) {
        this.identNumber = identNumber;
    }

    /** 
     * Get the 'IdentKind' element value. Вид средств идентификации: 1 - пломба, 2 - печать, 3 - иное
     * 
     * @return value
     */
    public String getIdentKind() {
        return identKind;
    }

    /** 
     * Set the 'IdentKind' element value. Вид средств идентификации: 1 - пломба, 2 - печать, 3 - иное
     * 
     * @param identKind
     */
    public void setIdentKind(String identKind) {
        this.identKind = identKind;
    }

    /** 
     * Get the 'IdentDesc' element value. Примечание по средству идентификации
     * 
     * @return value
     */
    public String getIdentDesc() {
        return identDesc;
    }

    /** 
     * Set the 'IdentDesc' element value. Примечание по средству идентификации
     * 
     * @param identDesc
     */
    public void setIdentDesc(String identDesc) {
        this.identDesc = identDesc;
    }

    /** 
     * Get the 'Quantity' element value. Количество
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}

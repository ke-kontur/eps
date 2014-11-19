
package ru.acs.fts.schemas.album.instrinspection;

/** 
 * Средство идентификации
 */
public class IdentUnitType
{
    private String identDescription;
    private String identQuantity;

    /** 
     * Get the 'IdentDescription' element value. Описание средства идентификации
     * 
     * @return value
     */
    public String getIdentDescription() {
        return identDescription;
    }

    /** 
     * Set the 'IdentDescription' element value. Описание средства идентификации
     * 
     * @param identDescription
     */
    public void setIdentDescription(String identDescription) {
        this.identDescription = identDescription;
    }

    /** 
     * Get the 'IdentQuantity' element value. Количество средств идентификации
     * 
     * @return value
     */
    public String getIdentQuantity() {
        return identQuantity;
    }

    /** 
     * Set the 'IdentQuantity' element value. Количество средств идентификации
     * 
     * @param identQuantity
     */
    public void setIdentQuantity(String identQuantity) {
        this.identQuantity = identQuantity;
    }
}

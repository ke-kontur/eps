
package ru.acs.fts.schemas.album.actcustomsobservation;

/** 
 * Применяемые ТСТК
 */
public class ApplicationTMCCType
{
    private String kind;
    private String number;

    /** 
     * Get the 'Kind' element value. Вид ТСТК
     * 
     * @return value
     */
    public String getKind() {
        return kind;
    }

    /** 
     * Set the 'Kind' element value. Вид ТСТК
     * 
     * @param kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /** 
     * Get the 'Number' element value. Инвентарные номера
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Инвентарные номера
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }
}

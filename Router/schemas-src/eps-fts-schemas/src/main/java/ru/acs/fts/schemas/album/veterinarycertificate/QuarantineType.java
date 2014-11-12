
package ru.acs.fts.schemas.album.veterinarycertificate;

/** 
 * Карантинирование
 */
public class QuarantineType
{
    private String plaseQuarantine;
    private String numberDays;

    /** 
     * Get the 'PlaseQuarantine' element value. Место карантинирование
     * 
     * @return value
     */
    public String getPlaseQuarantine() {
        return plaseQuarantine;
    }

    /** 
     * Set the 'PlaseQuarantine' element value. Место карантинирование
     * 
     * @param plaseQuarantine
     */
    public void setPlaseQuarantine(String plaseQuarantine) {
        this.plaseQuarantine = plaseQuarantine;
    }

    /** 
     * Get the 'NumberDays' element value. Количество дней
     * 
     * @return value
     */
    public String getNumberDays() {
        return numberDays;
    }

    /** 
     * Set the 'NumberDays' element value. Количество дней
     * 
     * @param numberDays
     */
    public void setNumberDays(String numberDays) {
        this.numberDays = numberDays;
    }
}

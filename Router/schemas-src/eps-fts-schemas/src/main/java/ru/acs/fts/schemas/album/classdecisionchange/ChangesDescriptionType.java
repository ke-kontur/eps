
package ru.acs.fts.schemas.album.classdecisionchange;

/** 
 * Описание изменений
 */
public class ChangesDescriptionType
{
    private String GRNumber;
    private String previousValue;
    private String newValue;

    /** 
     * Get the 'GRNumber' element value. Номер графы
     * 
     * @return value
     */
    public String getGRNumber() {
        return GRNumber;
    }

    /** 
     * Set the 'GRNumber' element value. Номер графы
     * 
     * @param GRNumber
     */
    public void setGRNumber(String GRNumber) {
        this.GRNumber = GRNumber;
    }

    /** 
     * Get the 'PreviousValue' element value. Старое значение
     * 
     * @return value
     */
    public String getPreviousValue() {
        return previousValue;
    }

    /** 
     * Set the 'PreviousValue' element value. Старое значение
     * 
     * @param previousValue
     */
    public void setPreviousValue(String previousValue) {
        this.previousValue = previousValue;
    }

    /** 
     * Get the 'NewValue' element value. Новое значение
     * 
     * @return value
     */
    public String getNewValue() {
        return newValue;
    }

    /** 
     * Set the 'NewValue' element value. Новое значение
     * 
     * @param newValue
     */
    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }
}

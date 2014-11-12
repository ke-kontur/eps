
package ru.acs.fts.schemas.album.airshoppingwaybill;

/** 
 * Сведения о контейнере
 */
public class ContainerInfoType
{
    private String number;
    private String numberLock;
    private String numberSeal;

    /** 
     * Get the 'Number' element value. Номер контейнера
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер контейнера
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'NumberLock' element value. Номер замка на контейнере
     * 
     * @return value
     */
    public String getNumberLock() {
        return numberLock;
    }

    /** 
     * Set the 'NumberLock' element value. Номер замка на контейнере
     * 
     * @param numberLock
     */
    public void setNumberLock(String numberLock) {
        this.numberLock = numberLock;
    }

    /** 
     * Get the 'NumberSeal' element value. Номер пломбы на контейнере
     * 
     * @return value
     */
    public String getNumberSeal() {
        return numberSeal;
    }

    /** 
     * Set the 'NumberSeal' element value. Номер пломбы на контейнере
     * 
     * @param numberSeal
     */
    public void setNumberSeal(String numberSeal) {
        this.numberSeal = numberSeal;
    }
}

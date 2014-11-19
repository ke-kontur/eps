
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * Сведения об акцизных марках
 */
public class ESADExciseType
{
    private String exciseSerieses;
    private String exciseFirstNumber;
    private String exciseLastNumber;
    private String exciseQuantity;

    /** 
     * Get the 'ExciseSerieses' element value. Номер серии акцизных марок
     * 
     * @return value
     */
    public String getExciseSerieses() {
        return exciseSerieses;
    }

    /** 
     * Set the 'ExciseSerieses' element value. Номер серии акцизных марок
     * 
     * @param exciseSerieses
     */
    public void setExciseSerieses(String exciseSerieses) {
        this.exciseSerieses = exciseSerieses;
    }

    /** 
     * Get the 'ExciseFirstNumber' element value. Первый номер диапазона номеров акцизных марок
     * 
     * @return value
     */
    public String getExciseFirstNumber() {
        return exciseFirstNumber;
    }

    /** 
     * Set the 'ExciseFirstNumber' element value. Первый номер диапазона номеров акцизных марок
     * 
     * @param exciseFirstNumber
     */
    public void setExciseFirstNumber(String exciseFirstNumber) {
        this.exciseFirstNumber = exciseFirstNumber;
    }

    /** 
     * Get the 'ExciseLastNumber' element value. Последний номер диапазона номеров акцизных марок
     * 
     * @return value
     */
    public String getExciseLastNumber() {
        return exciseLastNumber;
    }

    /** 
     * Set the 'ExciseLastNumber' element value. Последний номер диапазона номеров акцизных марок
     * 
     * @param exciseLastNumber
     */
    public void setExciseLastNumber(String exciseLastNumber) {
        this.exciseLastNumber = exciseLastNumber;
    }

    /** 
     * Get the 'ExciseQuantity' element value. Количество акцизных марок
     * 
     * @return value
     */
    public String getExciseQuantity() {
        return exciseQuantity;
    }

    /** 
     * Set the 'ExciseQuantity' element value. Количество акцизных марок
     * 
     * @param exciseQuantity
     */
    public void setExciseQuantity(String exciseQuantity) {
        this.exciseQuantity = exciseQuantity;
    }
}

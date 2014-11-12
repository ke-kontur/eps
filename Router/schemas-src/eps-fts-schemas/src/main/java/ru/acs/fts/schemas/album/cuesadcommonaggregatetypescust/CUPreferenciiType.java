
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * Преференции в соответствии с классификатором льгот по уплате таможенных платежей. Гр.36
 */
public class CUPreferenciiType
{
    private String customsTax;
    private String customsDuty;
    private String excise;
    private String rate;

    /** 
     * Get the 'CustomsTax' element value. Таможенные сборы
     * 
     * @return value
     */
    public String getCustomsTax() {
        return customsTax;
    }

    /** 
     * Set the 'CustomsTax' element value. Таможенные сборы
     * 
     * @param customsTax
     */
    public void setCustomsTax(String customsTax) {
        this.customsTax = customsTax;
    }

    /** 
     * Get the 'CustomsDuty' element value. Таможенная пошлина
     * 
     * @return value
     */
    public String getCustomsDuty() {
        return customsDuty;
    }

    /** 
     * Set the 'CustomsDuty' element value. Таможенная пошлина
     * 
     * @param customsDuty
     */
    public void setCustomsDuty(String customsDuty) {
        this.customsDuty = customsDuty;
    }

    /** 
     * Get the 'Excise' element value. Акцизы
     * 
     * @return value
     */
    public String getExcise() {
        return excise;
    }

    /** 
     * Set the 'Excise' element value. Акцизы
     * 
     * @param excise
     */
    public void setExcise(String excise) {
        this.excise = excise;
    }

    /** 
     * Get the 'Rate' element value. Налог на добавленную стоимость
     * 
     * @return value
     */
    public String getRate() {
        return rate;
    }

    /** 
     * Set the 'Rate' element value. Налог на добавленную стоимость
     * 
     * @param rate
     */
    public void setRate(String rate) {
        this.rate = rate;
    }
}

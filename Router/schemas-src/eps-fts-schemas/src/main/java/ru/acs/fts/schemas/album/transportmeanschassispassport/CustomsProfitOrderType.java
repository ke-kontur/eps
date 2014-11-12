
package ru.acs.fts.schemas.album.transportmeanschassispassport;

import org.joda.time.LocalDate;

/** 
 * Номер таможенного приходного ордера (ТПО)
 */
public class CustomsProfitOrderType
{
    private String customsCode;
    private LocalDate registrationDate;
    private String number;
    private String series;

    /** 
     * Get the 'CustomsCode' element value. Код таможенного органа
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'RegistrationDate' element value. Дата регистрации документа.
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. Дата регистрации документа.
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'Number' element value. Номер
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'Series' element value. Серия
     * 
     * @return value
     */
    public String getSeries() {
        return series;
    }

    /** 
     * Set the 'Series' element value. Серия
     * 
     * @param series
     */
    public void setSeries(String series) {
        this.series = series;
    }
}

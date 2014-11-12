
package ru.acs.fts.schemas.album.classdecisionchange;

import org.joda.time.LocalDate;

/** 
 * Регистрационный номер
 */
public class RegistrationNumberType
{
    private String customsCode;
    private String serialNumber;
    private LocalDate date;

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
     * Get the 'SerialNumber' element value. Порядковый исходящий номер
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. Порядковый исходящий номер
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /** 
     * Get the 'Date' element value. Дата принятия решения
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата принятия решения
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
}


package ru.acs.fts.schemas.album.paymentdocument;

import org.joda.time.LocalDate;

/** 
 * Регистрационный номер ДТ/справочный номер ТПО/справочный номер ТР.
 */
public class RegistrationNumberType
{
    private String customsCode;
    private LocalDate registrationDate;
    private String number;

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
     * Get the 'Number' element value. Порядковый (регистрационный) номер ДТ/ регистрационный номер (серия, типографский номер) ТПО/ типографский номер ТР
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Порядковый (регистрационный) номер ДТ/ регистрационный номер (серия, типографский номер) ТПО/ типографский номер ТР
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }
}

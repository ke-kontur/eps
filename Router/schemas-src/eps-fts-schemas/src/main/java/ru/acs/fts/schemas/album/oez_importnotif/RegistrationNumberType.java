
package ru.acs.fts.schemas.album.oez_importnotif;

import org.joda.time.LocalDate;

/** 
 * –егистрационный номер разрешени€
 */
public class RegistrationNumberType
{
    private String customsCode;
    private LocalDate registrationDate;
    private String number;

    /** 
     * Get the 'CustomsCode' element value.  од таможенного органа, зарегистрировавшего документ.
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value.  од таможенного органа, зарегистрировавшего документ.
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'RegistrationDate' element value. ƒата регистрации документа.
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. ƒата регистрации документа.
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'Number' element value. ѕор€дковый номер документа
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. ѕор€дковый номер документа
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }
}

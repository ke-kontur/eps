
package ru.acs.fts.schemas.admin.int_dtrequest;

import org.joda.time.LocalDate;

/** 
 * Регистрационный номер таможенного документа.
 */
public class GTDIDType
{
    private String customsCode;
    private LocalDate registrationDate;
    private String GTDNumber;

    /** 
     * Get the 'CustomsCode' element value. Код таможенного органа, зарегистрировавшего документ.
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа, зарегистрировавшего документ.
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
     * Get the 'GTDNumber' element value. Порядковый номер документа по журналу регистрации.
     * 
     * @return value
     */
    public String getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. Порядковый номер документа по журналу регистрации.
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(String GTDNumber) {
        this.GTDNumber = GTDNumber;
    }
}

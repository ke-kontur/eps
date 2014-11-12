
package ru.acs.fts.schemas.album.notifmporegistration;

import org.joda.time.LocalDate;

/** 
 * Сведения о регистрационном номере МПО
 */
public class MPORegistrationType
{
    private String customsCode;
    private LocalDate registrationDate;
    private String MPONumber;

    /** 
     * Get the 'CustomsCode' element value. Код таможенного органа, зарегистрировавшего документ
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа, зарегистрировавшего документ
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'RegistrationDate' element value. Дата регистрации документа
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. Дата регистрации документа
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'MPO_Number' element value. Уникальный номер МПО
     * 
     * @return value
     */
    public String getMPONumber() {
        return MPONumber;
    }

    /** 
     * Set the 'MPO_Number' element value. Уникальный номер МПО
     * 
     * @param MPONumber
     */
    public void setMPONumber(String MPONumber) {
        this.MPONumber = MPONumber;
    }
}

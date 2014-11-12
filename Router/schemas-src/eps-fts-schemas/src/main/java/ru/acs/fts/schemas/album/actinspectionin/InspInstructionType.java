
package ru.acs.fts.schemas.album.actinspectionin;

import org.joda.time.LocalDate;

/** 
 * Сведения о поручении на досмотр
 */
public class InspInstructionType
{
    private String time;
    private String customsCode;
    private LocalDate registrationDate;
    private String PTDNumber;

    /** 
     * Get the 'Time' element value. Время выдачи поручения на досмотр
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'Time' element value. Время выдачи поручения на досмотр
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /** 
     * Get the 'CustomsCode' element value. Код таможенного органа, зарегистрировавшего ПТД.
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа, зарегистрировавшего ПТД.
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'RegistrationDate' element value. Дата регистрации ПТД.
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. Дата регистрации ПТД.
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'PTDNumber' element value. Порядковый номер ПТД   по журналу регистрации.
     * 
     * @return value
     */
    public String getPTDNumber() {
        return PTDNumber;
    }

    /** 
     * Set the 'PTDNumber' element value. Порядковый номер ПТД   по журналу регистрации.
     * 
     * @param PTDNumber
     */
    public void setPTDNumber(String PTDNumber) {
        this.PTDNumber = PTDNumber;
    }
}

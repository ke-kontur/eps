
package ru.acs.fts.schemas.album.liquidationcustomsmark;

import org.joda.time.LocalDate;

/** 
 * –егистрационный номер за€влени€ на уничтожение
 */
public class ApplicationRegNumberType
{
    private String customsCode;
    private LocalDate registrationDate;
    private String serialNumber;

    /** 
     * Get the 'CustomsCode' element value.  од таможенного органа, зарегистрировавшего документ
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value.  од таможенного органа, зарегистрировавшего документ
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'RegistrationDate' element value. ƒата регистрации документа
     * 
     * @return value
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. ƒата регистрации документа
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /** 
     * Get the 'SerialNumber' element value. ѕор€дковый номер документа по журналу регистрации
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. ѕор€дковый номер документа по журналу регистрации
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}

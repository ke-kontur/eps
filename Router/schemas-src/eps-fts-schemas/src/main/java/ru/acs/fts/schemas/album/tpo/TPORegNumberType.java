
package ru.acs.fts.schemas.album.tpo;

import org.joda.time.LocalDate;

/** 
 * Справочный номер ТПО
 */
public class TPORegNumberType
{
    private String customsCode;
    private LocalDate registrationDate;
    private String docNumber;

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
     * Get the 'DocNumber' element value. Номер документа по журналу регистрации/типографский номер
     * 
     * @return value
     */
    public String getDocNumber() {
        return docNumber;
    }

    /** 
     * Set the 'DocNumber' element value. Номер документа по журналу регистрации/типографский номер
     * 
     * @param docNumber
     */
    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }
}

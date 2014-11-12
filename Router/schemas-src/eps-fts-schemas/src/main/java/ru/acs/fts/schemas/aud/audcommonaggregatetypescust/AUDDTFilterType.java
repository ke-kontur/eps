
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Регистрационный номер таможенного документа. Применяется для всех документов имеющих структуру номера, совпадающую с со структурой номера ГТД
 */
public class AUDDTFilterType
{
    private String customsCode;
    private String GTDNumber;
    private AUDDateFilterParamsType registrationDate;

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

    /** 
     * Get the 'RegistrationDate' element value. Дата  регистрации документа
     * 
     * @return value
     */
    public AUDDateFilterParamsType getRegistrationDate() {
        return registrationDate;
    }

    /** 
     * Set the 'RegistrationDate' element value. Дата  регистрации документа
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(AUDDateFilterParamsType registrationDate) {
        this.registrationDate = registrationDate;
    }
}

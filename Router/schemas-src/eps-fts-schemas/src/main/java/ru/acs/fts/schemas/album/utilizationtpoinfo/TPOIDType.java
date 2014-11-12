
package ru.acs.fts.schemas.album.utilizationtpoinfo;

import org.joda.time.LocalDate;

/** 
 * Идентифицирующие параметры документа ТПО
 */
public class TPOIDType
{
    private String customsCode;
    private LocalDate registrationDate;
    private String orderNumber;

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
     * Get the 'OrderNumber' element value. Типографский номер бланка ТПО
     * 
     * @return value
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /** 
     * Set the 'OrderNumber' element value. Типографский номер бланка ТПО
     * 
     * @param orderNumber
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}

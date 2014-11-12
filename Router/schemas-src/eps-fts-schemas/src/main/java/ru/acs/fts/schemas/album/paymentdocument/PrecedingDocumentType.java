
package ru.acs.fts.schemas.album.paymentdocument;

import java.util.ArrayList;
import java.util.List;

/** 
 * "ДУ - предшествующие ДТ/аннулированные ТПО/ аннулированные ТР"
 */
public class PrecedingDocumentType
{
    private String BCC;
    private RegistrationNumberType precedingRegistrationNumber;
    private List<PaymentType> paymentList = new ArrayList<PaymentType>();

    /** 
     * Get the 'BCC' element value. Код бюджетной классификации (КБК) согласно Классификатору  видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы.
     * 
     * @return value
     */
    public String getBCC() {
        return BCC;
    }

    /** 
     * Set the 'BCC' element value. Код бюджетной классификации (КБК) согласно Классификатору  видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы.
     * 
     * @param BCC
     */
    public void setBCC(String BCC) {
        this.BCC = BCC;
    }

    /** 
     * Get the 'PrecedingRegistrationNumber' element value. Регистрационный номер предшествующей ДТ/справочный номер предшествующего аннулированного ТПО/справочный номер предшествующей аннулированной ТР
     * 
     * @return value
     */
    public RegistrationNumberType getPrecedingRegistrationNumber() {
        return precedingRegistrationNumber;
    }

    /** 
     * Set the 'PrecedingRegistrationNumber' element value. Регистрационный номер предшествующей ДТ/справочный номер предшествующего аннулированного ТПО/справочный номер предшествующей аннулированной ТР
     * 
     * @param precedingRegistrationNumber
     */
    public void setPrecedingRegistrationNumber(
            RegistrationNumberType precedingRegistrationNumber) {
        this.precedingRegistrationNumber = precedingRegistrationNumber;
    }

    /** 
     * Get the list of 'Payment' element items. Платежи
     * 
     * @return list
     */
    public List<PaymentType> getPaymentList() {
        return paymentList;
    }

    /** 
     * Set the list of 'Payment' element items. Платежи
     * 
     * @param list
     */
    public void setPaymentList(List<PaymentType> list) {
        paymentList = list;
    }
}

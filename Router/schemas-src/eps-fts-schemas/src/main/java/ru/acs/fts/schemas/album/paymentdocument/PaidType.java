
package ru.acs.fts.schemas.album.paymentdocument;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ДУ - уплачено
 */
public class PaidType extends DocumentBaseType
{
    private String BCC;
    private String paymentDocumentType;
    private String totalAmount;
    private String writeOffs;
    private LocalDate datewWiting;
    private String serialNumber;
    private String currencyCode;
    private String kindAccrual;
    private String paymentCurrCode;
    private String paymentModeCode;
    private List<DocumentBaseType> agreementList = new ArrayList<DocumentBaseType>();
    private PayerOrgDataType payerOrgData;

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
     * Get the 'PaymentDocumentType' element value. Тип платежного документа: "1" - "ПП" (при безналичной уплате денежных средств); "2" - "ПКО" (при внесении денежных средств в кассу таможенного органа); "3" - "квит." (при внесении денежных средств в кассы кредитных организаций для их последующего перечисления на счет Федерального казначейства); "4" - "чек" (при уплате таможенных платежей посредством микропроцессорных пластиковых карт); "5" - "расп." (при централизованной уплате таможенных платежей).
     * 
     * @return value
     */
    public String getPaymentDocumentType() {
        return paymentDocumentType;
    }

    /** 
     * Set the 'PaymentDocumentType' element value. Тип платежного документа: "1" - "ПП" (при безналичной уплате денежных средств); "2" - "ПКО" (при внесении денежных средств в кассу таможенного органа); "3" - "квит." (при внесении денежных средств в кассы кредитных организаций для их последующего перечисления на счет Федерального казначейства); "4" - "чек" (при уплате таможенных платежей посредством микропроцессорных пластиковых карт); "5" - "расп." (при централизованной уплате таможенных платежей).
     * 
     * @param paymentDocumentType
     */
    public void setPaymentDocumentType(String paymentDocumentType) {
        this.paymentDocumentType = paymentDocumentType;
    }

    /** 
     * Get the 'TotalAmount' element value. Общая сумма по платежному документу
     * 
     * @return value
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /** 
     * Set the 'TotalAmount' element value. Общая сумма по платежному документу
     * 
     * @param totalAmount
     */
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /** 
     * Get the 'WriteOffs' element value. ДУ/ДТ, ДУ/ТПО: - сумма списания (зачета) денежных средств в счет уплаты таможенных платежей; ДУ/ТР: - сумма списания (зачета) денежных средств в счет обеспечения уплаты таможенных пошлин, налогов
     * 
     * @return value
     */
    public String getWriteOffs() {
        return writeOffs;
    }

    /** 
     * Set the 'WriteOffs' element value. ДУ/ДТ, ДУ/ТПО: - сумма списания (зачета) денежных средств в счет уплаты таможенных платежей; ДУ/ТР: - сумма списания (зачета) денежных средств в счет обеспечения уплаты таможенных пошлин, налогов
     * 
     * @param writeOffs
     */
    public void setWriteOffs(String writeOffs) {
        this.writeOffs = writeOffs;
    }

    /** 
     * Get the 'DatewWiting' element value. ДУ/ДТ, ДУ/ТПО: - дата списания (зачета) денежных средств в счет уплаты таможенных платежей; ДУ/ТР: - дата списания (зачета) денежных средств в счет обеспечения уплаты таможенных пошлин, налогов
     * 
     * @return value
     */
    public LocalDate getDatewWiting() {
        return datewWiting;
    }

    /** 
     * Set the 'DatewWiting' element value. ДУ/ДТ, ДУ/ТПО: - дата списания (зачета) денежных средств в счет уплаты таможенных платежей; ДУ/ТР: - дата списания (зачета) денежных средств в счет обеспечения уплаты таможенных пошлин, налогов
     * 
     * @param datewWiting
     */
    public void setDatewWiting(LocalDate datewWiting) {
        this.datewWiting = datewWiting;
    }

    /** 
     * Get the 'SerialNumber' element value. ДУ/ДТ: - порядковый номер КТС (КДТ), по которой произведено доначисление платежей 
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. ДУ/ДТ: - порядковый номер КТС (КДТ), по которой произведено доначисление платежей 
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /** 
     * Get the 'CurrencyCode' element value. Цифровой код валюты платежа / резервируемой суммы
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Цифровой код валюты платежа / резервируемой суммы
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'KindAccrual' element value. ДУ/ДТ:  - тип документа, который послужил основанием для доначисления платежей: "2" - "КТС"; "3" - "КДТ".
     * 
     * @return value
     */
    public String getKindAccrual() {
        return kindAccrual;
    }

    /** 
     * Set the 'KindAccrual' element value. ДУ/ДТ:  - тип документа, который послужил основанием для доначисления платежей: "2" - "КТС"; "3" - "КДТ".
     * 
     * @param kindAccrual
     */
    public void setKindAccrual(String kindAccrual) {
        this.kindAccrual = kindAccrual;
    }

    /** 
     * Get the 'PaymentCurrCode' element value. Цифровой код валюты суммы по платежному документу
     * 
     * @return value
     */
    public String getPaymentCurrCode() {
        return paymentCurrCode;
    }

    /** 
     * Set the 'PaymentCurrCode' element value. Цифровой код валюты суммы по платежному документу
     * 
     * @param paymentCurrCode
     */
    public void setPaymentCurrCode(String paymentCurrCode) {
        this.paymentCurrCode = paymentCurrCode;
    }

    /** 
     * Get the 'PaymentModeCode' element value. Код вида платежа в соответствии с Классификатором  видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. Код вида платежа в соответствии с Классификатором  видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the list of 'Agreement' element items. Cоглашение о применении централизованного порядка уплаты таможенных пошлин, налогов
     * 
     * @return list
     */
    public List<DocumentBaseType> getAgreementList() {
        return agreementList;
    }

    /** 
     * Set the list of 'Agreement' element items. Cоглашение о применении централизованного порядка уплаты таможенных пошлин, налогов
     * 
     * @param list
     */
    public void setAgreementList(List<DocumentBaseType> list) {
        agreementList = list;
    }

    /** 
     * Get the 'PayerOrgData' element value. Сведения о плательщике по платежному документу
     * 
     * @return value
     */
    public PayerOrgDataType getPayerOrgData() {
        return payerOrgData;
    }

    /** 
     * Set the 'PayerOrgData' element value. Сведения о плательщике по платежному документу
     * 
     * @param payerOrgData
     */
    public void setPayerOrgData(PayerOrgDataType payerOrgData) {
        this.payerOrgData = payerOrgData;
    }
}

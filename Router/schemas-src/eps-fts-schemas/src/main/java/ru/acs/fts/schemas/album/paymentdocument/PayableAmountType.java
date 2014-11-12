
package ru.acs.fts.schemas.album.paymentdocument;

import org.joda.time.LocalDate;

/** 
 * ДУ - суммы к уплате/резервируемые суммы
 */
public class PayableAmountType
{
    private String BCC;
    private LocalDate dateAccrual;
    private String paymentModeCode;
    private String amount;
    private String kindAccrual;
    private String serialNumber;
    private String currencyCode;
    private String currencyRate;

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
     * Get the 'DateAccrual' element value. Дата начисления, доначисления или установления излишнего начисления платежей
     * 
     * @return value
     */
    public LocalDate getDateAccrual() {
        return dateAccrual;
    }

    /** 
     * Set the 'DateAccrual' element value. Дата начисления, доначисления или установления излишнего начисления платежей
     * 
     * @param dateAccrual
     */
    public void setDateAccrual(LocalDate dateAccrual) {
        this.dateAccrual = dateAccrual;
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
     * Get the 'Amount' element value. ДУ/ДТ, ДУ/ТПО: - сумма платежа, начисленная (доначисленная) к уплате; ДУ/ТР: - резервируемая сумма
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. ДУ/ДТ, ДУ/ТПО: - сумма платежа, начисленная (доначисленная) к уплате; ДУ/ТР: - резервируемая сумма
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'KindAccrual' element value. ДУ/ДТ: - тип начисления - тип документа, который послужил основанием для начисления к уплате платежей: "1" - "ДТ"; "2" - "КТС"; "3" - "КДТ".
     * 
     * @return value
     */
    public String getKindAccrual() {
        return kindAccrual;
    }

    /** 
     * Set the 'KindAccrual' element value. ДУ/ДТ: - тип начисления - тип документа, который послужил основанием для начисления к уплате платежей: "1" - "ДТ"; "2" - "КТС"; "3" - "КДТ".
     * 
     * @param kindAccrual
     */
    public void setKindAccrual(String kindAccrual) {
        this.kindAccrual = kindAccrual;
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
     * Get the 'CurrencyRate' element value. Курс валюты платежа / резервируемой суммы
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. Курс валюты платежа / резервируемой суммы
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }
}

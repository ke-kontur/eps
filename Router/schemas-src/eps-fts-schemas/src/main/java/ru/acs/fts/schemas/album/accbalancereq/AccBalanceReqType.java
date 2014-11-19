
package ru.acs.fts.schemas.album.accbalancereq;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * Запрос остатков на платежных поручениях участника ВЭД
 */
public class AccBalanceReqType extends BaseDocType
{
    private String currencyCode;
    private String customsCode;
    private String INN;
    private String KPP;
    private CustomsPersonType customsPerson;
    private PaymentInfoType paymentInfo;
    private String documentModeID;

    /** 
     * Get the 'CurrencyCode' element value. Код валюты
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'CustomsCode' element value. Код таможенного органа, осуществляющего запрос.
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа, осуществляющего запрос.
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'INN' element value. Индивидуальный номер налогоплательщика 
     * 
     * @return value
     */
    public String getINN() {
        return INN;
    }

    /** 
     * Set the 'INN' element value. Индивидуальный номер налогоплательщика 
     * 
     * @param INN
     */
    public void setINN(String INN) {
        this.INN = INN;
    }

    /** 
     * Get the 'KPP' element value. КПП плательщика
     * 
     * @return value
     */
    public String getKPP() {
        return KPP;
    }

    /** 
     * Set the 'KPP' element value. КПП плательщика
     * 
     * @param KPP
     */
    public void setKPP(String KPP) {
        this.KPP = KPP;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'PaymentInfo' element value. Сведения о платежном документе (если запрашивается остаток на конкретной ПП)
     * 
     * @return value
     */
    public PaymentInfoType getPaymentInfo() {
        return paymentInfo;
    }

    /** 
     * Set the 'PaymentInfo' element value. Сведения о платежном документе (если запрашивается остаток на конкретной ПП)
     * 
     * @param paymentInfo
     */
    public void setPaymentInfo(PaymentInfoType paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}


package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Квитанция плательщика
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:ExchangeDocuments:PayerReceipt:5.4.3" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PayerReceiptType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:BaseDocType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:string" name="ReceiptNumber"/>
 *         &lt;xs:element type="xs:date" name="ReceiptDate"/>
 *         &lt;xs:element type="xs:string" name="Amount"/>
 *         &lt;xs:element type="xs:string" name="AmountLetter" minOccurs="0"/>
 *         &lt;xs:element type="xs:string" name="CurrencyRate" minOccurs="0"/>
 *         &lt;xs:element type="xs:string" name="ReservationID" minOccurs="0"/>
 *         &lt;xs:element type="ns1:PayerType" name="Payer"/>
 *         &lt;xs:element type="ns1:PayeeType" name="Payee"/>
 *         &lt;xs:element type="ns1:CustomsDocumentType" name="CustomsDocument"/>
 *         &lt;xs:element type="ns1:PayingType" name="Paying" maxOccurs="unbounded"/>
 *         &lt;xs:element type="ns1:TPORegNumberType" name="TPORegNumber"/>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:string" use="required" fixed="1004113E" name="DocumentModeID"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PayerReceiptType extends BaseDocType
{
    private String receiptNumber;
    private LocalDate receiptDate;
    private String amount;
    private String amountLetter;
    private String currencyRate;
    private String reservationID;
    private PayerType payer;
    private PayeeType payee;
    private CustomsDocumentType customsDocument;
    private List<PayingType> payingList = new ArrayList<PayingType>();
    private TPORegNumberType TPORegNumber;
    private String documentModeID;

    /** 
     * Get the 'ReceiptNumber' element value. Номер квитанции
     * 
     * @return value
     */
    public String getReceiptNumber() {
        return receiptNumber;
    }

    /** 
     * Set the 'ReceiptNumber' element value. Номер квитанции
     * 
     * @param receiptNumber
     */
    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    /** 
     * Get the 'ReceiptDate' element value. Дата
     * 
     * @return value
     */
    public LocalDate getReceiptDate() {
        return receiptDate;
    }

    /** 
     * Set the 'ReceiptDate' element value. Дата
     * 
     * @param receiptDate
     */
    public void setReceiptDate(LocalDate receiptDate) {
        this.receiptDate = receiptDate;
    }

    /** 
     * Get the 'Amount' element value. Общая сумма подлежащих к уплате платежей
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Общая сумма подлежащих к уплате платежей
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'AmountLetter' element value. Общая сумма подлежащих к уплате платежей (прописью)
     * 
     * @return value
     */
    public String getAmountLetter() {
        return amountLetter;
    }

    /** 
     * Set the 'AmountLetter' element value. Общая сумма подлежащих к уплате платежей (прописью)
     * 
     * @param amountLetter
     */
    public void setAmountLetter(String amountLetter) {
        this.amountLetter = amountLetter;
    }

    /** 
     * Get the 'CurrencyRate' element value. Код валюты платежа
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. Код валюты платежа
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'ReservationID' element value. Идентификатор резервирования денежных средств для целей уплаты таможенных платежей
     * 
     * @return value
     */
    public String getReservationID() {
        return reservationID;
    }

    /** 
     * Set the 'ReservationID' element value. Идентификатор резервирования денежных средств для целей уплаты таможенных платежей
     * 
     * @param reservationID
     */
    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    /** 
     * Get the 'Payer' element value. Реквизиты плательщика
     * 
     * @return value
     */
    public PayerType getPayer() {
        return payer;
    }

    /** 
     * Set the 'Payer' element value. Реквизиты плательщика
     * 
     * @param payer
     */
    public void setPayer(PayerType payer) {
        this.payer = payer;
    }

    /** 
     * Get the 'Payee' element value. Реквизиты получателя
     * 
     * @return value
     */
    public PayeeType getPayee() {
        return payee;
    }

    /** 
     * Set the 'Payee' element value. Реквизиты получателя
     * 
     * @param payee
     */
    public void setPayee(PayeeType payee) {
        this.payee = payee;
    }

    /** 
     * Get the 'CustomsDocument' element value. Регистрационный номер документа, на основании которого осуществляется таможенное декларирование
     * 
     * @return value
     */
    public CustomsDocumentType getCustomsDocument() {
        return customsDocument;
    }

    /** 
     * Set the 'CustomsDocument' element value. Регистрационный номер документа, на основании которого осуществляется таможенное декларирование
     * 
     * @param customsDocument
     */
    public void setCustomsDocument(CustomsDocumentType customsDocument) {
        this.customsDocument = customsDocument;
    }

    /** 
     * Get the list of 'Paying' element items. Платеж
     * 
     * @return list
     */
    public List<PayingType> getPayingList() {
        return payingList;
    }

    /** 
     * Set the list of 'Paying' element items. Платеж
     * 
     * @param list
     */
    public void setPayingList(List<PayingType> list) {
        payingList = list;
    }

    /** 
     * Get the 'TPORegNumber' element value. Справочный номер ТПО
     * 
     * @return value
     */
    public TPORegNumberType getTPORegNumber() {
        return TPORegNumber;
    }

    /** 
     * Set the 'TPORegNumber' element value. Справочный номер ТПО
     * 
     * @param TPORegNumber
     */
    public void setTPORegNumber(TPORegNumberType TPORegNumber) {
        this.TPORegNumber = TPORegNumber;
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

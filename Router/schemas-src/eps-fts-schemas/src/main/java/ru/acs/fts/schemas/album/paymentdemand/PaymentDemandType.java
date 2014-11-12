
package ru.acs.fts.schemas.album.paymentdemand;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.BankMarkType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.PartPaymentType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.PayCustomerType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Платежное требование
 */
public class PaymentDemandType extends BaseDocType
{
    private String paymentAmount;
    private String transactionKind;
    private LocalDate receiptDateCollectBank;
    private LocalDate receiptDate;
    private LocalDate chargeOffDate;
    private LocalDate maturiryDate;
    private String acceptanceAmount;
    private LocalDate docDispatchDate;
    private String acceptanceTerm;
    private String paymentCondition;
    private String priority;
    private String purpose;
    private String valueSpelledOut;
    private String paymentModeCode;
    private LocalDate finCardDate;
    private DocumentBaseType documentReference;
    private PayCustomerType payer;
    private PayCustomerType payee;
    private DocumentBaseType paymentConditionRef;
    private List<PersonSignatureType> documentSignList = new ArrayList<PersonSignatureType>();
    private List<BankMarkType> recipBankMarkList = new ArrayList<BankMarkType>();
    private List<BankMarkType> payBankMarkList = new ArrayList<BankMarkType>();
    private List<PartPaymentType> partPaymentList = new ArrayList<PartPaymentType>();
    private String documentModeID;

    /** 
     * Get the 'PaymentAmount' element value. Сумма
     * 
     * @return value
     */
    public String getPaymentAmount() {
        return paymentAmount;
    }

    /** 
     * Set the 'PaymentAmount' element value. Сумма
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /** 
     * Get the 'TransactionKind' element value. Вид операции. Фиксированное значение "01"
     * 
     * @return value
     */
    public String getTransactionKind() {
        return transactionKind;
    }

    /** 
     * Set the 'TransactionKind' element value. Вид операции. Фиксированное значение "01"
     * 
     * @param transactionKind
     */
    public void setTransactionKind(String transactionKind) {
        this.transactionKind = transactionKind;
    }

    /** 
     * Get the 'ReceiptDateCollectBank' element value. Дата представления документов получателем в обслуживающий его банк 
     * 
     * @return value
     */
    public LocalDate getReceiptDateCollectBank() {
        return receiptDateCollectBank;
    }

    /** 
     * Set the 'ReceiptDateCollectBank' element value. Дата представления документов получателем в обслуживающий его банк 
     * 
     * @param receiptDateCollectBank
     */
    public void setReceiptDateCollectBank(LocalDate receiptDateCollectBank) {
        this.receiptDateCollectBank = receiptDateCollectBank;
    }

    /** 
     * Get the 'ReceiptDate' element value. Дата поступления расчетного документа в банк плательщика. Заполняется при платежах клиента кредитной организации  (поступ. в банк. плат)
     * 
     * @return value
     */
    public LocalDate getReceiptDate() {
        return receiptDate;
    }

    /** 
     * Set the 'ReceiptDate' element value. Дата поступления расчетного документа в банк плательщика. Заполняется при платежах клиента кредитной организации  (поступ. в банк. плат)
     * 
     * @param receiptDate
     */
    public void setReceiptDate(LocalDate receiptDate) {
        this.receiptDate = receiptDate;
    }

    /** 
     * Get the 'ChargeOffDate' element value. Дата списания денежных средств со счета плательщика. Заполняется при платежах клиента кредитной организации (Списано со сч. плат.)
     * 
     * @return value
     */
    public LocalDate getChargeOffDate() {
        return chargeOffDate;
    }

    /** 
     * Set the 'ChargeOffDate' element value. Дата списания денежных средств со счета плательщика. Заполняется при платежах клиента кредитной организации (Списано со сч. плат.)
     * 
     * @param chargeOffDate
     */
    public void setChargeOffDate(LocalDate chargeOffDate) {
        this.chargeOffDate = chargeOffDate;
    }

    /** 
     * Get the 'MaturiryDate' element value. Окончание срока акцепта
     * 
     * @return value
     */
    public LocalDate getMaturiryDate() {
        return maturiryDate;
    }

    /** 
     * Set the 'MaturiryDate' element value. Окончание срока акцепта
     * 
     * @param maturiryDate
     */
    public void setMaturiryDate(LocalDate maturiryDate) {
        this.maturiryDate = maturiryDate;
    }

    /** 
     * Get the 'AcceptanceAmount' element value. Сумма исходного расчетного документа, предъявленного к акцепту. Заполняется при частичном акцепте (помимо акцептованной суммы, подлежащей к оплате)
     * 
     * @return value
     */
    public String getAcceptanceAmount() {
        return acceptanceAmount;
    }

    /** 
     * Set the 'AcceptanceAmount' element value. Сумма исходного расчетного документа, предъявленного к акцепту. Заполняется при частичном акцепте (помимо акцептованной суммы, подлежащей к оплате)
     * 
     * @param acceptanceAmount
     */
    public void setAcceptanceAmount(String acceptanceAmount) {
        this.acceptanceAmount = acceptanceAmount;
    }

    /** 
     * Get the 'DocDispatchDate' element value. Дата отсылки (вручения) плательщику предусмотренных договором документов. Проставляется в случае, если эти документы были отосланы (вручены) получателем средств плательщику
     * 
     * @return value
     */
    public LocalDate getDocDispatchDate() {
        return docDispatchDate;
    }

    /** 
     * Set the 'DocDispatchDate' element value. Дата отсылки (вручения) плательщику предусмотренных договором документов. Проставляется в случае, если эти документы были отосланы (вручены) получателем средств плательщику
     * 
     * @param docDispatchDate
     */
    public void setDocDispatchDate(LocalDate docDispatchDate) {
        this.docDispatchDate = docDispatchDate;
    }

    /** 
     * Get the 'AcceptanceTerm' element value. Количество дней для акцепта, установленного договором, в случае, если платеж производится при условии акцепта платежного требования плательщиком
     * 
     * @return value
     */
    public String getAcceptanceTerm() {
        return acceptanceTerm;
    }

    /** 
     * Set the 'AcceptanceTerm' element value. Количество дней для акцепта, установленного договором, в случае, если платеж производится при условии акцепта платежного требования плательщиком
     * 
     * @param acceptanceTerm
     */
    public void setAcceptanceTerm(String acceptanceTerm) {
        this.acceptanceTerm = acceptanceTerm;
    }

    /** 
     * Get the 'PaymentCondition' element value. Условие оплаты аккредитива или платежного требования (1 - с акцептом, 2 - без акцепта)
     * 
     * @return value
     */
    public String getPaymentCondition() {
        return paymentCondition;
    }

    /** 
     * Set the 'PaymentCondition' element value. Условие оплаты аккредитива или платежного требования (1 - с акцептом, 2 - без акцепта)
     * 
     * @param paymentCondition
     */
    public void setPaymentCondition(String paymentCondition) {
        this.paymentCondition = paymentCondition;
    }

    /** 
     * Get the 'Priority' element value. Очередность платежа
     * 
     * @return value
     */
    public String getPriority() {
        return priority;
    }

    /** 
     * Set the 'Priority' element value. Очередность платежа
     * 
     * @param priority
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /** 
     * Get the 'Purpose' element value. Назначение платежа
     * 
     * @return value
     */
    public String getPurpose() {
        return purpose;
    }

    /** 
     * Set the 'Purpose' element value. Назначение платежа
     * 
     * @param purpose
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /** 
     * Get the 'ValueSpelledOut' element value. Сумма прописью
     * 
     * @return value
     */
    public String getValueSpelledOut() {
        return valueSpelledOut;
    }

    /** 
     * Set the 'ValueSpelledOut' element value. Сумма прописью
     * 
     * @param valueSpelledOut
     */
    public void setValueSpelledOut(String valueSpelledOut) {
        this.valueSpelledOut = valueSpelledOut;
    }

    /** 
     * Get the 'PaymentModeCode' element value. Код вида платежа (0 - не заполнено, 1 - электронно, 2 - почтой, 3 - телеграфом)
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. Код вида платежа (0 - не заполнено, 1 - электронно, 2 - почтой, 3 - телеграфом)
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'FinCardDate' element value. Дата помещения в картотеку
     * 
     * @return value
     */
    public LocalDate getFinCardDate() {
        return finCardDate;
    }

    /** 
     * Set the 'FinCardDate' element value. Дата помещения в картотеку
     * 
     * @param finCardDate
     */
    public void setFinCardDate(LocalDate finCardDate) {
        this.finCardDate = finCardDate;
    }

    /** 
     * Get the 'DocumentReference' element value. Реквизиты документа
     * 
     * @return value
     */
    public DocumentBaseType getDocumentReference() {
        return documentReference;
    }

    /** 
     * Set the 'DocumentReference' element value. Реквизиты документа
     * 
     * @param documentReference
     */
    public void setDocumentReference(DocumentBaseType documentReference) {
        this.documentReference = documentReference;
    }

    /** 
     * Get the 'Payer' element value. Реквизиты плательщика
     * 
     * @return value
     */
    public PayCustomerType getPayer() {
        return payer;
    }

    /** 
     * Set the 'Payer' element value. Реквизиты плательщика
     * 
     * @param payer
     */
    public void setPayer(PayCustomerType payer) {
        this.payer = payer;
    }

    /** 
     * Get the 'Payee' element value. Реквизиты получателя
     * 
     * @return value
     */
    public PayCustomerType getPayee() {
        return payee;
    }

    /** 
     * Set the 'Payee' element value. Реквизиты получателя
     * 
     * @param payee
     */
    public void setPayee(PayCustomerType payee) {
        this.payee = payee;
    }

    /** 
     * Get the 'PaymentConditionRef' element value. Условие оплаты. При списании средств без акцепта плательщика - ссылка на номер, дату принятия и статью закона или номер, дату и пункт договора о праве безакцептного списания
     * 
     * @return value
     */
    public DocumentBaseType getPaymentConditionRef() {
        return paymentConditionRef;
    }

    /** 
     * Set the 'PaymentConditionRef' element value. Условие оплаты. При списании средств без акцепта плательщика - ссылка на номер, дату принятия и статью закона или номер, дату и пункт договора о праве безакцептного списания
     * 
     * @param paymentConditionRef
     */
    public void setPaymentConditionRef(DocumentBaseType paymentConditionRef) {
        this.paymentConditionRef = paymentConditionRef;
    }

    /** 
     * Get the list of 'DocumentSign' element items. Подписи
     * 
     * @return list
     */
    public List<PersonSignatureType> getDocumentSignList() {
        return documentSignList;
    }

    /** 
     * Set the list of 'DocumentSign' element items. Подписи
     * 
     * @param list
     */
    public void setDocumentSignList(List<PersonSignatureType> list) {
        documentSignList = list;
    }

    /** 
     * Get the list of 'RecipBankMark' element items. Отметки банка получателя
     * 
     * @return list
     */
    public List<BankMarkType> getRecipBankMarkList() {
        return recipBankMarkList;
    }

    /** 
     * Set the list of 'RecipBankMark' element items. Отметки банка получателя
     * 
     * @param list
     */
    public void setRecipBankMarkList(List<BankMarkType> list) {
        recipBankMarkList = list;
    }

    /** 
     * Get the list of 'PayBankMark' element items. Отметки банка плательщика
     * 
     * @return list
     */
    public List<BankMarkType> getPayBankMarkList() {
        return payBankMarkList;
    }

    /** 
     * Set the list of 'PayBankMark' element items. Отметки банка плательщика
     * 
     * @param list
     */
    public void setPayBankMarkList(List<BankMarkType> list) {
        payBankMarkList = list;
    }

    /** 
     * Get the list of 'PartPayment' element items. Сведения о частичном платеже
     * 
     * @return list
     */
    public List<PartPaymentType> getPartPaymentList() {
        return partPaymentList;
    }

    /** 
     * Set the list of 'PartPayment' element items. Сведения о частичном платеже
     * 
     * @param list
     */
    public void setPartPaymentList(List<PartPaymentType> list) {
        partPaymentList = list;
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

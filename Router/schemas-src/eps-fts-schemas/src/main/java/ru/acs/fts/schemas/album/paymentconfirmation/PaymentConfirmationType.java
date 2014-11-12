
package ru.acs.fts.schemas.album.paymentconfirmation;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Чек подтверждения оплаты
 */
public class PaymentConfirmationType extends BaseDocType
{
    private String nameOperator;
    private String ownerEquipment;
    private LocalDate docDate;
    private String docTime;
    private String reportNumber;
    private String checkNumber;
    private String totalAmount;
    private String completion;
    private CustomInfoType customsInfo;
    private TerminalInfoType terminalInfo;
    private PaymentType payment;
    private PayerInfoType payerInfo;
    private DocumentBaseType basePayment;
    private List<PayingType> payingList = new ArrayList<PayingType>();
    private String documentModeID;

    /** 
     * Get the 'NameOperator' element value. Наименование оператора таможенных платежей
     * 
     * @return value
     */
    public String getNameOperator() {
        return nameOperator;
    }

    /** 
     * Set the 'NameOperator' element value. Наименование оператора таможенных платежей
     * 
     * @param nameOperator
     */
    public void setNameOperator(String nameOperator) {
        this.nameOperator = nameOperator;
    }

    /** 
     * Get the 'OwnerEquipment' element value. Наименование банка-эмитента/владельца оборудования
     * 
     * @return value
     */
    public String getOwnerEquipment() {
        return ownerEquipment;
    }

    /** 
     * Set the 'OwnerEquipment' element value. Наименование банка-эмитента/владельца оборудования
     * 
     * @param ownerEquipment
     */
    public void setOwnerEquipment(String ownerEquipment) {
        this.ownerEquipment = ownerEquipment;
    }

    /** 
     * Get the 'DocDate' element value. Дата проведения операции
     * 
     * @return value
     */
    public LocalDate getDocDate() {
        return docDate;
    }

    /** 
     * Set the 'DocDate' element value. Дата проведения операции
     * 
     * @param docDate
     */
    public void setDocDate(LocalDate docDate) {
        this.docDate = docDate;
    }

    /** 
     * Get the 'DocTime' element value. Время проведения операции
     * 
     * @return value
     */
    public String getDocTime() {
        return docTime;
    }

    /** 
     * Set the 'DocTime' element value. Время проведения операции
     * 
     * @param docTime
     */
    public void setDocTime(String docTime) {
        this.docTime = docTime;
    }

    /** 
     * Get the 'ReportNumber' element value. Номер отчета
     * 
     * @return value
     */
    public String getReportNumber() {
        return reportNumber;
    }

    /** 
     * Set the 'ReportNumber' element value. Номер отчета
     * 
     * @param reportNumber
     */
    public void setReportNumber(String reportNumber) {
        this.reportNumber = reportNumber;
    }

    /** 
     * Get the 'CheckNumber' element value. Номер чека
     * 
     * @return value
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /** 
     * Set the 'CheckNumber' element value. Номер чека
     * 
     * @param checkNumber
     */
    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    /** 
     * Get the 'TotalAmount' element value. Общая сумма
     * 
     * @return value
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /** 
     * Set the 'TotalAmount' element value. Общая сумма
     * 
     * @param totalAmount
     */
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /** 
     * Get the 'Completion' element value. Подтверждение успешного завершения инкассации
     * 
     * @return value
     */
    public String getCompletion() {
        return completion;
    }

    /** 
     * Set the 'Completion' element value. Подтверждение успешного завершения инкассации
     * 
     * @param completion
     */
    public void setCompletion(String completion) {
        this.completion = completion;
    }

    /** 
     * Get the 'CustomsInfo' element value. Сведения о таможни
     * 
     * @return value
     */
    public CustomInfoType getCustomsInfo() {
        return customsInfo;
    }

    /** 
     * Set the 'CustomsInfo' element value. Сведения о таможни
     * 
     * @param customsInfo
     */
    public void setCustomsInfo(CustomInfoType customsInfo) {
        this.customsInfo = customsInfo;
    }

    /** 
     * Get the 'TerminalInfo' element value. Сведения о терминале/банкомате
     * 
     * @return value
     */
    public TerminalInfoType getTerminalInfo() {
        return terminalInfo;
    }

    /** 
     * Set the 'TerminalInfo' element value. Сведения о терминале/банкомате
     * 
     * @param terminalInfo
     */
    public void setTerminalInfo(TerminalInfoType terminalInfo) {
        this.terminalInfo = terminalInfo;
    }

    /** 
     * Get the 'Payment' element value. Оплата
     * 
     * @return value
     */
    public PaymentType getPayment() {
        return payment;
    }

    /** 
     * Set the 'Payment' element value. Оплата
     * 
     * @param payment
     */
    public void setPayment(PaymentType payment) {
        this.payment = payment;
    }

    /** 
     * Get the 'PayerInfo' element value. Сведения о плательщике
     * 
     * @return value
     */
    public PayerInfoType getPayerInfo() {
        return payerInfo;
    }

    /** 
     * Set the 'PayerInfo' element value. Сведения о плательщике
     * 
     * @param payerInfo
     */
    public void setPayerInfo(PayerInfoType payerInfo) {
        this.payerInfo = payerInfo;
    }

    /** 
     * Get the 'BasePayment' element value. Основание платежа
     * 
     * @return value
     */
    public DocumentBaseType getBasePayment() {
        return basePayment;
    }

    /** 
     * Set the 'BasePayment' element value. Основание платежа
     * 
     * @param basePayment
     */
    public void setBasePayment(DocumentBaseType basePayment) {
        this.basePayment = basePayment;
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

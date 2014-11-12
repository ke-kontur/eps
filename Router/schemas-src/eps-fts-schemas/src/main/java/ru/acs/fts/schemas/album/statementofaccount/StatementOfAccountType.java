
package ru.acs.fts.schemas.album.statementofaccount;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.CustomerType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Выписка со счета
 */
public class StatementOfAccountType extends BaseDocType
{
    private String reservedAmount;
    private String creditLimitAmount;
    private String creditAmount;
    private String debetAmount;
    private String outBal;
    private String enterBal;
    private LocalDate lastMovementDate;
    private String abstractKind;
    private LocalDate abstractDate;
    private DocumentInfoType documentInfo;
    private CustomerType accountHolder;
    private List<TransInfoType> transInfoList = new ArrayList<TransInfoType>();
    private String documentModeID;

    /** 
     * Get the 'ReservedAmount' element value. Сумма забронированных средств (если больше нуля). Не заполняется для выписки, содержащей текущий остаток на счете
     * 
     * @return value
     */
    public String getReservedAmount() {
        return reservedAmount;
    }

    /** 
     * Set the 'ReservedAmount' element value. Сумма забронированных средств (если больше нуля). Не заполняется для выписки, содержащей текущий остаток на счете
     * 
     * @param reservedAmount
     */
    public void setReservedAmount(String reservedAmount) {
        this.reservedAmount = reservedAmount;
    }

    /** 
     * Get the 'CreditLimitAmount' element value. Сумма лимита внутридневного кредита (если больше нуля). Не заполняется для выписки, содержащей текущий остаток на счете
     * 
     * @return value
     */
    public String getCreditLimitAmount() {
        return creditLimitAmount;
    }

    /** 
     * Set the 'CreditLimitAmount' element value. Сумма лимита внутридневного кредита (если больше нуля). Не заполняется для выписки, содержащей текущий остаток на счете
     * 
     * @param creditLimitAmount
     */
    public void setCreditLimitAmount(String creditLimitAmount) {
        this.creditLimitAmount = creditLimitAmount;
    }

    /** 
     * Get the 'CreditAmount' element value. Общая сумма документов по кредиту счета участников (если больше нуля). Не заполняется для выписки, содержащей текущий остаток на счете
     * 
     * @return value
     */
    public String getCreditAmount() {
        return creditAmount;
    }

    /** 
     * Set the 'CreditAmount' element value. Общая сумма документов по кредиту счета участников (если больше нуля). Не заполняется для выписки, содержащей текущий остаток на счете
     * 
     * @param creditAmount
     */
    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }

    /** 
     * Get the 'DebetAmount' element value. Общая сумма документов по дебету счета участников (если больше нуля). Не заполняется для выписки, содержащей текущий остаток на счете
     * 
     * @return value
     */
    public String getDebetAmount() {
        return debetAmount;
    }

    /** 
     * Set the 'DebetAmount' element value. Общая сумма документов по дебету счета участников (если больше нуля). Не заполняется для выписки, содержащей текущий остаток на счете
     * 
     * @param debetAmount
     */
    public void setDebetAmount(String debetAmount) {
        this.debetAmount = debetAmount;
    }

    /** 
     * Get the 'OutBal' element value. Исходящий остаток на счете участника (дебетовый остаток - отрицательный, кредитовый - положительный)
     * 
     * @return value
     */
    public String getOutBal() {
        return outBal;
    }

    /** 
     * Set the 'OutBal' element value. Исходящий остаток на счете участника (дебетовый остаток - отрицательный, кредитовый - положительный)
     * 
     * @param outBal
     */
    public void setOutBal(String outBal) {
        this.outBal = outBal;
    }

    /** 
     * Get the 'EnterBal' element value. Входящий остаток на счете участника (дебетовый остаток - отрицательный, кредитовый - положительный). Не заполняется для выписки, содержащей текущий остаток на счете
     * 
     * @return value
     */
    public String getEnterBal() {
        return enterBal;
    }

    /** 
     * Set the 'EnterBal' element value. Входящий остаток на счете участника (дебетовый остаток - отрицательный, кредитовый - положительный). Не заполняется для выписки, содержащей текущий остаток на счете
     * 
     * @param enterBal
     */
    public void setEnterBal(String enterBal) {
        this.enterBal = enterBal;
    }

    /** 
     * Get the 'LastMovementDate' element value. Дата последнего движения по счету. Не заполняется при отсутствии движения по счету
     * 
     * @return value
     */
    public LocalDate getLastMovementDate() {
        return lastMovementDate;
    }

    /** 
     * Set the 'LastMovementDate' element value. Дата последнего движения по счету. Не заполняется при отсутствии движения по счету
     * 
     * @param lastMovementDate
     */
    public void setLastMovementDate(LocalDate lastMovementDate) {
        this.lastMovementDate = lastMovementDate;
    }

    /** 
     * Get the 'AbstractKind' element value. Тип выписки (0 - окончательная выписка, 1 - промежуточная выписка, 2 - текущий остаток на счете, 3 - свернутая выписка)
     * 
     * @return value
     */
    public String getAbstractKind() {
        return abstractKind;
    }

    /** 
     * Set the 'AbstractKind' element value. Тип выписки (0 - окончательная выписка, 1 - промежуточная выписка, 2 - текущий остаток на счете, 3 - свернутая выписка)
     * 
     * @param abstractKind
     */
    public void setAbstractKind(String abstractKind) {
        this.abstractKind = abstractKind;
    }

    /** 
     * Get the 'AbstractDate' element value. Дата, на которую формируется выписка
     * 
     * @return value
     */
    public LocalDate getAbstractDate() {
        return abstractDate;
    }

    /** 
     * Set the 'AbstractDate' element value. Дата, на которую формируется выписка
     * 
     * @param abstractDate
     */
    public void setAbstractDate(LocalDate abstractDate) {
        this.abstractDate = abstractDate;
    }

    /** 
     * Get the 'DocumentInfo' element value. Информация о формировании формы документа
     * 
     * @return value
     */
    public DocumentInfoType getDocumentInfo() {
        return documentInfo;
    }

    /** 
     * Set the 'DocumentInfo' element value. Информация о формировании формы документа
     * 
     * @param documentInfo
     */
    public void setDocumentInfo(DocumentInfoType documentInfo) {
        this.documentInfo = documentInfo;
    }

    /** 
     * Get the 'AccountHolder' element value. Информация о владельце счета
     * 
     * @return value
     */
    public CustomerType getAccountHolder() {
        return accountHolder;
    }

    /** 
     * Set the 'AccountHolder' element value. Информация о владельце счета
     * 
     * @param accountHolder
     */
    public void setAccountHolder(CustomerType accountHolder) {
        this.accountHolder = accountHolder;
    }

    /** 
     * Get the list of 'TransInfo' element items. Информация об одной операции по лицевому счету в выписке
     * 
     * @return list
     */
    public List<TransInfoType> getTransInfoList() {
        return transInfoList;
    }

    /** 
     * Set the list of 'TransInfo' element items. Информация об одной операции по лицевому счету в выписке
     * 
     * @param list
     */
    public void setTransInfoList(List<TransInfoType> list) {
        transInfoList = list;
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

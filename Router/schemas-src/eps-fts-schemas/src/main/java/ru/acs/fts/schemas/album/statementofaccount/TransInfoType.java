
package ru.acs.fts.schemas.album.statementofaccount;

import org.joda.time.LocalDate;

/** 
 * Информация об одной операции по лицевому счету в выписке. Не заполняется для свернутой выписки и выписки, содержащей текущий остаток на счете
 */
public class TransInfoType
{
    private String accDocNo;
    private String transKind;
    private String BICCorr;
    private String corrAccBrf;
    private String payerPersonalAccount;
    private String payeePersonalAccount;
    private String turnoverKind;
    private String DC;
    private String amount;
    private LocalDate transDate;

    /** 
     * Get the 'AccDocNo' element value. Номер расчетного документа
     * 
     * @return value
     */
    public String getAccDocNo() {
        return accDocNo;
    }

    /** 
     * Set the 'AccDocNo' element value. Номер расчетного документа
     * 
     * @param accDocNo
     */
    public void setAccDocNo(String accDocNo) {
        this.accDocNo = accDocNo;
    }

    /** 
     * Get the 'TransKind' element value. Вид операции. Указывается в соответствии со Справочником видов операций
     * 
     * @return value
     */
    public String getTransKind() {
        return transKind;
    }

    /** 
     * Set the 'TransKind' element value. Вид операции. Указывается в соответствии со Справочником видов операций
     * 
     * @param transKind
     */
    public void setTransKind(String transKind) {
        this.transKind = transKind;
    }

    /** 
     * Get the 'BICCorr' element value. БИК банка корреспондента. БИК РКЦ получателя (отправителя) платежа, если получателем (отправителем) средств является клиент РКЦ, либо БИК кредитной организации, если получателем (отправителем) является ее клиент
     * 
     * @return value
     */
    public String getBICCorr() {
        return BICCorr;
    }

    /** 
     * Set the 'BICCorr' element value. БИК банка корреспондента. БИК РКЦ получателя (отправителя) платежа, если получателем (отправителем) средств является клиент РКЦ, либо БИК кредитной организации, если получателем (отправителем) является ее клиент
     * 
     * @param BICCorr
     */
    public void setBICCorr(String BICCorr) {
        this.BICCorr = BICCorr;
    }

    /** 
     * Get the 'CorrAccBrf' element value. Корреспондирующий счет. Номер балансового счета второго порядка, через который осуществляются операции по зачислению (списанию) средств на корреспондентский или лицевой счет клиента РКЦ в зависимости от способа расчетов между РКЦ
     * 
     * @return value
     */
    public String getCorrAccBrf() {
        return corrAccBrf;
    }

    /** 
     * Set the 'CorrAccBrf' element value. Корреспондирующий счет. Номер балансового счета второго порядка, через который осуществляются операции по зачислению (списанию) средств на корреспондентский или лицевой счет клиента РКЦ в зависимости от способа расчетов между РКЦ
     * 
     * @param corrAccBrf
     */
    public void setCorrAccBrf(String corrAccBrf) {
        this.corrAccBrf = corrAccBrf;
    }

    /** 
     * Get the 'PayerPersonalAccount' element value. Счет отправителя/ плательщика
     * 
     * @return value
     */
    public String getPayerPersonalAccount() {
        return payerPersonalAccount;
    }

    /** 
     * Set the 'PayerPersonalAccount' element value. Счет отправителя/ плательщика
     * 
     * @param payerPersonalAccount
     */
    public void setPayerPersonalAccount(String payerPersonalAccount) {
        this.payerPersonalAccount = payerPersonalAccount;
    }

    /** 
     * Get the 'PayeePersonalAccount' element value. Счет получателя
     * 
     * @return value
     */
    public String getPayeePersonalAccount() {
        return payeePersonalAccount;
    }

    /** 
     * Set the 'PayeePersonalAccount' element value. Счет получателя
     * 
     * @param payeePersonalAccount
     */
    public void setPayeePersonalAccount(String payeePersonalAccount) {
        this.payeePersonalAccount = payeePersonalAccount;
    }

    /** 
     * Get the 'TurnoverKind' element value. Вид оборотов (1 - основные, 2 - заключительные, 3 - эмиссионные заключительные)
     * 
     * @return value
     */
    public String getTurnoverKind() {
        return turnoverKind;
    }

    /** 
     * Set the 'TurnoverKind' element value. Вид оборотов (1 - основные, 2 - заключительные, 3 - эмиссионные заключительные)
     * 
     * @param turnoverKind
     */
    public void setTurnoverKind(String turnoverKind) {
        this.turnoverKind = turnoverKind;
    }

    /** 
     * Get the 'DC' element value. Признак дебета/кредита счета клиента (1 - дебет, 2 - кредит)
     * 
     * @return value
     */
    public String getDC() {
        return DC;
    }

    /** 
     * Set the 'DC' element value. Признак дебета/кредита счета клиента (1 - дебет, 2 - кредит)
     * 
     * @param DC
     */
    public void setDC(String DC) {
        this.DC = DC;
    }

    /** 
     * Get the 'Amount' element value. Сумма
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Сумма
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'TransDate' element value. Дата совершения операций по счету
     * 
     * @return value
     */
    public LocalDate getTransDate() {
        return transDate;
    }

    /** 
     * Set the 'TransDate' element value. Дата совершения операций по счету
     * 
     * @param transDate
     */
    public void setTransDate(LocalDate transDate) {
        this.transDate = transDate;
    }
}

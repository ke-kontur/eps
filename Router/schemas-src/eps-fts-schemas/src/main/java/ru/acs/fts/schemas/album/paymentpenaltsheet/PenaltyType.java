
package ru.acs.fts.schemas.album.paymentpenaltsheet;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Сведения об оплате штрафа
 */
public class PenaltyType
{
    private String violatorID;
    private String penaltySum;
    private String penaltyCreateDateTime;
    private String isPaid;
    private String payDateTime;
    private String organization;
    private DocumentBaseType resolution;
    private DocumentBaseType payDoc;
    private CUOrganizationType payer;
    private BankRequisType bankRequis;
    private TransportMeansBaseType TSInfo;

    /** 
     * Get the 'ViolatorID' element value. Идентификатор записи в реестре нарушителей
     * 
     * @return value
     */
    public String getViolatorID() {
        return violatorID;
    }

    /** 
     * Set the 'ViolatorID' element value. Идентификатор записи в реестре нарушителей
     * 
     * @param violatorID
     */
    public void setViolatorID(String violatorID) {
        this.violatorID = violatorID;
    }

    /** 
     * Get the 'PenaltySum' element value. Сумма штрафа в рублях
     * 
     * @return value
     */
    public String getPenaltySum() {
        return penaltySum;
    }

    /** 
     * Set the 'PenaltySum' element value. Сумма штрафа в рублях
     * 
     * @param penaltySum
     */
    public void setPenaltySum(String penaltySum) {
        this.penaltySum = penaltySum;
    }

    /** 
     * Get the 'PenaltyCreateDateTime' element value. Дата/время внесения платежа
     * 
     * @return value
     */
    public String getPenaltyCreateDateTime() {
        return penaltyCreateDateTime;
    }

    /** 
     * Set the 'PenaltyCreateDateTime' element value. Дата/время внесения платежа
     * 
     * @param penaltyCreateDateTime
     */
    public void setPenaltyCreateDateTime(String penaltyCreateDateTime) {
        this.penaltyCreateDateTime = penaltyCreateDateTime;
    }

    /** 
     * Get the 'IsPaid' element value. Признак оплаты штрафа (квитанции)
     * 
     * @return value
     */
    public String getIsPaid() {
        return isPaid;
    }

    /** 
     * Set the 'IsPaid' element value. Признак оплаты штрафа (квитанции)
     * 
     * @param isPaid
     */
    public void setIsPaid(String isPaid) {
        this.isPaid = isPaid;
    }

    /** 
     * Get the 'PayDateTime' element value. Дата/время оплаты
     * 
     * @return value
     */
    public String getPayDateTime() {
        return payDateTime;
    }

    /** 
     * Set the 'PayDateTime' element value. Дата/время оплаты
     * 
     * @param payDateTime
     */
    public void setPayDateTime(String payDateTime) {
        this.payDateTime = payDateTime;
    }

    /** 
     * Get the 'Organization' element value. КП/УГАДН
     * 
     * @return value
     */
    public String getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. КП/УГАДН
     * 
     * @param organization
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /** 
     * Get the 'Resolution' element value. Постановление
     * 
     * @return value
     */
    public DocumentBaseType getResolution() {
        return resolution;
    }

    /** 
     * Set the 'Resolution' element value. Постановление
     * 
     * @param resolution
     */
    public void setResolution(DocumentBaseType resolution) {
        this.resolution = resolution;
    }

    /** 
     * Get the 'PayDoc' element value. Платежный документ
     * 
     * @return value
     */
    public DocumentBaseType getPayDoc() {
        return payDoc;
    }

    /** 
     * Set the 'PayDoc' element value. Платежный документ
     * 
     * @param payDoc
     */
    public void setPayDoc(DocumentBaseType payDoc) {
        this.payDoc = payDoc;
    }

    /** 
     * Get the 'Payer' element value. Плательщик
     * 
     * @return value
     */
    public CUOrganizationType getPayer() {
        return payer;
    }

    /** 
     * Set the 'Payer' element value. Плательщик
     * 
     * @param payer
     */
    public void setPayer(CUOrganizationType payer) {
        this.payer = payer;
    }

    /** 
     * Get the 'BankRequis' element value. Реквизиты банка
     * 
     * @return value
     */
    public BankRequisType getBankRequis() {
        return bankRequis;
    }

    /** 
     * Set the 'BankRequis' element value. Реквизиты банка
     * 
     * @param bankRequis
     */
    public void setBankRequis(BankRequisType bankRequis) {
        this.bankRequis = bankRequis;
    }

    /** 
     * Get the 'TSInfo' element value. Регистрационные данные ТС
     * 
     * @return value
     */
    public TransportMeansBaseType getTSInfo() {
        return TSInfo;
    }

    /** 
     * Set the 'TSInfo' element value. Регистрационные данные ТС
     * 
     * @param TSInfo
     */
    public void setTSInfo(TransportMeansBaseType TSInfo) {
        this.TSInfo = TSInfo;
    }
}

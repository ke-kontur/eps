
package ru.acs.fts.schemas.album.resulttk;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Сведения об оплате штрафа
 */
public class PenaltyType
{
    private String penaltyCreateDateTime;
    private String payDateTime;
    private String organization;
    private DocumentBaseType payDoc;
    private CUOrganizationType payer;
    private BankRequisType bankRequis;
    private TransportMeansBaseType TSInfo;

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
     * Get the 'Organization' element value. Код КП, где были внесены данные об оплате
     * 
     * @return value
     */
    public String getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. Код КП, где были внесены данные об оплате
     * 
     * @param organization
     */
    public void setOrganization(String organization) {
        this.organization = organization;
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
     * Get the 'TSInfo' element value. Сведения о транспортном средстве
     * 
     * @return value
     */
    public TransportMeansBaseType getTSInfo() {
        return TSInfo;
    }

    /** 
     * Set the 'TSInfo' element value. Сведения о транспортном средстве
     * 
     * @param TSInfo
     */
    public void setTSInfo(TransportMeansBaseType TSInfo) {
        this.TSInfo = TSInfo;
    }
}

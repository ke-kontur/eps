
package ru.acs.fts.schemas.album.gtdobligationin;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Представляемые документы
 */
public class PresentedDocumentsType extends DocumentBaseType
{
    private String docSign;
    private String modeCode;
    private LocalDate expirationDate;
    private String amountCustomaPay;
    private String addPaymentCode;

    /** 
     * Get the 'DocSign' element value. Признак: 1 - документы, позволяющие идентифицировать товары; 2 - документы, подтверждающий соблюдение ограничений, установленных законодательством РФ о регулировании внешнеторговой деятельности; 3 - документы, свидетельствующие об уплате/обеспечении уплаты таможенных платежей
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак: 1 - документы, позволяющие идентифицировать товары; 2 - документы, подтверждающий соблюдение ограничений, установленных законодательством РФ о регулировании внешнеторговой деятельности; 3 - документы, свидетельствующие об уплате/обеспечении уплаты таможенных платежей
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'ModeCode' element value. Код вида документа (заполняется в соответствии с классификатором видов документов, используемых при таможенном декларировании)
     * 
     * @return value
     */
    public String getModeCode() {
        return modeCode;
    }

    /** 
     * Set the 'ModeCode' element value. Код вида документа (заполняется в соответствии с классификатором видов документов, используемых при таможенном декларировании)
     * 
     * @param modeCode
     */
    public void setModeCode(String modeCode) {
        this.modeCode = modeCode;
    }

    /** 
     * Get the 'ExpirationDate' element value. Дата окончания действия документа
     * 
     * @return value
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /** 
     * Set the 'ExpirationDate' element value. Дата окончания действия документа
     * 
     * @param expirationDate
     */
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    /** 
     * Get the 'AmountCustomaPay' element value. Сумма уплаты/обеспечения уплаты таможенных платежей по документу
     * 
     * @return value
     */
    public String getAmountCustomaPay() {
        return amountCustomaPay;
    }

    /** 
     * Set the 'AmountCustomaPay' element value. Сумма уплаты/обеспечения уплаты таможенных платежей по документу
     * 
     * @param amountCustomaPay
     */
    public void setAmountCustomaPay(String amountCustomaPay) {
        this.amountCustomaPay = amountCustomaPay;
    }

    /** 
     * Get the 'AddPaymentCode' element value. Код способа обеспечения уплаты таможенных пошлин, налогов
     * 
     * @return value
     */
    public String getAddPaymentCode() {
        return addPaymentCode;
    }

    /** 
     * Set the 'AddPaymentCode' element value. Код способа обеспечения уплаты таможенных пошлин, налогов
     * 
     * @param addPaymentCode
     */
    public void setAddPaymentCode(String addPaymentCode) {
        this.addPaymentCode = addPaymentCode;
    }
}

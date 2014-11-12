
package ru.acs.fts.schemas.album.ktsoutcustomsmark;

import org.joda.time.LocalDate;

/** 
 * КТС-служебные отметки по товарам
 */
public class KTSOutCustomsMarkGoodsType
{
    private String goodsNumeric;
    private String KTS1FormNumber;
    private String paymentEnsuringModeCodeType;
    private String documentNumber;
    private LocalDate documentDate;
    private String markDescription;
    private String KTSFormNumber;
    private SubscriptionType customsPerson;

    /** 
     * Get the 'GoodsNumeric' element value. Номер товара по документу / списку / номер товара по ДТ ( для КТС, ДТС)
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Номер товара по документу / списку / номер товара по ДТ ( для КТС, ДТС)
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'KTS1FormNumber' element value. Номер бланка формы КТС-1
     * 
     * @return value
     */
    public String getKTS1FormNumber() {
        return KTS1FormNumber;
    }

    /** 
     * Set the 'KTS1FormNumber' element value. Номер бланка формы КТС-1
     * 
     * @param KTS1FormNumber
     */
    public void setKTS1FormNumber(String KTS1FormNumber) {
        this.KTS1FormNumber = KTS1FormNumber;
    }

    /** 
     * Get the 'PaymentEnsuringModeCodeType' element value. Код вида обеспечения уплаты
     * 
     * @return value
     */
    public String getPaymentEnsuringModeCodeType() {
        return paymentEnsuringModeCodeType;
    }

    /** 
     * Set the 'PaymentEnsuringModeCodeType' element value. Код вида обеспечения уплаты
     * 
     * @param paymentEnsuringModeCodeType
     */
    public void setPaymentEnsuringModeCodeType(
            String paymentEnsuringModeCodeType) {
        this.paymentEnsuringModeCodeType = paymentEnsuringModeCodeType;
    }

    /** 
     * Get the 'DocumentNumber' element value. Номер документа
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. Номер документа
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'DocumentDate' element value. Дата документа
     * 
     * @return value
     */
    public LocalDate getDocumentDate() {
        return documentDate;
    }

    /** 
     * Set the 'DocumentDate' element value. Дата документа
     * 
     * @param documentDate
     */
    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    /** 
     * Get the 'MarkDescription' element value. Служебная запись
     * 
     * @return value
     */
    public String getMarkDescription() {
        return markDescription;
    }

    /** 
     * Set the 'MarkDescription' element value. Служебная запись
     * 
     * @param markDescription
     */
    public void setMarkDescription(String markDescription) {
        this.markDescription = markDescription;
    }

    /** 
     * Get the 'KTSFormNumber' element value. Номер бланка основного листа предшествующей формы КТС, содержащей (на основном либо дополнительных листах) сведения по товару
     * 
     * @return value
     */
    public String getKTSFormNumber() {
        return KTSFormNumber;
    }

    /** 
     * Set the 'KTSFormNumber' element value. Номер бланка основного листа предшествующей формы КТС, содержащей (на основном либо дополнительных листах) сведения по товару
     * 
     * @param KTSFormNumber
     */
    public void setKTSFormNumber(String KTSFormNumber) {
        this.KTSFormNumber = KTSFormNumber;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо
     * 
     * @return value
     */
    public SubscriptionType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(SubscriptionType customsPerson) {
        this.customsPerson = customsPerson;
    }
}
